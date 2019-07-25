package com.aaa.house.service;

import com.aaa.house.dao.HouseDao;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Local com.aaa.house.service
 * @Author ZongKeLi
 * @Date 2019/07/22  18:42
 * @Version 1.0
 */
@Service
public class HouseServiceImpl implements HouseService {
    @Autowired
    private HouseDao dao;
    @Override
    public List<Map> queryAll() {
        return dao.queryAll();
    }

    @Override
    public Map queryById(Integer id) {
        List<Map> list = dao.queryById(id);
        if (list!=null&&list.size()>0){
            return list.get(0);
        }
        return null;
    }
}
