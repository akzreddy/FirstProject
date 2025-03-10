package com.firstSpringPorject.FirstProject;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class TestApplication {

    @RequestMapping("/test")
    public HashMap<String, String> rootTest(){
        HashMap<String, String> resp = new HashMap<>();
        resp.put("test", "test");
        return resp;
    }
}
