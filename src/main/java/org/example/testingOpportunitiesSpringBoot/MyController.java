package org.example.testingOpportunitiesSpringBoot;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "Описание контроллера")
public class MyController {

    @ApiOperation("Описание метода. По умолчанию возвращает имя метода")
    @GetMapping("/")
    public String getMain(@RequestParam() String str) {
        return str != null ? str : "index";
    }
}
