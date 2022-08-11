
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class login extends JFrame {

	private JPanel contentPane;
	private JLabel lbl_logo, lbl_imgloginLogo;

	private Image img_logo = new ImageIcon(login.class.getResource("logo.png")).getImage().getScaledInstance(260, 60, Image.SCALE_SMOOTH);
	private Image img_loginLogo = new ImageIcon(login.class.getResource("img_loginLogo.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
	private Image img_login = new ImageIcon(login.class.getResource("img_login.png")).getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
	private Image img_exit = new ImageIcon(login.class.getResource("img_exit.png")).getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);

	private JTextField textField_username;
	private JPasswordField passwordField_password;
	private JLabel lblPassword;
	private JPanel panel_login;
	private JLabel lblLogin;
	private JLabel lbl_imgLogin;
	private JPanel panel_exit;
	private JLabel lblExit;
	private JLabel lbl_imgExit;
	
    Thread t1 = null;
    int hours = 0, minutes = 0, seconds = 0;
    String timeString = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 260);
		contentPane = new JPanel();
		contentPane.setBackground(Color.decode("#041C32"));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbl_logo = new JLabel("");
		lbl_logo.setBackground(Color.decode("#041C32"));
		lbl_logo.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_logo.setBounds(10, 11, 280, 62);
		lbl_logo.setBorder(new LineBorder(new Color(255, 204, 0), 4));
		lbl_logo.setOpaque(true);
		lbl_logo.setIcon(new ImageIcon(img_logo));
		contentPane.add(lbl_logo);
		
		lbl_imgloginLogo = new JLabel("");
		lbl_imgloginLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_imgloginLogo.setBounds(10, 91, 119, 123);
		lbl_imgloginLogo.setIcon(new ImageIcon(img_loginLogo));
		contentPane.add(lbl_imgloginLogo);
		
		textField_username = new JTextField();
		textField_username.setBorder(new LineBorder(Color.GRAY));
		textField_username.setFont(new Font("Arial Black", Font.BOLD, 12));
		textField_username.setBounds(139, 116, 151, 20);
		contentPane.add(textField_username);
		textField_username.setColumns(10);
		
		passwordField_password = new JPasswordField();
		passwordField_password.setBorder(new LineBorder(Color.GRAY));
		passwordField_password.setFont(new Font("Arial Black", Font.BOLD, 12));
		passwordField_password.setBounds(139, 162, 151, 20);
		contentPane.add(passwordField_password);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblUsername.setBounds(139, 91, 151, 26);
		contentPane.add(lblUsername);
		
		lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblPassword.setBounds(139, 136, 151, 26);
		contentPane.add(lblPassword);
		
		panel_login = new JPanel();
		panel_login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (textField_username.getText().equals("admin") && passwordField_password.getText().equals("admin")) {
					AvailableMovies avi =new AvailableMovies();
					avi.setVisible(true);
				}
				else {
					JOptionPane.showConfirmDialog(null, "Invalid username or password.", "",JOptionPane.DEFAULT_OPTION);
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_login.setBackground(new Color(0, 0, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_login.setBackground(new Color(0, 0, 200));
			}
		});
		panel_login.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_login.setBackground(new Color(0, 0, 200));
		panel_login.setBounds(139, 193, 73, 21);
		contentPane.add(panel_login);
		panel_login.setLayout(null);
		
		lblLogin = new JLabel("LOGIN");
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblLogin.setHorizontalAlignment(SwingConstants.LEFT);
		lblLogin.setHorizontalTextPosition(SwingConstants.CENTER);
		lblLogin.setBounds(22, 0, 51, 21);
		panel_login.add(lblLogin);
		
		lbl_imgLogin = new JLabel("");
		lbl_imgLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_imgLogin.setBounds(0, 0, 20, 21);
		lbl_imgLogin.setIcon(new ImageIcon(img_login));
		panel_login.add(lbl_imgLogin);
		
		panel_exit = new JPanel();
		panel_exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirmation", JOptionPane.YES_NO_OPTION)== 0) {
					System.exit(0);
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_exit.setBackground(new Color(255, 0, 0));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_exit.setBackground(new Color(200, 0, 0));
			}
		});
		panel_exit.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_exit.setBackground(new Color(200, 0, 0));
		panel_exit.setLayout(null);
		panel_exit.setBounds(217, 193, 73, 21);
		contentPane.add(panel_exit);
		
		lblExit = new JLabel("EXIT");
		lblExit.setForeground(Color.WHITE);
		lblExit.setHorizontalTextPosition(SwingConstants.CENTER);
		lblExit.setHorizontalAlignment(SwingConstants.LEFT);
		lblExit.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblExit.setBounds(22, 0, 51, 21);
		panel_exit.add(lblExit);
		
		lbl_imgExit = new JLabel("");
		lbl_imgExit.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_imgExit.setBounds(0, 0, 20, 21);
		lbl_imgExit.setIcon(new ImageIcon(img_exit));
		panel_exit.add(lbl_imgExit);
		setLocationRelativeTo(null);
		setUndecorated(true);
	}
}
