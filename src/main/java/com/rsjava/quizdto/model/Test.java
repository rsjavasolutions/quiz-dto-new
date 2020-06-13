package com.rsjava.quizdto.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@RequiredArgsConstructor
public class Test extends EntityBase {

    @NonNull
    private String name;
    @NonNull
    @OneToMany(mappedBy = "test", cascade = CascadeType.ALL)
    private List<Question> questionList;
}
