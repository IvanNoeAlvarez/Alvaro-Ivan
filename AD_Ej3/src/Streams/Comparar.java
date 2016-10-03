package Streams;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Insets;
import java.awt.Panel;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.FileChooserUI;

import java.awt.FlowLayout;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ReadOnlyBufferException;
import java.nio.file.Files;
import java.awt.event.ActionEvent;

public class Comparar extends JPanel {
	private JTextField textField;
	private JTextArea textArea;
	private JScrollPane scrollPane;

	File fichero = null;
	File fichero2 = null;
	FileReader fl1;
	FileReader fl2;
	boolean primeraVez = true;

	JFileChooser fc = new JFileChooser();
	int seleccion;

	public Comparar() {
		setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(0, 2, 0, 0));

		textField = new JTextField();
		textField.setText("");
		panel.add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("Selecciona...\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cogeArchivos();
				if (fichero2 != null) {
					System.out.println(fichero.getName());
					System.out.println(fichero2.getName());
					System.out.println(compara(fichero, fichero2));
				}
			}
		});

		panel.add(btnNewButton);

		scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);

		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

	}

	public void cogeArchivos() {
		seleccion = fc.showOpenDialog(this);
		seleccion = JFileChooser.APPROVE_OPTION;
		if (primeraVez) {
			fichero = fc.getSelectedFile();
			textArea.setText(fichero.getName());
			primeraVez = false;
		} else {
			fichero2 = fc.getSelectedFile();
			textArea.setText(fichero.getName() + "\t " + fichero2.getName());
		}
	}

	public boolean compara(File archivo, File archivo2) {

		boolean igual = false;
		try {
			FileReader fl1 = new FileReader(fichero);
			FileReader fl2 = new FileReader(fichero2);
			BufferedReader br1 = new BufferedReader(fl1);
			BufferedReader br2 = new BufferedReader(fl2);
			int str;
			while ((str = fl1.read()) != -1) {
				System.out.print((char) str);
				/*
				 * if (fl1.read() == fl2.read()) igual = true; else igual =
				 * false;
				 */
			}
		} catch (Exception e) {

		}
		if (igual)
			return true;
		else
			return false;
	}
}
