package com.cosun.finance.service;


import com.cosun.finance.bean.UserInfo;

public interface IUserInfoServ {

    UserInfo findUserByUserNameandPassword(String userName, String userPwd) throws Exception;

    void updateUserInfoLoginTime(Integer uId, String datetime) throws Exception;


}


