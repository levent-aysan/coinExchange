package com.cc.coin.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cc.coin.entity.User;
import com.cc.coin.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public User registerUser(User user) {

		return userRepository.save(user);
	}

	public Optional<User> findById(Integer id) {
		Optional<User> userWithIdOne = userRepository.findById(id);
		return userWithIdOne;
	}

	public List<User> findAll() {
		List<User> users = userRepository.findAll();
		return users;

	}

}
