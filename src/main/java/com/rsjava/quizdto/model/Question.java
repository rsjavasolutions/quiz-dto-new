package com.rsjava.quizdto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@RequiredArgsConstructor
public class Question extends EntityBase {

    @NonNull
    private String content;
    @NonNull
    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
    private List<Answer> answerList;
    @NonNull
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "test_id")
    Test test;
}
