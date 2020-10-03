package de.endrigobigi.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import de.endrigobigi.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
