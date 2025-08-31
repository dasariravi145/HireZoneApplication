package com.hirezone.entities;

import java.util.Date;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Transient;

@Entity
public class JobPostActivity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer jobPostId;

	@ManyToOne
	@JoinColumn(name="postedById",referencedColumnName ="userId")
	private Users postedById;


	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="joblocationId",referencedColumnName ="id" )
	private JobLocation joblocationId;//many jobs can be present in one location


	//for company details
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="jobcompanyId",referencedColumnName = "id")
	private JobCompany jobCompanyId;//multiple job can be associated from one company

	@Transient
	private Boolean isActive;

	@Transient
	private Boolean isSaved;

	@Length(max=10000)
	private String descriptionOfJob;

	private String jobType;

	private String salary;

	private String remote;

	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date postedDate;// we can use @creationTimestamp also with LocalDateTime just for different falvour using this

	private String jobTitle;

	   public JobPostActivity() {
		super();
		// TODO Auto-generated constructor stub
	   }

	   public JobPostActivity(Integer jobPostId, Users postedById, JobLocation joblocationId, JobCompany jobCompanyId,
			Boolean isSaved, Boolean isActive, @Length(max = 10000) String descriptionOfJob, String jobType,
			String salary, String remote, Date postedDate, String jobTitle) {
		super();
		this.jobPostId = jobPostId;
		this.postedById = postedById;
		this.joblocationId = joblocationId;
		this.jobCompanyId = jobCompanyId;
		this.isSaved = isSaved;
		this.isActive = isActive;
		this.descriptionOfJob = descriptionOfJob;
		this.jobType = jobType;
		this.salary = salary;
		this.remote = remote;
		this.postedDate = postedDate;
		this.jobTitle = jobTitle;
	   }

	   public Integer getJobPostId() {
		   return jobPostId;
	   }

	   public void setJobPostId(Integer jobPostId) {
		   this.jobPostId = jobPostId;
	   }

	   public Users getPostById() {
		   return postedById;
	   }

	   public void setPostById(Users postById) {
		   this.postedById = postById;
	   }

	   public JobLocation getJoblocationId() {
		   return joblocationId;
	   }

	   public void setJoblocationId(JobLocation joblocationId) {
		   this.joblocationId = joblocationId;
	   }

	   public JobCompany getJobcompanyId() {
		   return jobCompanyId;
	   }

	   public void setJobcompanyId(JobCompany jobCompanyId) {
		   this.jobCompanyId = jobCompanyId;
	   }

	   public Boolean getIsSaved() {
		   return isSaved;
	   }

	   public void setIsSaved(Boolean isSaved) {
		   this.isSaved = isSaved;
	   }

	   public Boolean getIsActive() {
		   return isActive;
	   }

	   public void setIsActive(Boolean isActive) {
		   this.isActive = isActive;
	   }

	   public String getDescriptionOfJob() {
		   return descriptionOfJob;
	   }

	   public void setDescriptionOfJob(String descriptionOfJob) {
		   this.descriptionOfJob = descriptionOfJob;
	   }

	   public String getJobType() {
		   return jobType;
	   }

	   public void setJobType(String jobType) {
		   this.jobType = jobType;
	   }

	   public String getSalary() {
		   return salary;
	   }

	   public void setSalary(String salary) {
		   this.salary = salary;
	   }

	   public String getRemote() {
		   return remote;
	   }

	   public void setRemote(String remote) {
		   this.remote = remote;
	   }

	   public Date getPostedDate() {
		   return postedDate;
	   }

	   public void setPostedDate(Date postedDate) {
		   this.postedDate = postedDate;
	   }

	   public String getJobTitle() {
		   return jobTitle;
	   }

	   public void setJobTitle(String jobTitle) {
		   this.jobTitle = jobTitle;
	   }
}
