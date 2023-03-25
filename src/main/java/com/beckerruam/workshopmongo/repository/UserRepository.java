package com.beckerruam.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.beckerruam.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String>{ //gerencia o User - informar o tipo de id do User

}
