package com.qf.service.impl;

import com.qf.dao.CusDao;
import com.qf.entity.CustomerInfo;
import com.qf.service.CusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * projectName: logistics
 * author: GSL
 * time: 2020/10/7 15:24
 * description:
 */
@Service
public class CusServiceimpl implements CusService {
    @Autowired
    private CusDao cusDao;

    @Override
    public List<String> selectAllCusCode() {
        return cusDao.selectAllCusCode();
    }

    @Override
    public CustomerInfo selectByCustomerCode(String customerCode) {
        return cusDao.findByCustomerCode(customerCode);
    }
}
