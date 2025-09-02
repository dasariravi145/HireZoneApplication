package com.hirezone.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hirezone.entities.JobPostActivity;
import com.hirezone.entities.JobSeekarProfile;
import com.hirezone.entities.JobSeekerApply;

public interface JobSeekerApplyRepo extends JpaRepository<JobSeekerApply, Integer> {

	
	  List<JobSeekerApply> findByUserId(JobSeekarProfile userId);
	  
	  
	  List<JobSeekerApply> findByJob(JobPostActivity job);
	 

}
