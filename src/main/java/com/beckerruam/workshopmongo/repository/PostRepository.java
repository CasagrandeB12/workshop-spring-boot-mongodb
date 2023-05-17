package com.beckerruam.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.beckerruam.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{


}
