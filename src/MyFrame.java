import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton buttonCalculator;
    JButton button2;
    JButton button3;
    JPanel leftPanel;
    JPanel topPanel;
    JPanel mainPanel;
    JLabel logo;
    JLabel title;
    JLabel printInstallment;
    MyFrame(){

        ImageIcon logoImg = new ImageIcon("logo.png");

        leftPanel = new JPanel();
        topPanel = new JPanel();
        mainPanel = new JPanel();
        logo = new JLabel();
        title = new myTopLabel();

        logo.setLayout(null);
        logo.setHorizontalAlignment(SwingConstants.LEFT);
        logo.setIcon(logoImg);
        logo.setBounds(0,0, 150, 100);

        buttonCalculator = new myButton("Oblicz ratę");
        buttonCalculator.addActionListener(this);
        button2 = new myButton("sample text");
        button2.addActionListener(this);
        button3 = new myButton("sample text 2");
        button3.addActionListener(this);
        topPanel.setLayout(new BorderLayout());
        topPanel.add(logo);
        topPanel.add(title);

        mainPanel.setLayout(new FlowLayout());

        leftPanel.add(buttonCalculator);
        leftPanel.add(button2);
        leftPanel.add(button3);

        topPanel.setBackground(new Color(128, 128, 128));
        leftPanel.setBackground(new Color(128, 128, 128));
        mainPanel.setBackground(new Color(35,35,35));

        topPanel.setBounds(0,0, 800, 100);
        leftPanel.setBounds(0,100, 150, 500);
        mainPanel.setBounds(150, 100, 650, 500);

        this.setTitle("GUI Project 2");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,600);
        this.setVisible(true);
        this.setResizable(false);
        this.add(topPanel);
        this.add(leftPanel);
        this.add(mainPanel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        byte FRAME_ID;
        if(e.getSource() == buttonCalculator){
            Main.changeFrame((byte) 1);
        }
        else if(e.getSource() == button2){
            System.out.println("btn2");
        }
        else if(e.getSource() == button3){
            System.out.println("btn3");
        }
    }
}