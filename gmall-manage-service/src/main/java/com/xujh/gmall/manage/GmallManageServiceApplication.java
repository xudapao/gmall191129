package com.xujh.gmall.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/** @author Xu */
@SpringBootApplication
@MapperScan(basePackages = "com.xujh.gmall.manage.mapper")
public class GmallManageServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(GmallManageServiceApplication.class, args);
  }
}
