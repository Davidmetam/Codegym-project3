package codegym.module3.servlets;

import codegym.module3.models.Question;
import codegym.module3.services.QuestionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class ServletController extends HttpServlet {
    private final QuestionService questionService;
    private static final Logger logger = LoggerFactory.getLogger(ServletController.class);

    public ServletController() {
        questionService = new QuestionService();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String lastResponse = req.getParameter("ChallengeDecision");
        logger.info("Received response {}", lastResponse);

        Question nextQuestion = questionService.nextQuestion(lastResponse);
        logger.info("Next question is {}", nextQuestion);

        String destination = "game/game.jsp";
        RequestDispatcher requestDispatcher = req.getRequestDispatcher(destination);

        req.setAttribute("nextQuestion", nextQuestion);


        requestDispatcher.forward(req, resp);
    }

}
