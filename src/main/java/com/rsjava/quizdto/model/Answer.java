package com.rsjava.quizdto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "answers")
@NoArgsConstructor
@RequiredArgsConstructor
public class Answer extends EntityBase {

    @NonNull
    private String name;
    @NonNull
    private boolean isCorrect;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "question_id")
    private Question question;
}


