package com.hirezone.entities;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class JobSeekerApply {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId", referencedColumnName = "userAccountId")
	private JobSeekarProfile userId;// jobseekarprofile object have all detail of jobseekar , many job can be applied by one profile
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "job", referencedColumnName = "jobPostId")
	private JobPostActivity job;//jobpostactivity object have all job details, many job  by one profile.
	
	@CreationTimestamp
	@Column(updatable = false)
    private LocalDateTime applyDate;
	
	  private String coverLetter;

			public JobSeekerApply() {
				super();
				// TODO Auto-generated constructor stub
			}

			public JobSeekerApply(Integer id, JobSeekarProfile userId, JobPostActivity job, LocalDateTime applyDate,
					String coverLetter) {
				super();
				this.id = id;
				this.userId = userId;
				this.job = job;
				this.applyDate = applyDate;
				this.coverLetter = coverLetter;
			}

			public Integer getId() {
				return id;
			}

			public void setId(Integer id) {
				this.id = id;
			}

			public JobSeekarProfile getUserid() {
				return userId;
			}

			public void setUserid(JobSeekarProfile userId) {
				this.userId = userId;
			}

			public JobPostActivity getJob() {
				return job;
			}

			public void setJob(JobPostActivity job) {
				this.job = job;
			}

			public LocalDateTime getApplyDate() {
				return applyDate;
			}

			public void setApplyDate(LocalDateTime applyDate) {
				this.applyDate = applyDate;
			}

			public String getCoverLetter() {
				return coverLetter;
			}

			public void setCoverLetter(String coverLetter) {
				this.coverLetter = coverLetter;
			}
}
