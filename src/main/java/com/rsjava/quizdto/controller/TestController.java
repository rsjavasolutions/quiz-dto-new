package com.rsjava.quizdto.controller;

import com.rsjava.quizdto.dto.TestDto;
import com.rsjava.quizdto.dto.mapper.TestMapper;
import com.rsjava.quizdto.model.Test;
import com.rsjava.quizdto.repository.TestRepository;
import com.rsjava.quizdto.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class TestController {

    private TestMapper testMapper;
    private TestService testService;

    @Autowired
    public TestController(TestMapper testMapper, TestService testService) {
        this.testMapper = testMapper;
        this.testService = testService;
    }

    @GetMapping("tests/{id}")
    public TestDto getTestById(@PathVariable Long id) {
        return testMapper.mapToTestDto(testService.findTestById(id));
    }
}
