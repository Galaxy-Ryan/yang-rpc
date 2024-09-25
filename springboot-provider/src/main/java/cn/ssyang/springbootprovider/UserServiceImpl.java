package cn.ssyang.springbootprovider;

import cn.ssyang.common.model.User;
import cn.ssyang.common.service.UserService;
import cn.ssyang.yangrpc.springboot.starter.annotation.RpcService;
import org.springframework.stereotype.Service;

@Service
@RpcService
public class UserServiceImpl implements UserService {
    @Override
    public User getUser(User user) {
        System.out.println("用户名：" + user.getName());
        return user;
    }
}
