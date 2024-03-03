package codegym.module3.repository;

import codegym.module3.models.Question;

import java.util.HashMap;
import java.util.Map;

public class QuestionRepository {
    Map<String, Question> questionMap;
    Map<String, String> answers;


    public QuestionRepository() {
        questionMap = new HashMap<>();

        answers = new HashMap<>();
        answers.put("Si", "Aceptar el reto");
        answers.put("No", "Rechazar el reto");
        questionMap.put("Perdiste la memoria", Question.builder()
                .label("Perdiste la memoria")
                .quest("¿Aceptas el reto?")
                .answers(answers)
                .build());

        answers = new HashMap<>();
        answers.put("Si", "Subir con el Capitan");
        answers.put("No", "Rechazar");
        questionMap.put("Aceptar el reto", Question.builder()
                .label("Haz aceptado el reto")
                .quest("¿Subiras al puente de mando con el Capitan?")
                .answers(answers)
                .build());

        answers = new HashMap<>();
        answers.put("Si", "Contar la verdad");
        answers.put("No", "Mentir");
        questionMap.put("Subir con el Capitan", Question.builder()
                .label("Ahora te encuentras con el Capitan")
                .quest("¿Quién eres?")
                .answers(answers)
                .build());

        questionMap.put("Contar la verdad", Question.builder()
                .label("Aceptamos regresarte a casa")
                .quest("Victoria!")
                .build());

        questionMap.put("Rechazar el reto", Question.builder()
                .label("Haz rechazado el reto")
                .quest("Fallaste")
                .build());

        questionMap.put("Rechazar", Question.builder()
                .label("Decidiste no seguir con las negociaciones")
                .quest("Fallaste")
                .build());

        questionMap.put("Mentir", Question.builder()
                .label("Descubrieron tu mentira")
                .quest("Fallaste")
                .build());
    }

    public Question getQuestion(String decision) {
        Question nextQuestion = questionMap.get(decision);
        return nextQuestion;
    }
}
