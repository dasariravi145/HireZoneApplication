package com.hirezone.entities;

import java.beans.Transient;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class JobSeekarProfile {

	    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userAccountId;
	
	@OneToOne
	@JoinColumn(name="user_id")
	private Users userID;
	
	private String firstName;
	private String lastName;
	private String city;
	private String state;
	private String country;
	private String workAuthorization;
	private String employementType;
	private String resume;
	
	@Column(nullable = true)
	private String profilephoto;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "jobSeekarProfile")
	private List<Skills> skills;

		 public JobSeekarProfile() {
			super();
			// TODO Auto-generated constructor stub
		 }

		 public JobSeekarProfile(Integer userAccountId, Users userID, String firstName, String lastName, String city,
				String state, String country, String workAuthorization, String employementType, String resume,
				String profilephoto, List<Skills> skills) {
			super();
			this.userAccountId = userAccountId;
			this.userID = userID;
			this.firstName = firstName;
			this.lastName = lastName;
			this.city = city;
			this.state = state;
			this.country = country;
			this.workAuthorization = workAuthorization;
			this.employementType = employementType;
			this.resume = resume;
			this.profilephoto = profilephoto;
			this.skills = skills;
		 }

		 public Integer getUserAccountId() {
			 return userAccountId;
		 }

		 public void setUserAccountId(Integer userAccountId) {
			 this.userAccountId = userAccountId;
		 }

		 public Users getUserId() {
			 return userID;
		 }

		 public void setUserId(Users userID) {
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

		 public String getWorkAuthorization() {
			 return workAuthorization;
		 }

		 public void setWorkAuthorization(String workAuthorization) {
			 this.workAuthorization = workAuthorization;
		 }

		 public String getEmployementType() {
			 return employementType;
		 }

		 public void setEmployementType(String employementType) {
			 this.employementType = employementType;
		 }

		 public String getResume() {
			 return resume;
		 }

		 public void setResume(String resume) {
			 this.resume = resume;
		 }

		 public String getProfilephoto() {
			 return profilephoto;
		 }

		 public void setProfilephoto(String profilephoto) {
			 this.profilephoto = profilephoto;
		 }

		 public List<Skills> getSkills() {
			 return skills;
		 }

		 public void setSkills(List<Skills> skills) {
			 this.skills = skills;
		 }
	     
		     @Transient
			public String getPhotoImagePath()
			{
				
				if(profilephoto==null || userAccountId==null)
					return null;
				
				return "/photos/candidate/"+userAccountId+"/"+profilephoto;

			}
         
}
