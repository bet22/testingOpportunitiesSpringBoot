package org.example.testingOpportunitiesSpringBoot.repository;

import org.example.testingOpportunitiesSpringBoot.model.TestModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyRepo extends JpaRepository<TestModel, Long> {

}
