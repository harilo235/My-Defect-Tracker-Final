package com.sgic.defect.service;

import com.sgic.defect.entity.User;

import java.util.List;

public interface UserService {

    void saveUser(User user);

    List<User> getAllUser();
    User findUserByUserId(Long id);
    User DeleteUserByUserId(Long id);
    void updateUser(User user);
}
