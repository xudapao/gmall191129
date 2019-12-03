package com.xujh.gmall.user.service.impl;

import com.xujh.gmall.user.bean.UmsMember;
import com.xujh.gmall.user.bean.UmsMemberReceiveAddress;
import com.xujh.gmall.user.mapper.UserMapper;
import com.xujh.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/** @author Xu */
@Service
public class UserServiceImpl implements UserService {
  @Autowired UserMapper userMapper;

  @Override
  public List<UmsMember> getAllUser() {

    // List<UmsMember> umsMembers = userMapper.selectAll()  userMapper.selectAllUser();
    return userMapper.selectAll();
  }

  @Override
  public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {

    return null;
  }
}
