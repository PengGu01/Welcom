/**
 * Student Name: Peng Gu
 * StudentId:301240546
 * Submit Day:09 July,2023
 * */

package com.peng.mvc;

import java.util.Map;

public class Reservation {
	//fileds about reservation
	public String firstName;
	public String lastName;
	public String areaCode;
	public String phoneNumber;
	public String email;
	public String streetAddress;
	public String streetAddressLine2;
	public String city;
	public String state;
	public String postal;
	public String country;
	
	public String arrivalDate;
	public String depatureDate;
	public int roomType;
	public String roomTypeText;
	public int numberOfRoomNight;
	public int adultNum;
	public int kidsNum;
	public String paymentMethod;
	//none parameter constructor
	public Reservation() {
		super();
	}
	//full parameters constructor
	public Reservation(String firstName, String lastName, String areaCode, String phoneNumber, String email,
			String streetAddress, String streetAddressLine2, String city, String state, String postal, String country,
			String arrivalDate, String depatureDate, int roomType, String roomTypeText, int numberOfRoomNight,
			int adultNum, int kidsNum, String paymentMethod) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.areaCode = areaCode;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.streetAddress = streetAddress;
		this.streetAddressLine2 = streetAddressLine2;
		this.city = city;
		this.state = state;
		this.postal = postal;
		this.country = country;
		this.arrivalDate = arrivalDate;
		this.depatureDate = depatureDate;
		this.roomType = roomType;
		this.roomTypeText = roomTypeText;
		this.numberOfRoomNight = numberOfRoomNight;
		this.adultNum = adultNum;
		this.kidsNum = kidsNum;
		this.paymentMethod = paymentMethod;
	}

	public Reservation(Map<String, Object> params) {
		// TODO Auto-generated constructor stub
	}
	
	//getter and setters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getStreetAddressLine2() {
		return streetAddressLine2;
	}
	public void setStreetAddressLine2(String streetAddressLine2) {
		this.streetAddressLine2 = streetAddressLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPostal() {
		return postal;
	}
	public void setPostal(String postal) {
		this.postal = postal;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public String getDepatureDate() {
		return depatureDate;
	}
	public void setDepatureDate(String depatureDate) {
		this.depatureDate = depatureDate;
	}
	public int getRoomType() {
		return roomType;
	}
	public void setRoomType(int roomType) {
		this.roomType = roomType;
	}
	public int getNumberOfRoomNight() {
		return numberOfRoomNight;
	}
	public void setNumberOfRoomNight(int numberOfRoomNight) {
		this.numberOfRoomNight = numberOfRoomNight;
	}
	public int getAdultNum() {
		return adultNum;
	}
	public void setAdultNum(int adultNum) {
		this.adultNum = adultNum;
	}
	public int getKidsNum() {
		return kidsNum;
	}
	public void setKidsNum(int kidsNum) {
		this.kidsNum = kidsNum;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	@Override
	public String toString() {
		return "Reservation [firstName=" + firstName + ", lastName=" + lastName + ", areaCode=" + areaCode
				+ ", phoneNumber=" + phoneNumber + ", email=" + email + ", streetAddress=" + streetAddress
				+ ", streetAddressLine2=" + streetAddressLine2 + ", city=" + city + ", state=" + state + ", postal="
				+ postal + ", country=" + country + ", arrivalDate=" + arrivalDate + ", depatureDate=" + depatureDate
				+ ", roomType=" + roomType + ", numberOfRoomNight=" + numberOfRoomNight + ", adultNum=" + adultNum
				+ ", kidsNum=" + kidsNum + ", paymentMethod=" + paymentMethod + "]";
	}
	
	
	
}