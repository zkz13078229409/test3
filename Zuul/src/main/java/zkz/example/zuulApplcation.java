package zkz.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableAutoConfiguration
public class zuulApplcation {
    public static void main(String[] args) {
        SpringApplication.run(zuulApplcation.class,args);
    }

}
