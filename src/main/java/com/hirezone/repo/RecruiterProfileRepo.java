package com.hirezone.repo;



import org.springframework.data.jpa.repository.JpaRepository;


import com.hirezone.entities.RecruterProfile;


public interface RecruiterProfileRepo extends JpaRepository<RecruterProfile, Integer> {
	
	
	//public Optional<RecruterProfile> findByUserID(Users users);

}
