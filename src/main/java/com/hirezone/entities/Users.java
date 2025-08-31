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
import jakarta.validation.constraints.NotEmpty;

@Entity
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	
	@Column(unique = true)
	private String email;
	
	@NotEmpty(message = "password should not be empty!!!")
	private String password;
	private boolean isActive;
	
	@Column(updatable = false)
	@CreationTimestamp
	private LocalDateTime registrationDate;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="user_type_Id" , referencedColumnName = "usertypeId")
	private UsersType usertypeId;

	   public Users() {
		super();
		// TODO Auto-generated constructor stub
	   }

	   public Users(int userId, String email, @NotEmpty(message = "password should not be empty!!!") String password,
			boolean isActive, LocalDateTime registrationDate, UsersType usertypeId) {
		super();
		this.userId = userId;
		this.email = email;
		this.password = password;
		this.isActive = isActive;
		this.registrationDate = registrationDate;
		this.usertypeId = usertypeId;
	}



	   public int getUserid() {
		   return userId;
	   }

	   public void setUserid(int userId) {
		   this.userId = userId;
	   }

	   public String getEmail() {
		   return email;
	   }

	   public void setEmail(String email) {
		   this.email = email;
	   }

	   public String getPassword() {
		   return password;
	   }

	   public void setPassword(String password) {
		   this.password = password;
	   }

	   public LocalDateTime getRegisterationDate() {
		   return registrationDate;
	   }

	   public void setRegisterationDate(LocalDateTime registerationDate) {
		   this.registrationDate = registerationDate;
	   }

	   public UsersType getUsertypeId() {
		   return usertypeId;
	   }

	   public void setUsertypeId(UsersType usertypeId) {
		   this.usertypeId = usertypeId;
	   }

	   public int getUserId() {
		   return userId;
	   }

	   public void setUserId(int userId) {
		   this.userId = userId;
	   }

	   public boolean isActive() {
		   return isActive;
	   }

	   public void setActive(boolean isActive) {
		   this.isActive = isActive;
	   }

	   public LocalDateTime getRegistrationDate() {
		   return registrationDate;
	   }

	   public void setRegistrationDate(LocalDateTime registrationDate) {
		   this.registrationDate = registrationDate;
	   }
	   
	   

}
