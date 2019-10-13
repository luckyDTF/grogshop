package com.cairne.grogshop.dao.impl;

import com.cairne.grogshop.dao.LoginDAO;
import com.cairne.grogshop.domain.UserDO;
import com.cairne.grogshop.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @ClassName impl
 * @Description TODD
 * @Author ASUS
 * @Date 2019/10/13 17:48
 **/
@Repository
public class LoginDAOImpl implements LoginDAO {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public UserDO login(UserDO userDO) throws Exception {
        return loginMapper.login(userDO);
    }
}
