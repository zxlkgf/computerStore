package com.zxl.store.controller;

import com.github.pagehelper.PageInfo;
import com.zxl.store.entity.Product;
import com.zxl.store.service.IProductService;
import com.zxl.store.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zxl
 * @description  处理商品相关请求的控制类
 * @date 2022/11/4
 */
@RestController
@RequestMapping("/product")
public class ProductController extends BaseController {
    @Autowired(required = false)
    private IProductService productService;

    /**
     *  返回热销商品
     * @return
     */
    @RequestMapping(value = "/hot_list",method = RequestMethod.GET)
    public JsonResult<List<Product>> getHotList(){
        //查询热销商品
        List<Product> data = productService.findHotList();
        return new JsonResult<>(OK,data);
    }

    /**
     *  返回新商品
     * @return
     */
    @RequestMapping(value = "/new_list",method = RequestMethod.GET)
    public JsonResult<List<Product>> getNewList(){
        //查询新到商品
        List<Product> data = productService.findNewProductList();
        return new JsonResult<>(OK,data);
    }

    @RequestMapping(value = "/{id}")
    public  JsonResult<Product> findProductById(@PathVariable("id")Integer id){
        //按照获得的id查询商品
        Product data = productService.findProductById(id);
        return new JsonResult<>(OK,data);
    }

    @RequestMapping(value = "/{pageNum}/{pageSize}/{title}",method = RequestMethod.GET)
    public JsonResult<PageInfo<Product>> findWithTitle(@PathVariable("pageNum") Integer pageNum,
                                                       @PathVariable("pageSize") Integer pageSize,
                                                       @PathVariable("title") String title){
        PageInfo<Product> res = productService.findProductByTitle(title, pageNum, pageSize);
        return new JsonResult<>(OK,res);
    }
}
