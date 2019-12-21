package com.xujh.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xujh.gmall.bean.PmsBaseAttrInfo;
import com.xujh.gmall.bean.PmsBaseAttrValue;
import com.xujh.gmall.service.AttrService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class AttrController {

  @Reference AttrService attrService;

  @RequestMapping("attrInfoList")
  @ResponseBody
  public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id) {
    return attrService.attrInfoList(catalog3Id);
  }

  @RequestMapping("saveAttrInfo")
  @ResponseBody
  public int saveAttrInfo(@RequestBody PmsBaseAttrInfo pmsBaseAttrInfo) {
    return attrService.saveAttrInfo(pmsBaseAttrInfo);
  }

  @RequestMapping("getAttrValueList")
  @ResponseBody
  public List<PmsBaseAttrValue> getAttrValueList(String attrId) {
    return attrService.getAttrValueList(attrId);
  }
}
