package codegym.module3.services;

import codegym.module3.models.Question;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class QuestionServiceTest{

    @Test
    public void getNextQuestion(){

        //incialización
        QuestionService questionService = new QuestionService();
        //ejecución
        Question question = questionService.nextQuestion("Perdiste la memoria");

        //validación
        Assertions.assertEquals("Perdiste la memoria" ,question.getLabel());
        Assertions.assertEquals("¿Aceptas el reto?", question.getQuest());
        Assertions.assertEquals("Aceptar el reto", question.getAnswers().get("Si"));
        Assertions.assertEquals("Rechazar el reto", question.getAnswers().get("No"));
    }

}