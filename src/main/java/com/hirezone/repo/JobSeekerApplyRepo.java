package com.hirezone.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.hirezone.entities.JobSeekerApply;


public interface JobSeekerApplyRepo extends JpaRepository<JobSeekerApply,Integer> {
	
	
	/*
	 * List<JobSeekerApply> findByUserId(JobSeekarProfile userId);
	 * 
	 * 
	 * List<JobSeekerApply> findByJob(JobPostActivity job);
	 */

}
