package com.stackroute.gupshup.recommendationservice.entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

@NodeEntity(label="person")
public class UserRecommendation {
	
	@GraphId Long id;
	
	@Id
	@NotNull(message="username cannot be null")
	@Size(min=1, message="username cannot be empty")
	private String name;
	
	@NotNull(message="firstname cannot be null")
	@Size(min=1, message="firstname cannot be empty")
	private String firstname;
	
	@NotNull(message="lastname cannot be null")
	@Size(min=1, message="lastname cannot be empty")
	private String lastname;
	
	@NotNull(message="gender cannot be null")
	@Size(min=1, message="gender cannot be empty")
	private String gender;
	
	private String intrest;
	
	@NotNull(message="Date of Birth cannot be null")
	private int DOB;
	
	public UserRecommendation(){};
	
	@JsonCreator
	public UserRecommendation(
			@JsonProperty("name") String name, 
			@JsonProperty("firstname") String firstname, 
			@JsonProperty("lastname") String lastname, 
			@JsonProperty("gender") String gender, 
			@JsonProperty("intrest") String intrest,
			@JsonProperty("DOB") int DOB){
		this.name = name;
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.intrest = intrest;
		this.DOB = DOB;
	}
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getIntrest() {
		return intrest;
	}

	public void setIntrest(String intrest) {
		this.intrest = intrest;
	}

	public int getDOB() {
		return DOB;
	}

	public void setDOB(int dOB) {
		DOB = dOB;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "UserRecommendation [id=" + id + ", name=" + name + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", gender=" + gender + ", intrest=" + intrest + ", DOB=" + DOB + "]";
	}

}