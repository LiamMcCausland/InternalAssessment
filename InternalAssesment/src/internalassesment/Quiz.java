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

    public String[] createQuiz() {
        String[] newQuiz = null;
        System.out.println("Quiz Created");
        return newQuiz;
    }

    public void addQuestion(String[] quiz, String question, int index) {
        for (int i = 0; i < quiz.length; i++) {
            if (quiz[i] == null) {
                quiz[i] = question;
            }
        }
        System.out.println("Question Added");
    }

}
