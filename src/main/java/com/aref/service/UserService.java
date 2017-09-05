package com.aref.service;

import com.aref.dao.UserDao;
import com.aref.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao dao;

    public User findByIndex(int index) {
        return dao.getUser(index);
    }

    public void save(User user) {
         dao.saveUser(user);
    }

}
