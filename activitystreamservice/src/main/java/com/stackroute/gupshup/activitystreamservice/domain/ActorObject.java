package com.stackroute.gupshup.activitystreamservice.domain;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public interface ActorObject {
	
	public String getType();
	public String getName();
}