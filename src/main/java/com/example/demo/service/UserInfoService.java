package com.example.demo.service;

import com.example.demo.model.UserInfo;
import com.github.pagehelper.PageInfo;

/**
 * @author 华明铭
 * @Description:
 * @time 2018/6/1 11:56
 */
public interface UserInfoService {

    UserInfo selectById(Integer id);

    PageInfo<UserInfo> selectAll(Integer page, Integer size);

}
