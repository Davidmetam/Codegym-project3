package codegym.module3.servlets;

import codegym.module3.models.Question;
import codegym.module3.services.QuestionService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class ServletController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        QuestionService questionService = new QuestionService();
        String lastQuestion = req.getParameter("ChallengeDecision");

        Question nextQuestion = questionService.nextQuestion(lastQuestion);

        String destination = "game/game.jsp";
        RequestDispatcher requestDispatcher = req.getRequestDispatcher(destination);

        req.setAttribute("nextQuestion", nextQuestion);

        requestDispatcher.forward(req, resp);
    }

}
