package com.github.devtoju.backend;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface DbInfoRepo extends MongoRepository<DbData, String> {

}
