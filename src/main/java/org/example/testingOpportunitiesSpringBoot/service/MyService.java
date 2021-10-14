package org.example.testingOpportunitiesSpringBoot.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MyService {

    Map<String, String> map = new HashMap<String, String>() {{
        put("1", "first");
        put("2", "second");
        put("3", "free");
    }};

    public void addValue(String key, String value) {
        map.put(key, value);
    }

    public Map<String, String> getMap(){
        return map;
    }
}
