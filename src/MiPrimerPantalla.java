import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.Rectangle;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class MiPrimerPantalla {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiPrimerPantalla window = new MiPrimerPantalla();
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
	public MiPrimerPantalla() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(150, 150, 675, 525);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel_norte = new JPanel();
		panel_norte.setBorder(new TitledBorder(null, "Flow", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		frame.getContentPane().add(panel_norte, BorderLayout.NORTH);
		
		JButton JButton1 = new JButton("Jbutton1");
		JButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_norte.add(JButton1);
		
		JButton btnNewButton_1 = new JButton("JButton2");
		panel_norte.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("JButton3");
		panel_norte.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("JButton4");
		panel_norte.add(btnNewButton_3);
		
		JPanel panel_oeste = new JPanel();
		panel_oeste.setPreferredSize(new Dimension(90, 90));
		panel_oeste.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Free", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		frame.getContentPane().add(panel_oeste, BorderLayout.WEST);
		panel_oeste.setLayout(null);
		
		JButton btnNewButton_16 = new JButton("JButton12");
		btnNewButton_16.setBounds(39, 323, 41, 23);<
		panel_oeste.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("JButton11");
		btnNewButton_17.setBounds(24, 170, 41, 23);
		panel_oeste.add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("JButton10");
		btnNewButton_18.setBounds(10, 30, 31, 23);
		panel_oeste.add(btnNewButton_18);
		
		JPanel panel_este = new JPanel();
		panel_este.setBorder(new TitledBorder(null, "Box", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		frame.getContentPane().add(panel_este, BorderLayout.EAST);
		panel_este.setLayout(new BoxLayout(panel_este, BoxLayout.Y_AXIS));
		
		JButton btnNewButton_12 = new JButton("JButton17");
		panel_este.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("JButton18");
		panel_este.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("JButton19");
		panel_este.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("JButton20");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_este.add(btnNewButton_15);
		
		JPanel panel_sur = new JPanel();
		panel_sur.setBorder(new TitledBorder(null, "Grid", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		frame.getContentPane().add(panel_sur, BorderLayout.SOUTH);
		panel_sur.setLayout(new GridLayout(1, 4, 0, 0));
		
		JButton btnNewButton_8 = new JButton("JButton13");
		panel_sur.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("JButton14");
		panel_sur.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("JButton15");
		panel_sur.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("JButton16");
		panel_sur.add(btnNewButton_11);
		
		JPanel panel_centro = new JPanel();
		panel_centro.setBorder(new TitledBorder(null, "Border", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		frame.getContentPane().add(panel_centro, BorderLayout.CENTER);
		panel_centro.setLayout(new BorderLayout(0, 0));
		
		JButton button = new JButton("JButton5");
		panel_centro.add(button);
		
		JButton btnNewButton_4 = new JButton("JButton8");
		panel_centro.add(btnNewButton_4, BorderLayout.EAST);
		
		JButton btnNewButton_5 = new JButton("JButton7");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_centro.add(btnNewButton_5, BorderLayout.WEST);
		
		JButton btnNewButton_6 = new JButton("JButton6");
		panel_centro.add(btnNewButton_6, BorderLayout.NORTH);
		
		JButton btnNewButton_7 = new JButton("JButton9");
		panel_centro.add(btnNewButton_7, BorderLayout.SOUTH);
	}
}
