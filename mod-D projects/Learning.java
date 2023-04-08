import javax.swing.*;

public class Learning {

    JFrame   frame;

    Learning(){

          frame = new JFrame("my window");
          frame.setVisible(true);
          frame.setBounds(300,300,100,300);
    }
    public static void main(String[] args) {

           new Learning();


    }
}
