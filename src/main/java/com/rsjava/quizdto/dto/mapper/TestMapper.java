package com.rsjava.quizdto.dto.mapper;

import com.rsjava.quizdto.dto.TestDto;
import com.rsjava.quizdto.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestMapper {

    private QuestionMapper questionMapper;

    @Autowired
    public TestMapper(QuestionMapper questionMapper) {
        this.questionMapper = questionMapper;
    }

    public TestDto mapToTestDto(Test test){
        TestDto testDto = new TestDto();
        testDto.setId(test.getId());
        testDto.setName(test.getName());
        testDto.setQuestionDtoList(questionMapper.mapToListQuestionDto(test.getQuestionList()));
        return testDto;
    }
}
