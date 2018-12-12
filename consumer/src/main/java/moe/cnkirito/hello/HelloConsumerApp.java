package moe.cnkirito.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author daofeng.xjf
 * @date 2018/12/7
 */
@SpringBootApplication
public class HelloConsumerApp {

    public static void main(String[] args) {
        SpringApplication.run(HelloConsumerApp.class, args);
    }

    @Bean
    HelloApi helloApi() {
        // add dubbo consumer here
        return null;
    }

}
