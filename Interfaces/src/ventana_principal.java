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
		setBounds(100, 100, 667, 488);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(60, 0, 0));
		contentPane.setToolTipText("dfhndfhn");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setBounds(45, 137, 60, 24);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Last Name");
		lblNewLabel_1.setBounds(45, 175, 60, 14);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		contentPane.add(lblNewLabel_1);
		
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
		
		JLabel lblNewLabel_2 = new JLabel("User name");
		lblNewLabel_2.setBounds(44, 233, 61, 17);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setBounds(54, 265, 56, 14);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		contentPane.add(lblNewLabel_3);
		
		JButton inicio = new JButton("Submit");
		inicio.setBounds(271, 394, 103, 23);
		inicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					JFrame secundaria = new secundaria();
					secundaria.setVisible(true);
					principal.setVisible(false);
					
			}
		});
		contentPane.add(inicio);
		
		JLabel lblNewLabel_4 = new JLabel("Supernatural News");
		lblNewLabel_4.setBounds(187, 31, 294, 46);
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_4.setBackground(new Color(0, 128, 0));
		contentPane.add(lblNewLabel_4);
		
		JLabel banner = new JLabel("New label");
		banner.setBounds(0, 0, 650, 102);
		banner.setBackground(Color.WHITE);
		banner.setIcon(new ImageIcon("C:\\Users\\Bea\\Desktop\\1DAW\\Programación\\banner.jpg"));
		contentPane.add(banner);
		
		Gmail = new JTextField();
		Gmail.setBounds(120, 200, 129, 20);
		contentPane.add(Gmail);
		Gmail.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Email");
		lblNewLabel_5.setBounds(70, 208, 36, 14);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_7 = new JLabel("Species");
		lblNewLabel_7.setBounds(64, 296, 46, 14);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		contentPane.add(lblNewLabel_7);
		
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
				otraEspecie.enable(false);
			}else {
				otraEspecie.enable(true);
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
		botonContraseña.setBackground(new Color(53, 0, 0));
		contentPane.add(botonContraseña);
		
		Contraseña = new JPasswordField();
		Contraseña.setBounds(120, 262, 129, 20);
		contentPane.add(Contraseña);
	}
}
