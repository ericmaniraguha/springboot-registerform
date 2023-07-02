package com.springbootregistrationform.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "userRegister")
public class User {

    private String name;

    @Id
    private String username;
    private String email;
    private String phone;
    private String password;
    private String cpassword; // confirm password
    private String gender;

    // Default constructor
    public User() {
    }
    
    
	public User(String name, String username, String email, String phone, String password, String cpassword,
			String gender) {
		super();
		this.name = name;
		this.username = username;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.cpassword = cpassword;
		this.gender = gender;
	}
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCpassword() {
        return cpassword;
    }

    public void setCpassword(String cpassword) {
        this.cpassword = cpassword;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }



	@Override
	public String toString() {
		return "User [name=" + name + ", username=" + username + ", email=" + email + ", phone=" + phone + ", password="
				+ password + ", cpassword=" + cpassword + ", gender=" + gender + "]";
	}
    
    
}
