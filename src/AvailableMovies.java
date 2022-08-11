import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class AvailableMovies extends JFrame implements ActionListener{

	JPanel border1,panel,panel_4,panel_2, panel_5, panel_3, panel_6;
	JLabel nowShowing,lblpic1, lblpic2, lblpic3,lblpic4,lblpic5,lblpic6,lblNewLabel,lblNewLabel_1,lblNewLabel_2,lblNewLabel_3,
			lblNewLabel_4,lblNewLabel_5,lblNewLabel_6,lblNewLabel_7	,lblNewLabel_8,lblNewLabel_9, lblNewLabel_10,lblNewLabel_11,
			lblNewLabel_12,lblNewLabel_13,lblNewLabel_14,lblNewLabel_15,lblNewLabel_16,lblNewLabel_17;
    JButton bknow1,bknow2,bknow3,bknow4,bknow5,bknow6;
	
   Image p1 = new ImageIcon(AvailableMovies.class.getResource("pic1.jpg")).getImage().getScaledInstance(260, 170, Image.SCALE_SMOOTH);
   Image p2 = new ImageIcon(AvailableMovies.class.getResource("pic2.jpg")).getImage().getScaledInstance(260, 170, Image.SCALE_SMOOTH);
   Image p3 = new ImageIcon(AvailableMovies.class.getResource("pic3.jpg")).getImage().getScaledInstance(260, 170, Image.SCALE_SMOOTH);
   Image p4 = new ImageIcon(AvailableMovies.class.getResource("pic4.jpg")).getImage().getScaledInstance(260, 170, Image.SCALE_SMOOTH);
   Image p5 = new ImageIcon(AvailableMovies.class.getResource("pic5.jpg")).getImage().getScaledInstance(260, 170, Image.SCALE_SMOOTH);
   Image p6 = new ImageIcon(AvailableMovies.class.getResource("pic6.jpg")).getImage().getScaledInstance(260, 170, Image.SCALE_SMOOTH);


    Image load = new ImageIcon(AvailableMovies.class.getResource("loadpic.gif")).getImage();

 	JProgressBar progressBar;
 	int count = 0;
 	Timer timer;
	
 	//constructor
	public AvailableMovies() {
		
		 setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\NEW JAVA\\WeWatch\\src\\logo.png"));
		 getContentPane().setBackground(Color.decode("#041C32"));
		 setBounds(100, 100, 992, 743);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 getContentPane().setLayout(null);
		 setUndecorated(true);
		 setLocationRelativeTo(null);
		
		 //border for now showing
		 border1 = new JPanel();
		 border1.setBounds(10, 11, 980, 69);
		 border1.setBorder(new LineBorder(new Color(255, 204, 0), 5));
		 border1.setBackground(Color.decode("#041C32"));
		 getContentPane().add(border1);
		 border1.setLayout(null);
		 
		 nowShowing = new JLabel("Now Showing");
		 nowShowing.setForeground(Color.WHITE);
		 nowShowing.setBounds(10, 10, 910, 49);
		 border1.add(nowShowing);
		 nowShowing.setFont(new Font("Impact", Font.PLAIN, 45));
		 nowShowing.setHorizontalAlignment(SwingConstants.CENTER);
		 
		 //exit
		 JLabel lblNewLabel_18 = new JLabel("X");
		 lblNewLabel_18.setBounds(921, 10, 49, 40);
		 border1.add(lblNewLabel_18);
		 lblNewLabel_18.addMouseListener(new MouseAdapter() {
		 	@Override
		 	public void mouseClicked(MouseEvent e) {
		 		System.exit(0);
		 	}
		 	@Override
		 	public void mouseEntered(MouseEvent e) {
		 		lblNewLabel_18.setForeground(Color.RED);
		 	}
		 	@Override
		 	public void mouseExited(MouseEvent e) {
		 		lblNewLabel_18.setForeground(Color.WHITE);
		 	}
		 });
		 lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
		 lblNewLabel_18.setForeground(Color.WHITE);
		 lblNewLabel_18.setFont(new Font("Arial Black", Font.BOLD, 14));
		
		 //panel for movie 1
		 panel = new JPanel();
		 panel.setBounds(33, 91, 280, 260);
		 panel.setBackground(Color.decode("#041C32"));
		 panel.setBorder(new LineBorder(new Color(255, 204, 0), 3));
		 panel.setLayout(null);
		 getContentPane().add(panel);
	
		 lblpic1 = new JLabel();
		 lblpic1.setHorizontalAlignment(SwingConstants.CENTER);
		 lblpic1.setBounds(10, 10, 260, 170);
		 lblpic1.setIcon(new ImageIcon(load));
		 panel.add(lblpic1);
		 
		 lblNewLabel = new JLabel("July 2  1:00PM - 3:00PM");
		 lblNewLabel.setForeground(Color.WHITE);
		 lblNewLabel.setFont(new Font("Poppins", Font.PLAIN, 11));
		 lblNewLabel.setBounds(146, 224, 113, 26);
		 panel.add(lblNewLabel);
		 
		 lblNewLabel_1 = new JLabel("July 1  8:00AM - 10:00AM");
		 lblNewLabel_1.setForeground(Color.WHITE);
		 lblNewLabel_1.setFont(new Font("Poppins", Font.PLAIN, 11));
		 lblNewLabel_1.setBounds(10, 224, 132, 26);
		 panel.add(lblNewLabel_1);
		 
		 lblNewLabel_2 = new JLabel("Jurassic World Dominion");
		 lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		 lblNewLabel_2.setForeground(Color.WHITE);
		 lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 16));
		 lblNewLabel_2.setBounds(10, 188, 250, 26);
		 panel.add(lblNewLabel_2);
		 
		 //panel for movie 4
		 panel_4 = new JPanel();
		 panel_4.setBounds(33, 403, 280, 260);
		 panel_4.setBackground(Color.decode("#041C32"));
		 panel_4.setBorder(new LineBorder(new Color(255, 204, 0), 3));
		 panel_4.setLayout(null);
		 getContentPane().add(panel_4);
		 
		 lblpic4 = new JLabel();
		 lblpic4.setHorizontalAlignment(SwingConstants.CENTER);
		 lblpic4.setIcon(new ImageIcon(load));
		 lblpic4.setBounds(10, 10, 260, 170);
		 panel_4.add(lblpic4);
		 
		 lblNewLabel_9 = new JLabel("Top Gun: Maverick");
		 lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		 lblNewLabel_9.setForeground(Color.WHITE);
		 lblNewLabel_9.setFont(new Font("Arial Black", Font.BOLD, 16));
		 lblNewLabel_9.setBounds(10, 193, 260, 26);
		 panel_4.add(lblNewLabel_9);
		 
		 lblNewLabel_10 = new JLabel("July 1  6:00AM - 8:00AM");
		 lblNewLabel_10.setForeground(Color.WHITE);
		 lblNewLabel_10.setFont(new Font("Poppins", Font.PLAIN, 11));
		 lblNewLabel_10.setBounds(10, 223, 140, 26);
		 panel_4.add(lblNewLabel_10);
		 
		 lblNewLabel_11 = new JLabel("July 2  10:00AM - 12:00AM");
		 lblNewLabel_11.setForeground(Color.WHITE);
		 lblNewLabel_11.setFont(new Font("Poppins", Font.PLAIN, 11));
		 lblNewLabel_11.setBounds(137, 223, 133, 26);
		 panel_4.add(lblNewLabel_11);
		 
		 //panel for movie 2
		 panel_2 = new JPanel();
		 panel_2.setBounds(365, 91, 280, 260);
		 panel_2.setBackground(Color.decode("#041C32"));
		 panel_2.setBorder(new LineBorder(new Color(255, 204, 0), 3));
		 panel_2.setLayout(null);
		 getContentPane().add(panel_2);
		 
		 lblpic2 = new JLabel();
		 lblpic2.setHorizontalAlignment(SwingConstants.CENTER);
		 lblpic2.setIcon(new ImageIcon(load));
		 lblpic2.setBounds(10, 10, 260, 170);
		 panel_2.add(lblpic2);
		 
		 lblNewLabel_3 = new JLabel("Thor: Love and Thunder");
		 lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		 lblNewLabel_3.setForeground(Color.WHITE);
		 lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 16));
		 lblNewLabel_3.setBounds(10, 188, 260, 26);
		 panel_2.add(lblNewLabel_3);
		 
		 lblNewLabel_4 = new JLabel("July 1  10:00AM - 12:00AM");
		 lblNewLabel_4.setForeground(Color.WHITE);
		 lblNewLabel_4.setFont(new Font("Poppins", Font.PLAIN, 11));
		 lblNewLabel_4.setBounds(10, 224, 133, 26);
		 panel_2.add(lblNewLabel_4);
		 
		 lblNewLabel_5 = new JLabel("July 2  8:00AM - 10:00AM");
		 lblNewLabel_5.setForeground(Color.WHITE);
		 lblNewLabel_5.setFont(new Font("Poppins", Font.PLAIN, 11));
		 lblNewLabel_5.setBounds(150, 224, 120, 26);
		 panel_2.add(lblNewLabel_5);
		 
		 //panel for movie 5
		 panel_5 = new JPanel();
		 panel_5.setBounds(365, 403, 280, 260);
		 panel_5.setBackground(Color.decode("#041C32"));
		 panel_5.setBorder(new LineBorder(new Color(255, 204, 0), 3));
		 panel_5.setLayout(null);
		 getContentPane().add(panel_5);
		
		 lblpic5 = new JLabel();
		 lblpic5.setHorizontalAlignment(SwingConstants.CENTER);
		 lblpic5.setIcon(new ImageIcon(load));
		 lblpic5.setBounds(10, 10, 260, 170);
		 panel_5.add(lblpic5);
		 
		 lblNewLabel_12 = new JLabel("Jujutsu Kaisen");
		 lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		 lblNewLabel_12.setForeground(Color.WHITE);
		 lblNewLabel_12.setFont(new Font("Arial Black", Font.BOLD, 16));
		 lblNewLabel_12.setBounds(10, 188, 260, 26);
		 panel_5.add(lblNewLabel_12);
		 
		 lblNewLabel_13 = new JLabel("July 1  3:00PM - 5:00PM");
		 lblNewLabel_13.setForeground(Color.WHITE);
		 lblNewLabel_13.setFont(new Font("Poppins", Font.PLAIN, 11));
		 lblNewLabel_13.setBounds(10, 225, 150, 26);
		 panel_5.add(lblNewLabel_13);
		 
		 lblNewLabel_14 = new JLabel("July 2  3:00PM - 5:00PM");
		 lblNewLabel_14.setForeground(Color.WHITE);
		 lblNewLabel_14.setFont(new Font("Poppins", Font.PLAIN, 11));
		 lblNewLabel_14.setBounds(133, 225, 143, 26);
		 panel_5.add(lblNewLabel_14);
		 
		 //panel for movie 3
		 panel_3 = new JPanel();
		 panel_3.setBounds(691, 91, 280, 260);
		 panel_3.setBackground(Color.decode("#041C32"));
		 panel_3.setBorder(new LineBorder(new Color(255, 204, 0), 3));
		 panel_3.setLayout(null);
		 getContentPane().add(panel_3);
		 
	     lblpic3 = new JLabel();
	     lblpic3.setHorizontalAlignment(SwingConstants.CENTER);
	     lblpic3.setIcon(new ImageIcon(load));
		 lblpic3.setBounds(10, 10, 260, 170);
		 panel_3.add(lblpic3);
		 
		 lblNewLabel_6 = new JLabel("League of Super Pets");
		 lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		 lblNewLabel_6.setForeground(Color.WHITE);
		 lblNewLabel_6.setFont(new Font("Arial Black", Font.BOLD, 16));
		 lblNewLabel_6.setBounds(10, 188, 260, 26);
		 panel_3.add(lblNewLabel_6);
		 
		 lblNewLabel_7 = new JLabel("July 1  1:00PM - 3:00PM");
		 lblNewLabel_7.setForeground(Color.WHITE);
		 lblNewLabel_7.setFont(new Font("Poppins", Font.PLAIN, 11));
		 lblNewLabel_7.setBounds(10, 224, 174, 26);
		 panel_3.add(lblNewLabel_7);
		 
		 lblNewLabel_8 = new JLabel("July 2  6:00AM - 8:00AM");
		 lblNewLabel_8.setForeground(Color.WHITE);
		 lblNewLabel_8.setFont(new Font("Poppins", Font.PLAIN, 11));
		 lblNewLabel_8.setBounds(143, 224, 127, 26);
		 panel_3.add(lblNewLabel_8);
		 
		 //panel for movie 6
		 panel_6 = new JPanel();
		 panel_6.setBounds(691, 403, 280, 260);
		 panel_6.setBackground(Color.decode("#041C32"));
		 panel_6.setBorder(new LineBorder(new Color(255, 204, 0), 3));
		 panel_6.setLayout(null);
		 getContentPane().add(panel_6);
		 
		 lblpic6 = new JLabel();
		 lblpic6.setHorizontalAlignment(SwingConstants.CENTER);
		 lblpic6.setIcon(new ImageIcon(load));
		 lblpic6.setBounds(10, 10, 260, 170);
		 panel_6.add(lblpic6); 
		 
		 lblNewLabel_15 = new JLabel("The Batman");
		 lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		 lblNewLabel_15.setForeground(Color.WHITE);
		 lblNewLabel_15.setFont(new Font("Arial Black", Font.BOLD, 16));
		 lblNewLabel_15.setBounds(10, 191, 260, 26);
		 panel_6.add(lblNewLabel_15);
		 
		 lblNewLabel_16 = new JLabel("July 1  5:00PM - 7:00PM");
		 lblNewLabel_16.setForeground(Color.WHITE);
		 lblNewLabel_16.setFont(new Font("Poppins", Font.PLAIN, 11));
		 lblNewLabel_16.setBounds(10, 223, 140, 26);
		 panel_6.add(lblNewLabel_16);
		 
		 lblNewLabel_17 = new JLabel("July 2  5:00PM - 7:00PM");
		 lblNewLabel_17.setForeground(Color.WHITE);
		 lblNewLabel_17.setFont(new Font("Poppins", Font.PLAIN, 11));
		 lblNewLabel_17.setBounds(141, 223, 129, 26);
		 panel_6.add(lblNewLabel_17);
		 
		 //book now buttons
		 bknow1 = new JButton("Book Now");
		 bknow1.setForeground(Color.WHITE);
		 bknow1.setFont(new Font("Poppins ExtraBold", Font.BOLD, 14));
		 bknow1.setFocusable(false);
		 bknow1.setBackground(new Color(255, 204, 51));
		 bknow1.setBounds(100, 361, 147, 31);
		 getContentPane().add(bknow1);
		 
		 bknow2 = new JButton("Book Now");
		 bknow2.setBounds(432, 364, 147, 31);
		 bknow2.setForeground(Color.WHITE);
		 bknow2.setFont(new Font("Poppins ExtraBold", Font.BOLD, 14));
		 bknow2.setFocusable(false);
		 bknow2.setBackground(new Color(255, 204, 51));
		 getContentPane().add(bknow2);
		 	 
		 bknow3 = new JButton("Book Now");
		 bknow3.setForeground(Color.WHITE);
		 bknow3.setFont(new Font("Poppins ExtraBold", Font.BOLD, 14));
		 bknow3.setFocusable(false);
		 bknow3.setBackground(new Color(255, 204, 51));
		 bknow3.setBounds(762, 361, 147, 31);
		 getContentPane().add(bknow3);
		 
		 bknow4 = new JButton("Book Now");
		 bknow4.setForeground(Color.WHITE);
		 bknow4.setFont(new Font("Poppins ExtraBold", Font.BOLD, 14));
		 bknow4.setFocusable(false);
		 bknow4.setBackground(new Color(255, 204, 51));
		 bknow4.setBounds(100, 669, 147, 31);
		 getContentPane().add(bknow4);
		 
		 bknow5 = new JButton("Book Now");
		 bknow5.setForeground(Color.WHITE);
		 bknow5.setFont(new Font("Poppins ExtraBold", Font.BOLD, 14));
		 bknow5.setFocusable(false);
		 bknow5.setBackground(new Color(255, 204, 51));
		 bknow5.setBounds(432, 669, 147, 31);
		 getContentPane().add(bknow5);
		 
		 bknow6 = new JButton("Book Now");
		 bknow6.setForeground(Color.WHITE);
		 bknow6.setFont(new Font("Poppins ExtraBold", Font.BOLD, 14));
		 bknow6.setFocusable(false);
		 bknow6.setBackground(new Color(255, 204, 51));
		 bknow6.setBounds(762, 669, 147, 31);
		 getContentPane().add(bknow6);
		 
		 
		 bknow1.addActionListener(this);
		 bknow2.addActionListener(this);
		 bknow3.addActionListener(this);
		 bknow4.addActionListener(this);
		 bknow5.addActionListener(this);
		 bknow6.addActionListener(this);

		 
		
		 //loading 
		 timer = new Timer(20, (ActionListener)new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					count++;
					if (count == 2) {
						lblpic1.setIcon(new ImageIcon(p1));
					}
					else if (count == 3) {
						lblpic2.setIcon(new ImageIcon(p2));
					}	
					else if (count ==4) {
						lblpic3.setIcon(new ImageIcon(p3));
					}	
					else if (count == 5) {
						lblpic4.setIcon(new ImageIcon(p4));
					}	
					else if (count == 6) {
						lblpic5.setIcon(new ImageIcon(p5));
					}	
					else if (count == 7) {
						timer.stop();
						lblpic6.setIcon(new ImageIcon(p6));
						count = 0; 
					}	
	
				}
			});
			
		 timer.start();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()== bknow1)
		{
			dispose();
	 		BookNow bk = new BookNow();
	 		bk.setVisible(true);
	 		bk.lblSelectedMovie.setText("Jurrasic World Dominion");
	 		bk.lblSched1.setText("July 1  8:00AM - 10:00AM");
	 		bk.lblSched2.setText("July 2  1:00PM - 3:00PM");
		}
		if(e.getSource()== bknow2)
		{
			dispose();
	 		BookNow bk = new BookNow();
	 		bk.setVisible(true);
	 		bk.lblSelectedMovie.setText("Thor: Love and Thunderr");
	 		bk.lblSched1.setText("July 1  10:00AM - 12:00AM");
	 		bk.lblSched2.setText("July 2  8:00AM - 10:00AM");
		}
		if(e.getSource()==bknow3)
		{
			dispose();
	 		BookNow bk = new BookNow();
	 		bk.setVisible(true);
	 		bk.lblSelectedMovie.setText("League of Super Pets");
	 		bk.lblSched1.setText("July 1  1:00PM - 3:00PM");
	 		bk.lblSched2.setText("July 2  6:00AM - 8:00AM");
		}
		if(e.getSource()== bknow4)
		{
			dispose();
	 		BookNow bk = new BookNow();
	 		bk.setVisible(true);
	 		bk.lblSelectedMovie.setText("Top Gun: Maverick");
	 		bk.lblSched1.setText("July 1  6:00AM - 8:00AM");
	 		bk.lblSched2.setText("July 2  10:00AM - 12:00AM");
		}
		if(e.getSource()== bknow5)
		{
			dispose();
	 		BookNow bk = new BookNow();
	 		bk.setVisible(true);
	 		bk.lblSelectedMovie.setText("Jujutsu Kaisen");
	 		bk.lblSched1.setText("July 1  3:00PM - 5:00PM");
	 		bk.lblSched2.setText("July 2  3:00PM - 5:00PM");
		}
		if(e.getSource()==bknow6)
		{
			dispose();
	 		BookNow bk = new BookNow();
	 		bk.setVisible(true);
	 		bk.lblSelectedMovie.setText("The Batman");
	 		bk.lblSched1.setText("July 1  5:00PM - 7:00PM");
	 		bk.lblSched2.setText("July 2  5:00PM - 7:00PM");
		}
	}
}
