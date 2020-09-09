package Frontend;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class Homequiz {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Homequiz window = new Homequiz();
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
	public Homequiz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 51));
		frame.getContentPane().setForeground(new Color(0, 128, 128));
		frame.getContentPane().setFont(new Font("Times New Roman", Font.BOLD, 16));
		frame.setBounds(100, 100, 450, 379);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(119, 136, 153));
		panel.setToolTipText("");
		panel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		panel.setBounds(10, 11, 414, 39);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		 ButtonGroup b=new ButtonGroup();
		 
		
		JLabel lblNewLabel = new JLabel("WELCOME TO QUIZ ");
		lblNewLabel.setBackground(new Color(0, 128, 128));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(134, 11, 204, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Select Topics :");
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1.setForeground(new Color(0, 102, 204));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(46, 93, 84, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBackground(new Color(255, 204, 153));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton_1.setBounds(292, 276, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JRadioButton mix = new JRadioButton("Mixed Bag");
		mix.setFont(new Font("Tahoma", Font.PLAIN, 12));
		mix.setBackground(new Color(0, 204, 255));
		mix.setBounds(146, 90, 145, 23);
		frame.getContentPane().add(mix);
		b.add(mix);
		
		JRadioButton geo = new JRadioButton("Geography");
		geo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		geo.setBackground(new Color(0, 204, 102));
		geo.setBounds(146, 116, 145, 23);
		frame.getContentPane().add(geo);
		b.add(geo);
		
		JRadioButton pa = new JRadioButton("Plants and Animals");
		pa.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pa.setBackground(new Color(255, 204, 0));
		pa.setBounds(146, 142, 145, 23);
		frame.getContentPane().add(pa);
		b.add(pa);
		
		JRadioButton sc = new JRadioButton("Science and Tech");
		sc.setFont(new Font("Tahoma", Font.PLAIN, 12));
		sc.setBackground(new Color(255, 153, 51));
		sc.setBounds(146, 168, 145, 23);
		frame.getContentPane().add(sc);
		b.add(sc);
		
		JRadioButton sp = new JRadioButton("Sports and Arts");
		sp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		sp.setBackground(new Color(204, 0, 102));
		sp.setBounds(146, 194, 145, 23);
		frame.getContentPane().add(sp);
		b.add(sp);
		
		JRadioButton his = new JRadioButton("History");
		his.setFont(new Font("Tahoma", Font.PLAIN, 12));
		his.setBackground(new Color(204, 51, 0));
		his.setBounds(144, 220, 147, 23);
		frame.getContentPane().add(his);
		b.add(his);
		
		
		JButton btnNewButton = new JButton("Start Quiz");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Questionpage q=new Questionpage();
				if(mix.isSelected()) {
				       q.getqs(1);
				}
				else if(geo.isSelected()) {
					q.getqs(2);
				}
				else if (pa.isSelected()) {
					q.getqs(3);
				}
				else if(sc.isSelected()) {
					q.getqs(4);
				}
				
				else if(sp.isSelected()) {
					q.getqs(5);
				}
				
				else if (his.isSelected()) {
					q.getqs(6);
				}
				
				
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(0, 204, 102));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton.setBounds(71, 276, 99, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		
		
		
		
		
		
		
	}
}
