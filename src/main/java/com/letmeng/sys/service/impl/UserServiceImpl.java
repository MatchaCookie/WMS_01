package com.letmeng.sys.service.impl;

import com.letmeng.sys.domain.User;
import com.letmeng.sys.mapper.UserMapper;
import com.letmeng.sys.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author letmeng
 * @since 2022-05-03
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
