package com.xujh.gmall.user.controller;

import com.xujh.gmall.bean.UmsMember;
import com.xujh.gmall.bean.UmsMemberReceiveAddress;
import com.xujh.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

  @Autowired UserService userService;

  @RequestMapping("getReceiveAddressByMemberId")
  @ResponseBody
  public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(@RequestBody String memberId) {

    List<UmsMemberReceiveAddress> umsMemberReceiveAddresses =
        userService.getReceiveAddressByMemberId(memberId);

    return umsMemberReceiveAddresses;
  }

  @RequestMapping("getAllUser")
  @ResponseBody
  public List<UmsMember> getAllUser() {

    List<UmsMember> umsMembers = userService.getAllUser();

    return umsMembers;
  }

  @RequestMapping("index")
  @ResponseBody
  public String index() {
    return "hello user";
  }
}
