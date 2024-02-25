/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package internalassesment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author l.mccausland
 */
public class QuizScreen extends javax.swing.JFrame {

    public String[] questions;
    public String[] answers;

    //public QuizManager manager = new QuizManager();
    /**
     * Creates new form QuizScreen
     */
    public QuizScreen(Quiz quiz, File file) {
        initComponents();
        setFrame();
        getQnA(quiz, file);
        test();
        quit();

    }

    private QuizScreen() {
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        titleLabel.setText("Quiza!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(250, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addContainerGap(432, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuizScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuizScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuizScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuizScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuizScreen().setVisible(true);
            }
        });
    }

    /**
     * sets the visual properties of the JFrame
     */
    private void setFrame() {
        //set window title
        this.setTitle("Quiza");
        //set frame size
        this.setSize(650, 480);
        //set to dispose on close
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        //set location to show up in the middle (null) 
        this.setLocationRelativeTo(null);
        //set frame visible
        this.setVisible(true);
        //set the frame resizabke property to false
        this.setResizable(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

    private void getQnA(Quiz quiz, File file) {
        try {
            FileReader reader = new FileReader(file);
            BufferedReader buffer = new BufferedReader(reader);
            String line = buffer.readLine();
            int count = 0;
            while (line != null) {
                if (!line.equals("")) {
                    count++;
                }
                line = buffer.readLine();
            }
            buffer.close();
            questions = new String[count];
            answers = new String[count];
            reader = new FileReader(file);
            buffer = new BufferedReader(reader);
            line = buffer.readLine();
            int i = 0;
            while (line != null) {
                String[] parts = line.split("\\|");
                if (parts.length == 2) {
                    questions[i] = parts[0].trim();
                    answers[i] = parts[1].trim();
                    System.out.println("Question: " + questions[i] + " Answer: " + answers[i]);
                    i++;
                }
                line = buffer.readLine();
            }
            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void test() {
        int numQuestions = questions.length;
        int numCorrect = 0;
        for (int i = 0; i < numQuestions; i++) {
            if (questions[i] == null) {
                JOptionPane.showMessageDialog(this, "You got " + numCorrect + " out of " + numQuestions + " questions correct.");
                return;
            }
            String userAnswer = JOptionPane.showInputDialog(this, "Question " + (i + 1) + ": " + questions[i]);
            if (userAnswer.trim().equalsIgnoreCase(answers[i])) {
                JOptionPane.showMessageDialog(this, "Correct!");
                numCorrect++;
            } else {
                JOptionPane.showMessageDialog(this, "Incorrect. The correct answer is: " + answers[i]);
            }
        }
        JOptionPane.showMessageDialog(this, "You got " + numCorrect + " out of " + numQuestions + " questions correct.");
    }

    private void quit() {
        this.setVisible(false);
        this.dispose();
    }

}