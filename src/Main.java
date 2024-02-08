import javax.swing.*;
import java.awt.*;

public class Main {
    static MyFrame mainFrame;

    public static void main(String[] args) {

        mainFrame = new MyFrame();

    }
    public static void changeFrame(byte FRAME_ID){
        switch (FRAME_ID){
            case  (byte) 1: {
                CalculatorFrame.EditMainPanel();
                CalculatorFrame.EditTopPanel();
            }
        }
    }

}