package org.example.testingOpportunitiesSpringBoot.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class TestModel {
    @Id
    private Long id;
    private String name;
}
