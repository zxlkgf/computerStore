package com.zxl.store.service;

import com.zxl.store.entity.District;

import java.util.List;

/**
 * @author zxl
 * @description District业务层的接口类
 * @date 2022/11/3
 */
public interface IDistrictService {
    /**
     * 根据父代号查询区域信息(省市区)
     * @param parent 父代号
     * @return 返回多个查询结果
     */
    List<District> getDistrictByParent(String parent);

    /**
     * 按照code查询当前省市区名称
     * @param code code
     * @return 返回省市区名称
     */
    String getNameByCode(String code);
}
