package Calci;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculator implements ActionListener {

        JFrame frame =new JFrame("Calculator");
        JPanel panel = new JPanel();

        JTextArea textField = new JTextArea();

        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton button0 = new JButton("0");

        JButton button_equal = new JButton("=");
        JButton button_clear = new JButton("C");
        JButton button_dot = new JButton(".");

        JButton button_sum = new JButton("+");
        JButton button_subtract = new JButton("-");
        JButton button_multiply = new JButton("*");
        JButton button_divide = new JButton("/");

        double number1 , number2 ,result;
        int sum=0 , mul=0 , div =0 , sub=0 ;

    public Calculator() {
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocation(600,190);
        frame.setBackground(Color.CYAN);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);
        panel.setBackground(Color.LIGHT_GRAY);
        Border border = BorderFactory.createLineBorder(Color.RED);

        panel.add(textField);

        textField.setForeground(Color.black);
        Border t_border = BorderFactory.createLineBorder(Color.BLUE);
        textField.setBorder(t_border);
        Font font = new Font("arial",Font.BOLD,25);
        textField.setFont(font);
        textField.setPreferredSize(new Dimension(300,40));
        textField.setLineWrap(true);

        // setting the position for the buttons
        button0.setPreferredSize(new Dimension(100,40));
        button1.setPreferredSize(new Dimension(100,40));
        button2.setPreferredSize(new Dimension(100,40));
        button3.setPreferredSize(new Dimension(100,40));
        button4.setPreferredSize(new Dimension(100,40));
        button5.setPreferredSize(new Dimension(100,40));
        button6.setPreferredSize(new Dimension(100,40));
        button7.setPreferredSize(new Dimension(100,40));
        button8.setPreferredSize(new Dimension(100,40));
        button9.setPreferredSize(new Dimension(100,40));

        button_sum.setPreferredSize(new Dimension(100,40));
        button_sum.setForeground(Color.RED);
        button_subtract.setPreferredSize(new Dimension(100,40));
        button_subtract.setForeground(Color.RED);
        button_multiply.setPreferredSize(new Dimension(100,40));
        button_multiply.setForeground(Color.RED);
        button_divide.setPreferredSize(new Dimension(100,40));
        button_divide.setForeground(Color.RED);

        button_equal.setPreferredSize(new Dimension(150,40));
        button_equal.setForeground(Color.RED);
        button_clear.setPreferredSize(new Dimension(100,40));
        button_clear.setForeground(Color.RED);
        button_dot.setPreferredSize(new Dimension(100,40));
        button_dot.setForeground(Color.RED);

        // Adding the Components
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(button_clear);
        panel.add(button0);
        panel.add(button_dot);

        panel.add(button_sum);
        panel.add(button_subtract);
        panel.add(button_multiply);
        panel.add(button_divide);

        panel.add(button_equal);

        // Adding ActionListener , to perform operations
        button1.addActionListener((ActionListener) this);
        button2.addActionListener((ActionListener) this);
        button3.addActionListener((ActionListener) this);
        button4.addActionListener((ActionListener) this);
        button5.addActionListener((ActionListener) this);
        button6.addActionListener((ActionListener) this);
        button7.addActionListener((ActionListener) this);
        button8.addActionListener((ActionListener) this);
        button9.addActionListener((ActionListener) this);
        button0.addActionListener((ActionListener) this);
        
        button_sum.addActionListener((ActionListener) this);
        button_subtract.addActionListener((ActionListener) this);
        button_multiply.addActionListener((ActionListener) this);
        button_divide.addActionListener((ActionListener) this);

        button_dot.addActionListener((ActionListener) this);
        button_clear.addActionListener((ActionListener) this);
        button_equal.addActionListener((ActionListener) this);

    }

    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();

        if (source.equals(button_clear)){
            number1 = 0.0;
            number2 = 0.0;
            textField.setText("");
        }
        if (source.equals(button1)){
            textField.append("1");
        }
        if (source.equals(button2)){
            textField.append("2");
        }
        if (source.equals(button3)){
            textField.append("3");
        }
        if (source.equals(button4)){
            textField.append("4");
        }
        if (source.equals(button5)){
            textField.append("5");
        }
        if (source.equals(button6)){
            textField.append("6");
        }
        if (source.equals(button7)){
            textField.append("7");
        }
        if (source.equals(button8)){
            textField.append("8");
        }
        if (source.equals(button9)){
            textField.append("9");
        }
        if (source.equals(button0)){
            textField.append("0");
        }
        if (source.equals(button_sum)){
            number1 = number_reader();
            textField.setText("+");
            sum =1;
            sub = 0;
            mul = 0;
            div =0;
        }
        if (source.equals(button_subtract)){
            number1 = number_reader();
            textField.setText("-");
            sum =0;
            sub = 1;
            mul = 0;
            div =0;
        }
        if (source.equals(button_multiply)){
            number1 = number_reader();
            textField.setText("*");
            sum =0;
            sub = 0;
            mul = 1;
            div =0;
        }
        if (source.equals(button_divide)){
            number1 = number_reader();
            textField.setText("/");
            sum =0;
            sub = 0;
            mul = 0;
            div =1;
        }
        if (source.equals(button_dot)){
            textField.append(".");
        }
        if (source.equals(button_equal)){
            number2 = number_reader();
            if (sum > 0){
                result = number1 + number2;
                textField.setText((Double.toString(result)));
            }
            if (sub > 0){
                result = number1 - number2;
                textField.setText((Double.toString(result)));
            }
            if (mul > 0){
                result = number1 * number2;
                textField.setText((Double.toString(result)));
            }
            if (div > 0){
                result = number1 / number2;
                textField.setText((Double.toString(result)));
            }
        }

    }

    public double number_reader() {
        double num1;
        String s;
        s = textField.getText();    // First the Value will enter in string s and then converted to double
        num1 = Double.parseDouble(s);
        return num1 ;
    }

    public static void main(String[] args) {
        Calculator cl = new Calculator();
    }
}
