package com.hirezone.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class JobSeekerSave {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId", referencedColumnName = "userAccountId")
	private JobSeekarProfile userId;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "job", referencedColumnName = "jobPostId")
	private JobPostActivity job;

		   public JobSeekerSave() {
			super();
			// TODO Auto-generated constructor stub
		   }

		   public JobSeekerSave(Integer id, JobSeekarProfile userId, JobPostActivity job) {
			super();
			this.id = id;
			this.userId = userId;
			this.job = job;
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
}
