package com.zw.eblog.mapper;

import com.zw.eblog.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {
    @Select("SELECT * FROM user")
        //@Cacheable(value="user")
    List<User> getAll();

    @Select("SELECT * FROM user WHERE uid = #{uid}")
        //@Cacheable(value="user")
    User get(Long uid);

    @Select("SELECT * FROM user where username=#{username} and password=#{password}")
    User getByUsernameAndPWD(@Param("username") String username, @Param("password") String password);

    @Insert("INSERT INTO user(name,username,password,sex,birthday,image) VALUES(#{name},#{username}, #{password}, #{sex}, #{birthday}, #{image})")
    void insert(User user);

    @Update("UPDATE user SET name=#{name},username=#{username},password=#{password},sex=#{sex},birthday=#{birthday},image=#{image} WHERE uid =#{uid}")
    void update(User user);

    @Delete("DELETE FROM user WHERE uid =#{uid}")
    void delete(Long uid);
}
