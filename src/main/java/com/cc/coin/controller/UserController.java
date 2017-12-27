package com.cc.coin.controller;

import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;
import javax.websocket.server.PathParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.cc.coin.entity.User;

@RestController
@RequestMapping("user")
public class UserController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    
    @RequestMapping(value ="/{id}/",method = RequestMethod.GET)
    public User greeting(@RequestParam(value="username", defaultValue="World") String name,@PathVariable("id") Integer id) {
    	 return new User(1,"2","3","4","5","6","7","8",new Date());
    }
    @RequestMapping(value ="/yalla",method = RequestMethod.GET)
    public User greeting() {
    	 return new User(1,"2","3","4","5","6","7","8",new Date());
    }
    @RequestMapping(value ="/yalla2",method = RequestMethod.GET)
    public User greetings() {
    	 return new User(1,"2","3","4","5","6","7","8",new Date());
    }
            
}
