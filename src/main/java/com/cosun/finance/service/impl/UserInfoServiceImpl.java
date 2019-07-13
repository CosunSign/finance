package com.cosun.finance.service.impl;


import com.cosun.finance.bean.UserInfo;
import com.cosun.finance.mapper.UserInfoMapper;
import com.cosun.finance.service.IUserInfoServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class UserInfoServiceImpl implements IUserInfoServ {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Transactional(rollbackFor = Exception.class)
    public UserInfo findUserByUserNameandPassword(String userName, String userPwd) throws Exception {
        return userInfoMapper.findUserByUserNameandPassword(userName, userPwd);
    }

    public void updateUserInfoLoginTime(Integer uId,String datetime) throws Exception {
        userInfoMapper.updateUserInfoLoginTime(uId,datetime);
    }



}
