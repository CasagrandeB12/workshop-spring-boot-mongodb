package com.beckerruam.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.beckerruam.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

	@Query("{ 'title': { $regex: ?0, $options: 'i' } }") //?0 primeiro parametro recebido no metodo
	List<Post> searchTitle (String text);
	
	List<Post> findByTitleContainingIgnoreCase(String text);
}
