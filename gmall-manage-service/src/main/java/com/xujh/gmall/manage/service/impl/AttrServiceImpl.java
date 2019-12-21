package com.xujh.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xujh.gmall.bean.PmsBaseAttrInfo;
import com.xujh.gmall.bean.PmsBaseAttrValue;
import com.xujh.gmall.manage.mapper.PmsBaseAttrInfoMapper;
import com.xujh.gmall.manage.mapper.PmsBaseAttrValueMapper;
import com.xujh.gmall.service.AttrService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/** @author Xu */
@Service
public class AttrServiceImpl implements AttrService {

  @Autowired PmsBaseAttrInfoMapper pmsBaseAttrInfoMapper;
  @Autowired PmsBaseAttrValueMapper pmsBaseAttrValueMapper;

  @Override
  public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id) {
    PmsBaseAttrInfo pmsBaseAttrInfo = new PmsBaseAttrInfo();
    pmsBaseAttrInfo.setCatalog3Id(catalog3Id);
    return pmsBaseAttrInfoMapper.select(pmsBaseAttrInfo);
  }

  @Override
  public int saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo) {
    if (StringUtils.isEmpty(pmsBaseAttrInfo.getId())) {
      pmsBaseAttrInfoMapper.insert(pmsBaseAttrInfo);
    } else {
      pmsBaseAttrInfoMapper.updateByPrimaryKey(pmsBaseAttrInfo);
    }
    PmsBaseAttrValue pmsBaseAttrValue = new PmsBaseAttrValue();
    pmsBaseAttrValue.setAttrId(pmsBaseAttrInfo.getId());
    pmsBaseAttrValueMapper.delete(pmsBaseAttrValue);

    List<PmsBaseAttrValue> attrValueList = pmsBaseAttrInfo.getAttrValueList();
    for (PmsBaseAttrValue attrValue : attrValueList) {
      attrValue.setAttrId(pmsBaseAttrInfo.getId());
      pmsBaseAttrValueMapper.insert(attrValue);
    }
    return 0;
  }

  @Override
  public List<PmsBaseAttrValue> getAttrValueList(String attrId) {
    PmsBaseAttrValue pmsBaseAttrValue = new PmsBaseAttrValue();
    pmsBaseAttrValue.setAttrId(attrId);
    return pmsBaseAttrValueMapper.select(pmsBaseAttrValue);
  }
}
