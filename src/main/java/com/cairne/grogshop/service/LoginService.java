package com.cairne.grogshop.service;

import com.cairne.grogshop.domain.UserDTO;

/**
 * @ClassName LoginService
 * @Description TODD
 * @Author ASUS
 * @Date 2019/10/13 17:41
 **/
public interface LoginService {

    Boolean login(UserDTO userDTO) throws Exception;

}
