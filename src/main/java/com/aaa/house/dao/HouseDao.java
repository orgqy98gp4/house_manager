package com.aaa.house.dao;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @Local com.aaa.house.dao
 * @Author ZongKeLi
 * @Date 2019/07/22  18:38
 * @Version 1.0
 */
public interface HouseDao {
    /**
     * 房子列表
     * @return
     */
    @Select("select * from house")
    List<Map> queryAll();

    /**
     * 单个房子
     * @param id
     * @return
     */
    @Select("select * from house where id=#{id}")
    List<Map> queryById(Integer id);
}
