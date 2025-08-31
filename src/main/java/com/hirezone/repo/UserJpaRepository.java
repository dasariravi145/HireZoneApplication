package com.hirezone.repo;



import org.springframework.data.jpa.repository.JpaRepository;

import com.hirezone.entities.Users;


public interface UserJpaRepository extends JpaRepository<Users,Integer> {
	
	//Optional<User> findByEmail(String email);

}
