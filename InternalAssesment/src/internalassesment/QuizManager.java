package internalassesment;

import collections.LinkedList;

/**
 *
 * @author l.mccausland
 */
public class QuizManager {

    public static LinkedList<Quiz> manager = new LinkedList();

    /**
     * Adds a given quiz object to the manager linkedList
     * 
     * @param quiz the quiz that was given
     * @param index the index to add it to
     */
    public static void addQuiz(Quiz quiz, int index) {
        manager.add(quiz, index);
    }

    /**
     * Adds a given array of quizzes to the manager
     * 
     * @param quizzes the given array of quizzes
     */
    public static void addQuiz(Quiz[] quizzes) { 
        for (int i = 0; i < quizzes.length; i++) {
            manager.add(quizzes[i], i);
            System.out.println(quizzes[i].name + " was added at index " + i);
        }
    }
    
    /**
     * gets the index of the given quiz from the manager
     * 
     * @param quiz the quiz to find
     * @return the index the given quiz is in
     */
    public static int getIndex(Quiz quiz) {
        for (int i = 0; i < manager.size(); i++) {
            if (manager.get(i) == quiz) {
                return i;
            }
        }
        return 0;
    }
    
    /**
     * Gets a quiz from the manager
     * 
     * @param index the index of the quiz to return
     * @return the quiz located at the given index
     */
    public static Quiz getQuiz(int index) {
        Quiz quiz = manager.get(index);
        return quiz;
    }

    /**
     * Gets a quiz from the manager using a given name
     * 
     * @param name the name to find
     * @return the quiz with the given name
     */
    public static Quiz getQuiz(String name) {
        for (int i = 0; i < manager.size(); i++) {
            if (manager.get(i).name == name) {
                return manager.get(i);
            }
        }
        return null;
    }
}
