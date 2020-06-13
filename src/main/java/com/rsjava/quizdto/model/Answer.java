package com.rsjava.quizdto.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;

@Data
@Entity
@NoArgsConstructor
@RequiredArgsConstructor
public class Answer extends EntityBase {

    @NonNull
    private String name;
    @NonNull
    private boolean isCorrect;
}


