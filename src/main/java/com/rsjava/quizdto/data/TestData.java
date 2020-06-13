package com.rsjava.quizdto.data;

import com.rsjava.quizdto.model.Answer;
import com.rsjava.quizdto.model.Question;
import com.rsjava.quizdto.model.Test;
import com.rsjava.quizdto.repository.TestRepository;
import com.rsjava.quizdto.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestData implements CommandLineRunner {

    public static final boolean CORRECT = true;
    public static final boolean INCORRECT = false;
    private TestService testService;

    @Autowired
    public TestData(TestService testService) {
        this.testService = testService;
    }

    @Override
    public void run(String... args) throws Exception {

        Test test = new Test("Test wiedzy");
        Question question = new Question("What is the Capiotol of Poland");
        question.addAnswer(new Answer("Warszawa", CORRECT));
        question.addAnswer(new Answer("Mumbai", INCORRECT));
        question.addAnswer(new Answer("Kolkatta",INCORRECT));

        Question question2 = new Question("Who is CEO of Tesla Motors?");
        question2.addAnswer(new Answer("Bill Gates",INCORRECT));
        question2.addAnswer(new Answer("Steve Jobs",INCORRECT));
        question2.addAnswer(new Answer("Elon Musk",CORRECT));

        Question question3 = new Question("Name World's Richest Man?");
        question3.addAnswer(new Answer("Jeff Bazo",INCORRECT));
        question3.addAnswer(new Answer("Bill Gates",INCORRECT));
        question3.addAnswer(new Answer("Mark Zuckenberg",CORRECT));

        Question question4 = new Question("Word's Longest River?");
        question4.addAnswer(new Answer("River Nile",CORRECT));
        question4.addAnswer(new Answer("River Amazon",INCORRECT));
        question4.addAnswer(new Answer("River Godavari",INCORRECT));

        test.addQuestion(question);
        test.addQuestion(question2);
        test.addQuestion(question3);
        testService.save(test);
    }
}
