package com.cairne.grogshop.dao;

import com.cairne.grogshop.domain.UserDO;

public interface LoginDAO {

    UserDO login(UserDO userDO) throws Exception;
}
