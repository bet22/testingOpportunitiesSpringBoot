package org.example.testingOpportunitiesSpringBoot;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api(tags = "Имя класса")
@RestController
@RequestMapping("/bet")
public class MyController {

    Map<String, String> map = new HashMap<String, String>() {{
        put("1", "first");
        put("2", "second");
        put("3", "free");
    }};

    @ApiModel
    class Test {
        private String str = "2";

        public String getStr() {
            return str;
        }
    }

    @ApiOperation("Описание метода. По умолчанию имя метода")
    @GetMapping()
    public Map<String, String> getMain() {
        return map;
    }

    @PostMapping()
    public Map<String,String> add(String key, String value) {
        map.put(key, value);
        return map;
    }

    @GetMapping("{id}")
    public String one(@PathVariable String id) {
        return map.get(id) == null ? "not found" : map.get(id);
    }

}
