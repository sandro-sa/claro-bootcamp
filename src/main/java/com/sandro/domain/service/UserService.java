package com.sandro.domain.service;


import com.sandro.domain.model.User;

public interface UserService extends CrudService<Long, User> {

    User findById(Long id);

    User create(User userToCreate);
}