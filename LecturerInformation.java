import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Students;

public class LecturerInformation extends JFrame {

    private JLabel nameLabel, phoneLabel, genderLabel, emailLabel, dobLabel, staff_numberLabel, departmentLabel;
    private JTextField nameTextField, phoneTextField, genderTextField, emailTextField, dobTextField, staff_numberTextField, departmentTextField;

    public  LecturerInformation() {
        super("Lecturer Information");

        nameLabel = new JLabel("Name: ");
        dobLabel = new JLabel("Date of Birth: ");
        departmentLabel = new JLabel("Department: ");
        genderLabel = new JLabel("Gender: ");
        staff_numberLabel = new JLabel("Staff number: ");
        phoneLabel = new JLabel("Phone: ");
        emailLabel = new JLabel("Email: ");

        nameTextField = new JTextField(20);
        dobTextField = new JTextField(20);
        departmentTextField = new JTextField(20);
        genderTextField = new JTextField(20);
        staff_numberTextField = new JTextField(20);
        phoneTextField = new JTextField(20);
        emailTextField = new JTextField(20);

        JPanel panel = new JPanel(new GridLayout(7, 2));
        panel.add(nameLabel);
        panel.add(nameTextField);
        panel.add(dobLabel);
        panel.add(dobTextField);
        panel.add(departmentLabel);
        panel.add(departmentTextField);
        panel.add(genderLabel);
        panel.add(genderTextField);
        panel.add(staff_numberLabel);
        panel.add(staff_numberTextField);
        panel.add(phoneLabel);
        panel.add(phoneTextField);
        panel.add(emailLabel);
        panel.add(emailTextField);

        add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);

        // Retrieve data from database and set text fields
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/applied", "root", "");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM lecturer WHERE staff_number= 'lec/10'"); // change this query to retrieve the data you want
            if (rs.next()) {
                nameTextField.setText(rs.getString("name"));
                dobTextField.setText(rs.getString("dob"));
                departmentTextField.setText(rs.getString("department"));
                genderTextField.setText(rs.getString("gender"));
                staff_numberTextField.setText(rs.getString("staff_number"));
                phoneTextField.setText(rs.getString("phone"));
                emailTextField.setText(rs.getString("email"));
            }
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LecturerInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        new  LecturerInformation();
       
    }
}


