package com.example.demo;
import jakarta.persistence.*;

@Entity
@Table(name = "Customer")
public class Customer {
	@Id
    @Column(name = "customerid")
	private int customerid;
	
	private String username;
	private String password;
	private String firstname ;
	private String lastname ;
	private String address;
	private String city;
	private String postalcode;
	private String phone;
	private String emailid;
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", username=" + username + ", password=" + password
				+ ", firstname=" + firstname + ", lastname=" + lastname + ", address=" + address + ", city=" + city
				+ ", postalcode=" + postalcode + ", phone=" + phone + ", emailid=" + emailid + "]";
	}
	public Customer(int customerid, String username, String password, String firstname, String lastname, String address,
			String city, String postalcode, String phone, String emailid) {
		super();
		this.customerid = customerid;
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.city = city;
		this.postalcode = postalcode;
		this.phone = phone;
		this.emailid = emailid;
	}
	public Customer() {
		super();
	}
	
	
}
