package graphics;

import javax.swing.*;
import java.awt.*;

public class EasyForm extends JFrame {

    JButton button = new JButton();
    JLabel label = new JLabel();
    JTextField jTextField = new JTextField();
    JPasswordField jPasswordField = new JPasswordField();

    public EasyForm() {
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        this.setTitle("EASY FORM");
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        addComponents();

        this.setVisible(true);
    }

    public void addComponents() {

        jTextField.setPreferredSize(new Dimension(100,27));
        jPasswordField.setPreferredSize(new Dimension(100,27));

        this.add(jTextField);
        this.add(jPasswordField);

        button.setText("OK");
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                label.setText(jTextField.getText());
//            }
//        });

        button.addActionListener(e -> setTextLabel());


        this.add(button);

        label.setText("This is a label!");
        this.add(label);
    }

    public void setTextLabel() {
        if(jTextField.getText().equals("admin") && jPasswordField.getText().equals("admin")){
            JOptionPane.showMessageDialog(this,
                    "Login success!", "LOGIN",JOptionPane.INFORMATION_MESSAGE);
        } else{
            JOptionPane.showMessageDialog(this,
                    "Login error!","LOGIN",JOptionPane.ERROR_MESSAGE);
        }
    }
}
