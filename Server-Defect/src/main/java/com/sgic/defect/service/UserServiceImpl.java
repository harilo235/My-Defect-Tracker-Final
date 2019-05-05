package com.sgic.defect.service;

import com.sgic.defect.entity.User;
import com.sgic.defect.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User findUserByUserId(Long id) {
        return userRepository.findUserByUserId(id);
    }

    @Override
    public User DeleteUserByUserId(Long id) {
        return userRepository.DeleteUserByUserId(id);
    }

    @Override
    public void updateUser(User user) {
        userRepository.save(user);
    }
}
