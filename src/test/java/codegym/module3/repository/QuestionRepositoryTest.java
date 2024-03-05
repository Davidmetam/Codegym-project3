package codegym.module3.repository;

import codegym.module3.models.Question;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class QuestionRepositoryTest {

    @Test
    public void getQuestion(){

        //incialización
        QuestionRepository repository = new QuestionRepository();
        //ejecución
        Question question = repository.getQuestion("Perdiste la memoria");

        //validación
        Assertions.assertEquals("Perdiste la memoria" ,question.getLabel());
        Assertions.assertEquals("¿Aceptas el reto?", question.getQuest());
        Assertions.assertEquals("Aceptar el reto", question.getAnswers().get("Si"));
        Assertions.assertEquals("Rechazar el reto", question.getAnswers().get("No"));
    }

}