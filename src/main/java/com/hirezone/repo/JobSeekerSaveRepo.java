package com.hirezone.repo;



import org.springframework.data.jpa.repository.JpaRepository;

import com.hirezone.entities.JobSeekerSave;



public interface JobSeekerSaveRepo extends JpaRepository<JobSeekerSave, Integer> {
	
	
	/*
	 * public List<JobSeekerSave> findByUserId(JobSeekarProfile jobSeekarProfile);
	 * 
	 * public List<JobSeekerSave> findByJob(JobPostActivity job);
	 */
	
	

}
