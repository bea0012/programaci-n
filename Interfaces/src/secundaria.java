import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class secundaria extends JFrame {

	private JPanel banner;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					secundaria frame = new secundaria();
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
	public secundaria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 488);
		banner = new JPanel();
		banner.setBackground(new Color(62, 0, 0));
		banner.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(banner);
		banner.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Fall of the Angels");
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setBounds(124, 392, 106, 14);
		banner.add(lblNewLabel_6);
		
		JLabel lblNewLabel_1 = new JLabel("Supernatural News");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(187, 31, 294, 46);
		banner.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Bea\\Desktop\\1DAW\\Programación\\banner.jpg"));
		lblNewLabel.setBounds(0, 0, 651, 103);
		banner.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Congratulations!");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(266, 114, 124, 46);
		banner.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(" You are now subcribed to our portal of Supernatural news");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(170, 156, 325, 14);
		banner.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("here you have some news to start with");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(222, 175, 218, 14);
		banner.add(lblNewLabel_4);
		
		JLabel noticia1 = new JLabel("New label");
		noticia1.setIcon(new ImageIcon("C:\\Users\\Bea\\Downloads\\supernatural-823-sacrifice-angels-falling.jpg"));
		noticia1.setBounds(41, 212, 275, 175);
		banner.add(noticia1);
		
		JLabel lblNewLabel_5 = new JLabel("Last week a strange phenomenon happend all around our country...");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(21, 413, 328, 14);
		banner.add(lblNewLabel_5);
		
		JLabel lblNewLabel_7 = new JLabel("A little town in Kansas, named Harlan was evacuated by...");
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setBounds(359, 413, 282, 14);
		banner.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Lethal virus or raised of death");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_8.setBounds(397, 392, 185, 14);
		banner.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\Bea\\Desktop\\1DAW\\Programación\\Map_of_Smith_Co,_Ks,_USA.png"));
		lblNewLabel_9.setBounds(359, 212, 268, 175);
		banner.add(lblNewLabel_9);
	}
}
