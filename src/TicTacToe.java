import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class TicTacToe implements ActionListener{
    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel title = new JPanel();
    JPanel button = new JPanel();
    JLabel textfield = new JLabel();
    JButton[] buttons = new JButton[9];
    boolean player1_turn;
    TicTacToe(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.getContentPane().setBackground(new Color(50,50,50));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        textfield.setBackground(new Color(20,20,20));
        textfield.setForeground(new Color(25,255,0));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("TIC TAC TOE");
        textfield.setOpaque(true);
        title.setLayout(new BorderLayout());
        title.setBounds(0,0,800,100);
        button.setLayout(new GridLayout(3,3));
       // button.setBackground(new Color(150,150,150));
        for(int i = 0;i < 9;i++){
            buttons[i] = new JButton();
            button.add(buttons[i]);
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
            first();
        }
        title.add(textfield);
        frame.add(title,BorderLayout.NORTH);
        frame.add(button);
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        for(int i = 0; i < 9; i++){
            if(actionEvent.getSource() == buttons[i]) {
                if (player1_turn) {
                    if (buttons[i].getText() == "") {
                        buttons[i].setForeground(new Color(255, 0, 0));
                        buttons[i].setText("X");
                        player1_turn = false;
                        textfield.setText("O Turn");
                        check();
                    }
                }
                else{
                    if(buttons[i].getText() == ""){
                        buttons[i].setForeground(new Color(5,0,250));
                        buttons[i].setText("O");
                        player1_turn = true;
                        textfield.setText("X Turn");
                        check();
                    }
                }
            }
        }
    }
    public void first(){
        if(random.nextInt(2) == 0){
            player1_turn = true;
            textfield.setText("X Turn");
        }
        else if(random.nextInt(2) == 0){
            player1_turn = false;
            textfield.setText("0 Turn");
        }
    }

    public void check(){

        if((buttons[0].getText() == "X") && (buttons[1].getText() == "X") && (buttons[2].getText() == "X")){

            xwins(0,1,2);

        }
        if((buttons[3].getText() == "X") && (buttons[4].getText() == "X") && (buttons[5].getText() == "X")){

            xwins(3,4,5);

        }
        if((buttons[6].getText() == "X") && (buttons[7].getText() == "X") && (buttons[8].getText() == "X")){

            xwins(6,7,8);

        }

        if((buttons[0].getText() == "X") && (buttons[3].getText() == "X") && (buttons[6].getText() == "X")){

            xwins(0,3,6);

        }

        if((buttons[1].getText() == "X") && (buttons[4].getText() == "X") && (buttons[7].getText() == "X")){

            xwins(1,4,7);

        }

        if((buttons[2].getText() == "X") && (buttons[5].getText() == "X") && (buttons[8].getText() == "X")){

            xwins(2,5,8);

        }

        if((buttons[0].getText() == "X") && (buttons[4].getText() == "X") && (buttons[8].getText() == "X")){

            xwins(0,4,8);

        }

        if((buttons[2].getText() == "X") && (buttons[4].getText() == "X") && (buttons[6].getText() == "X")){

            xwins(2,4,6);

        }






        if((buttons[0].getText() == "O") && (buttons[1].getText() == "O") && (buttons[2].getText() == "O")){

            owins(0,1,2);

        }
        if((buttons[3].getText() == "O") && (buttons[4].getText() == "O") && (buttons[5].getText() == "O")){

            owins(3,4,5);

        }
        if((buttons[6].getText() == "O") && (buttons[7].getText() == "O") && (buttons[8].getText() == "O")){

            owins(6,7,8);

        }

        if((buttons[0].getText() == "O") && (buttons[3].getText() == "O") && (buttons[6].getText() == "O")){

            owins(0,3,6);

        }

        if((buttons[1].getText() == "O") && (buttons[4].getText() == "O") && (buttons[7].getText() == "O")){

            owins(1,4,7);

        }

        if((buttons[2].getText() == "O") && (buttons[5].getText() == "O") && (buttons[8].getText() == "O")){

            owins(2,5,8);

        }

        if((buttons[0].getText() == "O") && (buttons[4].getText() == "O") && (buttons[8].getText() == "O")){

            owins(0,4,8);

        }

        if((buttons[2].getText() == "O") && (buttons[4].getText() == "O") && (buttons[6].getText() == "O")){

            owins(2,4,6);

        }


    }

    public void xwins(int a,int b,int c){

        buttons[a].setBackground(Color.green);
        buttons[b].setBackground(Color.green);
        buttons[c].setBackground(Color.green);

        for(int i=0;i<9;i++){

            buttons[i].setEnabled(false);

        }

        textfield.setText("X WINS");

    }
    public void owins(int a,int b,int c){

        buttons[a].setBackground(Color.green);
        buttons[b].setBackground(Color.green);
        buttons[c].setBackground(Color.green);

        for(int i=0;i<9;i++){

            buttons[i].setEnabled(false);

        }

        textfield.setText("O WINS");


    }









}
