package com.rsjava.quizdto.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Test extends EntityBase {

    @NonNull
    private String name;
    @NonNull
    private List<Question> questionList;
}
