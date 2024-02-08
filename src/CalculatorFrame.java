import javax.swing.*;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class CalculatorFrame extends MyFrame implements ActionListener {
    JPanel calculatorMainPanel;
    JPanel calculatorTopPanel;
    static String JAnswear;

    CalculatorFrame(){

        this.calculatorMainPanel = Main.mainFrame.mainPanel;
        this.calculatorTopPanel = Main.mainFrame.topPanel;
    }

    public static void EditMainPanel(){

        JLabel principle =         new myLabel("Jaka kwota kredytu?");
        JTextField principle_TF = new MyTextField(200,50);

        JLabel annualInterestRate = new myLabel("Stopa oprocentowania");
        JTextField annualInterestRate_TF = new MyTextField(200,50);

        JLabel amountOfYears =     new myLabel("Na jaką ilość lat?");
        JTextField amountOfYears_TF = new MyTextField(200,50);

        JButton calculate =        new myButton("Oblicz!");


        JLabel printInstallment = new myLabel("");

        Main.mainFrame.mainPanel.add(principle);
        Main.mainFrame.mainPanel.add(principle_TF);
        Main.mainFrame.mainPanel.add(annualInterestRate);
        Main.mainFrame.mainPanel.add(annualInterestRate_TF);
        Main.mainFrame.mainPanel.add(amountOfYears);
        Main.mainFrame.mainPanel.add(amountOfYears_TF);
        Main.mainFrame.mainPanel.add(calculate);
        Main.mainFrame.mainPanel.add(printInstallment);

        calculate.addActionListener(e -> {
            double hajs = Double.parseDouble(principle_TF.getText());
            double intrestRate = Double.parseDouble(annualInterestRate_TF.getText());
            double years = Double.parseDouble(amountOfYears_TF.getText());

            JAnswear = CalculateInstallment(hajs, intrestRate, years);
            printInstallment.setText(JAnswear);
        });

    }
    public static void EditTopPanel(){

        Main.mainFrame.title.setText("KALKULATOR KREDYTOWY");

    }
    public static String CalculateInstallment(Double hajs, double intrestRate, double years){

        byte MONTHS_IN_A_YEAR = 12;
        double Installment = ((hajs + hajs * (intrestRate / 100))/ (years * MONTHS_IN_A_YEAR));
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String labelAnswer = currency.format(Installment);

        return labelAnswer;
    }
}
