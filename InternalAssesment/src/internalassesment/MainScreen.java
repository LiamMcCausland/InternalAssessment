package internalassesment;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatArcDarkContrastIJTheme;
import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author l.mccausland
 */
public class MainScreen extends javax.swing.JFrame {

    public int quizCount;
    final String USERNAME = System.getProperty("user.name");
    public final String PATH = "C:\\Users\\" + USERNAME + "\\Documents\\files\\";
    public QuizManager quizManager = new QuizManager();
    //public LinkedList quizManager = new LinkedList();

    //public final String PATH = System. getProperty("user. dir");
    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
        initComponents();
        setFrame();
        setList();
        getFiles();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        quizList = new java.awt.List();
        editButton = new javax.swing.JButton();
        startButton = new javax.swing.JButton();
        createButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        outputLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        quizList.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        quizList.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                quizListItemStateChanged(evt);
            }
        });
        quizList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quizListActionPerformed(evt);
            }
        });

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        startButton.setText("Start!");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        createButton.setText("Create Quiz");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        jLabel1.setText("Quiza!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(createButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(startButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(outputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(quizList, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(createButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(startButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editButton))
                    .addComponent(quizList, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(outputLabel)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Asks the user to enter the name of the quiz they want to create, then
     * creates it.
     *
     * @param evt
     */
    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        // Create Input Dialog
        String name = JOptionPane.showInputDialog("Enter quiz name: ");
        if (null == name) {
            JOptionPane.showMessageDialog(null, "enter a name!");
            // if the user adds spaces, tell them to enter something
        } else // if the user enters nothing, tell them to
            switch (name) {
                case "":
                    JOptionPane.showMessageDialog(null, "enter a name!");
                    // if the user enters the name, create the quiz
                    break;
                default:
                    //create a new quiz
                    createQuiz(name);
                    break;
            }
    }//GEN-LAST:event_createButtonActionPerformed
    /**
     * Checks if the "Start!" button was clicked and starts the selected quiz
     *
     * @param evt
     */
    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        try {
            if (quizList.getSelectedItem() == null) {
                output("Select a Quiz!");
            } else {
                Quiz quiz = quizManager.getQuiz(quizList.getSelectedIndex());
                File
                QuizScreen quizScreen = new QuizScreen(, File file = new File(PATH + quizList.getSelectedItem())));
            }
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");
        }
    }//GEN-LAST:event_startButtonActionPerformed

    /**
     * Checks if the edit button was clicked and edits the selected quiz
     *
     * @param evt
     */
    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        int index = quizList.getSelectedIndex();
        edit(index);
    }//GEN-LAST:event_editButtonActionPerformed

    /**
     * Checks if the delete button was clicked and then runs the deleteQuiz()
     * method
     *
     * @param evt
     */
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        deleteQuiz();
    }//GEN-LAST:event_deleteButtonActionPerformed
    /**
     * When the refresh button is clicked this method will run the getFiles()
     * method
     *
     * @param evt
     */
    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        getFiles();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void quizListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quizListActionPerformed
        System.out.println("click");
    }//GEN-LAST:event_quizListActionPerformed

    private void quizListItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_quizListItemStateChanged
        output("Selected Quiz: " + quizList.getSelectedItem());
    }//GEN-LAST:event_quizListItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            FlatArcDarkContrastIJTheme.setup();
        } catch (Exception e) {
            e.printStackTrace();
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainScreen().setVisible(true);
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
    private javax.swing.JButton createButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel outputLabel;
    private java.awt.List quizList;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton startButton;
    // End of variables declaration//GEN-END:variables

    /**
     * Creates a new quiz and adds it to the JList
     *
     * @param name the name the user entered
     */
    private void createQuiz(String name) {
        // adds the quiz to the list
        //quizCount++;
        Quiz newQuiz = new Quiz(name);
        quizManager.addQuiz(newQuiz, quizCount);
        String path = PATH + name;
        // save quiz to permanent storage
        try {
            FileWriter writer = new FileWriter(path);   // First object
            PrintWriter printer = new PrintWriter(writer);
            printer.print(newQuiz);                        // Call class method to write to file   
            printer.close();                                  // Close connection
        } catch (IOException error) {                         // catch error....
            output("File write error");                  // output message..
        }
        quizList.add(name);
        output("Quiz created");
    }

    /**
     * Set AWT List visuals
     */
    private void setList() {
        // set list visuals
        quizList.setBackground(new Color(37, 42, 53));
    }

    private void edit(int index) {
        String text = "";
        // edit quiz questions and properties
        if (quizList.getSelectedItem() == null) {
            output("Select a quiz!");
        } else {
            // Get the quiz that we are working with
            Quiz quiz = quizManager.getQuiz(index);

            String length = JOptionPane.showInputDialog(null,
                    "Enter how many questions you want in the quiz: ");
            for (int i = 0; i < Integer.parseInt(length); i++) {
                String newQuestion = JOptionPane.showInputDialog(null, "Enter question " + i + 1 + ": ");
                String newAnswer = JOptionPane.showInputDialog(null, "Enter answer to question " + i + 1 + ": ");
               //quiz.addQuestion(newQuestion, newAnswer);
                text += newQuestion + " | " + newAnswer + "\n";
            }
            addToQuiz(quizList.getSelectedItem(),text);
            
        }

        // open the quiz and edit the questions
    }

    public void addToQuiz(String item, String text) {
        try {
            File quizToEdit = new File(PATH + item);
            FileWriter writer = new FileWriter(quizToEdit.getPath());
            PrintWriter printer = new PrintWriter(writer);
            printer.println(text + "\n");
            printer.close();
        } catch (IOException e) {
            output("File Write error");
        }
    }

    public void getFiles() {
        quizList.removeAll();

        // Create a File object for the folder
        File folder = new File(PATH);

        // Get a list of all files in the folder
        File[] files = folder.listFiles();

        // Check if the folder exists
        if (!folder.exists()) {
            System.out.println("The folder does not exist. Creating Folder...");
            folder.mkdir();
        }

        // Check if the folder is empty
        if (files.length == 0) {
            System.out.println("The folder is empty.");
            return;
        }
        // Create quiz array 
        Quiz[] quizzes = new Quiz[files.length];

        // Print the list of files in the folder
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()) {
                quizList.add(files[i].getName());
                quizzes[i] = new Quiz(files[i].getName());
            }
        }

        for (int i = 0; i < quizzes.length; i++) {
            quizManager.addQuiz(quizzes[i], i);
        }

    }

    private void deleteQuiz() {
        if (quizList.getSelectedItem() == null) {
            output("Select a quiz!");
        } else {
            int option = JOptionPane.showConfirmDialog(null, "Are you sure?");
            if (option == 0) {
                String item = quizList.getSelectedItem();
                quizList.remove(item);
                File fileToDelete = new File(PATH + item);
                fileToDelete.delete();
            }
        }
    }

    private void output(String text) {
        outputLabel.setText(text);
    }
}
