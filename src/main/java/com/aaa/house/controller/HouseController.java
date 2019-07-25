package com.aaa.house.controller;

import com.aaa.house.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Local com.aaa.house.controller
 * @Author ZongKeLi
 * @Date 2019/07/22  18:44
 * @Version 1.0
 */
@RestController
@RequestMapping("/house")
public class HouseController {
    @Autowired
    private HouseService service;

    /**
     * 获取单个
     * @param id
     * @return
     */
    @RequestMapping("/getOne")
    public Object getOne(Integer id){
        System.out.println(2);
        return service.queryById(id);
    }

    /**
     * 获取房子列表
     * @return
     */
    @RequestMapping("/getAll")
    public Object getAll(){
        System.out.println(1/0);
        return service.queryAll();
    }
}
