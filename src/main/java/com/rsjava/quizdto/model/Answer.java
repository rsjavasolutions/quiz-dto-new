package com.rsjava.quizdto.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Answer extends EntityBase {

    @NonNull
    private String name;
    @NonNull
    private boolean isCorrect;
}


