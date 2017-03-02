package org.cntt.user.service;

import java.awt.List;

import org.cntt.model.user.User;
import org.cntt.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	public User saveUser(User user){
		return userRepository.save(user);
		
	}

}
