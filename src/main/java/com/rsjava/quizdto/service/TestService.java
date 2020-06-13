package com.rsjava.quizdto.service;

import com.rsjava.quizdto.model.Test;
import com.rsjava.quizdto.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    private TestRepository testRepository;

    @Autowired
    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    public Test findTestById(Long id){
        return testRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("There is no test number: " + id));
    }
}
