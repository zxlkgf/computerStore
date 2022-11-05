package com.zxl.store.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zxl
 * @description Cart表和Product表联合查询的结果映射实体类
 * @date 2022/11/5
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartVo {
    private Integer cid;
    private Integer pid;
    private Integer uid;
    private Long price;
    private Integer num;
    private String title;
    private String image;
    private String realPrice;
}
