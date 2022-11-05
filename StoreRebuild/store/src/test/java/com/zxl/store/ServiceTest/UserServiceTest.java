package com.zxl.store.ServiceTest;

import com.zxl.store.entity.User;
import com.zxl.store.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author zxl
 * @description
 * @date 2022/10/30
 */
@SpringBootTest
public class UserServiceTest {
    @Autowired(required = false)
    private IUserService userService;

    //@Test
    public void userRegisterTest(){
        User user = new User();
        user.setUsername("root");
        user.setPassword("12345");
        userService.userRegister(user);
    }
}
