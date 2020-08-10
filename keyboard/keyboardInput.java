import javax.swing.*;

public class keyboardInput {
    public static void main ( String[] args ) {
        JFrame f=new JFrame();

        JButton b=new JButton("click Here");

        b.setBounds(130 , 100 , 100 , 40);

        f.add(b);

        f.setSize(800 , 800);

        f.setLayout(null);

        f.setVisible(true);

    }
}



