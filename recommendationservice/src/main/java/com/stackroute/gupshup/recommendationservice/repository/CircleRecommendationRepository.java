package com.stackroute.gupshup.recommendationservice.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.gupshup.recommendationservice.entity.CircleRecommendation;


@Repository
public interface CircleRecommendationRepository extends GraphRepository<CircleRecommendation> {
	
	@Query("merge (c:circle {circleId:{0}, keyword:{1}, circleName:{2}, createdBy:{3}}) return c")
	Map<String, Object> createCircle(String circleId, String keyword, String CircleName, String createdBy);
	
	@Query("MATCH (a:circle {circleId: {0}}) DETACH DELETE a")
	void deleteCircle(String circleId);
	
	@Query("MATCH (a:circle {circleId: {0}}) SET a.keyword = {1}, a.circleName = {2}, a.createdBy = {3} RETURN a")
	Map<String, Object> updateCircle(String circleId, String keyword, String CircleName, String createdBy);
	
	@Query("match (a:person), (b:circle) where a.name={0} and b.circleId={1} create (a)-[:created]->(b) return a,b")
	Iterable<Map<String, Object>> created(String name1, String circleId);
	
	@Query("match (a:person), (b:circle) where a.name={0} and b.circleId={1} create (a)-[:subscribed]->(b) return a,b")
	Iterable<Map<String, Object>> subscribed(String name1, String circleId);
	
	@Query("match (a:person {name:{0}})-[:follows]->(people),(people)-[:created |:subscribed]->(things) where not (a)-[:subscribed |:created]->(things) return things.keyword")
	Iterable<List<String>> subscribeRecommendation(String user);
//	List<CircleRecommendation> findByName(String name);


}
