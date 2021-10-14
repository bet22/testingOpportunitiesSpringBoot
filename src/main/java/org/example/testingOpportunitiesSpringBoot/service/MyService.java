package org.example.testingOpportunitiesSpringBoot.service;

import lombok.RequiredArgsConstructor;
import org.example.testingOpportunitiesSpringBoot.model.TestModel;
import org.example.testingOpportunitiesSpringBoot.repository.MyRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MyService {

    private final MyRepo repo;

    public void addValue(Long key, String value) {
        TestModel testModel = new TestModel();
        testModel.setId(key);
        testModel.setName(value);
        repo.save(testModel);
    }

    public List<TestModel> getMap() {
        return repo.findAll();
    }

    public TestModel getOne(Long id) {
        return repo.findById(id).orElse(null);
    }
}
