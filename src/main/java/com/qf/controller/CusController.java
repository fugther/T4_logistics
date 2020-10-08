package com.qf.controller;

import com.qf.entity.CustomerInfo;
import com.qf.entity.GoodsBill;
import com.qf.service.CusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * projectName: logistics
 * author: GSL
 * time: 2020/10/7 15:19
 * description:客户
 */
@RestController
public class CusController {
    @Autowired
    private CusService cusService;

    /**
     * 查询所有用户code
     * @return
     */
    @RequestMapping("/selectAllCusCode")
    public List<?>selectAllCusCode(){
        List<String>cusCodes=cusService.selectAllCusCode();
        return cusCodes;
    }

    /**
     * 根据code查询用户信息
     * @param customerCode
     * @return
     */
    @RequestMapping("/selectCusByCode")
    public CustomerInfo selectCusByCode(String customerCode) {

        CustomerInfo customerInfo = cusService.selectByCustomerCode(customerCode);
        return customerInfo;
    }
}
