import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class secundaria extends JFrame {

	private JPanel fondo;

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
		fondo = new JPanel();
		fondo.setBackground(new Color(62, 0, 0));
		fondo.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(fondo);
		fondo.setLayout(null);
		
		JLabel noticia1 = new JLabel("Fall of the Angels");
		noticia1.setForeground(new Color(255, 255, 255));
		noticia1.setFont(new Font("Tahoma", Font.BOLD, 12));
		noticia1.setBounds(124, 392, 106, 14);
		fondo.add(noticia1);
		
		JLabel titulo = new JLabel("Supernatural News");
		titulo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		titulo.setForeground(new Color(255, 255, 255));
		titulo.setBounds(187, 31, 294, 46);
		fondo.add(titulo);
		
		JLabel banner = new JLabel("New label");
		banner.setIcon(new ImageIcon(secundaria.class.getResource("/imagenes/banner.jpg")));
		banner.setBounds(0, 0, 651, 103);
		fondo.add(banner);
		
		JLabel textIntroductorio = new JLabel("Congratulations!");
		textIntroductorio.setFont(new Font("Tahoma", Font.BOLD, 15));
		textIntroductorio.setForeground(new Color(255, 255, 255));
		textIntroductorio.setBounds(266, 114, 124, 46);
		fondo.add(textIntroductorio);
		
		JLabel text1 = new JLabel(" You are now subcribed to our portal of Supernatural news");
		text1.setForeground(new Color(255, 255, 255));
		text1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		text1.setBounds(170, 156, 325, 14);
		fondo.add(text1);
		
		JLabel text2 = new JLabel("here you have some news to start with");
		text2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		text2.setForeground(new Color(255, 255, 255));
		text2.setBounds(222, 175, 218, 14);
		fondo.add(text2);
		
		JLabel fotoNoticia1 = new JLabel("New label");
		fotoNoticia1.setIcon(new ImageIcon(secundaria.class.getResource("/imagenes/supernatural-823-sacrifice-angels-falling.jpg")));
		fotoNoticia1.setBounds(41, 212, 275, 175);
		fondo.add(fotoNoticia1);
		
		JLabel textNoticia1 = new JLabel("Last week a strange phenomenon happend all around our country...");
		textNoticia1.setForeground(new Color(255, 255, 255));
		textNoticia1.setBounds(21, 413, 328, 14);
		fondo.add(textNoticia1);
		
		JLabel textNoticia2 = new JLabel("A little town in Kansas, named Harlan was evacuated by...");
		textNoticia2.setForeground(new Color(255, 255, 255));
		textNoticia2.setBounds(359, 413, 282, 14);
		fondo.add(textNoticia2);
		
		JLabel noticia2 = new JLabel("Lethal virus or raised of death");
		noticia2.setFont(new Font("Tahoma", Font.BOLD, 12));
		noticia2.setForeground(new Color(255, 255, 255));
		noticia2.setBounds(397, 392, 185, 14);
		fondo.add(noticia2);
		
		JLabel fotoNoticia2 = new JLabel("New label");
		fotoNoticia2.setIcon(new ImageIcon(secundaria.class.getResource("/imagenes/Map_of_Smith_Co,_Ks,_USA.png")));
		fotoNoticia2.setBounds(359, 212, 268, 175);
		fondo.add(fotoNoticia2);
	}
}
