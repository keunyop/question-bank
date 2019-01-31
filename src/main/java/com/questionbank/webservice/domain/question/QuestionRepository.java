package com.questionbank.webservice.domain.question;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class QuestionRepository {
    public List<Question> getQuestionsFromFile(String questionId) {

        List<Example> examples = new ArrayList<>();
        examples.add(Example.builder().exampleText("보기1").answer(false).build());
        examples.add(Example.builder().exampleText("보기2").answer(false).build());
        examples.add(Example.builder().exampleText("보기3").answer(true).build());
        examples.add(Example.builder().exampleText("보기4").answer(false).build());

        List<Question> questions = new ArrayList<>();
        questions.add(Question.builder().number(1).questionText("문제내용").examples(examples).explanation("설명")
                .reference("참조").build());

        return questions;
    }
}
