package Frontend;
import Backend.Geo;
import Backend.History;
import Backend.Mix;
import Backend.Plants;
import Backend.Science;
import Backend.Sports;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JSplitPane;
import javax.swing.JSeparator;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Questionpage {

	private JFrame frame;
	JButton btnNewButton_6;
	JButton btnNewButton_5;
	JButton btnNewButton_4;
	public static int c,count=1,score=0,points=100;
	public  boolean eliminate=false , fiv=false,hint=false;
	String qs;
	String o1;
	String o2;
	String o3;
	String ca;
	/**
	 * Launch the application.
	 */
	public static void getqs(int n) {
		c=n;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Questionpage window = new Questionpage();
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
	public Questionpage() {
		initialize();
	}
	
	
	
	public static String shuffle(String s) {
		String su="";
		while(s.length()!=0)
		{
			int ind=(int)Math.floor(Math.random()*s.length());
			char c=s.charAt(ind);
			s=s.substring(0, ind)+s.substring(ind+1);
			su+=c;
		}
		return su;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(102, 153, 204));
		frame.setBounds(100, 100, 724, 407);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 102, 153));
		panel.setBounds(0, 0, 697, 60);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
	
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(491, 26, 146, 14);
		panel.add(progressBar);
		
		JLabel lblNewLabel_1 = new JLabel("ROUND1");
		lblNewLabel_1.setBounds(405, 26, 63, 14);
		panel.add(lblNewLabel_1);
		
		//checking for the question type
	
		
		if (c==1) {
			Mix m=new Mix();
			try {
				m.getdata();
			} catch (InstantiationException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			qs=m.getqs();
			o1=m.geto1();
			o2=m.geto2();
			o3=m.geto3();
			ca=m.getc();
					
		}
		else if(c==2) {
			Geo m=new Geo();
		    
			try {
				m.getdata();
			} catch (InstantiationException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			qs=m.getqs();
			o1=m.geto1();
			o2=m.geto2();
			o3=m.geto3();
			ca=m.getc();
		}
		else if(c==3) {
			Plants m=new Plants();
			
			try {
				m.getdata();
			} catch (InstantiationException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			qs=m.getqs();
			o1=m.geto1();
			o2=m.geto2();
			o3=m.geto3();
			ca=m.getc();
			
		}
		else if (c==4) {
			Science m= new Science();
			
			try {
				m.getdata();
			} catch (InstantiationException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			qs=m.getqs();
			o1=m.geto1();
			o2=m.geto2();
			o3=m.geto3();
			ca=m.getc();
		}
		else if (c==5) {
			Sports m=new Sports();
			 
			try {
				m.getdata();
			} catch (InstantiationException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			qs=m.getqs();
			o1=m.geto1();
			o2=m.geto2();
			o3=m.geto3();
			ca=m.getc();
		}
		else
		{
			History m=new History();
		
			try {
				m.getdata();
			} catch (InstantiationException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			qs=m.getqs();
			o1=m.geto1();
			o2=m.geto2();
			o3=m.geto3();
			ca=m.getc();
		}
		
		JButton btnNewButton_7 = new JButton("NEXT");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if ( count<11) {
					frame.dispose();
				Questionpage p=new Questionpage();
				count++;
				p.getqs(c);
				
				
				}
				
				if (count==11) {
					frame.dispose();
					Scorepage p=new Scorepage();
					p.score(score);
				}
			}
		
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_7.setBounds(609, 334, 89, 23);
		frame.getContentPane().add(btnNewButton_7);
		
		JLabel lblNewLabel = new JLabel(qs);
		
		lblNewLabel.setBackground(new Color(204, 204, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(48, 105, 617, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_3 = new JButton(o1);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(o1.equals(ca)) {
					btnNewButton_3.setBackground(new Color(0, 204, 102));
					if (hint==false  && fiv==false && eliminate ==false) {
					score=score+50;
					}
					else {
						if (eliminate==true && hint==true && fiv==true) {
							
							score=score+0;
							
						}
						else if(eliminate==true && hint==true)
							score=score+15;
						else if(eliminate==true && fiv==true)
							score=score+20;
						else if (fiv==true && hint==true)
							score=score+5;
						else if (eliminate==true)
							score=score+40;
						else if (hint==true)
							score=score+25;
						else
							score=score+30;
							
					}
				}
				else {
					btnNewButton_3.setBackground(new Color(204, 51, 0));
					JOptionPane.showMessageDialog(null,"Correct :"+ca);
				}
			
			}
		});
		btnNewButton_3.setBounds(73, 167, 176, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		 btnNewButton_4 = new JButton(o2);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				if(o2.equals(ca)) {
					btnNewButton_4.setBackground(new Color(0, 204, 102));
					if (hint==false  && fiv==false && eliminate ==false) {
						score=score+50;
						}
						else {
							if (eliminate==true && hint==true && fiv==true) {
								
								score=score+0;
								
							}
							else if(eliminate==true && hint==true)
								score=score+15;
							else if(eliminate==true && fiv==true)
								score=score+20;
							else if (fiv==true && hint==true)
								score=score+5;
							else if (eliminate==true)
								score=score+40;
							else if (hint==true)
								score=score+25;
							else
								score=score+30;
								
						}
				}
				else {
					btnNewButton_4.setBackground(new Color(204, 51, 0));
					JOptionPane.showMessageDialog(null,"Correct :"+ca);
				}
				
			}
		});
		btnNewButton_4.setBounds(385, 167, 164, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		btnNewButton_5 = new JButton(o3);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(o3.contentEquals(ca)) {
					btnNewButton_5.setBackground(new Color(0, 204, 102));
					if (hint==false  && fiv==false && eliminate ==false) {
						score=score+50;
						}
						else {
							if (eliminate==true && hint==true && fiv==true) {
								
								score=score+0;
								
							}
							else if(eliminate==true && hint==true)
								score=score+15;
							else if(eliminate==true && fiv==true)
								score=score+20;
							else if (fiv==true && hint==true)
								score=score+5;
							else if (eliminate==true)
								score=score+40;
							else if (hint==true)
								score=score+25;
							else
								score=score+30;
								
						}
				}
				else {
					btnNewButton_5.setBackground(new Color(204, 51, 0));
					JOptionPane.showMessageDialog(null,"Correct :"+ca);
				}
			}
		});
		btnNewButton_5.setForeground(new Color(0, 0, 0));
		btnNewButton_5.setBounds(73, 242, 176, 23);
		frame.getContentPane().add(btnNewButton_5);
		
	    btnNewButton_6 = new JButton("None of the above");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_5.disable();
				btnNewButton_4.disable();
				btnNewButton_3.disable();
				
				
				
				btnNewButton_6.setBackground(new Color(204, 51, 0));
				JOptionPane.showMessageDialog(null,"Correct :"+ca);
			}
		});
		btnNewButton_6.setBounds(385, 242, 164, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		
		JButton btnNewButton_2 = new JButton("Hint");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            hint=true;
				JOptionPane.showMessageDialog(null,"Here is the Ans Guess: "+shuffle(ca));
			}
		});
		btnNewButton_2.setBounds(259, 26, 104, 23);
		panel.add(btnNewButton_2);
		
		
		JButton btnNewButton = new JButton("Eliminate 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminate=true;
				
				btnNewButton_6.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(10, 26, 115, 23);
		panel.add(btnNewButton);
		
		
		JButton btnNewButton_1 = new JButton("50-50");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				fiv=true;
				
				if(!o1.equals(ca)) {
					btnNewButton_3.setVisible(false);
					
				}
				else if(!o2.equals(ca)) {
					btnNewButton_4.setVisible(false);
					
				}
				else  {
					btnNewButton_5.setVisible(false);
				}
				btnNewButton_6.setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton_1.setBounds(135, 26, 114, 23);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("Question:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(10, 80, 68, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		
		
		JButton btnNewButton_8 = new JButton("HOME");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Homequiz h=new Homequiz();
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_8.setBounds(22, 335, 89, 23);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("View Score");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Current Points: "+score);
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_9.setBounds(287, 335, 110, 23);
		frame.getContentPane().add(btnNewButton_9);
		}
}
