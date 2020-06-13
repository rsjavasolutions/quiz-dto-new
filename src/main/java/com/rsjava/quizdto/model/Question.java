package com.rsjava.quizdto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "questions")
@NoArgsConstructor
@RequiredArgsConstructor
public class Question extends EntityBase {

    @NonNull
    private String content;
    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
    private List<Answer> answerList = new ArrayList<>();
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "test_id")
    Test test;

    public void addAnswer(Answer answer){
        answerList.add(answer);
        answer.setQuestion(this);
    }
}
