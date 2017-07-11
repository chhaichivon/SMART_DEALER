package com.smartdealer.core.services.user;

import com.smartdealer.core.models.User;

import java.util.List;

/**
 * AUTHOR : CHHAI CHIVON
 * EMAIL  : chhaichivon1995@gmail.com
 * DATE   : 7/11/2017
 * TIME   : 2:09 PM
 */
public interface UserService {
    List<User> getListUsers();
    User getUser(long id);
    void saveOrUpdateUser(User user);
    void deleteUser(long id);
}
