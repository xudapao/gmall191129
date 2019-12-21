package com.xujh.gmall.service;

import com.xujh.gmall.bean.UmsMember;
import com.xujh.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

/** @author Xu */
public interface UserService {
  List<UmsMember> getAllUser();

  List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
