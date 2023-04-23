import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class HomeScreen {

	public JFrame frame;
	private JPanel contentPane;
	private final JLabel image = new JLabel("");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeScreen window = new HomeScreen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HomeScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 600, 400);
		frame.setLocationRelativeTo(null);  
		frame.setResizable(false);
		frame.setVisible(true);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		frame.setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(124, 252, 0));
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setLayout(null);
		contentPane.add(panel, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(172, 132, 268, 52);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		
		JButton playButton = new JButton("Play");
		playButton.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		playButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				GameFrame mainFrame = new GameFrame();
			}
		});
		playButton.setBounds(6, 6, 258, 40);
		panel_1.add(playButton);
		
		JLabel lblNewLabel = new JLabel("Let's Play Snake Game Yay !!!! ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel.setBounds(38, 17, 531, 84);
		panel.add(lblNewLabel);
		
		ImageIcon icon = new ImageIcon(this.getClass().getClassLoader().getResource("snake.png"));
		image.setIcon(icon);
		panel.add(image);
	}

}
