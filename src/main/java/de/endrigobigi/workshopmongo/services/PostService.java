package de.endrigobigi.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.endrigobigi.workshopmongo.domain.Post;
import de.endrigobigi.workshopmongo.repository.PostRepository;
import de.endrigobigi.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found."));
	}
	
	public List<Post> findbyTitle(String text){
		return repo.searchTitle(text);
	}
}
