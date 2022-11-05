package com.zxl.store.MappersTest;

import com.zxl.store.entity.Address;
import com.zxl.store.mappers.AddressMapper;
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
public class AddressMapperTest {
    @Autowired(required = false)
    private AddressMapper addressMapper;

   // @Test
    public void findByUidTest(){
        List<Address> res = addressMapper.findByUid(1);
        for (Address a : res) {
            System.out.println(a);
        }
    }
}
