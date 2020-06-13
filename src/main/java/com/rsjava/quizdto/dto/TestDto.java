package com.rsjava.quizdto.dto;

import com.rsjava.quizdto.model.Question;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
public class TestDto {

    private Long id;
    private String name;
    private List<QuestionDto> questionDtoList = new ArrayList<>();
}
