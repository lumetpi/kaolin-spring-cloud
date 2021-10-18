package com.lumet.kaolinspringcloudprovider;


import com.lumet.api.service.KaolinEchoService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * <p>  </p>
 * <p>
 * Description: todo
 *
 * @author phil.yue
 * @version V1.0.0
 * @date 2021/10/17 9:48 下午
 */
@DubboService
public class SimpleEchoService implements KaolinEchoService {

    @Override
    public String echo(String any) {
        System.out.println("provider echo : " + any);
        return "provider echo : " + any;
    }
}
