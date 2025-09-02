package com.hirezone.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.hirezone.entities.JobPostActivity;
import com.hirezone.services.IRecruiterJobs;



public interface JobPostActivityRepo extends JpaRepository<JobPostActivity, Integer> {

	     @Query
	     List<IRecruiterJobs> getRecruterJobs(@Param("recruiter") int recruiter);
}
