package example.controller;

import example.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties(Car.class)
public class HelloWorldController {
    @Autowired
    Car car;
    @RequestMapping("/car")
    public Car mycar(){
        return car;
    }
}
