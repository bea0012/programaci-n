import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class Error extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Error frame = new Error();
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
	public Error() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 475, 222);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(60, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Ups = new JLabel("Ups! Something went wrong");
		Ups.setFont(new Font("Tahoma", Font.BOLD, 11));
		Ups.setForeground(new Color(255, 255, 255));
		Ups.setBounds(154, 56, 157, 14);
		contentPane.add(Ups);
		
		JLabel Mensaje = new JLabel("Your password is too weak, please add a special character");
		Mensaje.setForeground(new Color(255, 255, 255));
		Mensaje.setBounds(72, 82, 360, 14);
		contentPane.add(Mensaje);
		
		JLabel Characters = new JLabel("(#, *, . or @)");
		Characters.setForeground(new Color(255, 255, 255));
		Characters.setBounds(199, 107, 66, 14);
		contentPane.add(Characters);
	}
}
