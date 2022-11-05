package com.zxl.store.mappers;

import com.zxl.store.entity.District;

import java.util.List;

/**
 * @author zxl
 * @description 实体类District对应的DistrictMapper接口
 * @date 2022/11/3
 */
public interface DistrictMapper {
    /**
     * 根据用户的父代号查询区域信息
     * @param parent 父代号
     * @return 某个父区域下的所有区域列表
     */
    List<District> findDistrictByParent(String parent);

    /**
     * 根据code查询区域名称
     * @param code 区域代号
     * @return 返回区域名称
     */
    String findNameByCode(String code);
}
