package codegym.module3.models;

import lombok.Builder;
import lombok.Data;

import java.util.Map;
@Data
@Builder
public class Question {
    String label;
    String quest;
    Map<String, String> answers;


}
