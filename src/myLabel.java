import javax.swing.*;
import java.awt.*;

public class myLabel extends JLabel {

    myLabel(String label){
        this.setText(label);
        this.setHorizontalAlignment(CENTER);
        this.setForeground(new Color(215, 200, 200));
        this.setFont(new Font("Dialog", Font.BOLD, 25));
        this.setPreferredSize(new Dimension(350, 50));
    }
}
