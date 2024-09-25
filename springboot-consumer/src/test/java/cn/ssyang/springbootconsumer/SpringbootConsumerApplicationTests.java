package cn.ssyang.springbootconsumer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SpringbootConsumerApplicationTests {

    @Resource
    private ConsumerServiceImpl consumerService;

    @Test
    void test() {
        consumerService.test();
    }
    @Test
    void contextLoads() {
    }

}
