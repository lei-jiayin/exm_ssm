package com.xw.ssm.service.impl;

import com.xw.ssm.dao.IUserInfoDao;
import com.xw.ssm.domain.UserInfo;
import com.xw.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xw
 * @date 2019-05-15 21:17
 */
@Service
public class IUserServiceImpl implements IUserService {

    @Autowired
    private IUserInfoDao userInfoDao;

    @Override
    public List<UserInfo> findAll() {
        return userInfoDao.findAll();
    }
}
