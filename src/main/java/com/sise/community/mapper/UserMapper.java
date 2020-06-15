package com.sise.community.mapper;

import com.sise.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Insert("insert into user (name,account_id,token,avatar_url) values (#{name},#{accountId},#{token},#{avatarUrl})")
    void insert(User user);

    /**
     * 在mybaties中，方法参数是类的话，会自动将参数类中成员变量填入到sql语句中 #{} 对应位置
     * 但如果方法参数不是类，是变量的话，需要添加 @Param 注解，注解的value的值填写需要填入到sql语句中 #{} 对应位置的值
     * @param token
     * @return
     */
    @Select("select * from user where token = #{token}")
    User findByToken(@Param("token") String token);

    @Select("select * from user where id = #{id}")
    User findById(@Param("id") Integer id);
}
