package com.example.ssw.service.impl;

import com.example.ssw.entity.User;
import com.example.ssw.mapper.UserMapper;
import com.example.ssw.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author sky
 * @since 2020-07-08
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
