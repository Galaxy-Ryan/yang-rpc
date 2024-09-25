package cn.ssyang.provider;

import cn.ssyang.common.model.User;
import cn.ssyang.common.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User getUser(User user) {
        System.out.println("用户名：" + user.getName());
        return user;
    }
}
