package com.smartdealer.core.services.user;

import com.smartdealer.core.models.User;
import com.smartdealer.core.services.BaseService;

import java.util.Collection;

/**
 * AUTHOR : CHHAI CHIVON
 * EMAIL  : chhaichivon1995@gmail.com
 * DATE   : 7/6/2017
 * TIME   : 10:38 AM
 */
public interface UserService extends BaseService {
    User getUserById(Long id);
    Collection<User> getListUser();
    void saveOrUpdateUser(User user);
    void delete(Long id);
}
