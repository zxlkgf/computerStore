package com.zxl.store.service.Impl;

import com.zxl.store.entity.Product;
import com.zxl.store.mappers.ProductMapper;
import com.zxl.store.service.IProductService;
import com.zxl.store.service.ex.ProductNotFoundException;
import com.zxl.store.service.ex.ProductStatusException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zxl
 * @description 处理商品的业务层实现类
 * @date 2022/11/4
 */
@Service
public class IProductServiceImpl implements IProductService {
    @Autowired(required = false)
    private ProductMapper productMapper;

    @Override
    public List<Product> findHotList() {
        //查找数据
        List<Product> res = productMapper.findHotList();
        return res;
    }

    @Override
    public List<Product> findNewProductList() {
        //查找数据
        List<Product> res = productMapper.findNewProductList();
        return res;
    }

    @Override
    public Product findProductById(Integer id) {
        //根据id查询商品信息
        Product res = productMapper.findProductById(id);
        //判断商品存在或者商品状态是否为上架
        if(res==null){
            throw new ProductNotFoundException("查询商品不存在");
        }
        if(res.getStatus()!=1){
            throw new ProductStatusException("查询商品尚未上架");
        }
        //传输商品信息
        return res;
    }
}
