package com.kob.backend.controller.pk;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/pk/")
@CrossOrigin(origins="*")
public class BotInfoController {

    @RequestMapping("getbotinfo/")
    @CrossOrigin(origins="*")
    public Map<String,String> getBotInfo(){
            Map<String,String> m = new HashMap<>();
            m.put("name","tiger");
            m.put("rating","1500");
            return m;
    }

}
