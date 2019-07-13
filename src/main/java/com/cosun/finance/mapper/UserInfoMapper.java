package com.cosun.finance.mapper;

import com.cosun.finance.bean.UserInfo;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserInfoMapper {


    @Select("SELECT * FROM userinfo WHERE username = #{userName} and userpwd=#{userPwd}")
    UserInfo findUserByUserNameandPassword(@Param("userName") String userName, @Param("userPwd") String userPwd);

    @Update("update userinfo set newestlogintime = #{dateTime} where uid = #{uId} ")
    void updateUserInfoLoginTime(Integer uId, String dateTime);



}
