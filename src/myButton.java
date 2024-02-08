import javax.swing.*;
import java.awt.*;

public class myButton extends JButton {
    
    myButton(String buttonText){
        ImageIcon buttonSprite = new ImageIcon("buttonSprite.png");
        this.setText(buttonText);
        this.setBounds(0, 0, 140, 40);
        this.setFocusable(true);
        this.setHorizontalTextPosition(SwingConstants.CENTER);
        this.setVerticalTextPosition(SwingConstants.CENTER);
        this.setForeground(new Color(255, 255, 240));
        this.setIcon(buttonSprite);
        this.setLayout(null);
        this.setOpaque(false);
        this.setBorder(null);
    }

}

