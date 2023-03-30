import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import java.awt.Checkbox;
import java.awt.Label;
import java.awt.TextField;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;

public class ventana_principal extends JFrame {

	private JPanel contentPane;
	private JTextField Nombre;
	private JTextField Apellido;
	private JTextField nombreUsuario;
	private JTextField Gmail;
	private JTextField otraEspecie;
	static ventana_principal principal;
	private JPasswordField Contraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal = new ventana_principal();
					principal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ventana_principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 669, 488);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(60, 0, 0));
		contentPane.setToolTipText("dfhndfhn");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel firstName = new JLabel("First Name");
		firstName.setBounds(45, 137, 60, 24);
		firstName.setFont(new Font("Tahoma", Font.BOLD, 11));
		firstName.setForeground(new Color(255, 255, 255));
		contentPane.add(firstName);
		
		JLabel lastName = new JLabel("Last Name");
		lastName.setBounds(45, 175, 60, 14);
		lastName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lastName.setForeground(new Color(255, 255, 255));
		contentPane.add(lastName);
		
		Nombre = new JTextField();
		Nombre.setBounds(120, 139, 129, 20);
		contentPane.add(Nombre);
		Nombre.setColumns(10);
		
		Apellido = new JTextField();
		Apellido.setBounds(120, 169, 129, 20);
		contentPane.add(Apellido);
		Apellido.setColumns(10);
		
		nombreUsuario = new JTextField();
		nombreUsuario.setBounds(120, 231, 129, 20);
		contentPane.add(nombreUsuario);
		nombreUsuario.setColumns(10);
		
		JLabel userName = new JLabel("User name");
		userName.setBounds(44, 233, 61, 17);
		userName.setFont(new Font("Tahoma", Font.BOLD, 11));
		userName.setForeground(new Color(255, 255, 255));
		contentPane.add(userName);
		
		JLabel password = new JLabel("Password");
		password.setBounds(54, 265, 56, 14);
		password.setFont(new Font("Tahoma", Font.BOLD, 11));
		password.setForeground(new Color(255, 255, 255));
		contentPane.add(password);
		
		 
		JLabel titulo = new JLabel("Supernatural News");
		titulo.setBounds(187, 31, 294, 46);
		titulo.setForeground(new Color(255, 255, 255));
		titulo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		titulo.setBackground(new Color(0, 128, 0));
		contentPane.add(titulo);
		
		JLabel banner = new JLabel("New label");
		banner.setBounds(0, 0, 650, 102);
		banner.setBackground(Color.WHITE);
		banner.setIcon(new ImageIcon(ventana_principal.class.getResource("/imagenes/banner.jpg")));
		contentPane.add(banner);
		
		Gmail = new JTextField();
		Gmail.setBounds(120, 200, 129, 20);
		contentPane.add(Gmail);
		Gmail.setColumns(10);
		
		JLabel email = new JLabel("Email");
		email.setBounds(70, 208, 36, 14);
		email.setFont(new Font("Tahoma", Font.BOLD, 11));
		email.setForeground(new Color(255, 255, 255));
		contentPane.add(email);
		
		JLabel species = new JLabel("Species");
		species.setBounds(64, 296, 46, 14);
		species.setFont(new Font("Tahoma", Font.BOLD, 11));
		species.setForeground(new Color(255, 255, 255));
		contentPane.add(species);
		
		final JRadioButton boton1 = new JRadioButton("Hunter");
		boton1.setBounds(120, 292, 71, 23);
		boton1.setForeground(new Color(255, 255, 255));
		boton1.setBackground(new Color(62, 0, 0));
		contentPane.add(boton1);
		
		
		final JRadioButton boton2 = new JRadioButton("Demon");
		boton2.setBounds(187, 292, 78, 23);
		boton2.setForeground(new Color(255, 255, 255));
		boton2.setBackground(new Color(60, 0, 0));
		contentPane.add(boton2);
		
		final JRadioButton boton3 = new JRadioButton("Angel");
		boton3.setBounds(262, 292, 71, 23);
		boton3.setForeground(new Color(255, 255, 255));
		boton3.setBackground(new Color(60, 0, 0));
		contentPane.add(boton3);
		
		final JRadioButton boton4 = new JRadioButton("Other");
		boton4.setBounds(120, 318, 60, 23);
		
		boton1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
				if(boton1.isSelected()) {
					boton1.setSelected(true);
					boton2.setSelected(false);
					boton3.setSelected(false);
					boton4.setSelected(false);
				}
			}
		});
		
		boton2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
				if(boton2.isSelected()) {
					boton1.setSelected(false);
					boton2.setSelected(true);
					boton3.setSelected(false);
					boton4.setSelected(false);
				}
			
			}
		});
		
		boton3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
				if(boton3.isSelected()) {
					boton1.setSelected(false);
					boton2.setSelected(false);
					boton3.setSelected(true);
					boton4.setSelected(false);
				}
			}
		});
		
		boton4.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
				if(boton4.isSelected()) {
					boton1.setSelected(false);
					boton2.setSelected(false);
					boton3.setSelected(false);
					boton4.setSelected(true);
				}
			
			if(!boton4.isSelected()) {
				otraEspecie.enable();
				otraEspecie.hide();
			}else {
				otraEspecie.enable(true);
				otraEspecie.show();
			}
			
		}
		
		});
		boton4.setForeground(new Color(255, 255, 255));
		boton4.setBackground(new Color(55, 0, 0));
		contentPane.add(boton4);
		
		otraEspecie = new JTextField();
		otraEspecie.setBounds(180, 319, 118, 20);
		otraEspecie.setEnabled(false);
		contentPane.add(otraEspecie);
		otraEspecie.setColumns(10);
		
		final JRadioButton botonContraseña = new JRadioButton("Show");
		botonContraseña.setBounds(255, 261, 109, 23);
		botonContraseña.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
				if(botonContraseña.isSelected()) {
					Contraseña.setEchoChar((char)0);
				}else {
					Contraseña.setEchoChar('*');
				}
			}
		});
		botonContraseña.setForeground(new Color(255, 255, 255));
		botonContraseña.setBackground(new Color(62, 0, 0));
		contentPane.add(botonContraseña);
		
		Contraseña = new JPasswordField();
		Contraseña.setBounds(120, 262, 129, 20);
		contentPane.add(Contraseña);
		
		JButton inicio = new JButton("Submit");
		inicio.setBounds(271, 394, 103, 23);
		inicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Gmail.getText().contains("@") && Gmail.getText().contains(".")) {
					if(boton1.isSelected() || boton2.isSelected() || boton3.isSelected() || boton4.isSelected()) {
						if(Contraseña.getText().contains("*") || Contraseña.getText().contains("#") || Contraseña.getText().contains(".")) {
							JFrame login = new login();
							login.setVisible(true);
							principal.setVisible(false);
						}else {
							 Error obj= new Error();
							obj.setVisible(true);
						}
					}else {
						Error2 obj= new Error2();
						obj.setVisible(true);
					}
				}else {
					Error3 obj= new Error3();
					obj.setVisible(true);
				}
					
					
			}
		});
		contentPane.add(inicio);
	}
	
}
