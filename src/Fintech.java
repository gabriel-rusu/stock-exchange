import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.KeyStroke;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.text.JTextComponent;

public class Fintech extends JFrame {

    private static final int WIDTH = 500;
    private static final int HEIGHT = 300;
    public boolean VERIFY = false;

    JPasswordField passwordField;
    JTextField accountField;

    private class AutentificationButton implements ActionListener, KeyListener {
        Fintech exit;

        public AutentificationButton(Fintech chenarAuten) {
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

    Fintech() {
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
        JLabel text = new JLabel(new ImageIcon("logo.png"));
        JButton goButton = new JButton("Autentificate");
        setFocusable(true);
        passwordField.addKeyListener(new AutentificationButton(this));
        // goButton.setBackground(Color.WHITE);
        goButton.addActionListener(new AutentificationButton(this));
        centerR.add(goButton, BorderLayout.SOUTH);
        revalidate();
    }

}