package com.example.demo.dao;

import com.example.demo.model.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 华明铭
 * @Description:
 * @time 2018/6/1 11:54
 */
public interface UserInfoMapper {

    UserInfo selectById(@Param("id") Integer id);

    List<UserInfo> selectAll();

}
