package com.xujh.gmall.user.mapper;

import com.xujh.gmall.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/** @author Xu */
public interface UserMapper extends Mapper<UmsMember> {
  List<UmsMember> selectAllUser();
}
