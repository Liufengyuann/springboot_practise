package example.controller;

import example.bean.User;
import example.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.web.reactive.filter.OrderedHiddenHttpMethodFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.filter.HiddenHttpMethodFilter;

import java.util.Map;

@RestController
public class UserController {
    @Autowired
    RedisUtil redisUtil;
    // Restful风格
//    @RequestMapping(value = "/user/{userid}" ,method = RequestMethod.GET)
//    redis遇到一个序列化和反序列化的问题
//    public String getUser(@PathVariable("userid") Integer userid){
//        if(userid!=null){
//            User user = (User)redisUtil.get(userid.toString());
//            return user.toString();
//        }else {
//            return "error";
//        }
//    }
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String getUser(){
        return "GET-张三";
    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String saveUser(){
        return "POST-张三";
    }


    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public String putUser(){
        return "PUT-张三";
    }

    @RequestMapping(value = "/user",method = RequestMethod.DELETE)
    public String deleteUser(){
        return "DELETE-张三";
    }




    //自定义filter
    @Bean
    public HiddenHttpMethodFilter hiddenHttpMethodFilter(){
        HiddenHttpMethodFilter methodFilter = new HiddenHttpMethodFilter();
        methodFilter.setMethodParam("_m");
        return methodFilter;
    }

    @RequestMapping("/user/{userid}/{name}/{age}")
    public void setUser(@PathVariable("name") String username, @PathVariable("age") Integer age, @PathVariable("userid") Integer userid){
        User user = new User(username,age,userid);
        redisUtil.set(userid.toString(),user);
    }
}
