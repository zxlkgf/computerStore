package com.zxl.store.MappersTest;

import com.zxl.store.entity.District;
import com.zxl.store.mappers.DistrictMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author zxl
 * @description
 * @date 2022/11/3
 */
@SpringBootTest
public class DistrictMapperTest {
    @Autowired(required = false)
    private DistrictMapper districtMapper;

    //@Test
    public void findDistrictByParentTest(){
        List<District> parent = districtMapper.findDistrictByParent("86");
        for (District district : parent) {
            System.out.println(district);
        }
    }
}
