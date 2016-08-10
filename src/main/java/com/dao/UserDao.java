package com.dao;

import com.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by Administrator on 2016/8/7.
 */
public interface UserDao extends MongoRepository<User, Long> {

    @Query(value = "from User u where u.child.firstName:f")
    User findByChildName(@Param("f") String zhumingmning);
}

