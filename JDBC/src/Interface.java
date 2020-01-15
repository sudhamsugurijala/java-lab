import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.sql.*;

public class Interface extends JPanel {
	
	Connection con;
	Statement st;
	PreparedStatement ps;
	CallableStatement cs;
	ResultSet rs;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 */
	public Interface() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			JOptionPane.showMessageDialog(this, " Driver Loaded...");
			try {
				con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","gd7435");
				JOptionPane.showMessageDialog(this,"connection established");
			} catch(SQLException e) {
				JOptionPane.showMessageDialog(this, e.getMessage());
			}
			
		} catch(ClassNotFoundException e){
			JOptionPane.showMessageDialog(this, e.toString());
		}
		setLayout(null);
		
		JButton btnNewButton = new JButton("Insert");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(40, 224, 89, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Update");
		btnNewButton_1.setBounds(139, 224, 89, 23);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.setBounds(238, 224, 89, 23);
		add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Exit");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}			
		});
		btnNewButton_3.setBounds(337, 224, 89, 23);
		add(btnNewButton_3);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(40, 47, 46, 14);
		add(lblName);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(40, 78, 46, 14);
		add(lblId);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(40, 109, 46, 14);
		add(lblAge);
		
		textField = new JTextField();
		textField.setBounds(124, 44, 201, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(124, 75, 201, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(124, 106, 201, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(121, 137, 201, 20);
		add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblMarks = new JLabel("Marks");
		lblMarks.setBounds(40, 142, 46, 14);
		add(lblMarks);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(64, 180, 47, 23);
		add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(145, 180, 65, 23);
		add(rdbtnFemale);
		
		JRadioButton rdbtnOthers = new JRadioButton("Others");
		rdbtnOthers.setBounds(216, 180, 109, 23);
		add(rdbtnOthers);

	}
}
