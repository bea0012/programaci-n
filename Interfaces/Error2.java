import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class Error2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Error2 frame = new Error2();
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
	public Error2() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 428, 222);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Ups = new JLabel("Ups! Something went wrong");
		Ups.setBounds(122, 54, 157, 14);
		Ups.setForeground(new Color(255, 255, 255));
		Ups.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(Ups);
		
		JLabel Mensaje = new JLabel("You must have forgotten to select your specie");
		Mensaje.setBounds(81, 79, 274, 14);
		Mensaje.setForeground(new Color(255, 255, 255));
		contentPane.add(Mensaje);
		
		JLabel Characters = new JLabel("It´s nothing to worry about, our web is for everyone");
		Characters.setBounds(59, 104, 321, 14);
		Characters.setForeground(new Color(255, 255, 255));
		contentPane.add(Characters);
		
		JLabel Please = new JLabel("Please check one of the options");
		Please.setForeground(new Color(255, 255, 255));
		Please.setBounds(112, 129, 210, 14);
		Characters.setForeground(new Color(255, 255, 255));
		contentPane.add(Please);
	}

}
