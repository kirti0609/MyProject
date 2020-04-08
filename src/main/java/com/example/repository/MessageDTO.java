package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Message;

@Repository
public interface MessageDTO extends CrudRepository<Message, Integer> {

}
