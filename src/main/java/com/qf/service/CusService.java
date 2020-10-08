package com.qf.service;

import com.qf.entity.CustomerInfo;

import java.util.List;

/**
 * projectName: logistics
 * author: GSL
 * time: 2020/10/7 15:20
 * description:
 */
public interface CusService {
    List<String> selectAllCusCode();

    CustomerInfo selectByCustomerCode(String customerCode);
}
