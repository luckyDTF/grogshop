package com.cairne.grogshop.service.impl;

import com.cairne.grogshop.dao.LoginDAO;
import com.cairne.grogshop.domain.UserDO;
import com.cairne.grogshop.domain.UserDTO;
import com.cairne.grogshop.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @ClassName LoginServiceimpl
 * @Description TODD
 * @Author ASUS
 * @Date 2019/10/13 17:45
 **/
@Service
public class LoginServiceimpl implements LoginService {


    @Autowired
    private LoginDAO loginDAO;

    @Override
    public Boolean login(UserDTO userDTO) throws Exception {
        UserDTO userDTO1 = loginDAO.login(userDTO.clone(UserDO.class)).clone(UserDTO.class);
        return Objects.equals(userDTO.getUsername(), userDTO1.getUsername())
                && Objects.equals(userDTO.getPassword(), userDTO1.getPassword());
    }
}
