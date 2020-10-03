package de.endrigobigi.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.endrigobigi.workshopmongo.domain.User;
import de.endrigobigi.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}

}
