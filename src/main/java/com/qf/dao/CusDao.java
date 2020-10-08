package com.qf.dao;

import com.qf.entity.CustomerInfo;

import java.util.List;

/**
 * projectName: logistics
 * author: GSL
 * time: 2020/10/7 15:25
 * description:
 */
public interface CusDao {
    List<String> selectAllCusCode();

    CustomerInfo findByCustomerCode(String customerCode);
}
