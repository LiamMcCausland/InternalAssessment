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
    public String[] questions;
    public String[] answers;

    public Quiz(String name) {
        this.name = name;
    }

    public void addQuestion(String question, String answer) {
        for (int i = 0; i < questions.length; i++) {
            if (questions[i] != null) {
                questions[i] = question;
            }
        }
        System.out.println("Question Added");
    }

    public String toString() {
        return this.name;
    }
}
