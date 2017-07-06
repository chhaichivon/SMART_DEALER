package com.smartdealer.core.services.user;

import com.smartdealer.core.models.User;
import com.smartdealer.core.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * AUTHOR : CHHAI CHIVON
 * EMAIL  : chhaichivon1995@gmail.com
 * DATE   : 7/6/2017
 * TIME   : 10:41 AM
 */
@Service
public class UserServiceImp implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserById(Long id) {
        return userRepository.getUserById(id);
    }

    @Override
    public Collection<User> getListUser() {
        return userRepository.getListUser();
    }

    @Override
    public void saveOrUpdateUser(User user) {
        userRepository.saveOrUpdateUser(user);
    }

    @Override
    public void delete(Long id) {
        userRepository.delete(id);
    }
}
