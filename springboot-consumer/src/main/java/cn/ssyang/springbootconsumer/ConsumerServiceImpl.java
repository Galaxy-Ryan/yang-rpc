package cn.ssyang.springbootconsumer;

import cn.ssyang.common.model.User;
import cn.ssyang.common.service.UserService;
import cn.ssyang.yangrpc.springboot.starter.annotation.RpcReference;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl {

    @RpcReference
    private UserService userService;

    public void test() {
        User user = new User();
        user.setName("aubrey");
        User result = userService.getUser(user);
        System.out.println(result);
    }
}
