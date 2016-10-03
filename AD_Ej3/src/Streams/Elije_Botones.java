package Streams;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Button;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JButton;

public class Elije_Botones extends JPanel {

	private JButton btnComparar;
	private JButton btnBuscar;
	
	/**
	 * Create the panel.
	 */
	public Elije_Botones() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.NORTH);
		
		JLabel lblTitulo = new JLabel("Ej3_AD");
		panel.add(lblTitulo);
		
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(2, 1, 0, 0));
		
		btnComparar = new JButton("Comparar ficheros");
		panel_1.add(btnComparar);
		
		btnBuscar = new JButton("Buscar palabras");
		panel_1.add(btnBuscar);

	}

	public JButton getBtnComparar() {
		return btnComparar;
	}

	public void setBtnComparar(JButton btnComparar) {
		this.btnComparar = btnComparar;
	}

	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	public void setBtnBuscar(JButton btnBuscar) {
		this.btnBuscar = btnBuscar;
	}

}
