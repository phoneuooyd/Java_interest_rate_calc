import javax.swing.*;
import java.awt.*;

public class myTopLabel extends JLabel {

    myTopLabel(){
        this.setLayout(null);
        this.setHorizontalAlignment(CENTER);
        this.setForeground(new Color(255, 255, 255));
        this.setFont(new Font("Dialog", Font.BOLD, 25));
        this.setBounds(0,0, 150, 100);
    }

}
