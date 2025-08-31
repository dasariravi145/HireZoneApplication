package com.hirezone.repo;



import org.springframework.data.jpa.repository.JpaRepository;

import com.hirezone.entities.JobSeekarProfile;



public interface JobSeekerProfileRepo  extends JpaRepository<JobSeekarProfile, Integer>{
	
	//public Optional<JobSeekarProfile> findByUserID(User users);
}
