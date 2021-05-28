package engine;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.text.JTextComponent;

public class FinTech extends JFrame {

    private static final int WIDTH = 480;
    private static final int HEIGHT = 300;
    public boolean VERIFY = false;

    JPasswordField passwordField;
    JTextField accountField;

    private class AutentificationButton implements ActionListener, KeyListener {
        FinTech exit;

        public AutentificationButton(FinTech chenarAuten) {
            exit = chenarAuten;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if ((passwordField.getText().length()) != 0 && (passwordField.getText().equals("admin"))
                    && (accountField.getText().equals("admin"))) {
                VERIFY = true;
                exit.setVisible(false);
                new GUI();
                exit.dispose();
            }
        }

        @Override
        public void keyPressed(KeyEvent e) {

            if (e.getKeyCode() == KeyEvent.VK_ENTER)
                if ((passwordField.getText().length()) != 0 && (passwordField.getText().equals("admin"))
                        && (accountField.getText().equals("admin"))) {
                    VERIFY = true;

                    exit.setVisible(false);
                    new GUI();
                    exit.dispose();
                }

        }

        @Override
        public void keyReleased(KeyEvent e) {
        }

        @Override
        public void keyTyped(KeyEvent e) {
        }
    }

    FinTech() {
        super();
        setTitle("Fintech Demo Solution");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setBackground(Color.BLACK);
        setVisible(true);
        JPanel north = new JPanel(new FlowLayout());
        JLabel northLabel = new JLabel("Autentification Area");
        north.add(northLabel);
        JPanel center = new JPanel(new FlowLayout());
        JPanel centerL = new JPanel(new FlowLayout());
        JLabel centerJLabelL = new JLabel(new ImageIcon("logo1.png"));
        centerL.add(centerJLabelL);
        JPanel centerR = new JPanel(new BorderLayout());
        JLabel centerJLabelR1 = new JLabel("Password:");
        accountField = new JTextField(12);
        accountField.setFont(getFont().decode(Font.SANS_SERIF));
        JLabel centerJLabelR2 = new JLabel("Account Id");
        JPanel centerNorthR = new JPanel(new FlowLayout());
        centerNorthR.add(centerJLabelR2);
        centerNorthR.add(accountField);
        centerR.add(centerNorthR, BorderLayout.NORTH);
        passwordField = new JPasswordField(12);
        JPanel centerSouthR = new JPanel(new FlowLayout());
        passwordField.setFont(getFont().decode(Font.SANS_SERIF));
        centerSouthR.add(centerJLabelR1, BorderLayout.SOUTH);
        centerSouthR.add(passwordField, BorderLayout.SOUTH);
        centerR.add(centerSouthR, BorderLayout.CENTER);
        JPanel south = new JPanel(new FlowLayout());
        JLabel southLabel = new JLabel("Designed by Straight Flush Team");
        south.add(southLabel);
        setResizable(false);
        // add(north,BorderLayout.NORTH);
        center.add(centerL);
        center.add(centerR);
        setLocationRelativeTo(null);
        add(center, BorderLayout.CENTER);
        add(south, BorderLayout.SOUTH);
        JLabel text = new JLabel(new ImageIcon(this.getClass().getClassLoader().getResource("images/logo.png").getPath()));
        JButton goButton = new JButton("Autentificate");
        setFocusable(true);
        passwordField.addKeyListener(new AutentificationButton(this));
        // goButton.setBackground(Color.WHITE);
        goButton.addActionListener(new AutentificationButton(this));
        centerR.add(goButton, BorderLayout.SOUTH);
        revalidate();
    }

}