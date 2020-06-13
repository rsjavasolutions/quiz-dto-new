package com.rsjava.quizdto.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class QuestionDto {

    private Long id;
    private String content;
    private List<String> options = new ArrayList<>();
    private String correctAnswer;

}
