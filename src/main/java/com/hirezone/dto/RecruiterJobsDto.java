package com.hirezone.dto;

import com.hirezone.entities.JobCompany;
import com.hirezone.entities.JobLocation;

public class RecruiterJobsDto {
	
	private Long totalCandidates;
	private Integer jobPostId;
	private String jobTitle;
	private JobLocation joblocationId;
	private JobCompany jobCompanyId;
	public RecruiterJobsDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RecruiterJobsDto(Long totalCandidates, Integer jobPostId, String jobTitle, JobLocation joblocationId,
			JobCompany jobCompanyId) {
		super();
		this.totalCandidates = totalCandidates;
		this.jobPostId = jobPostId;
		this.jobTitle = jobTitle;
		this.joblocationId = joblocationId;
		this.jobCompanyId = jobCompanyId;
	}
	public Long getTotalCandidates() {
		return totalCandidates;
	}
	public void setTotalCandidates(Long totalCandidates) {
		this.totalCandidates = totalCandidates;
	}
	public Integer getJobPostId() {
		return jobPostId;
	}
	public void setJobPostId(Integer jobPostId) {
		this.jobPostId = jobPostId;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public JobLocation getJoblocationId() {
		return joblocationId;
	}
	public void setJoblocationId(JobLocation joblocationId) {
		this.joblocationId = joblocationId;
	}
	public JobCompany getJobCompanyId() {
		return jobCompanyId;
	}
	public void setJobCompanyId(JobCompany jobCompanyId) {
		this.jobCompanyId = jobCompanyId;
	}
	
	

}
