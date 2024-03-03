package codegym.module3.services;

import codegym.module3.models.Question;
import codegym.module3.repository.QuestionRepository;

public class QuestionService {
    QuestionRepository questionRepository;

    public QuestionService() {
        questionRepository = new QuestionRepository();
    }


    public Question nextQuestion(String decision) {
        return questionRepository.getQuestion(decision);
    }
}
