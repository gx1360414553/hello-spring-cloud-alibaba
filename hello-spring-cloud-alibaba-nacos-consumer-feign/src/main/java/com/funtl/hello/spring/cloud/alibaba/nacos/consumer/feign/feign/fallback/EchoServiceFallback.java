package com.funtl.hello.spring.cloud.alibaba.nacos.consumer.feign.feign.fallback;

import com.funtl.hello.spring.cloud.alibaba.nacos.consumer.feign.feign.EchoService;
import org.springframework.stereotype.Component;

/**
 * @author 高雄
 * @version 1.0.0
 * @Description TODO
 * @createTime 2019年08月21日 09:53:00
 */
@Component
public class EchoServiceFallback implements EchoService {

    @Override
    public String echo(String message) {
        return "网络出现问题,echo fallback";
    }
}
