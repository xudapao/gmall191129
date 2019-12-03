package com.xujh.gmall.user.service;

import com.xujh.gmall.user.bean.UmsMember;
import com.xujh.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

/** @author Xu */
public interface UserService {
  List<UmsMember> getAllUser();

  List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
