package com.lumet.kaolinspringcloudclient;


import com.lumet.api.service.KaolinEchoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>  </p>
 * <p>
 * Description: todo
 *
 * @author phil.yue
 * @version V1.0.0
 * @date 2021/10/17 10:04 下午
 */
@RequestMapping("/echo")
@RestController
public class EchoController {

    @DubboReference
    private KaolinEchoService kaolinEchoService;

    @GetMapping
    public Object echo(@RequestParam String any) {

        return kaolinEchoService.echo(any);
    }
}
