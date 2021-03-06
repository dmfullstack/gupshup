package com.stackroute.gupshup.recommendationservice.entity;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.data.annotation.Id;
import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/*-----------Bean class for user for creating nodes in neo4j----------*/
@NodeEntity(label="circle")
public class CircleRecommendation extends ResourceSupport{
	
	@GraphId Long id;

	@Id
	@NotNull(message="circle id cannot be null")
	@Size(min=1, message="circle id cannot be empty")
	String circleId;
	
	@NotNull(message="ciecle name cannot be null")
	@Size(min=1, message="circle name cannot be empty")
	String circleName;
	
	@NotNull(message="circle keywords cannot be null")
	@Size(min=1, message="circle keyword cannot be empty")
	List<String> keywords;
	
	@NotNull(message="username cannot be null")
	@Size(min=1, message="username cannot be empty")
	String createdBy;
	
	public CircleRecommendation(){ };
	
	@JsonCreator
	public CircleRecommendation(
			@JsonProperty("circleId") String circleId,
			@JsonProperty("circleName") String circleName,
			@JsonProperty("keywords") ArrayList<String> keywords,
			@JsonProperty("createdBy") String createdBy
			){
		this.circleId = circleId;
		this.circleName = circleName;
		this.keywords = keywords;
		this.createdBy = createdBy;
	}
	
	public String getCircleId() {
		return circleId;
	}

	public void setCircleId(String circleId) {
		this.circleId = circleId;
	}

	public List<String> getKeywords() {
		return keywords;
	}

	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}
	
	public String getCircleName() {
		return circleName;
	}
	
	public void setCircleName(String circleName) {
		this.circleName = circleName;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Override
	public String toString() {
		return "CircleRecommendation [id=" + id + ", circleId=" + circleId + ", circleName=" + circleName + ", keyword="
				+ keywords + ", createdBy=" + createdBy + "]";
	}

}

