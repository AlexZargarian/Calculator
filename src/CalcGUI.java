import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcGUI {
    private double total1=0.0;
    // for result
    private double total2=0.0;
    private char math_operator;
    private JPanel JavaCalculator;
    private JTextField textField1;
    private JButton btnEquasion;
    private JButton btnMultiply;
    private JButton btn9;
    private JButton btn5;
    private JButton btn2;
    private JButton btnpoint;
    private JButton btnAddition;
    private JButton btn6;
    private JButton btn3;
    private JButton btnClear;
    private JButton btnminus;
    private JButton btndevide;
    private JButton btnIntegral;
    private JButton btnEquals;
    private JButton btn7;
    private JButton btn4;
    private JButton btn1;
    private JButton btn0;
    private JButton btn8;
    //void so nothing happens
    public void getOperation(String btnText){
        math_operator=btnText.charAt(0);
        total1=total1+Double.parseDouble(textField1.getText());
        textField1.setText("");
    }

    public CalcGUI() {
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOnetext=textField1.getText()+ btn1.getText();
                textField1.setText(btnOnetext);

            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn2text=textField1.getText()+ btn2.getText();
                textField1.setText(btn2text);
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn3text=textField1.getText()+ btn3.getText();
                textField1.setText(btn3text);
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn4text=textField1.getText()+ btn4.getText();
                textField1.setText(btn4text);
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn5text=textField1.getText()+ btn5.getText();
                textField1.setText(btn5text);
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn6text=textField1.getText()+ btn6.getText();
                textField1.setText(btn6text);
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn7text=textField1.getText()+ btn7.getText();
                textField1.setText(btn7text);
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn8text=textField1.getText()+ btn8.getText();
                textField1.setText(btn8text);
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn9text=textField1.getText()+ btn9.getText();
                textField1.setText(btn9text);
            }
        });
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn0text=textField1.getText()+ btn0.getText();
                textField1.setText(btn0text);
            }
        });
        btnAddition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String buttonText=btnAddition.getText();
               getOperation(buttonText);
            }
        });
        btnminus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttentext=btnminus.getText();
                getOperation(buttentext);

            }
        });
        btndevide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonText=btndevide.getText();
                getOperation(buttonText);

            }
        });
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttenText=btndevide.getText();
                getOperation(buttenText);
            }
        });
        
        btnEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               switch (math_operator){
                   case '+':
                       total2=total1+Double.parseDouble(textField1.getText());
                       break;
                   case '-':
                       total2=total1-Double.parseDouble(textField1.getText());
                       break;
                   case '*':
                       total2=total1*Double.parseDouble(textField1.getText());
                       break;
                   case  '/':
                       total2=total1/Double.parseDouble(textField1.getText());
               }
                textField1.setText(Double.toString(total2));
                total1=0;
            }
        });
        
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2=0;
                textField1.setText("");
            }
        });
        btnpoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField1.getText().equals("")){
                    textField1.setText("0.");
                }
                else if (textField1.getText().contains(".")){
                    btnpoint.setEnabled(false);
                }
                else {
                    String btnPointText=textField1.getText()+btnpoint.getText();
                    textField1.setText(btnPointText);
                }
                btnpoint.setEnabled(true);

            }
        });

        
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("CalcGUI");
        frame.setContentPane(new CalcGUI().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
