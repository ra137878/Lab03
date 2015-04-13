

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JButton;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class form extends JFrame {

	public JPanel contentPane;
	public JTextField textfirstName;
	public JTextField textlastName;
	public JTextField textdateofBirth;
	public JTextField textEmail;
	public JTextField textCPF;
	public JTextField textPhone;
	public JTextField textAddress1;
	public JTextField textAddress2;
	public JTextField textCEP;
	public JTextField textCity;
	public JTextField textState;
	public JTextField textCountry;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form frame = new form();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 545);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textfirstName = new JTextField();
		textfirstName.setBounds(120, 58, 114, 19);
		contentPane.add(textfirstName);
		textfirstName.setColumns(10);
		
		textlastName = new JTextField();
		textlastName.setBounds(120, 89, 114, 19);
		contentPane.add(textlastName);
		textlastName.setColumns(10);
		
		textdateofBirth = new JTextField();
		textdateofBirth.setBounds(120, 120, 114, 19);
		contentPane.add(textdateofBirth);
		textdateofBirth.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setBounds(120, 151, 114, 19);
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		textCPF = new JTextField();
		textCPF.setBounds(120, 182, 114, 19);
		contentPane.add(textCPF);
		textCPF.setColumns(10);
		
		textPhone = new JTextField();
		textPhone.setBounds(120, 213, 114, 19);
		contentPane.add(textPhone);
		textPhone.setColumns(10);
		
		textAddress1 = new JTextField();
		textAddress1.setBounds(120, 244, 114, 19);
		contentPane.add(textAddress1);
		textAddress1.setColumns(10);
			
		textAddress2 = new JTextField();
		textAddress2.setBounds(120, 275, 114, 19);
		contentPane.add(textAddress2);
		textAddress2.setColumns(10);
		
		textCEP = new JTextField();
		textCEP.setBounds(120, 306, 114, 19);
		contentPane.add(textCEP);
		textCEP.setColumns(10);
		
		textCity = new JTextField();
		textCity.setBounds(120, 337, 114, 19);
		contentPane.add(textCity);
		textCity.setColumns(10);
		
		textState = new JTextField();
		textState.setBounds(120, 368, 114, 19);
		contentPane.add(textState);
		textState.setColumns(10);
		
		textCountry = new JTextField();
		textCountry.setBounds(120, 399, 114, 19);
		contentPane.add(textCountry);
		textCountry.setColumns(10);
		
		
		
		final JComboBox comboTitle = new JComboBox();
		comboTitle.setModel(new DefaultComboBoxModel(new String[] {"Mr.", "Mrs.", "Miss.", "Ms.", "Dr.", "Other"}));
		comboTitle.setToolTipText("");
		comboTitle.setBounds(58, 12, 81, 24);
		contentPane.add(comboTitle);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(12, 60, 90, 15);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(12, 91, 90, 15);
		contentPane.add(lblLastName);
		
		JLabel lblDateofBirth = new JLabel("Date of Birth:");
		lblDateofBirth.setBounds(12, 121, 100, 15);
		contentPane.add(lblDateofBirth);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(12, 152, 100, 15);
		contentPane.add(lblEmail);
		
		JLabel lblCPF = new JLabel("CPF:");
		lblCPF.setBounds(12, 183, 100, 15);
		contentPane.add(lblCPF);
		
		JLabel lblPhone = new JLabel("Phone:");
		lblPhone.setBounds(12, 214, 100, 15);
		contentPane.add(lblPhone);
		
		JLabel lblAddress1 = new JLabel("Address1:");
		lblAddress1.setBounds(12, 245, 100, 15);
		contentPane.add(lblAddress1);
		
		JLabel lblAddress2 = new JLabel("Address2:");
		lblAddress2.setBounds(12, 276, 100, 15);
		contentPane.add(lblAddress2);
		
		JLabel lblCEP = new JLabel("CEP:");
		lblCEP.setBounds(12, 307, 100, 15);
		contentPane.add(lblCEP);
		
		JLabel lblCity = new JLabel("City:");
		lblCity.setBounds(12, 338, 100, 15);
		contentPane.add(lblCity);
		
		JLabel lblState = new JLabel("State:");
		lblState.setBounds(12, 369, 100, 15);
		contentPane.add(lblState);
		
		JLabel lblCountry = new JLabel("Country:");
		lblCountry.setBounds(12, 400, 100, 15);
		contentPane.add(lblCountry);
		
		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setBounds(12, 17, 90, 15);
		contentPane.add(lblTitle);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {		
				//contentPane.setVisible(false);
							
				print printForm = new print();
				
					if (checkFields() == 0) {
					
						printForm.titleLabel.setText((String) comboTitle.getSelectedItem());
						printForm.firstNameLabel.setText(textfirstName.getText());
						printForm.lastNameLabel.setText(textlastName.getText());
						printForm.dateofBirthLabel.setText(textdateofBirth.getText());
						printForm.emailLabel.setText(textEmail.getText());
						printForm.CPFLabel.setText(textCPF.getText());
						printForm.phoneLabel.setText(textPhone.getText());
						printForm.address1Label.setText(textAddress1.getText());
						printForm.address2Label.setText(textAddress2.getText());
						printForm.CEPLabel.setText(textCEP.getText());
						printForm.cityLabel.setText(textCity.getText());
						printForm.stateLabel.setText(textState.getText());
						printForm.countryLabel.setText(textCountry.getText());
					
						//printForm.contentPane.setVisible(true);				
						printForm.show();
					}
			}
			
			public int checkFields(){

				JFrame frame = new JFrame("Erro");
				
				if (textfirstName.getText().length() == 0){
					JLabel label = new JLabel("Please enter your first name.");
					frame.getContentPane().add(label);
					frame.pack();
					frame.setVisible(true);
					
					return 1;
				}

				else if (textlastName.getText().length() == 0){
					JLabel label = new JLabel("Please enter your last name");
					frame.getContentPane().add(label);
					frame.pack();
					frame.setVisible(true);
					
					return 1;
				}
				else if (textdateofBirth.getText().length() == 0){
					JLabel label = new JLabel("Please enter the date of your birth");
					frame.getContentPane().add(label);
					frame.pack();
					frame.setVisible(true);
					
					return 1;
				}
				else if (textEmail.getText().length() == 0){
					JLabel label = new JLabel("Please enter your email");
					frame.getContentPane().add(label);
					frame.pack();
					frame.setVisible(true);
					
					return 1;
				}
				else if (textCPF.getText().length() == 0){
					JLabel label = new JLabel("Please enter your CPF");
					frame.getContentPane().add(label);
					frame.pack();
					frame.setVisible(true);
					
					return 1;
				}
				else if (textCPF.getText().length() != 11){
					JLabel label = new JLabel("The number of your CPF is wrong");
					frame.getContentPane().add(label);
					frame.pack();
					frame.setVisible(true);
					
					return 1;
				}
				else if (textCEP.getText().length() != 8){
					JLabel label = new JLabel("The number of your CEP is wrong");
					frame.getContentPane().add(label);
					frame.pack();
					frame.setVisible(true);
					
					return 1;
				}
				
				
				return 0;
			}
			
			
		});
		btnPrint.setBounds(12, 450, 74, 25);
		contentPane.add(btnPrint);
	}
}

