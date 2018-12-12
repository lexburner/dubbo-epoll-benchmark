package moe.cnkirito.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author daofeng.xjf
 * @date 2018/12/6
 */
@RestController
public class HelloConsumer {

    @Autowired
    HelloApi helloApi;

    @RequestMapping(path = "/benchmark")
    public String benchmark() {
        helloApi.sayHello();
        return "success";
    }

}
