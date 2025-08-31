package com.hirezone.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hirezone.entities.UsersType;


public interface UserTypeRepo extends JpaRepository<UsersType,Integer> {

}
