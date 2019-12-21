package com.xujh.gmall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xujh.gmall.bean.UmsMember;
import com.xujh.gmall.bean.UmsMemberReceiveAddress;
import com.xujh.gmall.service.UserService;
import com.xujh.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.xujh.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/** @author Xu */
@Service
public class UserServiceImpl implements UserService {
  @Autowired UserMapper userMapper;
  @Autowired UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

  @Override
  public List<UmsMember> getAllUser() {

    // List<UmsMember> umsMembers = userMapper.selectAll()  userMapper.selectAllUser();
    return userMapper.selectAll();
  }

  @Override
  public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {

    /*Example example = new Example(UmsMemberReceiveAddress.class);
    example.createCriteria().andEqualTo("memberId", "memberId");
    List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.selectByExample(example);
    */
    UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
    umsMemberReceiveAddress.setMemberId(memberId);

    return umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
  }
}
