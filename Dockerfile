# 基于 Maven 官方镜像，包含了 Maven 和 JDK
FROM maven:3.8.1-jdk-11

# 设置工作目录
WORKDIR /app

# 将项目的 pom.xml 和源码复制到镜像中
COPY pom.xml .
COPY src /app/src

# 编译和打包 Java 应用
RUN mvn clean package

# 基于 OpenJDK 创建一个新的镜像，仅包含编译好的应用
FROM openjdk:11-jre

# 设置工作目录
WORKDIR /app

# 从上一阶段的镜像中复制编译好的 JAR 文件
COPY --from=0 /app/target/*.jar /app/app.jar

# 暴露端口
EXPOSE 8080

# 设置容器启动时执行的命令
CMD ["java", "-jar", "app.jar"]
