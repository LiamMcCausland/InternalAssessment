/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package internalassesment;
import internalassesment.Quiz;
/**
 *
 * @author l.mccausland
 */
public class QuizManager {
    
    public static LinkedList<Quiz> quizes;
    
    public QuizManager() {
        quizes = new LinkedList();
    }
    
    public static void addQuiz(Quiz quiz, int index) {
        quizes.add(quiz, index);
    }
}
