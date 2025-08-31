package com.hirezone.entities;

import java.beans.Transient;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class RecruterProfile {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int userAccountId;
	
	@OneToOne
	@JoinColumn(name="user_id")
	private Users userID;//means one recuriter profile belongs to only one user ex:- one insta profile belongs to one user only
	
	private String firstName;
	private String lastName;
	private String city;
	private String state;
	private String country;
	private String company;
	
	@Column(nullable = true)
	private String profilePhoto;

	public RecruterProfile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RecruterProfile(int userAccountId, Users userID, String firstName, String lastName, String city, String state,
			String country, String company, String profilePhoto) {
		super();
		this.userAccountId = userAccountId;
		this.userID = userID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.state = state;
		this.country = country;
		this.company = company;
		this.profilePhoto = profilePhoto;
	}

	public int getUserAccountId() {
		return userAccountId;
	}

	public void setUserAccountId(int userAccountId) {
		this.userAccountId = userAccountId;
	}

	public Users getUserID() {
		return userID;
	}

	public void setUserID(Users userID) {
		this.userID = userID;
	}

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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getProfilePhoto() {
		return profilePhoto;
	}

	public void setProfilePhoto(String profilePhoto) {
		this.profilePhoto = profilePhoto;
	}

	@Transient
	public String getPhotoImagePath() {

		if (profilePhoto == null)
			return null;

		return "/photos/recruiter/" + userAccountId + "/" + profilePhoto;

	}
}
