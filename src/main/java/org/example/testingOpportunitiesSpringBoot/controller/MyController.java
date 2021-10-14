package org.example.testingOpportunitiesSpringBoot.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.example.testingOpportunitiesSpringBoot.model.TestModel;
import org.example.testingOpportunitiesSpringBoot.service.MyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "Имя класса")
@RestController
@RequestMapping("/bet")
@RequiredArgsConstructor
public class MyController {

    private final MyService myService;

    @ApiOperation("Описание метода. По умолчанию имя метода")
    @GetMapping()
    public List<TestModel> getMain() {
        return myService.getMap();
    }

    @PostMapping()
    public List<TestModel> add(Long key, String value) {
        myService.addValue(key, value);
        return myService.getMap();
    }

    @GetMapping("{id}")
    public TestModel one(@PathVariable Long id) {
        return myService.getOne(id);
    }

}
