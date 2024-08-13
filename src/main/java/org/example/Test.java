package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test {
    private JFrame frame;
    private JTextField textField;
    private double number1, number2, result;
    private char operation;

    public Test() {
        createGUI();
    }

    private void createGUI() {
        frame = new JFrame("Calculator");
        frame.setSize(300, 300);
        frame.setLayout(new BorderLayout());

        textField = new JTextField();
        frame.add(textField, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));
        frame.add(panel, BorderLayout.CENTER);

        String[] buttons = {"7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"};

        for (String button : buttons) {
            JButton jButton = new JButton(button);
            jButton.addActionListener(new ButtonListener());
            panel.add(jButton);
        }

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            switch (command) {
                case "0":
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                    textField.setText(textField.getText() + command);
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                    number1 = Double.parseDouble(textField.getText());
                    operation = command.charAt(0);
                    textField.setText("");
                    break;
                case "=":
                    number2 = Double.parseDouble(textField.getText());
                    calculateResult();
                    textField.setText(String.valueOf(result));
                    break;
                case "C":
                    textField.setText("");
                    number1 = 0;
                    number2 = 0;
                    result = 0;
                    break;
            }
        }
    }

    private void calculateResult() {
        switch (operation) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
        }
    }

    public static void main(String[] args) {
        new Test();
    }
}