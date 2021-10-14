package org.example.testingOpportunitiesSpringBoot.model;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel
public class TestModel {
    private String id;
    private String name;
}
