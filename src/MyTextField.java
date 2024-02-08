import javax.swing.*;
import java.awt.*;

public class MyTextField extends JTextField {

    MyTextField(int width, int height){
        this.setForeground(new Color(255, 240, 240));
        this.setBackground(new Color(128, 128, 128));
        this.setFont(new Font("Dialog", Font.BOLD, 24));
        this.setCaretColor(new Color(255,240,240));

        this.setPreferredSize(new Dimension(width, height));
    }

}
