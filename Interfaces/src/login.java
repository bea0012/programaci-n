import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;
	static login login;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 669, 488);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(55, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titulo = new JLabel("Supernatural News");
		titulo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		titulo.setForeground(new Color(255, 255, 255));
		titulo.setBounds(187, 31, 294, 46);
		contentPane.add(titulo);
		
		JLabel banner = new JLabel("New label");
		banner.setIcon(new ImageIcon("C:\\Users\\Bea\\Desktop\\1DAW\\Programación\\banner.jpg"));
		banner.setBounds(0, 0, 650, 102);
		contentPane.add(banner);
		
		JLabel userName = new JLabel("User Name");
		userName.setFont(new Font("Tahoma", Font.BOLD, 11));
		userName.setForeground(new Color(255, 255, 255));
		userName.setBounds(187, 224, 61, 17);
		contentPane.add(userName);
		
		JLabel password = new JLabel("Password");
		password.setFont(new Font("Tahoma", Font.BOLD, 11));
		password.setForeground(new Color(255, 255, 255));
		password.setBounds(197, 258, 56, 14);
		contentPane.add(password);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(269, 255, 126, 20);
		contentPane.add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(269, 222, 126, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		final JRadioButton botonContraseña = new JRadioButton("Show");
		botonContraseña.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
				if(botonContraseña.isSelected()) {
					passwordField.setEchoChar((char)0);
				}else {
					passwordField.setEchoChar('*');
				}
			}
		});
		botonContraseña.setBackground(new Color(60, 0, 0));
		botonContraseña.setForeground(new Color(255, 255, 255));
		botonContraseña.setBounds(414, 254, 56, 23);
		contentPane.add(botonContraseña);
		
		JButton Sudmit = new JButton("Sudmit");
		Sudmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFrame secundaria = new secundaria();
				secundaria.setVisible(true);
				login.setVisible(false);
				
			}
		});
		Sudmit.setBounds(281, 322, 102, 23);
		contentPane.add(Sudmit);
		
		JLabel textTitulo = new JLabel("Profile succesfully created!");
		textTitulo.setFont(new Font("Tahoma", Font.BOLD, 15));
		textTitulo.setForeground(new Color(255, 255, 255));
		textTitulo.setBounds(229, 144, 205, 17);
		contentPane.add(textTitulo);
		
		JLabel lblNewLabel = new JLabel("Insert your data to log in please");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(242, 172, 175, 14);
		contentPane.add(lblNewLabel);
	}
}
