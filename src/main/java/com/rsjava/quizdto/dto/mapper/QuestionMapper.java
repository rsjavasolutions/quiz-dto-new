package com.rsjava.quizdto.dto.mapper;

import com.rsjava.quizdto.dto.QuestionDto;
import com.rsjava.quizdto.model.Question;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class QuestionMapper {

    public List<QuestionDto> mapToListQuestionDto(List<Question> questionList){
        return questionList.stream()
                .map(question -> mapToQuestionDto(question))
                .collect(Collectors.toList());
    }

    public QuestionDto mapToQuestionDto(Question question){
        QuestionDto questionDto = new QuestionDto();
        questionDto.setId(question.getId());
        questionDto.setContent(question.getContent());
        questionDto.setOptions(getOptions(question));
        questionDto.setCorrectAnswer(getCorrectAnswer(question));
        return questionDto;
    }

    private List<String> getOptions(Question question){
        return question.getAnswerList().stream()
                .map(answer -> answer.getName())
                .collect(Collectors.toList());
    }

    private String getCorrectAnswer(Question question){
        return question.getAnswerList().stream()
                .filter(answer -> answer.isCorrect())
                .map(answer -> answer.getName())
                .findFirst().get();
    }
}
