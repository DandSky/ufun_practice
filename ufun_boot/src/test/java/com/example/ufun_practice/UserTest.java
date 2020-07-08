package com.example.ufun_practice;

import com.example.ufun_practice.entity.User;
import com.example.ufun_practice.mapper.UserMapper;
import net.minidev.json.JSONUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest

public class UserTest {
    @Autowired
    @Qualifier("userMapper")
    private UserMapper userMapper;

    @Test
    public void testSelect(){
        System.out.println("----- select All method test -----");
        List<User> userList = userMapper.selectList(null);
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);

        System.out.println("------------Update----------");
        userMapper.update(userMapper, );
    }

}
