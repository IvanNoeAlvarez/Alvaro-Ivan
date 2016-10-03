package Streams;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventanas extends JFrame {

	private JPanel contentPane = new JPanel();
	
	final static String Elije_Botones = "Ventanas";
	final static String Comparar = "Comparar";
	
	Elije_Botones v0 = new Elije_Botones ();
	Comparar v1 = new Comparar();
	
	CardLayout c1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventanas frame = new Ventanas();
					frame.setVisible(true);
					frame.setTitle("Flujo de datos");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventanas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		c1 = new CardLayout();
		contentPane.setLayout(c1);
		contentPane.add(v0, Elije_Botones);
		contentPane.add(v1, Comparar);
		
		
		CardLayout c1 = (CardLayout) (contentPane.getLayout());
		c1.show(contentPane, Elije_Botones);
		
		v0.getBtnComparar().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				c1.show(contentPane, Comparar);
				
			}
		});
		
	}

}
