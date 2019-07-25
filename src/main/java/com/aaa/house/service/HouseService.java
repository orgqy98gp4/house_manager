package com.aaa.house.service;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @Local com.aaa.house.service
 * @Author ZongKeLi
 * @Date 2019/07/22  18:41
 * @Version 1.0
 */
public interface HouseService {
    /**
     * 房子列表
     * @return
     */
    List<Map> queryAll();

    /**
     * 单个房子
     * @param id
     * @return
     */
    Map queryById(Integer id);
}
