package com.example.ufun_practice.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.ufun_practice.entity.User;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {

    List<User> selectOne(QueryWrapper<List<User>> queryWrapper);
}
