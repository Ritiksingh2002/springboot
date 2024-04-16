package com.Springboot.Controlers;

import com.Springboot.PostRepository;
import com.Springboot.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class myController {
	@Autowired
	PostRepository repo;

	@GetMapping("/hello")
	public String hello()
	{
		return "Hello";
	}
	@GetMapping("/posts")
	public List<Post> getallPosts(){
		return repo.findAll();
	}


}

