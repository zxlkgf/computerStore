package com.zxl.store.controller;

import com.zxl.store.entity.District;
import com.zxl.store.service.IDistrictService;
import com.zxl.store.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zxl
 * @description 处理省市区相关业务的控制层
 * @date 2022/11/3
 */
@RestController
@RequestMapping("/district")
public class DistrictController extends BaseController{
    @Autowired(required = false)
    private IDistrictService districtService;

    @RequestMapping(value = "/parent",method = RequestMethod.GET)
    public JsonResult<List<District>> getDistrictByParent(String parent){
        //查询数据
        List<District> Data = districtService.getDistrictByParent(parent);
        //返回数据
        return new JsonResult<>(OK,Data);
    }
}
