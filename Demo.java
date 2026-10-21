import javax.swing.*;
import java.awt.*;

class ControlRoom extends JFrame{

    private JLabel lblTitle;


    ControlRoom(){
        setTitle("Control Room");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        lblTitle = new JLabel("");

        JButton btnAddDevice = new JButton("Add Device");
        add("Center",btnAddDevice);
        setVisible(true);
    }

}


public class Demo {
    public static void main (String args []){
        new ControlRoom();
    }
    
}