package com.smartdealer.core.repository.user;

import com.smartdealer.core.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * AUTHOR : CHHAI CHIVON
 * EMAIL  : chhaichivon1995@gmail.com
 * DATE   : 7/11/2017
 * TIME   : 2:08 PM
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
