package com.rsjava.quizdto.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "tests")
@NoArgsConstructor
@RequiredArgsConstructor
public class Test extends EntityBase {

    @NonNull
    private String name;
    @OneToMany(mappedBy = "test", cascade = CascadeType.ALL)
    private List<Question> questionList = new ArrayList<>();

    public void addQuestion(Question question){
        questionList.add(question);
        question.setTest(this);
    }
}
