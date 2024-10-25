package com.sandro.domain.service;


import com.sandro.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}