package com.smartdealer.core.services.user;

import com.smartdealer.core.models.User;
import com.smartdealer.core.repository.user.UserRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

/**
 * AUTHOR : CHHAI CHIVON
 * EMAIL  : chhaichivon1995@gmail.com
 * DATE   : 7/11/2017
 * TIME   : 2:09 PM
 */
@Service
public class UserServiceImp implements UserService {

    @Inject
    private UserRepository userRepository;

    @Override
    public List<User> getListUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(long id) {
        return userRepository.findOne(id);
    }

    @Override
    public void saveOrUpdateUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUser(long id) {
        userRepository.delete(id);
    }
}
