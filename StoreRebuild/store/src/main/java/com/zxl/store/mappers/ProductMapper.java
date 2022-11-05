package com.zxl.store.mappers;

import com.zxl.store.entity.Product;

import java.util.List;

/**
 * @author zxl
 * @description 处理商品数据的Mapper接口
 * @date 2022/11/4
 */
public interface ProductMapper {
    /**
     * 按照priority查找热销前五的商品数据
     * @return 返回商品数据集合
     */
    List<Product> findHotList();

    /**
     * 按照创建时间查找新到的商品
     * @return 返回新商品列表
     */
    List<Product> findNewProductList();

    /**
     * 按照商品的id查找商品
     * @param id
     * @return
     */
    Product findProductById(Integer id);
}
