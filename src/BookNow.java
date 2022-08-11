import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class BookNow extends JFrame  {
	
	JLabel lblgif, lblSelectedMovie,lblExit,lblNewLabel_4,
			lbllname,lblfname,lblAge,lblcontactNo,lblconfirm, lblNewLabel_2, lblNewLabel_3;
	JLabel lblHome,lblEmail,lblDiscount,lblClear,lblPay,
			lblReceipt,lblSub,lblVat,lblTotal,lblPayment,lblChange,lblSex,updateIcon,lblNewLabel_12,
			lblDeletelblNewLabel, lblMezzanine,lblBalcony, lblOseat,  lblMseat, lblBseat, lblSched1, lblSched2, lblNewLabel_1,
			lblNewLabel,confirmicon_2, lblClear_1,  ClearIcon,lblNewLabel_5;
	
	JLabel lblDelete,lblBack;
	//label for icons
	JLabel clearIcon,deleteIcon,backIcon,paymentIcon,receiptIcon,exitIcon,confirmicon,homeIcon;
	//label for seats
	JLabel bseat1,bseat2,bseat3,bseat4,bseat5,mseat1,mseat2,mseat3,mseat4,mseat5,oseat1,oseat2,oseat3,oseat4,oseat5,mseat6,bseat6,oseat6;
	
	
	JPanel panel, panel_2, panelHome,panelBack,panelExit,panelInvoice ,panelcusInfo,panelUpdate,panelDelete, panel_3 ;
	JPanel panelClear,panelPayment,panelReceipt, panelconfirm, Clear;
		
	JRadioButton rdbtnsched1, rdbtnsched2,rdbtnFemale,rdbtnMale, rdbtnStudent, rdbtnSenior, rdbtnOther;
	ButtonGroup sched,sexGroup, discountGroup;
	
	JTextField fname,lname,contactNo,Email,Age,subTotal,tax,total,pay,change,discount;
	JTable table;
	
			
			
	
	DefaultTableModel tModel;
	DefaultTableModel sModel;

	
	 Image bk = new ImageIcon(BookNow.class.getResource("bk.gif")).getImage();
	 Image home = new ImageIcon(BookNow.class.getResource("home.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
	 Image back = new ImageIcon(BookNow.class.getResource("back.png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
	 Image broom = new ImageIcon(BookNow.class.getResource("broom.png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
	 Image payment = new ImageIcon(BookNow.class.getResource("payment.png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
	 Image receipt = new ImageIcon(BookNow.class.getResource("receipt.png")).getImage().getScaledInstance(45, 45, Image.SCALE_SMOOTH);
	 Image exit = new ImageIcon(BookNow.class.getResource("exit.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
	 Image update = new ImageIcon(BookNow.class.getResource("update.png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
	 Image delete = new ImageIcon(BookNow.class.getResource("delete.png")).getImage().getScaledInstance(45, 45, Image.SCALE_SMOOTH);
	 Image mainscreen = new ImageIcon(BookNow.class.getResource("mainscreen.png")).getImage().getScaledInstance(80, 500, Image.SCALE_SMOOTH);
	 Image seat = new ImageIcon(BookNow.class.getResource("chair-rotated.png")).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
	 Image confirm = new ImageIcon(BookNow.class.getResource("check.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
	

	 double ttal, pyment, ttol;
	 double dis = 0.0;
		int bseat = 0;
		int mseat = 0;
		int oseat = 0;
		
	 
		//column for Table
	Object[] column = {"First_Name", 
			"Last_Name", 
			"Contact_Number", 
			"Email", 
			"Age",
			"Sex",
			"MovieTitle",
			"Schedule",
			"Bseat",
			"Mseat",
			"Oseat",
			"Subtotal",
			"Discount", 
			"Vat",
			"Total",
			"Payment", 
			"Change",
			"Receipt",
			"OSEAT1",
			"OSEAT2",
			"OSEAT3",
			"OSEAT4",
			"OSEAT5",
			"OSEAT6",
			"MSEAT1",
			"MSEAT2",
			"MSEAT3",
			"MSEAT4",
			"MSEAT5",
			"MSEAT6",
			"BSEAT1",
			"BSEAT2",
			"BSEAT3",
			"BSEAT4",
			"BSEAT5",
			"BSEAT6",};
	
	//rows for table
	Object[] row = new Object[36];
	
	//Yes or no for the receipt in JTable
	String rec1 = "no";
	String rec2 = "yes";

	//constructor
	public BookNow() {
		
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\NEW JAVA\\WeWatch\\src\\logo.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1252, 755);
		getContentPane().setBackground(Color.decode("#041C32"));
		getContentPane().setLayout(null);
		setUndecorated(true);
		setLocationRelativeTo(null);
		
	    panel = new JPanel();
		panel.setBackground(Color.decode("#041C32"));
		panel.setBorder(new LineBorder(new Color(255, 204, 0), 5, true));
		panel.setBounds(10, 66, 266, 640);
		panel.setLayout(null);
		getContentPane().add(panel);
		
		//name of the selected movies
		lblSelectedMovie = new JLabel("");
		lblSelectedMovie.setBounds(13, 11, 243, 28);
		lblSelectedMovie.setForeground(Color.RED);
		lblSelectedMovie.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblSelectedMovie.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblSelectedMovie);
		
		//name of the schedule 1 of the selected movies
		rdbtnsched1 = new JRadioButton();
		rdbtnsched1.setBounds(20, 53, 21, 28);
		rdbtnsched1.setForeground(Color.WHITE);
		rdbtnsched1.setFont(new Font("Poppins", Font.PLAIN, 12));
		rdbtnsched1.setBackground(Color.decode("#041C32"));
		rdbtnsched1.setFocusable(false);
		panel.add(rdbtnsched1);
		
		//name of the schedule 2 of the selected movies
		rdbtnsched2 = new JRadioButton();
		rdbtnsched2.setBounds(20, 89, 21, 28);
		rdbtnsched2.setForeground(Color.WHITE);
		rdbtnsched2.setFont(new Font("Poppins", Font.PLAIN, 12));
		rdbtnsched2.setBackground(Color.decode("#041C32"));
		rdbtnsched2.setFocusable(false);
		panel.add(rdbtnsched2);
		
		//buttonGroup for Schedules
		sched = new ButtonGroup();
		sched.add(rdbtnsched1);
		sched.add(rdbtnsched2);
		
		panelHome = new JPanel();
		panelHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			dispose();
			login log = new login();
			log.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelHome.setBackground(Color.decode("#95D1CC"));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				panelHome.setBackground(Color.decode("#BFE3E0"));
			}
		});
		panelHome.setBounds(13, 243, 236, 53);
		panelHome.setBackground(Color.decode("#95D1CC"));
		panelHome.setLayout(null);
		panel.add(panelHome);
		
		homeIcon = new JLabel();
		homeIcon.setHorizontalAlignment(SwingConstants.CENTER);
		homeIcon.setIcon(new ImageIcon(home));
		homeIcon.setBounds(0, 0, 114, 53);
		panelHome.add(homeIcon);
		
		lblHome = new JLabel("HOME");
		lblHome.setBounds(112, 10, 114, 33);
		lblHome.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblHome.setForeground(Color.decode("#041C32"));
		panelHome.add(lblHome);
		
		// to go back from the previous class or frame
		panelBack = new JPanel();
		panelBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(fname.getText().equals("")&&lname.getText().equals("") && discount.getText().equals("")&& Email.getText().equals("") && Age.getText().equals("") && rdbtnFemale.isSelected()==false&& rdbtnMale.isSelected()==false && contactNo.getText().equals("")&& rdbtnSenior.isSelected()==false&& rdbtnStudent.isSelected()==false && rdbtnOther.isSelected()==false &&  rdbtnsched1.isSelected()==false && rdbtnsched2.isSelected()==false && subTotal.getText().equals("") && discount.getText().equals("") && tax.getText().equals("") && total.getText().equals("") && pay.getText().equals("") )
				{
					dispose();
					AvailableMovies av = new AvailableMovies();
					av.setVisible(true);
				}
				else {
					 int n =JOptionPane.showConfirmDialog(null, "All the data you entered will be erased. Are you sure you want to proceed?", "Are you Sure?",JOptionPane.YES_NO_OPTION);
					if(n== JOptionPane.YES_OPTION)
					{
						dispose();
						AvailableMovies av = new AvailableMovies();
						av.setVisible(true);
					}
					
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelBack.setBackground(Color.decode("#6F69AC"));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				panelBack.setBackground(Color.decode("#A8A5CD"));
			}
		});
		panelBack.setBounds(13, 306, 236, 53);
		panelBack.setBackground(Color.decode("#6F69AC"));
		panel.add(panelBack);
		panelBack.setLayout(null);
		
		backIcon = new JLabel();
		backIcon.setHorizontalAlignment(SwingConstants.CENTER);
		backIcon.setIcon(new ImageIcon(back));
		backIcon.setBounds(0, 2, 114, 50);
		panelBack.add(backIcon);
		
		lblBack = new JLabel("BACK");
		lblBack.setBounds(111, 2, 87, 53);
		lblBack.setForeground(new Color(4, 28, 50));
		lblBack.setFont(new Font("Arial Black", Font.BOLD, 22));
		panelBack.add(lblBack);
		
		//to exit the system or frame
		panelExit = new JPanel();
		panelExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 int n =JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirmation?",JOptionPane.YES_NO_OPTION);
					if(n== JOptionPane.YES_OPTION)
					{
						System.exit(0);
					}

			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelExit.setBackground(Color.decode("#F8A79B"));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				panelExit.setBackground(Color.decode("#FAC1B9"));
			}
		});
		panelExit.setBounds(13, 558, 236, 53);
		panelExit.setBackground(Color.decode("#F8A79B"));
		panel.add(panelExit);
		panelExit.setLayout(null);
		
		exitIcon = new JLabel();
		exitIcon.setHorizontalAlignment(SwingConstants.CENTER);
		exitIcon.setIcon(new ImageIcon(exit));
		exitIcon.setBounds(0, 0, 114, 53);
		panelExit.add(exitIcon);
		
		lblExit = new JLabel("EXIT");
		lblExit.setBounds(112, 10, 87, 33);
		lblExit.setForeground(new Color(4, 28, 50));
		lblExit.setFont(new Font("Arial Black", Font.BOLD, 22));
		panelExit.add(lblExit);
		
		
		//to clear all the fields
		panelClear = new JPanel();
		panelClear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(fname.getText().equals("")&&lname.getText().equals("") && Email.getText().equals("") && Age.getText().equals("") && rdbtnFemale.isSelected()==false&& rdbtnMale.isSelected()==false && contactNo.getText().equals("")&& rdbtnSenior.isSelected()==false && rdbtnStudent.isSelected()==false &&  rdbtnsched1.isSelected()==false && rdbtnsched2.isSelected()==false && subTotal.getText().equals("") && discount.getText().equals("") && tax.getText().equals("") && total.getText().equals("") && pay.getText().equals("") )
				{
					JOptionPane.showConfirmDialog(null, "There's nothing to be cleared", "",JOptionPane.DEFAULT_OPTION);
				}
				else {


					if(JOptionPane.showConfirmDialog(null, "All the data you entered will be erased. Are you sure you want to proceed?", "Are you Sure?",JOptionPane.YES_NO_OPTION)==0)
					{
						clear();
					}
					
				}
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelClear.setBackground(Color.decode("#EB7878"));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				panelClear.setBackground(Color.decode("#F3AEAE"));
			}
		});
		panelClear.setBackground(new Color(149, 209, 204));
		panelClear.setBounds(13, 369, 236, 53);
		panelClear.setBackground(Color.decode("#EB7878"));
		panel.add(panelClear);
		panelClear.setLayout(null);
		
		clearIcon = new JLabel();
		clearIcon.setHorizontalAlignment(SwingConstants.CENTER);
		clearIcon.setIcon(new ImageIcon(broom));
		clearIcon.setBounds(0, 2, 116, 53);
		panelClear.add(clearIcon);
		
		lblClear = new JLabel("CLEAR");
		lblClear.setBounds(112, 10, 92, 33);
		lblClear.setForeground(new Color(4, 28, 50));
		lblClear.setFont(new Font("Arial Black", Font.BOLD, 22));
		panelClear.add(lblClear);
		
		
		//to generate payment
		panelPayment = new JPanel();
		panelPayment.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//if it doesn't have selected schedule
				if (rdbtnsched1.isSelected()== false && rdbtnsched2.isSelected()== false) {
					JOptionPane.showConfirmDialog(null, "Select your schedule.", "",JOptionPane.DEFAULT_OPTION);
				}
				//if it doesn't have selected seats
				else if (lblBseat.getText().equals("") || lblMseat.getText().equals("") || lblOseat.getText().equals("")) {
					JOptionPane.showConfirmDialog(null, "Confirm your seat.", "",JOptionPane.DEFAULT_OPTION);
				}
				//if the fields are empty
				else if (fname.getText().equals("") ||
						lname.getText().equals("") ||
						discount.getText().equals("")||
						Email.getText().equals("") || 
						Age.getText().equals("") ||  
						contactNo.getText().equals("")) {
					JOptionPane.showConfirmDialog(null, "You must input value to all fields", "",JOptionPane.DEFAULT_OPTION);
				}
				// if it doesn't have selected sex
				else if (rdbtnFemale.isSelected() == false && rdbtnMale.isSelected() == false) {
					JOptionPane.showConfirmDialog(null, "Select your gender.", "",JOptionPane.DEFAULT_OPTION);
				}
				// if it doesn't have selected discount or other
				else if (rdbtnSenior.isSelected() == false && rdbtnStudent.isSelected() == false && rdbtnOther.isSelected() == false ) {
					JOptionPane.showConfirmDialog(null, "Select your discount.", "",JOptionPane.DEFAULT_OPTION);
				}
				
				else if (subTotal.getText().equals("") || 
						tax.getText().equals("") || 
						total.getText().equals("")) {
					JOptionPane.showConfirmDialog(null, "You must input value to all fields", "",JOptionPane.DEFAULT_OPTION);
				}
				else if (pay.getText().equals("")) {
					JOptionPane.showConfirmDialog(null, "Enter payment!", "",JOptionPane.DEFAULT_OPTION);
				}
				else {
			 		 ttal =Double.parseDouble(total.getText());
					 pyment = Double.parseDouble(pay.getText());
					 ttol = pyment - ttal;
					 
					 	//if payment is less than the total
				 		if(pyment < ttal)
				 		{
				 			 JOptionPane.showConfirmDialog(null, "You have insufficient balance!", "",JOptionPane.DEFAULT_OPTION);
					 	}
				 		else 
					 	{
						    change.setText(String.valueOf(String.format("%.2f", ttol)));
							
						  //add row to table
							String sched1 = lblSched1.getText();
							String sched2 = lblSched2.getText();
							rdbtnsched1.setActionCommand(sched1);
							rdbtnsched2.setActionCommand(sched2);
							rdbtnMale.setActionCommand("Male");
							rdbtnFemale.setActionCommand("Female");
							rdbtnStudent.setActionCommand("10 %");
							rdbtnSenior.setActionCommand("50 %");
							rdbtnOther.setActionCommand("0");
							
							row[0] = fname.getText();
							row[1] = lname.getText();
							row[2] = contactNo.getText();
							row[3] = Email.getText();
							row[4] = Age.getText();
							row[5] = sexGroup.getSelection().getActionCommand();
							row[6] = lblSelectedMovie.getText();
							row[7] = sched.getSelection().getActionCommand();
							row[8] = lblBseat.getText();
							row[9] = lblMseat.getText();
							row[10] = lblOseat.getText();
							row[11] = subTotal.getText();
							row[12] = discountGroup.getSelection().getActionCommand();
							row[13] = tax.getText();
							row[14] = total.getText();
							row[15] = pay.getText();
							row[16] = change.getText();
							
								if(JOptionPane.showConfirmDialog(null, "Payment successful. Do you want to generate a receipt?", "Confirmation?",JOptionPane.YES_NO_OPTION)==0)
								{
									selectedSeat();
									row[17] = rec2.toString();
									row[18] = oseat1.getText();
									row[19] = oseat2.getText();
									row[20] = oseat3.getText();
									row[21] = oseat4.getText();
									row[22] = oseat5.getText();
									row[23] = oseat6.getText();
									
									row[24] = mseat1.getText();
									row[25] = mseat2.getText();
									row[26] = mseat3.getText();
									row[27] = mseat4.getText();
									row[28] = mseat5.getText();
									row[29] = mseat6.getText();
									
									row[30] = bseat1.getText();
									row[31] = bseat2.getText();
									row[32] = bseat3.getText();
									row[33] = bseat4.getText();
									row[34] = bseat5.getText();
									row[35] = bseat6.getText();

									tModel.addRow(row); //adding row to column
										receipt r = new receipt();// class call to open the receipt
										r.setVisible(true);
										r.lbl_Name.setText(fname.getText() + " " + lname.getText());
										r.lbl_Address.setText("n/a");
										r.lbl_Title.setText(lblSelectedMovie.getText());
										r.lbl_Bseat.setText("BSEAT x " + lblBseat.getText());
										r.lbl_Mseat.setText("MSEAT x " + lblMseat.getText());
										r.lbl_Oseat.setText("OSEAT x " + lblOseat.getText());
										r.lbl_Price.setText(subTotal.getText());
										r.lbl_Discount.setText(discount.getText());
										r.lbl_Vat.setText(tax.getText());
										r.lbl_Total.setText("P " + total.getText());
										r.lbl_Cash.setText("P " + pay.getText());
										r.lbl_Change.setText("P " + change.getText());
										
										clear();
								}
								else
								{
									
									pendingSeats();
									row[17] = rec1.toString();	
									row[18] = oseat1.getText();
									row[19] = oseat2.getText();
									row[20] = oseat3.getText();
									row[21] = oseat4.getText();
									row[22] = oseat5.getText();
									row[23] = oseat6.getText();
									
									row[24] = mseat1.getText();
									row[25] = mseat2.getText();
									row[26] = mseat3.getText();
									row[27] = mseat4.getText();
									row[28] = mseat5.getText();
									row[29] = mseat6.getText();
									
									row[30] = bseat1.getText();
									row[31] = bseat2.getText();
									row[32] = bseat3.getText();
									row[33] = bseat4.getText();
									row[34] = bseat5.getText();
									row[35] = bseat6.getText();

									tModel.addRow(row); 
									
									clear();
								}
								
					 	}
			
				 }	  
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelPayment.setBackground(Color.decode("#FF9A3C"));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				panelPayment.setBackground(Color.decode("#FFB876"));
			}
		});
		panelPayment.setBounds(13, 432, 236, 53);
		panel.add(panelPayment);
		panelPayment.setBackground(Color.decode("#FF9A3C"));
		panelPayment.setLayout(null);
		
		paymentIcon = new JLabel();
		paymentIcon.setHorizontalAlignment(SwingConstants.CENTER);
		paymentIcon.setIcon(new ImageIcon(payment));
		paymentIcon.setBounds(10, 0, 103, 53);
		panelPayment.add(paymentIcon);
		
		lblPay = new JLabel("PAY");
		lblPay.setBounds(112, 10, 114, 33);
		lblPay.setForeground(new Color(4, 28, 50));
		lblPay.setFont(new Font("Arial Black", Font.BOLD, 22));
		panelPayment.add(lblPay);
		
		//to generate the receipt
		panelReceipt = new JPanel();
		panelReceipt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = table.getSelectedRow();	
				if (i>=0) 
				{
						if (rdbtnsched1.isSelected()== false && rdbtnsched2.isSelected()== false) {
							JOptionPane.showConfirmDialog(null, "Some informations are missing. Failed to generate receipt.", "",JOptionPane.DEFAULT_OPTION);
						}
						else if (lblBseat.getText().equals("") || lblMseat.getText().equals("") || lblOseat.getText().equals("")) {
							JOptionPane.showConfirmDialog(null, "Some informations are missing. Failed to generate receipt.", "",JOptionPane.DEFAULT_OPTION);
						}
						else if (fname.getText().equals("") ||
								lname.getText().equals("") ||
								Email.getText().equals("") || 
								Age.getText().equals("") ||
								contactNo.getText().equals("") ||
								subTotal.getText().equals("") || 
								discount.getText().equals("")||
								tax.getText().equals("") || 
								total.getText().equals("") || 
								pay.getText().equals("") || 
								lblBseat.getText().equals("") || 
								lblMseat.getText().equals("") || 
								lblOseat.getText().equals("")){
							JOptionPane.showConfirmDialog(null, "Some informations are missing. Failed to generate receipt.", "",JOptionPane.DEFAULT_OPTION);
						}
						else if (rdbtnFemale.isSelected() == false && rdbtnMale.isSelected() == false) {
							JOptionPane.showConfirmDialog(null, "Some informations are missing. Failed to generate receipt.", "",JOptionPane.DEFAULT_OPTION);
						}
						else if (rdbtnSenior.isSelected() == false && rdbtnStudent.isSelected() == false && rdbtnOther.isSelected()==false) {
							JOptionPane.showConfirmDialog(null, "Some informations are missing. Failed to generate receipt.", "",JOptionPane.DEFAULT_OPTION);
						}
						else if(pyment < ttal ){
						 			 JOptionPane.showConfirmDialog(null, "You have insufficient balance!", "",JOptionPane.DEFAULT_OPTION);
							 	
						}
						else {
							 if (JOptionPane.showConfirmDialog(null, "Are you sure you want to generate the receipt?", "Confirmation", JOptionPane.YES_NO_OPTION)== 0) 
							  {
										
											
											String sched1 = lblSched1.getText();
											String sched2 = lblSched2.getText();
											rdbtnsched1.setActionCommand(sched1);
											rdbtnsched2.setActionCommand(sched2);
											rdbtnMale.setActionCommand("Male");
											rdbtnFemale.setActionCommand("Female");
											rdbtnStudent.setActionCommand("10 %");
											rdbtnSenior.setActionCommand("50 %");
											rdbtnOther.setActionCommand("0");
											tModel.setValueAt(fname.getText(), i, 0);
											tModel.setValueAt(lname.getText(), i, 1);
											tModel.setValueAt(contactNo.getText(), i, 2);
											tModel.setValueAt(Email.getText(), i, 3);
											tModel.setValueAt(Age.getText(), i, 4);
											tModel.setValueAt(sexGroup.getSelection().getActionCommand(), i, 5);
											tModel.setValueAt(lblSelectedMovie.getText(), i, 6);
											tModel.setValueAt(sched.getSelection().getActionCommand(), i, 7);
											tModel.setValueAt(lblBseat.getText(), i, 8);
											tModel.setValueAt(lblMseat.getText(), i, 9);
											tModel.setValueAt(lblOseat.getText(), i, 10);
											tModel.setValueAt(subTotal.getText(), i, 11);
											tModel.setValueAt(discountGroup.getSelection().getActionCommand(), i, 12);
											tModel.setValueAt(tax.getText(), i, 13);
											tModel.setValueAt(total.getText(), i, 14);
											tModel.setValueAt(pay.getText(), i, 15);
											tModel.setValueAt(change.getText(), i, 16);
											tModel.setValueAt(rec2, i, 17);	
											
											receipt r = new receipt();
											r.setVisible(true);
											r.lbl_Name.setText(fname.getText() + " " + lname.getText());
											r.lbl_Address.setText("n/a");
											r.lbl_Title.setText(lblSelectedMovie.getText());
											r.lbl_Bseat.setText("BSEAT x " + lblBseat.getText());
											r.lbl_Mseat.setText("MSEAT x " + lblMseat.getText());
											r.lbl_Oseat.setText("OSEAT x " + lblOseat.getText());
											r.lbl_Price.setText(subTotal.getText());
											r.lbl_Discount.setText(discount.getText());
											r.lbl_Vat.setText(tax.getText());
											r.lbl_Total.setText("P " + total.getText());
											r.lbl_Cash.setText("P " + pay.getText());
											r.lbl_Change.setText("P " + change.getText());
											updateSeat();
											clear();
										}
										else {
											tModel.setValueAt(rec1, i, 17);	
											clear();
										}
							 }
									

					}
					else {
						JOptionPane.showMessageDialog(null, "Please select a row.");
					}
		
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelReceipt.setBackground(Color.decode("#A6ED8E"));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				panelReceipt.setBackground(Color.decode("#C0F2AF"));
			}
		});
		panelReceipt.setLayout(null);
		panelReceipt.setBackground(Color.decode("#A6ED8E"));
		panelReceipt.setBounds(13, 495, 236, 53);
		panel.add(panelReceipt);
		
		receiptIcon = new JLabel();
		receiptIcon.setHorizontalAlignment(SwingConstants.CENTER);
		receiptIcon.setIcon(new ImageIcon(receipt));
		receiptIcon.setBounds(0, 0, 114, 53);
		panelReceipt.add(receiptIcon);
		
		lblReceipt = new JLabel("RECEIPT");
		lblReceipt.setForeground(new Color(4, 28, 50));
		lblReceipt.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblReceipt.setBounds(112, 10, 114, 33);
		panelReceipt.add(lblReceipt);
		
		//schedule 
		lblSched1 = new JLabel("sched1");
		lblSched1.setForeground(Color.WHITE);
		lblSched1.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblSched1.setBounds(53, 54, 183, 28);
		panel.add(lblSched1);
		
		lblSched2 = new JLabel("sched2");
		lblSched2.setForeground(Color.WHITE);
		lblSched2.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblSched2.setBounds(53, 89, 183, 28);
		panel.add(lblSched2);
		
		lblgif = new JLabel();
		lblgif.setForeground(new Color(255, 215, 0));
		lblgif.setBackground((new Color(255, 185, 0)));
		lblgif.setOpaque(true);
		lblgif.setHorizontalAlignment(SwingConstants.CENTER);
		lblgif.setIcon(new ImageIcon(bk));
		lblgif.setBounds(10, 10, 808, 50);
		getContentPane().add(lblgif);
		
		panel_2 = new JPanel();
		panel_2.setBackground(Color.decode("#041C32"));
		panel_2.setBorder(new LineBorder(new Color(255, 204, 0), 5, true));
		panel_2.setBounds(286, 66, 532, 642);
		panel_2.setLayout(null);
		getContentPane().add(panel_2);
	
		
		panelInvoice = new JPanel();
		panelInvoice.setBorder(new LineBorder(new Color(255, 204, 0), 3));
		panelInvoice.setBounds(10, 263, 510, 131);
		panelInvoice.setBackground(Color.decode("#041C32"));
		panelInvoice.setLayout(null);
		panel_2.add(panelInvoice);
		
		lblSub = new JLabel("SubTotal:");
		lblSub.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSub.setForeground(Color.WHITE);
		lblSub.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblSub.setBounds(37, 24, 96, 22);
		panelInvoice.add(lblSub);
		
		subTotal = new JTextField();
		subTotal.setFont(new Font("Arial Black", Font.BOLD, 13));
		subTotal.setEditable(false);
		subTotal.setBounds(143, 27, 120, 19);
		panelInvoice.add(subTotal);
		subTotal.setColumns(10);
		
		lblVat = new JLabel("VAT(12%):");
		lblVat.setHorizontalAlignment(SwingConstants.RIGHT);
		lblVat.setForeground(Color.WHITE);
		lblVat.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblVat.setBounds(37, 89, 96, 22);
		panelInvoice.add(lblVat);
		
		tax = new JTextField();
		tax.setFont(new Font("Arial Black", Font.BOLD, 13));
		tax.setEditable(false);
		tax.setBounds(143, 92, 120, 19);
		panelInvoice.add(tax);
		tax.setColumns(10);
		
		lblTotal = new JLabel("Total:");
		lblTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotal.setForeground(Color.WHITE);
		lblTotal.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblTotal.setBounds(249, 27, 117, 22);
		panelInvoice.add(lblTotal);
		
		total = new JTextField();
		total.setFont(new Font("Arial Black", Font.BOLD, 13));
		total.setEditable(false);
		total.setBounds(376, 27, 120, 19);
		panelInvoice.add(total);
		total.setColumns(10);
		
		lblPayment = new JLabel("Payment:");
		lblPayment.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPayment.setForeground(Color.WHITE);
		lblPayment.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblPayment.setBounds(241, 59, 122, 17);
		panelInvoice.add(lblPayment);
		
		pay = new JTextField();
		pay.setFont(new Font("Arial Black", Font.BOLD, 13));
		pay.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
					JOptionPane.showMessageDialog(null, "Please input a valid amount.");
					e.consume();
				}
			}
		});
		pay.setBounds(376, 59, 120, 19);
		panelInvoice.add(pay);
		pay.setColumns(10);
		
		lblChange = new JLabel("Change:");
		lblChange.setHorizontalAlignment(SwingConstants.RIGHT);
		lblChange.setForeground(Color.WHITE);
		lblChange.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblChange.setBounds(241, 92, 125, 17);
		panelInvoice.add(lblChange);
		
		change = new JTextField();
		change.setFont(new Font("Arial Black", Font.BOLD, 13));
		change.setEditable(false);
		change.setBounds(376, 92, 120, 19);
		panelInvoice.add(change);
		change.setColumns(10);
		
		lblDiscount = new JLabel("Discount:");
		lblDiscount.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDiscount.setForeground(Color.WHITE);
		lblDiscount.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblDiscount.setBounds(47, 56, 85, 18);
		panelInvoice.add(lblDiscount);
		
		discount = new JTextField();
		discount.setFont(new Font("Arial Black", Font.BOLD, 13));
		discount.setEditable(false);
		discount.setBounds(143, 59, 120, 19);
		panelInvoice.add(discount);
		discount.setColumns(10);
		
		
		
		panelcusInfo = new JPanel();
		panelcusInfo.setBorder(new LineBorder(new Color(255, 204, 0), 3));
		panelcusInfo.setBounds(10, 88, 510, 166);
		panelcusInfo.setBackground(Color.decode("#041C32"));
		panel_2.add(panelcusInfo);
		panelcusInfo.setLayout(null);
		
		contactNo = new JTextField();
		contactNo.setFont(new Font("Arial Black", Font.BOLD, 13));
		contactNo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
					JOptionPane.showMessageDialog(null, "Input numbers only.");
					e.consume();
				}
			}
		});
		contactNo.setBounds(143, 83, 120, 19);
		panelcusInfo.add(contactNo);
		contactNo.setColumns(10);
		
		lblEmail = new JLabel("Email:");
		lblEmail.setBounds(275, 22, 74, 22);
		panelcusInfo.add(lblEmail);
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Arial Black", Font.BOLD, 12));
		
		lname = new JTextField();
		lname.setFont(new Font("Arial Black", Font.BOLD, 13));
		lname.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(Character.isAlphabetic(c) || (c == KeyEvent.VK_SPACE) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == KeyEvent.VK_PERIOD))) {
					JOptionPane.showMessageDialog(null, "Input letters only.");
					e.consume();
				}
			}
		});
		lname.setBounds(143, 53, 120, 19);
		panelcusInfo.add(lname);
		lname.setColumns(10);
		
		lbllname = new JLabel("Last Name:");
		lbllname.setHorizontalAlignment(SwingConstants.RIGHT);
		lbllname.setBounds(10, 41, 123, 34);
		panelcusInfo.add(lbllname);
		lbllname.setForeground(Color.WHITE);
		lbllname.setFont(new Font("Arial Black", Font.BOLD, 12));
		
		fname = new JTextField();
		fname.setFont(new Font("Arial Black", Font.BOLD, 13));
		fname.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(Character.isAlphabetic(c) || (c == KeyEvent.VK_SPACE) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == KeyEvent.VK_PERIOD))) {
					JOptionPane.showMessageDialog(null, "Input letters only.");
					e.consume();
				}
			}
		});
		fname.setBounds(143, 22, 120, 19);
		panelcusInfo.add(fname);
		fname.setColumns(10);
		
		lblfname = new JLabel("First Name:");
		lblfname.setHorizontalAlignment(SwingConstants.RIGHT);
		lblfname.setBounds(10, 10, 123, 34);
		panelcusInfo.add(lblfname);
		lblfname.setForeground(Color.WHITE);
		lblfname.setFont(new Font("Arial Black", Font.BOLD, 12));
		
		lblAge = new JLabel("Age:");
		lblAge.setBounds(264, 50, 85, 28);
		panelcusInfo.add(lblAge);
		lblAge.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAge.setForeground(Color.WHITE);
		lblAge.setFont(new Font("Arial Black", Font.BOLD, 12));
		
		Age = new JTextField();
		Age.setFont(new Font("Arial Black", Font.BOLD, 13));
		Age.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
					JOptionPane.showMessageDialog(null, "Input numbers only.");
					e.consume();
				}
			}
		});
		Age.setBounds(374, 55, 120, 19);
		panelcusInfo.add(Age);
		Age.setColumns(10);
		
		Email = new JTextField();
		Email.setFont(new Font("Arial Black", Font.BOLD, 13));
		Email.setBounds(374, 24, 120, 19);
		panelcusInfo.add(Email);
		Email.setColumns(10);
		
		lblcontactNo = new JLabel("Contact Number:");
		lblcontactNo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblcontactNo.setBounds(10, 78, 123, 28);
		panelcusInfo.add(lblcontactNo);
		lblcontactNo.setForeground(Color.WHITE);
		lblcontactNo.setFont(new Font("Arial Black", Font.BOLD, 12));
		
		lblSex = new JLabel("Sex:");
		lblSex.setForeground(Color.WHITE);
		lblSex.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblSex.setBounds(318, 92, 45, 13);
		panelcusInfo.add(lblSex);
		
		rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setForeground(Color.WHITE);
		rdbtnFemale.setBackground(Color.decode("#041C32"));
		rdbtnFemale.setFont(new Font("Arial Black", Font.BOLD, 12));
		rdbtnFemale.setBounds(370, 88, 103, 21);
		panelcusInfo.add(rdbtnFemale);
		
		rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setForeground(Color.WHITE);
		rdbtnMale.setBackground(Color.decode("#041C32"));
		rdbtnMale.setFont(new Font("Arial Black", Font.BOLD, 12));
		rdbtnMale.setBounds(370, 111, 103, 21);
		panelcusInfo.add(rdbtnMale);
		
		sexGroup = new ButtonGroup();
		sexGroup.add(rdbtnFemale);
		sexGroup.add(rdbtnMale);
		
		rdbtnStudent = new JRadioButton("Student");
		rdbtnStudent.setEnabled(false);
		rdbtnStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (lblBseat.getText().equals("") && lblMseat.getText().equals("") && lblOseat.getText().equals("")) {
					JOptionPane.showConfirmDialog(null, "Please select your seat.", "",JOptionPane.DEFAULT_OPTION);
					discountGroup.clearSelection();
				}
				else {
					if (rdbtnStudent.isSelected() == true) {
						Double subT = Double.parseDouble(subTotal.getText());

						dis = 0.1;
						discount.setText("10 %");
						Double discountedPrice = subT - (subT * dis);
						Double vat = subT * 0.12;
						Double t = discountedPrice + vat;
						tax.setText(String.valueOf(String.format("%.2f", vat)));
						total.setText(String.valueOf(String.format("%.2f", t)));
						pay.setText("");
						change.setText("");
								
					}
				}

			}
		});
		rdbtnStudent.setFont(new Font("Arial Black", Font.BOLD, 12));
		rdbtnStudent.setForeground(Color.WHITE);
		rdbtnStudent.setBackground(Color.decode("#041C32"));
		rdbtnStudent.setBounds(48, 129, 93, 21);
		panelcusInfo.add(rdbtnStudent);
		
		rdbtnSenior = new JRadioButton("Senior");
		rdbtnSenior.setEnabled(false);
		rdbtnSenior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			if (lblBseat.getText().equals("") && lblMseat.getText().equals("") && lblOseat.getText().equals("")) {
				JOptionPane.showConfirmDialog(null, "Please select your seat.", "",JOptionPane.DEFAULT_OPTION);
				discountGroup.clearSelection();
			}
			else {
				if (rdbtnSenior.isSelected() == true) {
					Double subT = Double.parseDouble(subTotal.getText());
					dis = 0.5;
					discount.setText("50 %");
					Double discountedPrice = subT - (subT * dis);
					Double vat = subT * 0.12;
					Double t = discountedPrice + vat;
					tax.setText(String.valueOf(String.format("%.2f", vat)));
					total.setText(String.valueOf(String.format("%.2f", t)));
					pay.setText("");
					change.setText("");
				}
			}
			
			}
		});
		rdbtnSenior.setFont(new Font("Arial Black", Font.BOLD, 12));
		rdbtnSenior.setForeground(Color.WHITE);
		rdbtnSenior.setBackground(Color.decode("#041C32"));
		rdbtnSenior.setBounds(143, 129, 85, 21);
		panelcusInfo.add(rdbtnSenior);
		
		
		rdbtnOther = new JRadioButton("Other");
		rdbtnOther.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (lblBseat.getText().equals("") && lblMseat.getText().equals("") && lblOseat.getText().equals("")) {
					JOptionPane.showConfirmDialog(null, "Please select your seat.", "",JOptionPane.DEFAULT_OPTION);
					discountGroup.clearSelection();
				}
				else {
					if (rdbtnOther.isSelected() == true) {
						
						discount.setText("0");
						Double subT = Double.parseDouble(subTotal.getText());
						Double vat = subT * 0.12;
						Double t = subT +vat;
						tax.setText(String.valueOf(String.format("%.2f", vat)));
						total.setText(String.valueOf(String.format("%.2f", t)));
						pay.setText("");
						change.setText("");
					}
				}
			}
		});
		rdbtnOther.setEnabled(false);
		rdbtnOther.setFont(new Font("Arial Black", Font.BOLD, 12));
		rdbtnOther.setForeground(Color.WHITE);
		rdbtnOther.setBackground(Color.decode("#041C32"));
		rdbtnOther.setBounds(230, 129, 94, 21);
		panelcusInfo.add(rdbtnOther);
		
		discountGroup = new ButtonGroup();
		discountGroup.add(rdbtnStudent);
		discountGroup.add(rdbtnSenior);
		discountGroup.add(rdbtnOther);
		
		
		panelUpdate = new JPanel();
		panelUpdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			int i = table.getSelectedRow();	
			if (i>=0) 
			{
					if (rdbtnsched1.isSelected()== false && rdbtnsched2.isSelected()== false) {
						JOptionPane.showConfirmDialog(null, "Select your schedule.", "",JOptionPane.DEFAULT_OPTION);
					}
					else if (lblBseat.getText().equals("") || lblMseat.getText().equals("") || lblOseat.getText().equals("")) {
						JOptionPane.showConfirmDialog(null, "Confirm your seat.", "",JOptionPane.DEFAULT_OPTION);
					}
					else if (fname.getText().equals("") ||
							lname.getText().equals("") ||
							Email.getText().equals("") || 
							Age.getText().equals("") ||  
							contactNo.getText().equals("")) {
						JOptionPane.showConfirmDialog(null, "You must input value to all fields", "",JOptionPane.DEFAULT_OPTION);
					}
					else if (rdbtnFemale.isSelected() == false && rdbtnMale.isSelected() == false) {
						JOptionPane.showConfirmDialog(null, "Select your gender.", "",JOptionPane.DEFAULT_OPTION);
					}
					else if (rdbtnSenior.isSelected() == false && rdbtnStudent.isSelected() == false  && rdbtnOther.isSelected() == false) {
						JOptionPane.showConfirmDialog(null, "Select your discount.", "",JOptionPane.DEFAULT_OPTION);
					}
					else if (subTotal.getText().equals("") || 
							tax.getText().equals("") || 
							total.getText().equals("")) {
						JOptionPane.showConfirmDialog(null, "You must input value to all fields", "",JOptionPane.DEFAULT_OPTION);
					}
					else if (pay.getText().equals("")) {
						JOptionPane.showConfirmDialog(null, "Enter payment!", "",JOptionPane.DEFAULT_OPTION);
					}
					else {
						 if (JOptionPane.showConfirmDialog(null, "Are you sure you want to update this data?", "Confirmation", JOptionPane.YES_NO_OPTION)== 0) 
						  {
							
							 Double subT = Double.parseDouble(subTotal.getText());
							 Double discountedPrice = subT - (subT * dis);
							 Double vat = subT * 0.12;
							 Double t = discountedPrice + vat;
							 total.setText(String.valueOf(String.format("%.2f", t)));
							 tax.setText(String.valueOf(String.format("%.2f", vat)));
							 ttal =Double.parseDouble(total.getText());
							 pyment = Double.parseDouble(pay.getText());
							 

							 ttol = pyment - ttal;
							 
								if(pyment < ttal)
						 		{
						 			 JOptionPane.showConfirmDialog(null, "You have insufficient balance!", "",JOptionPane.DEFAULT_OPTION);
							 	}
						 		else 
							 	{
								    change.setText(String.valueOf(String.format("%.2f", ttol)));	 
										//update row to table
										String sched1 = lblSched1.getText();
										String sched2 = lblSched2.getText();
										rdbtnsched1.setActionCommand(sched1);
										rdbtnsched2.setActionCommand(sched2);
										rdbtnMale.setActionCommand("Male");
										rdbtnFemale.setActionCommand("Female");
										rdbtnStudent.setActionCommand("10 %");
										rdbtnSenior.setActionCommand("50 %");
										rdbtnOther.setActionCommand("0");
										tModel.setValueAt(fname.getText(), i, 0);
										tModel.setValueAt(lname.getText(), i, 1);
										tModel.setValueAt(contactNo.getText(), i, 2);
										tModel.setValueAt(Email.getText(), i, 3);
										tModel.setValueAt(Age.getText(), i, 4);
										tModel.setValueAt(sexGroup.getSelection().getActionCommand(), i, 5);
										tModel.setValueAt(lblSelectedMovie.getText(), i, 6);
										tModel.setValueAt(sched.getSelection().getActionCommand(), i, 7);
										tModel.setValueAt(lblBseat.getText(), i, 8);
										tModel.setValueAt(lblMseat.getText(), i, 9);
										tModel.setValueAt(lblOseat.getText(), i, 10);
										tModel.setValueAt(subTotal.getText(), i, 11);
										tModel.setValueAt(discountGroup.getSelection().getActionCommand(), i, 12);
										tModel.setValueAt(tax.getText(), i, 13);
										tModel.setValueAt(total.getText(), i, 14);
										tModel.setValueAt(pay.getText(), i, 15);
										tModel.setValueAt(change.getText(), i, 16);
												
											if(JOptionPane.showConfirmDialog(null, "Payment successful. Do you want to generate a receipt?", "Confirmation?",JOptionPane.YES_NO_OPTION)==0)
											{
												
												tModel.setValueAt(rec2, i, 17);	
												updateSeat();
												
												tModel.setValueAt(oseat1.getText(), i, 18);
												tModel.setValueAt(oseat2.getText(), i, 19);
												tModel.setValueAt(oseat3.getText(), i, 20);
												tModel.setValueAt(oseat4.getText(), i, 21);
												tModel.setValueAt(oseat5.getText(), i, 22);
												tModel.setValueAt(oseat6.getText(), i, 23);
												
												tModel.setValueAt(mseat1.getText(), i, 24);
												tModel.setValueAt(mseat2.getText(), i, 25);
												tModel.setValueAt(mseat3.getText(), i, 26);
												tModel.setValueAt(mseat4.getText(), i, 27);
												tModel.setValueAt(mseat5.getText(), i, 28);
												tModel.setValueAt(mseat6.getText(), i, 29);
												
												tModel.setValueAt(bseat1.getText(), i, 30);
												tModel.setValueAt(bseat2.getText(), i, 31);
												tModel.setValueAt(bseat3.getText(), i, 32);
												tModel.setValueAt(bseat4.getText(), i, 33);
												tModel.setValueAt(bseat5.getText(), i, 34);
												tModel.setValueAt(bseat6.getText(), i, 35);
												
												receipt r = new receipt();
												r.setVisible(true);
												r.lbl_Name.setText(fname.getText() + " " + lname.getText());
												r.lbl_Address.setText("n/a");
												r.lbl_Title.setText(lblSelectedMovie.getText());
												r.lbl_Bseat.setText("BSEAT x " + lblBseat.getText());
												r.lbl_Mseat.setText("MSEAT x " + lblMseat.getText());
												r.lbl_Oseat.setText("OSEAT x " + lblOseat.getText());
												r.lbl_Price.setText(subTotal.getText());
												r.lbl_Discount.setText(discount.getText());
												r.lbl_Vat.setText(tax.getText());
												r.lbl_Total.setText("P " + total.getText());
												r.lbl_Cash.setText("P " + pay.getText());
												r.lbl_Change.setText("P " + change.getText());
												
												clear();
											}
											else {
												tModel.setValueAt(rec1, i, 17);	
												
												pendingSeats();
												tModel.setValueAt(oseat1.getText(), i, 18);
												tModel.setValueAt(oseat2.getText(), i, 19);
												tModel.setValueAt(oseat3.getText(), i, 20);
												tModel.setValueAt(oseat4.getText(), i, 21);
												tModel.setValueAt(oseat5.getText(), i, 22);
												tModel.setValueAt(oseat6.getText(), i, 23);
												
												tModel.setValueAt(mseat1.getText(), i, 24);
												tModel.setValueAt(mseat2.getText(), i, 25);
												tModel.setValueAt(mseat3.getText(), i, 26);
												tModel.setValueAt(mseat4.getText(), i, 27);
												tModel.setValueAt(mseat5.getText(), i, 28);
												tModel.setValueAt(mseat6.getText(), i, 29);
												
												tModel.setValueAt(bseat1.getText(), i, 30);
												tModel.setValueAt(bseat2.getText(), i, 31);
												tModel.setValueAt(bseat3.getText(), i, 32);
												tModel.setValueAt(bseat4.getText(), i, 33);
												tModel.setValueAt(bseat5.getText(), i, 34);
												tModel.setValueAt(bseat6.getText(), i, 35);
												clear();
											}
								 }
						  }

						}

				}
				else {
					JOptionPane.showMessageDialog(null, "Please select a row.");
				}
		
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				panelUpdate.setBackground(Color.decode("#72e01e"));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelUpdate.setBackground(Color.decode("#5BB318"));
			}
		});
		panelUpdate.setBounds(44, 573, 214, 47);
		panelUpdate.setBackground(Color.decode("#5BB318"));
		panel_2.add(panelUpdate);
		panelUpdate.setLayout(null);
		
		updateIcon = new JLabel();
		updateIcon.setIcon(new ImageIcon(update));
		updateIcon.setBounds(31, 0, 46, 47);
		panelUpdate.add(updateIcon);
		
		lblNewLabel_12 = new JLabel("UPDATE");
		lblNewLabel_12.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_12.setForeground(Color.decode("#041C32"));
		lblNewLabel_12.setBounds(87, 10, 101, 27);
		panelUpdate.add(lblNewLabel_12);
		
		panelDelete = new JPanel();
		panelDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(oseat1.getText().equals("PENDING")|| oseat1.getText().equals("RESERVED")||
					oseat2.getText().equals("PENDING")|| oseat2.getText().equals("RESERVED")||
					oseat3.getText().equals("PENDING")|| oseat3.getText().equals("RESERVED")||
					oseat4.getText().equals("PENDING")|| oseat4.getText().equals("RESERVED")||
					oseat5.getText().equals("PENDING")|| oseat5.getText().equals("RESERVED")||
					oseat6.getText().equals("PENDING")|| oseat6.getText().equals("RESERVED")||
					mseat1.getText().equals("PENDING")|| mseat1.getText().equals("RESERVED")||
					mseat2.getText().equals("PENDING")|| mseat2.getText().equals("RESERVED")||
					mseat3.getText().equals("PENDING")|| mseat3.getText().equals("RESERVED")||
					mseat4.getText().equals("PENDING")|| mseat4.getText().equals("RESERVED")||
					mseat5.getText().equals("PENDING")|| mseat5.getText().equals("RESERVED")||
					mseat6.getText().equals("PENDING")|| mseat6.getText().equals("RESERVED")||
					bseat1.getText().equals("PENDING")|| bseat1.getText().equals("RESERVED")||
					bseat2.getText().equals("PENDING")|| bseat2.getText().equals("RESERVED")||
					bseat3.getText().equals("PENDING")|| bseat3.getText().equals("RESERVED")||
					bseat4.getText().equals("PENDING")|| bseat4.getText().equals("RESERVED")||
					bseat5.getText().equals("PENDING")|| bseat5.getText().equals("RESERVED")||
					bseat6.getText().equals("PENDING")|| bseat6.getText().equals("RESERVED"))
				{
					
					int i = table.getSelectedRow();
					if (i>=0) {
						if (JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this data?", "Confirmation", JOptionPane.YES_NO_OPTION)== 0) 
						{
							tModel.removeRow(i);
							if(bseat1.getText().equals("PAID")|| bseat1.getText().equals("PENDING"))
							{
								bseat1.setText("AVAILABLE");
								bseat1.setForeground(Color.WHITE);
								bseat1.setEnabled(true);
							}
							if(bseat2.getText().equals("PAID")|| bseat2.getText().equals("PENDING"))
							{
								bseat2.setText("AVAILABLE");
								bseat2.setForeground(Color.WHITE);
								bseat2.setEnabled(true);
							}
							if(bseat3.getText().equals("PAID")|| bseat3.getText().equals("PENDING"))
							{
								bseat3.setText("AVAILABLE");
								bseat3.setForeground(Color.WHITE);
								bseat3.setEnabled(true);
							}
							if(bseat4.getText().equals("PAID")|| bseat4.getText().equals("PENDING"))
							{
								bseat4.setText("AVAILABLE");
								bseat4.setForeground(Color.WHITE);
								bseat4.setEnabled(true);
							}
							if(bseat5.getText().equals("PAID")|| bseat5.getText().equals("PENDING"))
							{
								bseat5.setText("AVAILABLE");
								bseat5.setForeground(Color.WHITE);
								bseat5.setEnabled(true);
							}
							if(bseat6.getText().equals("PAID")|| bseat6.getText().equals("PENDING"))
							{
								bseat6.setText("AVAILABLE");
								bseat6.setForeground(Color.WHITE);
								bseat6.setEnabled(true);
							}
							if(mseat1.getText().equals("PAID")|| mseat1.getText().equals("PENDING"))
							{
								mseat1.setText("AVAILABLE");
								mseat1.setForeground(Color.WHITE);
								mseat1.setEnabled(true);
							}
							if(mseat2.getText().equals("PAID")|| mseat2.getText().equals("PENDING"))
							{
								mseat2.setText("AVAILABLE");
								mseat2.setForeground(Color.WHITE);
								mseat2.setEnabled(true);
							}
							if(mseat3.getText().equals("PAID")|| mseat3.getText().equals("PENDING"))
							{
								mseat3.setText("AVAILABLE");
								mseat3.setForeground(Color.WHITE);
								mseat3.setEnabled(true);
							}
							if(mseat4.getText().equals("PAID")|| mseat4.getText().equals("PENDING"))
							{
								mseat4.setText("AVAILABLE");
								mseat4.setForeground(Color.WHITE);
								mseat4.setEnabled(true);
							}
							if(mseat5.getText().equals("PAID")|| mseat5.getText().equals("PENDING"))
							{
								mseat5.setText("AVAILABLE");
								mseat5.setForeground(Color.WHITE);
								mseat5.setEnabled(true);
							}
							if(mseat6.getText().equals("PAID")|| mseat6.getText().equals("PENDING"))
							{
								mseat6.setText("AVAILABLE");
								mseat6.setForeground(Color.WHITE);
								mseat6.setEnabled(true);
							}
							if(oseat1.getText().equals("PAID")|| oseat1.getText().equals("PENDING"))
							{
								oseat1.setText("AVAILABLE");
								oseat1.setForeground(Color.WHITE);
								oseat1.setEnabled(true);
							}
							if(oseat2.getText().equals("PAID")|| oseat2.getText().equals("PENDING"))
							{
								oseat2.setText("AVAILABLE");
								oseat2.setForeground(Color.WHITE);
								oseat2.setEnabled(true);
							}
							if(oseat3.getText().equals("PAID")|| oseat3.getText().equals("PENDING"))
							{
								oseat3.setText("AVAILABLE");
								oseat3.setForeground(Color.WHITE);
								oseat3.setEnabled(true);
							}
							if(oseat4.getText().equals("PAID")|| oseat4.getText().equals("PENDING"))
							{
								oseat4.setText("AVAILABLE");
								oseat4.setForeground(Color.WHITE);
								oseat4.setEnabled(true);
							}
							if(oseat5.getText().equals("PAID")|| oseat5.getText().equals("PENDING"))
							{
								oseat5.setText("AVAILABLE");
								oseat5.setForeground(Color.WHITE);
								oseat5.setEnabled(true);
							}
							if(oseat6.getText().equals("PAID")|| oseat6.getText().equals("PENDING"))
							{
								oseat6.setText("AVAILABLE");
								oseat6.setForeground(Color.WHITE);
								oseat6.setEnabled(true);
							}
							JOptionPane.showMessageDialog(null, "Data Deleted.");
							clear();
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "Please select a row.");
					}
					
					
					
				}
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				panelDelete.setBackground(Color.decode("#72e01e"));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelDelete.setBackground(Color.decode("#5BB318"));
			}
		});
		panelDelete.setLayout(null);
		panelDelete.setBackground(Color.decode("#5BB318"));
		panelDelete.setBounds(286, 573, 214, 47);
		panel_2.add(panelDelete);
		
		deleteIcon = new JLabel();
		deleteIcon.setIcon(new ImageIcon(delete));
		deleteIcon.setBounds(31, 0, 56, 47);
		panelDelete.add(deleteIcon);
		
		lblDelete = new JLabel("DELETE");
		lblDelete.setForeground(new Color(4, 28, 50));
		lblDelete.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblDelete.setBounds(87, 10, 92, 27);
		panelDelete.add(lblDelete);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 405, 510, 157);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {				
				int i = table.getSelectedRow();

				String r = tModel.getValueAt(i, 17).toString();
				if (r == "yes") {
					JOptionPane.showMessageDialog(null, "You already have the receipt. You're not allowed to edit your personal information.");
					clear();
				}
				else {
					//schedule will be disabled
					rdbtnsched1.setEnabled(false);
					rdbtnsched2.setEnabled(false);
				
					//the data will go back to their fields
					fname.setText(tModel.getValueAt(i, 0).toString());
					lname.setText(tModel.getValueAt(i, 1).toString());
					contactNo.setText(tModel.getValueAt(i, 2).toString());
					Email.setText(tModel.getValueAt(i, 3).toString());
					Age.setText(tModel.getValueAt(i, 4).toString());
					
					String gender = tModel.getValueAt(i, 5).toString();	
					if (gender.equals("Male")) {
						rdbtnMale.setSelected(true);
					}
					else{
						rdbtnFemale.setSelected(true);
					}
					
					lblSelectedMovie.setText(tModel.getValueAt(i, 6).toString());
					String sched = tModel.getValueAt(i, 7).toString();
					if (sched.equals("July 1  8:00AM - 10:00AM") || 
							sched.equals("July 1  10:00AM - 12:00AM") ||
							sched.equals("July 1  1:00PM - 3:00PM") ||
							sched.equals("July 1  6:00AM - 8:00AM") ||
							sched.equals("July 1  3:00PM - 5:00PM") ||
							sched.equals("July 1  5:00PM - 7:00PM")) {
						rdbtnsched1.setSelected(true);
					}
					else{
						rdbtnsched2.setSelected(true);
					}
					lblBseat.setText(tModel.getValueAt(i, 8).toString());
					lblMseat.setText(tModel.getValueAt(i, 9).toString());
					lblOseat.setText(tModel.getValueAt(i, 10).toString());
					subTotal.setText(tModel.getValueAt(i, 11).toString());
					String dis = tModel.getValueAt(i, 12).toString();
					if (dis.equals("10 %")) 
					{
						rdbtnStudent.setSelected(true);
						discount.setText("10 %");
					}
					else if(dis.equals("50 %")){
						rdbtnSenior.setSelected(true);
						discount.setText("50 %");
					}
					else {
						rdbtnOther.setSelected(true);
						discount.setText("0");
					}
					tax.setText(tModel.getValueAt(i, 13).toString());
					total.setText(tModel.getValueAt(i, 14).toString());
					pay.setText(tModel.getValueAt(i, 15).toString());
					change.setText(tModel.getValueAt(i, 16).toString());
					
					oseat1.setText(tModel.getValueAt(i, 18).toString());
					oseat2.setText(tModel.getValueAt(i, 19).toString());
					oseat3.setText(tModel.getValueAt(i, 20).toString());
					oseat4.setText(tModel.getValueAt(i, 21).toString());
					oseat5.setText(tModel.getValueAt(i, 22).toString());
					oseat6.setText(tModel.getValueAt(i, 23).toString());
					
					mseat1.setText(tModel.getValueAt(i, 24).toString());
					mseat2.setText(tModel.getValueAt(i, 25).toString());
					mseat3.setText(tModel.getValueAt(i, 26).toString());
					mseat4.setText(tModel.getValueAt(i, 27).toString());
					mseat5.setText(tModel.getValueAt(i, 28).toString());
					mseat6.setText(tModel.getValueAt(i, 29).toString());
					
					bseat1.setText(tModel.getValueAt(i, 30).toString());
					bseat2.setText(tModel.getValueAt(i, 31).toString());
					bseat3.setText(tModel.getValueAt(i, 32).toString());
					bseat4.setText(tModel.getValueAt(i, 33).toString());
					bseat5.setText(tModel.getValueAt(i, 34).toString());
					bseat6.setText(tModel.getValueAt(i, 35).toString());
				}
			}
		});
		tModel= new DefaultTableModel();
		tModel.setColumnIdentifiers(column);
		table.setModel(tModel);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		scrollPane.setViewportView(table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 510, 67);
		panel_2.add(panel_1);
		panel_1.setBorder(new LineBorder(new Color(255, 204, 0), 4));
		panel_1.setBackground(Color.decode("#041C32"));
		panel_1.setLayout(null);
		
		lblNewLabel = new JLabel("Orchestra");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 15, 80, 30);
		panel_1.add(lblNewLabel);
		
		lblMezzanine = new JLabel("Mezzanine");
		lblMezzanine.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMezzanine.setForeground(Color.WHITE);
		lblMezzanine.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblMezzanine.setBounds(150, 15, 80, 30);
		panel_1.add(lblMezzanine);
		
		lblBalcony = new JLabel("Balcony");
		lblBalcony.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBalcony.setForeground(Color.WHITE);
		lblBalcony.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblBalcony.setBounds(290, 15, 80, 30);
		panel_1.add(lblBalcony);
		
		lblOseat = new JLabel("");
		lblOseat.setHorizontalAlignment(SwingConstants.CENTER);
		lblOseat.setForeground(Color.WHITE);
		lblOseat.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblOseat.setBounds(100, 15, 40, 30);
		panel_1.add(lblOseat);
		
		lblMseat = new JLabel("");
		lblMseat.setHorizontalAlignment(SwingConstants.CENTER);
		lblMseat.setForeground(Color.WHITE);
		lblMseat.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblMseat.setBounds(240, 15, 40, 30);
		panel_1.add(lblMseat);
		
		lblBseat = new JLabel("");
		lblBseat.setHorizontalAlignment(SwingConstants.CENTER);
		lblBseat.setForeground(Color.WHITE);
		lblBseat.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblBseat.setBounds(380, 15, 40, 30);
		panel_1.add(lblBseat);
		
		panel_3 = new JPanel();
		panel_3.setBounds(828, 10, 402, 696);
		panel_3.setBorder(new LineBorder(new Color(255, 204, 0), 4));
		panel_3.setBackground(Color.decode("#041C32"));
		getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(343, 120, 49, 500);
		lblNewLabel_1.setIcon(new ImageIcon(mainscreen));
		panel_3.add(lblNewLabel_1);
		
		oseat1 = new JLabel("AVAILABLE");
		oseat1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				oseat1.setText("RESERVED");
				oseat1.setForeground(Color.ORANGE);
			}
		});
		oseat1.setHorizontalTextPosition(SwingConstants.CENTER);
		oseat1.setFont(new Font("Arial Black", Font.BOLD, 8));
		oseat1.setForeground(Color.WHITE);
		oseat1.setHorizontalAlignment(SwingConstants.CENTER);
		oseat1.setBounds(249, 96, 60, 60);
		oseat1.setIcon(new ImageIcon(seat));
		panel_3.add(oseat1);
		
		mseat1 = new JLabel("AVAILABLE");
		mseat1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
						mseat1.setText("RESERVED");
						mseat1.setForeground(Color.ORANGE);
		
			}
		});
		mseat1.setForeground(Color.WHITE);
		mseat1.setHorizontalTextPosition(SwingConstants.CENTER);
		mseat1.setFont(new Font("Arial Black", Font.BOLD, 8));
		mseat1.setHorizontalAlignment(SwingConstants.CENTER);
		mseat1.setBounds(143, 96, 60, 60);
		mseat1.setIcon(new ImageIcon(seat));
		panel_3.add(mseat1);
		
		bseat1 = new JLabel("AVAILABLE");
		bseat1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
						bseat1.setText("RESERVED");
						bseat1.setForeground(Color.ORANGE);
			}
		});
		bseat1.setForeground(Color.WHITE);
		bseat1.setFont(new Font("Arial Black", Font.BOLD, 8));
		bseat1.setHorizontalTextPosition(SwingConstants.CENTER);
		bseat1.setHorizontalAlignment(SwingConstants.CENTER);
		bseat1.setBounds(25, 100, 60, 60);
		bseat1.setIcon(new ImageIcon(seat));
		panel_3.add(bseat1);
		
		bseat2 = new JLabel("AVAILABLE");
		bseat2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
						bseat2.setText("RESERVED");
						bseat2.setForeground(Color.ORANGE);
			}
		});
		bseat2.setForeground(Color.WHITE);
		bseat2.setFont(new Font("Arial Black", Font.BOLD, 8));
		bseat2.setHorizontalTextPosition(SwingConstants.CENTER);
		bseat2.setHorizontalAlignment(SwingConstants.CENTER);
		bseat2.setBounds(25, 167, 60, 60);
		bseat2.setIcon(new ImageIcon(seat));
		panel_3.add(bseat2);
		
		mseat2 = new JLabel("AVAILABLE");
		mseat2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
						mseat2.setText("RESERVED");
						mseat2.setForeground(Color.ORANGE);
			}
		});
		mseat2.setForeground(Color.WHITE);
		mseat2.setHorizontalTextPosition(SwingConstants.CENTER);
		mseat2.setFont(new Font("Arial Black", Font.BOLD, 8));
		mseat2.setHorizontalAlignment(SwingConstants.CENTER);
		mseat2.setBounds(143, 167, 60, 60);
		mseat2.setIcon(new ImageIcon(seat));
		panel_3.add(mseat2);
		
		oseat2 = new JLabel("AVAILABLE");
		oseat2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
						oseat2.setText("RESERVED");
						oseat2.setForeground(Color.ORANGE);
			}
		});
		oseat2.setHorizontalTextPosition(SwingConstants.CENTER);
		oseat2.setFont(new Font("Arial Black", Font.BOLD, 8));
		oseat2.setForeground(Color.WHITE);
		oseat2.setHorizontalAlignment(SwingConstants.CENTER);
		oseat2.setBounds(249, 166, 60, 60);
		oseat2.setIcon(new ImageIcon(seat));
		panel_3.add(oseat2);
		
		bseat3 = new JLabel("AVAILABLE");
		bseat3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
						bseat3.setText("RESERVED");
						bseat3.setForeground(Color.ORANGE);

			}
		});
		bseat3.setForeground(Color.WHITE);
		bseat3.setFont(new Font("Arial Black", Font.BOLD, 8));
		bseat3.setHorizontalTextPosition(SwingConstants.CENTER);
		bseat3.setHorizontalAlignment(SwingConstants.CENTER);
		bseat3.setBounds(25, 238, 60, 60);
		bseat3.setIcon(new ImageIcon(seat));
		panel_3.add(bseat3);
		
		mseat3 = new JLabel("AVAILABLE");
		mseat3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
						mseat3.setText("RESERVED");
						mseat3.setForeground(Color.ORANGE);
			}
		});
		mseat3.setForeground(Color.WHITE);
		mseat3.setHorizontalTextPosition(SwingConstants.CENTER);
		mseat3.setFont(new Font("Arial Black", Font.BOLD, 8));
		mseat3.setHorizontalAlignment(SwingConstants.CENTER);
		mseat3.setBounds(143, 238, 60, 60);
		mseat3.setIcon(new ImageIcon(seat));
		panel_3.add(mseat3);
		
		oseat3 = new JLabel("AVAILABLE");
		oseat3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
						oseat3.setText("RESERVED");
						oseat3.setForeground(Color.ORANGE);
			}
		});
		oseat3.setHorizontalTextPosition(SwingConstants.CENTER);
		oseat3.setFont(new Font("Arial Black", Font.BOLD, 8));
		oseat3.setForeground(Color.WHITE);
		oseat3.setHorizontalAlignment(SwingConstants.CENTER);
		oseat3.setBounds(249, 237, 60, 60);
		oseat3.setIcon(new ImageIcon(seat));
		panel_3.add(oseat3);
		
		bseat4 = new JLabel("AVAILABLE");
		bseat4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
						bseat4.setText("RESERVED");
						bseat4.setForeground(Color.ORANGE);
			}
		});
		bseat4.setForeground(Color.WHITE);
		bseat4.setFont(new Font("Arial Black", Font.BOLD, 8));
		bseat4.setHorizontalTextPosition(SwingConstants.CENTER);
		bseat4.setHorizontalAlignment(SwingConstants.CENTER);
		bseat4.setBounds(25, 384, 60, 60);
		bseat4.setIcon(new ImageIcon(seat));
		panel_3.add(bseat4);
		
		mseat4 = new JLabel("AVAILABLE");
		mseat4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
						mseat4.setText("RESERVED");
						mseat4.setForeground(Color.ORANGE);
			}
		});
		mseat4.setForeground(Color.WHITE);
		mseat4.setHorizontalTextPosition(SwingConstants.CENTER);
		mseat4.setFont(new Font("Arial Black", Font.BOLD, 8));
		mseat4.setHorizontalAlignment(SwingConstants.CENTER);
		mseat4.setBounds(143, 384, 60, 60);
		mseat4.setIcon(new ImageIcon(seat));
		panel_3.add(mseat4);
		
		oseat4 = new JLabel("AVAILABLE");
		oseat4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
						oseat4.setText("RESERVED");
						oseat4.setForeground(Color.ORANGE);

			}
		});
		oseat4.setHorizontalTextPosition(SwingConstants.CENTER);
		oseat4.setFont(new Font("Arial Black", Font.BOLD, 8));
		oseat4.setForeground(Color.WHITE);
		oseat4.setHorizontalAlignment(SwingConstants.CENTER);
		oseat4.setBounds(249, 384, 60, 60);
		oseat4.setIcon(new ImageIcon(seat));
		panel_3.add(oseat4);
		
		bseat5 = new JLabel("AVAILABLE");
		bseat5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
						bseat5.setText("RESERVED");
						bseat5.setForeground(Color.ORANGE);
				
			}
		});
		bseat5.setHorizontalTextPosition(SwingConstants.CENTER);
		bseat5.setForeground(Color.WHITE);
		bseat5.setFont(new Font("Arial Black", Font.BOLD, 8));
		bseat5.setHorizontalAlignment(SwingConstants.CENTER);
		bseat5.setBounds(25, 455, 60, 60);
		bseat5.setIcon(new ImageIcon(seat));
		panel_3.add(bseat5);
		
		mseat5 = new JLabel("AVAILABLE");
		mseat5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
						mseat5.setText("RESERVED");
						mseat5.setForeground(Color.ORANGE);
			}
		});
		mseat5.setForeground(Color.WHITE);
		mseat5.setHorizontalTextPosition(SwingConstants.CENTER);
		mseat5.setFont(new Font("Arial Black", Font.BOLD, 8));
		mseat5.setHorizontalAlignment(SwingConstants.CENTER);
		mseat5.setBounds(143, 455, 60, 60);
		mseat5.setIcon(new ImageIcon(seat));
		panel_3.add(mseat5);
		
		oseat5 = new JLabel("AVAILABLE");
		oseat5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
						oseat5.setText("RESERVED");
						oseat5.setForeground(Color.ORANGE);
			}
		});
		oseat5.setHorizontalTextPosition(SwingConstants.CENTER);
		oseat5.setFont(new Font("Arial Black", Font.BOLD, 8));
		oseat5.setForeground(Color.WHITE);
		oseat5.setHorizontalAlignment(SwingConstants.CENTER);
		oseat5.setBounds(249, 455, 60, 60);
		oseat5.setIcon(new ImageIcon(seat));
		panel_3.add(oseat5);
		
		panelconfirm = new JPanel();
		panelconfirm.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				confirm();
				rdbtnStudent.setEnabled(true);
				rdbtnSenior.setEnabled(true);
				rdbtnOther.setEnabled(true);
				lblNewLabel_5.setVisible(true);
			}
			public void mouseEntered(MouseEvent e) {
				panelconfirm.setBackground(Color.decode("#72e01e"));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelconfirm.setBackground(Color.decode("#5BB318"));
			}
		});
		panelconfirm.setLayout(null);
		panelconfirm.setBackground(new Color(91, 179, 24));
		panelconfirm.setBounds(45, 639, 155, 47);
		panel_3.add(panelconfirm);
		
		confirmicon = new JLabel();
		confirmicon.setHorizontalAlignment(SwingConstants.CENTER);
		confirmicon.setBounds(0, 0, 59, 47);
		confirmicon.setIcon(new ImageIcon(confirm));
		panelconfirm.add(confirmicon);
		
		lblconfirm = new JLabel("CONFIRM");
		lblconfirm.setForeground(new Color(4, 28, 50));
		lblconfirm.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblconfirm.setBounds(47, 10, 106, 27);
		panelconfirm.add(lblconfirm);
		
		lblNewLabel_2 = new JLabel("B-SEATS");
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 51, 85, 14);
		panel_3.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("M-SEATS");
		lblNewLabel_3.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_3.setBounds(128, 51, 85, 14);
		panel_3.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("O-SEATS");
		lblNewLabel_4.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_4.setBounds(241, 51, 81, 14);
		panel_3.add(lblNewLabel_4);
		
		oseat6 = new JLabel("AVAILABLE");
		oseat6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
						oseat6.setText("RESERVED");
						oseat6.setForeground(Color.ORANGE);
			}
		});
		oseat6.setHorizontalTextPosition(SwingConstants.CENTER);
		oseat6.setHorizontalAlignment(SwingConstants.CENTER);
		oseat6.setForeground(Color.WHITE);
		oseat6.setFont(new Font("Arial Black", Font.BOLD, 8));
		oseat6.setBounds(249, 526, 60, 60);
		oseat6.setIcon(new ImageIcon(seat));
		panel_3.add(oseat6);
		
		mseat6 = new JLabel("AVAILABLE");
		mseat6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
						mseat6.setText("RESERVED");
						mseat6.setForeground(Color.ORANGE);
					

			}
		});
		mseat6.setHorizontalTextPosition(SwingConstants.CENTER);
		mseat6.setHorizontalAlignment(SwingConstants.CENTER);
		mseat6.setForeground(Color.WHITE);
		mseat6.setFont(new Font("Arial Black", Font.BOLD, 8));
		mseat6.setBounds(143, 526, 60, 60);
		mseat6.setIcon(new ImageIcon(seat));
		panel_3.add(mseat6);
		
		bseat6 = new JLabel("AVAILABLE");
		bseat6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
						bseat6.setText("RESERVED");
						bseat6.setForeground(Color.ORANGE);
			}
		});
		bseat6.setHorizontalTextPosition(SwingConstants.CENTER);
		bseat6.setHorizontalAlignment(SwingConstants.CENTER);
		bseat6.setForeground(Color.WHITE);
		bseat6.setFont(new Font("Arial Black", Font.BOLD, 8));
		bseat6.setBounds(25, 526, 60, 60);
		bseat6.setIcon(new ImageIcon(seat));
		panel_3.add(bseat6);
		
		Clear = new JPanel();
		Clear.addMouseListener(new MouseAdapter() {
			@Override
	
			public void mouseClicked(MouseEvent e) {
				clearseats();
				lblNewLabel_5.setVisible(false);
				panelconfirm.setEnabled(true);
				lblOseat.setText("");
				lblMseat.setText("");
				lblBseat.setText("");
				bseat = 0;
				mseat = 0;
				oseat = 0;
				
			}
			public void mouseEntered(MouseEvent e) {
				Clear.setBackground(Color.decode("#72e01e"));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Clear.setBackground(Color.decode("#5BB318"));
			}
		});
		Clear.setLayout(null);
		Clear.setBackground(new Color(91, 179, 24));
		Clear.setBounds(210, 639, 155, 47);
		panel_3.add(Clear);
		
		ClearIcon = new JLabel();
		ClearIcon.setHorizontalAlignment(SwingConstants.CENTER);
		ClearIcon.setBounds(0, 0, 59, 47);
		ClearIcon.setIcon(new ImageIcon(broom));
		Clear.add(ClearIcon);
		
		lblClear_1 = new JLabel("CLEAR");
		lblClear_1.setForeground(new Color(4, 28, 50));
		lblClear_1.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblClear_1.setBounds(73, 10, 106, 27);
		Clear.add(lblClear_1);
		
		confirmicon_2 = new JLabel();
		confirmicon_2.setHorizontalAlignment(SwingConstants.CENTER);
		confirmicon_2.setBounds(10, 0, 59, 47);
		Clear.add(confirmicon_2);
		
		
		lblNewLabel_5 = new JLabel("Clear seat(s) if you want to change or add seat(s) after confirming");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 10));
		lblNewLabel_5.setBounds(25, 595, 367, 44);
		lblNewLabel_5.setVisible(false);
		
		panel_3.add(lblNewLabel_5);
		
	}
	
	//if the receipt is not generated
	public void pendingSeats() {
		if (bseat1.getText().equals("RESERVED")){
			bseat1.setText("PENDING");
			
			
		}
		if (bseat2.getText().equals("RESERVED")){
			bseat2.setText("PENDING");
			
			
		}
		if (bseat3.getText().equals("RESERVED")){
			bseat3.setText("PENDING");
			
		}
		if (bseat4.getText().equals("RESERVED")){
			bseat4.setText("PENDING");
		
			
		}
		if (bseat5.getText().equals("RESERVED")){
			bseat5.setText("PENDING");
			
			
		}
		if (bseat6.getText().equals("RESERVED")){
			bseat6.setText("PENDING");
		
			
		}

		if (mseat1.getText().equals("RESERVED")){
			mseat1.setText("PENDING");
			
			
		}
		if (mseat2.getText().equals("RESERVED")){
			mseat2.setText("PENDING");
			
			
		}
		if (mseat3.getText().equals("RESERVED")){
			mseat3.setText("PENDING");
			
			
		}
		if (mseat4.getText().equals("RESERVED")){
			mseat4.setText("PENDING");
			
		
		}
		if (mseat5.getText().equals("RESERVED")){
			mseat5.setText("PENDING");
			
			
		}
		if (mseat6.getText().equals("RESERVED")){
			mseat6.setText("PENDING");
			
			
		}
		
		if (oseat1.getText().equals("RESERVED")){
			oseat1.setText("PENDING");
			
			
		}
		if (oseat2.getText().equals("RESERVED")){
			oseat2.setText("PENDING");
			
			
		}
		if (oseat3.getText().equals("RESERVED")){
			oseat3.setText("PENDING");
			
		}
		if (oseat4.getText().equals("RESERVED")){
			oseat4.setText("PENDING");
			
		
		}
		if (oseat5.getText().equals("RESERVED")){
			oseat5.setText("PENDING");
			
		}
		if (oseat6.getText().equals("RESERVED")){
			oseat6.setText("PENDING");
			
			
		}
	}
	
	//if the receipt is generated
	public void selectedSeat() {
		if (bseat1.getText().equals("RESERVED")){
			bseat1.setText("PAID");
			bseat1.setEnabled(false);
		}
		if (bseat2.getText().equals("RESERVED")){
			bseat2.setText("PAID");
			bseat2.setEnabled(false);
		}
		if (bseat3.getText().equals("RESERVED")){
			bseat3.setText("PAID");
			bseat3.setEnabled(false);
		}
		if (bseat4.getText().equals("RESERVED")){
			bseat4.setText("PAID");
			bseat4.setEnabled(false);
		}
		if (bseat5.getText().equals("RESERVED")){
			bseat5.setText("PAID");
			bseat5.setEnabled(false);
		}
		if (bseat6.getText().equals("RESERVED")){
			bseat6.setText("PAID");
			bseat6.setEnabled(false);
		}

		if (mseat1.getText().equals("RESERVED")){
			mseat1.setText("PAID");
			mseat1.setEnabled(false);
		}
		if (mseat2.getText().equals("RESERVED")){
			mseat2.setText("PAID");
			mseat2.setEnabled(false);
		}
		if (mseat3.getText().equals("RESERVED")){
			mseat3.setText("PAID");
			mseat3.setEnabled(false);
		}
		if (mseat4.getText().equals("RESERVED")){
			mseat4.setText("PAID");
			mseat4.setEnabled(false);
		}
		if (mseat5.getText().equals("RESERVED")){
			mseat5.setText("PAID");
			mseat5.setEnabled(false);
		}
		if (mseat6.getText().equals("RESERVED")){
			mseat6.setText("PAID");
			mseat6.setEnabled(false);
		}
		
		if (oseat1.getText().equals("RESERVED")){
			oseat1.setText("PAID");
			oseat1.setEnabled(false);
		}
		if (oseat2.getText().equals("RESERVED")){
			oseat2.setText("PAID");
			oseat2.setEnabled(false);
		}
		if (oseat3.getText().equals("RESERVED")){
			oseat3.setText("PAID");
			oseat3.setEnabled(false);
		}
		if (oseat4.getText().equals("RESERVED")){
			oseat4.setText("PAID");
			oseat4.setEnabled(false);
		}
		if (oseat5.getText().equals("RESERVED")){
			oseat5.setText("PAID");
			oseat5.setEnabled(false);
		}
		if (oseat6.getText().equals("RESERVED")){
			oseat6.setText("PAID");
			oseat6.setEnabled(false);
		}
	}
	
	
	//for the update button
	public void updateSeat() {
		if (bseat1.getText().equals("PENDING")){
			bseat1.setText("PAID");
			bseat1.setEnabled(false);
		}
		if (bseat2.getText().equals("PENDING")){
			bseat2.setText("PAID");
			bseat2.setEnabled(false);
		}
		if (bseat3.getText().equals("PENDING")){
			bseat3.setText("PAID");
			bseat3.setEnabled(false);
		}
		if (bseat4.getText().equals("PENDING")){
			bseat4.setText("PAID");
			bseat4.setEnabled(false);
		}
		if (bseat5.getText().equals("PENDING")){
			bseat5.setText("PAID");
			bseat5.setEnabled(false);
		}
		if (bseat6.getText().equals("PENDING")){
			bseat6.setText("PAID");
			bseat6.setEnabled(false);
		}

		if (mseat1.getText().equals("PENDING")){
			mseat1.setText("PAID");
			mseat1.setEnabled(false);
		}
		if (mseat2.getText().equals("PENDING")){
			mseat2.setText("PAID");
			mseat2.setEnabled(false);
		}
		if (mseat3.getText().equals("PENDING")){
			mseat3.setText("PAID");
			mseat3.setEnabled(false);
		}
		if (mseat4.getText().equals("PENDING")){
			mseat4.setText("PAID");
			mseat4.setEnabled(false);
		}
		if (mseat5.getText().equals("PENDING")){
			mseat5.setText("PAID");
			mseat5.setEnabled(false);
		}
		if (mseat6.getText().equals("PENDING")){
			mseat6.setText("PAID");
			mseat6.setEnabled(false);
		}
		
		if (oseat1.getText().equals("PENDING")){
			oseat1.setText("PAID");
			oseat1.setEnabled(false);
		}
		if (oseat2.getText().equals("PENDING")){
			oseat2.setText("PAID");
			oseat2.setEnabled(false);
		}
		if (oseat3.getText().equals("PENDING")){
			oseat3.setText("PAID");
			oseat3.setEnabled(false);
		}
		if (oseat4.getText().equals("PENDING")){
			oseat4.setText("PAID");
			oseat4.setEnabled(false);
		}
		if (oseat5.getText().equals("PENDING")){
			oseat5.setText("PAID");
			oseat5.setEnabled(false);
		}
		if (oseat6.getText().equals("PENDING")){
			oseat6.setText("PAID");
			oseat6.setEnabled(false);
		}
	}


	//if the user confirm his/her seats
	public void confirm() {			
				if (bseat1.getText().equals("RESERVED")){
					bseat += 1;
				}
				if (bseat2.getText().equals("RESERVED")){
					bseat += 1;
				}
				if (bseat3.getText().equals("RESERVED")){
					bseat += 1;
				}
				if (bseat4.getText().equals("RESERVED")){
					bseat += 1;
				}
				if (bseat5.getText().equals("RESERVED")){
					bseat += 1;
				}
				if (bseat6.getText().equals("RESERVED")){
					bseat += 1;
				}

				if (mseat1.getText().equals("RESERVED")){
					mseat += 1;
				}
				if (mseat2.getText().equals("RESERVED")){
					mseat += 1;
				}
				if (mseat3.getText().equals("RESERVED")){
					mseat += 1;
				}
				if (mseat4.getText().equals("RESERVED")){
					mseat += 1;
				}
				if (mseat5.getText().equals("RESERVED")){
					mseat += 1;
				}
				if (mseat6.getText().equals("RESERVED")){
					mseat += 1;
				}
				
				if (oseat1.getText().equals("RESERVED")){
					oseat += 1;
				}
				if (oseat2.getText().equals("RESERVED")){
					oseat += 1;
				}
				if (oseat3.getText().equals("RESERVED")){
					oseat += 1;
				}
				if (oseat4.getText().equals("RESERVED")){
					oseat += 1;
				}
				if (oseat5.getText().equals("RESERVED")){
					oseat += 1;
				}
				if (oseat6.getText().equals("RESERVED")){
					oseat += 1;
				}
				if (JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirmation", JOptionPane.YES_NO_OPTION)== 0) {
					
					lblBseat.setText(String.valueOf(bseat));
					Double b = Double.parseDouble(String.valueOf(bseat));
					Double bseatAmount = b * 150;
				
					lblMseat.setText(String.valueOf(mseat));
					Double m = Double.parseDouble(String.valueOf(mseat));
					Double mseatAmount = m * 200;
							
					lblOseat.setText(String.valueOf(oseat));
					Double o = Double.parseDouble(String.valueOf(oseat));
					Double oseatAmount = o * 250;
							
					Double subT= bseatAmount + mseatAmount + oseatAmount;
					subTotal.setText(String.valueOf(String.format("%.2f", + subT)));
					
				}

			
		

		}
	
	//to clear the seats  before confirming
	public void clearseats() {
		if (oseat1.getText().equals("RESERVED") || oseat1.getText().equals("PENDING")) {
			oseat1.setText("AVAILABLE");
			oseat1.setForeground(Color.WHITE);
		}
		if (oseat2.getText().equals("RESERVED") || oseat2.getText().equals("PENDING")) {
			oseat2.setText("AVAILABLE");
			oseat2.setForeground(Color.WHITE);
		}
		if (oseat3.getText().equals("RESERVED") || oseat3.getText().equals("PENDING")) {
			oseat3.setText("AVAILABLE");
			oseat3.setForeground(Color.WHITE);
		}
		if (oseat4.getText().equals("RESERVED") || oseat4.getText().equals("PENDING")) {
			oseat4.setText("AVAILABLE");
			oseat4.setForeground(Color.WHITE);
		}
		if (oseat5.getText().equals("RESERVED") || oseat5.getText().equals("PENDING")) {
			oseat5.setText("AVAILABLE");
			oseat5.setForeground(Color.WHITE);
		}
		if (oseat6.getText().equals("RESERVED") || oseat6.getText().equals("PENDING")) {
			oseat6.setText("AVAILABLE");
			oseat6.setForeground(Color.WHITE);
		}
		if (mseat1.getText().equals("RESERVED") || mseat1.getText().equals("PENDING")) {
			mseat1.setText("AVAILABLE");
			mseat1.setForeground(Color.WHITE);
		}
		if (mseat2.getText().equals("RESERVED") || mseat2.getText().equals("PENDING")) {
			mseat2.setText("AVAILABLE");
			mseat2.setForeground(Color.WHITE);
		}
		if (mseat3.getText().equals("RESERVED") || mseat3.getText().equals("PENDING")) {
			mseat3.setText("AVAILABLE");
			mseat3.setForeground(Color.WHITE);
		}
		if (mseat4.getText().equals("RESERVED") || mseat4.getText().equals("PENDING")) {
			mseat4.setText("AVAILABLE");
			mseat4.setForeground(Color.WHITE);
		}
		if (mseat5.getText().equals("RESERVED") || mseat5.getText().equals("PENDING")) {
			mseat5.setText("AVAILABLE");
			mseat5.setForeground(Color.WHITE);
		}
		if (mseat6.getText().equals("RESERVED") || mseat6.getText().equals("PENDING")) {
			mseat6.setText("AVAILABLE");
			mseat6.setForeground(Color.WHITE);
		}
		if (bseat1.getText().equals("RESERVED") || bseat1.getText().equals("PENDING")) {
			bseat1.setText("AVAILABLE");
			bseat1.setForeground(Color.WHITE);
		}
		if (bseat2.getText().equals("RESERVED") || bseat2.getText().equals("PENDING")) {
			bseat2.setText("AVAILABLE");
			bseat2.setForeground(Color.WHITE);
		}
		if (bseat3.getText().equals("RESERVED") || bseat3.getText().equals("PENDING")) {
			bseat3.setText("AVAILABLE");
			bseat3.setForeground(Color.WHITE);
		}
		if (bseat4.getText().equals("RESERVED") || bseat4.getText().equals("PENDING")) {
			bseat4.setText("AVAILABLE");
			bseat4.setForeground(Color.WHITE);
		}
		if (bseat5.getText().equals("RESERVED") || bseat5.getText().equals("PENDING")) {
			bseat5.setText("AVAILABLE");
			bseat5.setForeground(Color.WHITE);
		}
		if (bseat6.getText().equals("RESERVED") || bseat6.getText().equals("PENDING")) {
			bseat6.setText("AVAILABLE");
			bseat6.setForeground(Color.WHITE);
		}
		
		
		
		
		
	}

	//to clear all the fields
	public void clear() {
	fname.setText("");
	lname.setText("");
	contactNo.setText("");
	Email.setText("");
	Age.setText("");
	sexGroup.clearSelection();
	lblBseat.setText("");
	lblMseat.setText("");
	lblOseat.setText("");
	subTotal.setText("");
	discount.setText("");
	discountGroup.clearSelection();
	tax.setText("");
	total.setText("");
	pay.setText("");
	change.setText("");
	sched.clearSelection();
	
	rdbtnsched1.setEnabled(true);
	rdbtnsched2.setEnabled(true);
	
	
	bseat = 0;
	mseat = 0;
	oseat = 0;
	
	
	
}
}
