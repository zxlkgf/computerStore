package com.zxl.store.MappersTest;

import com.zxl.store.entity.User;
import com.zxl.store.mappers.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author zxl
 * @description
 * @date 2022/10/30
 */
@SpringBootTest
public class UserMapperTest {
    @Autowired(required = false)
    private UserMapper userMapper;

    //@Test
    public void addUserTest(){
        User user = new User();
        user.setUsername("root");
        user.setPassword("1234");
        Integer integer = userMapper.addUser(user);
        if(integer!=1) System.out.println("失败");
        else System.out.println("成功");
    }

    //@Test
    public  void findUserByUsernameTest(){
        String username = "root";
        User userByUsername = userMapper.findUserByUsername(username);
        System.out.println(userByUsername);
    }

}
