/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package internalassesment;
/**
 *
 * @author l.mccausland
 */
public class Quiz {

    public String name;

    public Quiz(String name) {
        this.name = name;
    }

    public LinkedList createQuiz() {
        LinkedList<String> newQuiz = new LinkedList<>();
        return newQuiz;
    }

    public void addQuestion(LinkedList quiz, String question, int index) {
        quiz.add(question, index);
    }

}
