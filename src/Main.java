import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame {
	
	JLabel tagline, appName;
	JButton availbutton;
	int count = 0;
	Timer timer;
	
	
	public static void main(String[] args) {
		
					Main window = new Main();
					window.setVisible(true);
		
	}
		//constructor
	  public Main() {

		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\NEW JAVA\\WeWatch\\src\\logo.png"));
		getContentPane().setBackground(Color.decode("#041C32"));
		setBounds(100, 100, 400, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    getContentPane().setLayout(null);
		setUndecorated(true);
		setLocationRelativeTo(null);
		

		appName = new JLabel("WeWatch");
		appName.setHorizontalAlignment(SwingConstants.CENTER);
		appName.setFont(new Font("Behind the Painter", Font.PLAIN, 60));
		appName.setForeground(Color.decode("#FAC213"));
		appName.setBounds(10, 94, 380, 64);
		getContentPane().add(appName);
		
		tagline = new JLabel("Bringing the world inside.");	
		tagline.setFont(new Font("Arial Black", Font.BOLD, 12));
		tagline.setHorizontalAlignment(SwingConstants.CENTER);
		tagline.setForeground(Color.WHITE);
		tagline.setBounds(10, 169, 380, 45);
		getContentPane().add(tagline);
		
		
		availbutton = new JButton("Available Movies");
		availbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				timer.start();
			}
		});
		availbutton.setForeground(Color.decode("#041C32"));
		availbutton.setBackground( Color.decode("#FAC213"));
		availbutton.setFocusable(false);
		availbutton.setFont(new Font("Arial Black", Font.BOLD, 12));
		availbutton.setBounds(119, 246, 157, 35);
		getContentPane().add(availbutton);
		
		//exit
		JLabel lblNewLabel = new JLabel("X");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel.setForeground(Color.WHITE);
			}
		});
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel.setBounds(341, 11, 40, 40);
		getContentPane().add(lblNewLabel);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(10, 330, 380, 9);
		progressBar.setVisible(false);
		getContentPane().add(progressBar);
		
		timer = new Timer(5, (ActionListener)new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				progressBar.setVisible(true);
				progressBar.setValue(count);
				count++;
				if (count >= 100) {
					timer.stop();
					count = 0;
					dispose();
					login log = new login();
					log.setVisible(true);
					progressBar.setValue(0);
				}
			}
			
		});
	}
}
