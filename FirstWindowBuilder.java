package firstwindowbuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class FirstWindowBuilder {

	private JFrame frame;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstWindowBuilder window = new FirstWindowBuilder();
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
	public FirstWindowBuilder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon("C:\\Users\\William\\Desktop\\Java\\FirstWindowBuilder\\usmap.png"));
		label.setBounds(10, 11, 964, 579);
		frame.getContentPane().add(label);
		
		JButton btnPhx = new JButton("Phoenix");
		btnPhx.setFont(new Font("Arial", Font.PLAIN, 10));
		btnPhx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//System.out.println("Information for Phoenix...");
				new SearchCity("az", "phoenix");
			}
		});
		btnPhx.setBounds(242, 359, 81, 23);
		frame.getContentPane().add(btnPhx);
		
		JButton btnDenver = new JButton("Denver");
		btnDenver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SearchCity("co", "denver");
			}
		});
		btnDenver.setFont(new Font("Arial", Font.PLAIN, 10));
		btnDenver.setBounds(342, 269, 89, 23);
		frame.getContentPane().add(btnDenver);
		
		JButton btnDallas = new JButton("Dallas");
		btnDallas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SearchCity("tx", "dallas");
			}
		});
		btnDallas.setFont(new Font("Arial", Font.PLAIN, 10));
		btnDallas.setBounds(440, 396, 89, 23);
		frame.getContentPane().add(btnDallas);
		
		JButton btnSeattle = new JButton("Seattle");
		btnSeattle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SearchCity("wa", "seattle");
			}
		});
		btnSeattle.setFont(new Font("Arial", Font.PLAIN, 10));
		btnSeattle.setBounds(174, 99, 89, 23);
		frame.getContentPane().add(btnSeattle);
		
		JButton btnSanFrancisco = new JButton("San Francisco");
		btnSanFrancisco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SearchCity("ca", "san+francisco");
			}
		});
		btnSanFrancisco.setFont(new Font("Arial", Font.PLAIN, 10));
		btnSanFrancisco.setBounds(127, 269, 89, 23);
		frame.getContentPane().add(btnSanFrancisco);
		
		JButton btnKansasCity = new JButton("Kansas City");
		btnKansasCity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SearchCity("ks", "kansas+city");
			}
		});
		btnKansasCity.setFont(new Font("Arial", Font.PLAIN, 10));
		btnKansasCity.setBounds(473, 297, 89, 23);
		frame.getContentPane().add(btnKansasCity);
	}
}
