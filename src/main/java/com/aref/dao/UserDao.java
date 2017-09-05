package com.aref.dao;

import com.aref.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private List<User> users = new ArrayList<User>();

    public void saveUser(User user) {
        users.add(user);
    }
    public User getUser(int index) {
        return users.get(index);
    }
}
