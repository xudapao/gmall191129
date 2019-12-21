package com.xujh.gmall.service;

import com.xujh.gmall.bean.PmsBaseAttrInfo;
import com.xujh.gmall.bean.PmsBaseAttrValue;

import java.util.List;

/** @author Xu */
public interface AttrService {
  List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);

  int saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);

  List<PmsBaseAttrValue> getAttrValueList(String attrId);
}
