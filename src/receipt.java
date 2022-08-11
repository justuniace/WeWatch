import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;


public class receipt extends JFrame {

	 JPanel contentPane;
	 JLabel lbl_Name,  header2, lbl_Address, lbl_Bseat, line2, lbl_Total, lbl_Cash, footer, line4, lbl_Mseat,
	 		line3, lbl_Price, lbl_Discount, lbl_Vat, lbl_Change, lblsold, lbladd, lbl_Title, lblamt,
	 		lbldis, lblvat, lbltotal, lblcash, lblchange, lbl_Oseat, X, loading,  header, logo, line1,  gen;
	
	int count = 0;
	Timer timer;
	
	Image load = new ImageIcon(BookNow.class.getResource("load.gif")).getImage();
	Image imglogo = new ImageIcon(BookNow.class.getResource("logo.png")).getImage().getScaledInstance(100, 20, Image.SCALE_SMOOTH);
	
		
		//constructor
	public receipt() {
		

		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\NEW JAVA\\WeWatch\\src\\logo.png"));  
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		logo = new JLabel();
		logo.setHorizontalAlignment(SwingConstants.CENTER);
		logo.setBounds(10, 11, 340, 60);
		logo.setIcon(new ImageIcon(imglogo));
		contentPane.add(logo);
		
		header = new JLabel("<html><center><p>\r\n"
				+ "MOVIE TICKET BOOKING SYSTEM<br>\r\n"
				+ "Owned & Operated by: Philippine<br>\r\n"
				+ "Cinema Organization<br>\r\n"
				+ "Brgy. 8, Tagkawayan, Quezon<br>\r\n"
				+ "Tel#: 111-1111<br>\r\n"
				+ "=========================================================\r\n"
				+ "</p></center><html/>");
		header.setFont(new Font("Arial", Font.BOLD, 10));
		header.setHorizontalAlignment(SwingConstants.CENTER);
		header.setHorizontalTextPosition(SwingConstants.CENTER);
		header.setBounds(10, 70, 340, 90);
		contentPane.add(header);
		
		//name of the customer
		lbl_Name = new JLabel();
		lbl_Name.setFont(new Font("Arial", Font.BOLD, 10));
		lbl_Name.setBounds(205, 218, 145, 14);
		contentPane.add(lbl_Name);
		
		header2 = new JLabel("<html><p>\r\n"
				+ "RECEIPT#: 01<br>\r\n"
				+ "SERIAL#: 01<br>\r\n"
				+ "STAFF NAME: EUNICE VALDEZ<br>\r\n"
				+ "</p><html/>");
		header2.setHorizontalTextPosition(SwingConstants.CENTER);
		header2.setHorizontalAlignment(SwingConstants.LEFT);
		header2.setFont(new Font("Arial", Font.BOLD, 10));
		header2.setBounds(38, 155, 312, 46);
		contentPane.add(header2);
		
		//address of the customer
		lbl_Address = new JLabel();
		lbl_Address.setFont(new Font("Arial", Font.BOLD, 10));
		lbl_Address.setBounds(205, 237, 145, 14);
		contentPane.add(lbl_Address);
		
		//seats
		lbl_Bseat = new JLabel();
		lbl_Bseat.setFont(new Font("Arial", Font.BOLD, 10));
		lbl_Bseat.setBounds(205, 261, 145, 14);
		contentPane.add(lbl_Bseat);
		
		line2 = new JLabel("<html>==============================================================<html>");
		line2.setFont(new Font("Arial", Font.BOLD, 10));
		line2.setBounds(38, 309, 288, 14);
		contentPane.add(line2);
		
		//total amount
		lbl_Total = new JLabel();
		lbl_Total.setFont(new Font("Arial", Font.BOLD, 12));
		lbl_Total.setBounds(205, 418, 145, 14);
		contentPane.add(lbl_Total);
		
		lbl_Cash = new JLabel();
		lbl_Cash.setFont(new Font("Arial", Font.BOLD, 12));
		lbl_Cash.setBounds(205, 442, 145, 14);
		contentPane.add(lbl_Cash);
		
		footer = new JLabel("<html><center><p>\r\n"
				+ "THIS RECEIPT SHALL BE VALID FOR<br>\r\n"
				+ "FIVE (5)YEARS FROM THE DATE OF<br> \r\n"
				+ "PERMIT TO USE<br><br>\r\n"
				+ "*THIS IS AN OFFICIAL RECEIPT*<br>\r\n"
				+ "THIS DOCUMENT IS NOT VALID FOR<br>\r\n"
				+ "CLAIM OF INPUT TAX<br>\r\n"
				+ "</p></center><html/>");
		footer.setFont(new Font("Arial", Font.BOLD, 10));
		footer.setHorizontalAlignment(SwingConstants.CENTER);
		footer.setHorizontalTextPosition(SwingConstants.CENTER);
		footer.setBounds(38, 500, 288, 90);
		contentPane.add(footer);
		
		line4 = new JLabel("<html>==============================================================<html>");
		line4.setFont(new Font("Arial", Font.BOLD, 10));
		line4.setBounds(38, 482, 288, 14);
		contentPane.add(line4);
		
		line1 = new JLabel("<html>==============================================================<html>");
		line1.setFont(new Font("Arial", Font.BOLD, 10));
		line1.setBounds(38, 199, 288, 14);
		contentPane.add(line1);
		
		lbl_Mseat = new JLabel();
		lbl_Mseat.setFont(new Font("Arial", Font.BOLD, 10));
		lbl_Mseat.setBounds(205, 273, 145, 14);
		contentPane.add(lbl_Mseat);
		
		line3 = new JLabel("<html>==============================================================<html>");
		line3.setFont(new Font("Arial", Font.BOLD, 10));
		line3.setBounds(38, 397, 227, 14);
		contentPane.add(line3);
		
		lbl_Price = new JLabel();
		lbl_Price.setFont(new Font("Arial", Font.BOLD, 10));
		lbl_Price.setBounds(205, 322, 145, 14);
		contentPane.add(lbl_Price);
		
		lbl_Discount = new JLabel();
		lbl_Discount.setFont(new Font("Arial", Font.BOLD, 10));
		lbl_Discount.setBounds(205, 346, 145, 14);
		contentPane.add(lbl_Discount);
		
		lbl_Vat = new JLabel();
		lbl_Vat.setFont(new Font("Arial", Font.BOLD, 10));
		lbl_Vat.setBounds(205, 370, 145, 14);
		contentPane.add(lbl_Vat);
		
		lbl_Change = new JLabel();
		lbl_Change.setFont(new Font("Arial", Font.BOLD, 12));
		lbl_Change.setBounds(205, 469, 145, 14);
		contentPane.add(lbl_Change);
		
		lblsold = new JLabel("Sold to:");
		lblsold.setFont(new Font("Arial", Font.BOLD, 10));
		lblsold.setBounds(38, 218, 76, 14);
		contentPane.add(lblsold);
		
		lbladd = new JLabel("Address:");
		lbladd.setFont(new Font("Arial", Font.BOLD, 10));
		lbladd.setBounds(38, 237, 61, 14);
		contentPane.add(lbladd);
		
		lbl_Title = new JLabel();
		lbl_Title.setFont(new Font("Arial", Font.BOLD, 10));
		lbl_Title.setBounds(38, 256, 76, 14);
		contentPane.add(lbl_Title);
		
		lblamt = new JLabel("Amount:");
		lblamt.setFont(new Font("Arial", Font.BOLD, 10));
		lblamt.setBounds(38, 322, 76, 14);
		contentPane.add(lblamt);
		
		lbldis = new JLabel("Discount:");
		lbldis.setFont(new Font("Arial", Font.BOLD, 10));
		lbldis.setBounds(103, 346, 85, 14);
		contentPane.add(lbldis);
		
		lblvat = new JLabel("Tax (VAT) 12%");
		lblvat.setFont(new Font("Arial", Font.BOLD, 10));
		lblvat.setBounds(103, 370, 85, 14);
		contentPane.add(lblvat);
		
		lbltotal = new JLabel("TOTAL:");
		lbltotal.setFont(new Font("Arial", Font.BOLD, 12));
		lbltotal.setBounds(38, 421, 70, 14);
		contentPane.add(lbltotal);
		
		lblcash = new JLabel("CASH:");
		lblcash.setFont(new Font("Arial", Font.BOLD, 12));
		lblcash.setBounds(38, 445, 76, 14);
		contentPane.add(lblcash);
		
		lblchange = new JLabel("CHANGE:");
		lblchange.setFont(new Font("Arial", Font.BOLD, 12));
		lblchange.setBounds(38, 469, 145, 14);
		contentPane.add(lblchange);
		
		lbl_Oseat = new JLabel();
		lbl_Oseat.setFont(new Font("Arial", Font.BOLD, 10));
		lbl_Oseat.setBounds(205, 285, 145, 14);
		contentPane.add(lbl_Oseat);
		
		X = new JLabel("X");
		X.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 int n =JOptionPane.showConfirmDialog(null, "Do you want to book again?", "Confirmation?",JOptionPane.YES_NO_OPTION);
					if(n== JOptionPane.YES_OPTION)
					{
						dispose();
						AvailableMovies am = new AvailableMovies();
						am.setVisible(true);
					}
					else {
						dispose();
					}

			}
			@Override
			public void mouseEntered(MouseEvent e) {
				X.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				X.setForeground(Color.BLACK);
			}
		});
		X.setHorizontalAlignment(SwingConstants.CENTER);
		X.setFont(new Font("Arial Black", Font.BOLD, 10));
		X.setBounds(320, 11, 30, 30);
		contentPane.add(X);
		
		loading = new JLabel("");
		loading.setHorizontalAlignment(SwingConstants.CENTER);
		loading.setBounds(48, 125, 288, 211);
		contentPane.add(loading);
		loading.setIcon(new ImageIcon(load));
		
		gen = new JLabel("Generating receipt...");
		gen.setHorizontalAlignment(SwingConstants.CENTER);
		gen.setFont(new Font("Arial Black", Font.BOLD, 14));
		gen.setForeground(Color.RED);
		gen.setHorizontalTextPosition(SwingConstants.CENTER);
		gen.setBounds(38, 363, 288, 22);
		contentPane.add(gen);
		setUndecorated(true);

		disenabledAll();
		
		timer = new Timer(20, (ActionListener)new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				if (count >= 100) {
					timer.stop();
					count = 0;
					enabledAll();
					loading.setVisible(false);
					gen.setVisible(false);
				}
			}
			
		});
		timer.start();
		
	
		
	}
	public void enabledAll() {
		lbl_Name.setVisible(true);
		header2.setVisible(true);
		lbl_Address.setVisible(true);
		lbl_Bseat.setVisible(true);
		line2.setVisible(true);
		lbl_Total.setVisible(true);
		lbl_Cash.setVisible(true);
		footer.setVisible(true);
		line4.setVisible(true);
		lbl_Mseat.setVisible(true);
		line3.setVisible(true);
		lbl_Price.setVisible(true);
		lbl_Discount.setVisible(true);
		lbl_Vat.setVisible(true);
		lbl_Change.setVisible(true);
		lblsold.setVisible(true);
		lbladd.setVisible(true);
		lbl_Title.setVisible(true);
		lblamt.setVisible(true);
		lbldis.setVisible(true);
		lblvat.setVisible(true);
		lbltotal.setVisible(true);
		lblcash.setVisible(true);
		lblchange.setVisible(true);
		lbl_Oseat.setVisible(true);
		X.setVisible(true);
		line1.setVisible(true);
		header.setVisible(true);
		logo.setVisible(true);
		
	}
	public void disenabledAll() {
		lbl_Name.setVisible(false);
		header2.setVisible(false);
		lbl_Address.setVisible(false);
		lbl_Bseat.setVisible(false);
		line1.setVisible(false);
		line2.setVisible(false);
		lbl_Total.setVisible(false);
		lbl_Cash.setVisible(false);
		footer.setVisible(false);
		line4.setVisible(false);
		lbl_Mseat.setVisible(false);
		line3.setVisible(false);
		lbl_Price.setVisible(false);
		lbl_Discount.setVisible(false);
		lbl_Vat.setVisible(false);
		lbl_Change.setVisible(false);
		lblsold.setVisible(false);
		lbladd.setVisible(false);
		lbl_Title.setVisible(false);
		lblamt.setVisible(false);
		lbldis.setVisible(false);
		lblvat.setVisible(false);
		lbltotal.setVisible(false);
		lblcash.setVisible(false);
		lblchange.setVisible(false);
		lbl_Oseat.setVisible(false);
		X.setVisible(false);
		header.setVisible(false);
		logo.setVisible(false);
	}
}
