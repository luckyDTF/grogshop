package com.cairne.grogshop.mapper;

import com.cairne.grogshop.domain.UserDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * @ClassName LoginMapper
 * @Description TODD
 * @Author ASUS
 * @Date 2019/10/13 17:49
 **/
@Mapper
public interface LoginMapper {
    @Select("select username,password from user where" +
            " username = #{username} and" +
            " password = #{password}")
    @Results({
            @Result(column = "username", property = "username"),
            @Result(column = "password", property = "password")
    })
    UserDO login(UserDO userDO);

}
