import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Error3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Error3 frame = new Error3();
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
	public Error3() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 422, 222);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Ups = new JLabel("Ups! Something went wrong");
		Ups.setBounds(119, 56, 157, 14);
		Ups.setFont(new Font("Tahoma", Font.BOLD, 11));
		Ups.setForeground(new Color(255, 255, 255));
		contentPane.add(Ups);
		
		JLabel Mensaje = new JLabel("Your email looks to be incorrect");
		Mensaje.setBounds(107, 81, 209, 14);
		Mensaje.setForeground(new Color(255, 255, 255));
		contentPane.add(Mensaje);
		
		JLabel Characters = new JLabel("Remember all emails must have @ and .");
		Characters.setBounds(88, 106, 241, 14);
		Characters.setForeground(new Color(255, 255, 255));
		contentPane.add(Characters);
	}

}
