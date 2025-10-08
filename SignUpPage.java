
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignUpPage extends JFrame{
    public SignUpPage() {
        setTitle("Sign Up");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(10, 2, 10, 10));

        JLabel nameLabel = new JLabel("Emri: ");
        JTextField nameField = new JTextField();

        JLabel surnameLabel = new JLabel("Mbiemri: ");
        JTextField surnameField = new JTextField();

        JLabel genderLabel = new JLabel("Gjinia: ");
        String[] genders = {"Mashkull", "Femer"};
        JComboBox<String> genderBox = new JComboBox<>(genders);

        JLabel ageLabel = new JLabel("Mosha: ");
        Integer[] ages = new Integer[83];
        for (int i = 0; i < ages.length; i++) {
            ages[i] = i + 18;
        }
        JComboBox<Integer> ageBox = new JComboBox<>(ages);

        JLabel birthplaceLabel = new JLabel("Vendlindja: ");
        JTextField birthplaceField = new JTextField();

        JLabel emailLabel = new JLabel("Email: ");
        JTextField emailField = new JTextField();

        JLabel passwordLabel = new JLabel("Fjalekalimi: ");
        JPasswordField passwordField = new JPasswordField();

        JLabel languageLabel = new JLabel("Gjuha: ");
        String[] languages = {"Shqip", "Anglisht", "Italisht", "Gjermanisht"};
        JComboBox<String> languageBox = new JComboBox<>(languages);

        JButton submitButton = new JButton("Regjistro");
        JLabel resultLabel = new JLabel("");

        add(nameLabel);
        add(nameField);
        add(surnameLabel);
        add(surnameField);
        add(genderLabel);
        add(genderBox);
        add(ageLabel);
        add(ageBox);
        add(birthplaceLabel);
        add(birthplaceField);
        add(emailLabel);
        add(emailField);
        add(passwordLabel);
        add(passwordField);
        add(languageLabel);
        add(languageBox);
        add(new JLabel(""));
        add(submitButton);
        add(new JLabel(""));
        add(resultLabel);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText().trim();
                String surname = surnameField.getText().trim();
                String birthplace = birthplaceField.getText().trim();
                String password = new String(passwordField.getPassword());
                String email = emailField.getText().trim();
                String language = (String) languageBox.getSelectedItem();
                if (name.isEmpty() || surname.isEmpty() || birthplace.isEmpty() || email.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Ju lutem plotesioni te gjitha fushat!", "Gabim", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (!email.contains("@") || !email.contains(".")) {
                    JOptionPane.showMessageDialog(null, "Emaili nuk eshte i vlershem!", "Gabim", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                resultLabel.setText("U regjistrua " + name + " - Gjuha: " + language);
            }
        });
        setVisible(true);
    }

        public static void main(String[]args){
            new SignUpPage();
        }

    }

