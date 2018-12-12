package moe.cnkirito.hello;

/**
 * @author daofeng.xjf
 * @date 2018/12/6
 */
public class HelloProducer implements HelloApi {
    @Override
    public String sayHello() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "success";
    }
}
