package com.zxl.store.service;

import com.github.pagehelper.PageInfo;
import com.zxl.store.entity.Product;

import java.util.List;

/**
 * @author zxl
 * @description 处理商品的业务层接口
 * @date 2022/11/4
 */
public interface IProductService {
    /**
     * 按照priority查找热销前五的商品数据
     * @return 返回商品数据集合
     */
    List<Product> findHotList();

    /**
     * 按照商品状态和创建时间选取新商品集合
     * @return
     */
    List<Product> findNewProductList();

    /**
     * 根据商品id查找商品
     * @param id 商品id
     * @return 返回商品信息
     */
    Product findProductById(Integer id);

    /**
     * 按照标题查询
     * @param title
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageInfo<Product> findProductByTitle(String title, Integer pageNum, Integer pageSize);
}
