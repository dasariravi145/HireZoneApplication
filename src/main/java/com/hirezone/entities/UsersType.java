package com.hirezone.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class UsersType {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int usertypeId;
	
	private String userTypeName;
	
	@OneToMany(mappedBy = "usertypeId",cascade = CascadeType.ALL)
	private List<Users> users;

		public UsersType() {
			super();
			// TODO Auto-generated constructor stub
		}

		public UsersType(int usertypeId, String userTypeName, List<Users> users) {
			super();
			this.usertypeId = usertypeId;
			this.userTypeName = userTypeName;
			this.users = users;
		}

		public int getUserTypeId() {
			return usertypeId;
		}

		public void setUserTypeId(int usertypeId) {
			this.usertypeId = usertypeId;
		}

		public String getUserTypeName() {
			return userTypeName;
		}

		public void setUserTypeName(String userTypeName) {
			this.userTypeName = userTypeName;
		}

		public List<Users> getUsers() {
			return users;
		}

		public void setUsers(List<Users> users) {
			this.users = users;
		}
	    
	    
	    
}
