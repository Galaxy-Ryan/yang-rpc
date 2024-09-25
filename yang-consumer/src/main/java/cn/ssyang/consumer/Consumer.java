package cn.ssyang.consumer;

import cn.ssyang.common.model.User;
import cn.ssyang.common.service.UserService;
import cn.ssyang.yangrpc.RpcApplication;
import cn.ssyang.yangrpc.bootstrap.ConsumerBootstrap;
import cn.ssyang.yangrpc.config.RpcConfig;
import cn.ssyang.yangrpc.proxy.ServiceProxyFactory;
import cn.ssyang.yangrpc.utils.ConfigUtils;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Consumer {
    public static void main(String[] args) {
        // 服务消费者初始化
        ConsumerBootstrap.init();
        // 获取代理
        UserService userService = ServiceProxyFactory.getProxy(UserService.class);
        User user = new User();
        user.setName("aubrey");
        User user1 = userService.getUser(user);
        if(user1 == null) {
            System.out.println("user == null");
        }else {
            System.out.println(user1);
        }
    }
}
