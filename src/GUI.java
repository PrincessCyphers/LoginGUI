import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

   private JFrame frame;
   private JPanel panel;
   private static JLabel userLabel;
   private static JTextField userText;
   private static JLabel passwordLabel;
   private static JPasswordField userPassword;
   private static JButton button;
   private static JLabel success;

    public static void main(String[] args) {

        JPanel panel = new JPanel();        // panel is the inner space to frame

        JFrame frame = new JFrame();        // frame is the pop up box
        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);

        panel.setLayout(null);          // none specific layout. default almost

        userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 165, 25);       //note y-axis differs to user label as shows password placements lower in frame
        panel.add(passwordLabel);

        userPassword = new JPasswordField();
        userPassword.setBounds(100, 50, 165, 25);
        panel.add(userPassword);

        button = new JButton("Enter");
        button.setBounds(10, 80, 80, 25);
        button.addActionListener(new GUI());
        panel.add(button);

        success = new JLabel("");        //nothing in the text so it doesn't show up
        success.setBounds(10, 110, 300, 25);
        panel.add(success);


        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = userPassword.getText();       //old method and no longer supported.
        System.out.println(user + ", " + password);

        if(user.equals("Princess") && password.equals("RedZebra22")) {
            success.setText("Login Successful!");
        }
        else {
            success.setText("Please try again");
        }

    }
}
