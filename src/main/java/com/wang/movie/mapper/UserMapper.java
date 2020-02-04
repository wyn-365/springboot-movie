package com.wang.movie.mapper;

import com.wang.movie.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author 王一宁
 * @date 2020/2/2 10:56
 */
@Mapper
public interface UserMapper {
    @Select("select * from user where user_name=#{username} and user_password = #{password}")
    public User findUser(String username, String password);

    @Insert("insert into user(user_age,user_flag,user_name,user_password,user_tel,user_email,user_sex,user_qq,user_img,user_realName) values(#{user_age},#{user_flag},#{user_name},#{user_password},#{user_tel},#{user_email},#{user_sex},#{user_qq},#{user_img},#{user_realName})")
    void register(User user);
}
