package internalassesment;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author l.mccausland
 */
public class Quiz {

    public String name;
    public LinkedList questions = new LinkedList();
    public LinkedList answers = new LinkedList();

    public Quiz(String name) {
        this.name = name;
    }

    /**
     * Adds a question and answers to their designated linkedList
     *
     * @param question the question to add
     * @param answer the answer to that question
     */
    public void addQuestion(String question, String answer) {
        for (int i = 0; i < questions.size(); i++) {
            if (questions.getNode(i) != null) {
                questions.set(i, question);
            }
        }
        for (int i = 0; i < answers.size(); i++) {
            if (answers.getNode(i) != null) {
                answers.set(i, question);
            }
        }

        System.out.println("Question Added");
    }
}
