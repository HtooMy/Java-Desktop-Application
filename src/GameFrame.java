import javax.swing.JFrame;

public class GameFrame extends JFrame {

	/* Constructor */
	GameFrame() {
		this.add(new GamePanel());
		this.setUndecorated(true);
		this.setTitle("Snake Game");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
	}
}