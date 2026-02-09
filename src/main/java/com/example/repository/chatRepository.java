package com.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.model.chatModel;

public interface chatRepository extends MongoRepository<chatModel, String> {

}
