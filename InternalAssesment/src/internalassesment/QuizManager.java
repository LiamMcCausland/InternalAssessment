/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package internalassesment;

import collections.LinkedList;

/**
 *
 * @author l.mccausland
 */
public class QuizManager { 
    public static LinkedList<Quiz> manager = new LinkedList();
    
    public QuizManager() {
        
    }
    
    public static void addQuiz(Quiz quiz, int index) {
        manager.add(quiz, index);
    }
    
    public static int getIndex(Quiz quiz) {
        for (int i = 0; i < manager.size(); i++) {
            if (manager.get(i).name == quiz.name) {
                return i;
            } 
        }
        return 0;
    }
}
