package com.gx.dao;

import com.gx.po.UserPo;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDao {

    public UserPo selectLogin(UserPo user);

}
