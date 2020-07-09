package com.example.ufun_practice;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.ufun_practice.entity.User;
import com.example.ufun_practice.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest

public class UserTest {
    @Autowired
    @Qualifier("userMapper")
    private UserMapper userMapper;
/*
    @Test
    public void testSelect(){
        System.out.println("----- select All method test -----");
        List<User> userList = userMapper.selectList(null);
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);

        System.out.println("------------Update----------");
        userMapper.update(userMapper, );
    }*/


    @Test
    public void selectOne(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name", "Jack");
        User user = userMapper.selectOne(queryWrapper);
        System.out.println(user);
    }

    @Test
    public void selectLot(){
    /*    List<User> count = userMapper.selectList(null);
        for (User cou : count)
            System.out.println(cou);
*/
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.gt("age", 23);
        List<User> resu = userMapper.selectList(queryWrapper);
        for (User u : resu)
            System.out.println(u);
    }

    @Test
    public void selectMap(){
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.le("age", 24);
        List<Map<String, Object>> map = userMapper.selectMaps(queryWrapper);
    }

    @Test
    public void selectPage(){
        Page<User> page = new Page<>(2, 5);
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        Page<User> userIPage = userMapper.selectPage(page, queryWrapper);
        System.out.println(userIPage);
    }

}
