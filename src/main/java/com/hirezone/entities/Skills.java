package com.hirezone.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Skills {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String experienceLevel;
	private String yearsOfExperience;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="job_seeker_profile")
	private JobSeekarProfile jobSeekarProfile;

		 public Skills() {
			super();
			// TODO Auto-generated constructor stub
		 }

		 public Skills(Integer id, String name, String experienceLevel, String yearsOfExperience,
				JobSeekarProfile jobSeekarProfile) {
			super();
			this.id = id;
			this.name = name;
			this.experienceLevel = experienceLevel;
			this.yearsOfExperience = yearsOfExperience;
			this.jobSeekarProfile = jobSeekarProfile;
		 }

		 public Integer getId() {
			 return id;
		 }

		 public void setId(Integer id) {
			 this.id = id;
		 }

		 public String getName() {
			 return name;
		 }

		 public void setName(String name) {
			 this.name = name;
		 }

		 public String getExperienceLevel() {
			 return experienceLevel;
		 }

		 public void setExperienceLevel(String experienceLevel) {
			 this.experienceLevel = experienceLevel;
		 }

		 public String getYearsOfExperience() {
			 return yearsOfExperience;
		 }

		 public void setYearsOfExperience(String yearsOfExperience) {
			 this.yearsOfExperience = yearsOfExperience;
		 }

		 public JobSeekarProfile getJobSeekarProfile() {
			 return jobSeekarProfile;
		 }

		 public void setJobSeekarProfile(JobSeekarProfile jobSeekarProfile) {
			 this.jobSeekarProfile = jobSeekarProfile;
		 }
	     
	     
}
