package com.mateusvinicios.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mateusvinicios.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		User marcus = new User("1", "Marcus Aurelius","marcus@gmail.com");
		User alex = new User("2", "Alex Green","alex@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(marcus, alex));
		return ResponseEntity.ok().body(list);
	}

}
