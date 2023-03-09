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
    public LinkedList questions = new LinkedList();
    public LinkedList answers =  new LinkedList();

    public Quiz(String name) {
        this.name = name;
    }

    public void addQuestion(String question, String answer) {
        for (int i = 0; i < questions.size(); i++) {
            if (questions.getNode(i) != null) {
                questions.set(i, question);
            }
        }
        System.out.println("Question Added");
    }

    public String toString() {
        return this.name;
    }
}
