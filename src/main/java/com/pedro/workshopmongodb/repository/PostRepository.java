package com.pedro.workshopmongodb.repository;

import com.pedro.workshopmongodb.domain.Post;
import com.pedro.workshopmongodb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
