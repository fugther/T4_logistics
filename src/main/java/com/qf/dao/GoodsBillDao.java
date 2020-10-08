package com.qf.dao;

import com.qf.entity.GoodsBill;

/**
 * projectName: logistics
 * author: GSL
 * time: 2020/10/7 14:44
 * description:
 */
public interface GoodsBillDao {
    boolean findByGoodsBillCode(String goodsBillCode);

    void save(GoodsBill goodsBill);
}
