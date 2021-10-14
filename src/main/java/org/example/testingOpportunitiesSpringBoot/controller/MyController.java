package org.example.testingOpportunitiesSpringBoot.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.example.testingOpportunitiesSpringBoot.service.MyService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Api(tags = "Имя класса")
@RestController
@RequestMapping("/bet")
@RequiredArgsConstructor
public class MyController {

    private final MyService myService;

    @ApiOperation("Описание метода. По умолчанию имя метода")
    @GetMapping()
    public Map<String, String> getMain() {
        return myService.getMap();
    }

    @PostMapping()
    public Map<String,String> add(String key, String value) {
        myService.addValue(key, value);
        return myService.getMap();
    }

    @GetMapping("{id}")
    public String one(@PathVariable String id) {
        return myService.getMap().get(id) == null ? "not found" : myService.getMap().get(id);
    }

}
