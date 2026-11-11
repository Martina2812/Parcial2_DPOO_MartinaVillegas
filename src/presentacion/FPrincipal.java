package presentacion;

import java.awt.BorderLayout;  
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton; 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import logica.Parcial;

public class FPrincipal extends JFrame implements ActionListener {

	private JLabel lA;
	private JLabel lB;
	private JLabel lC;
	private JLabel lResultado;
	private JTextField tA;
	private JTextField tB;
	private JTextField tC;
	private JButton bCalcular;
	
	public FPrincipal() {
		
		setTitle("Examen Hector Flores");
		setSize(400, 260);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		lA = new JLabel("a:", JLabel.RIGHT);
		lA.setBounds(20, 20, 100, 30);
		add(lA);

		tA = new JTextField();
		tA.setBounds(130, 20, 220, 30);
		add(tA);

		lB = new JLabel("b:", JLabel.RIGHT);
		lB.setBounds(20, 65, 100, 30);
		add(lB);

		tB = new JTextField();
		tB.setBounds(130, 65, 220, 30);
		add(tB);

		lC = new JLabel("c:", JLabel.RIGHT);
		lC.setBounds(20, 110, 100, 30);
		add(lC);

		tC = new JTextField();
		tC.setBounds(130, 110, 220, 30);
		add(tC);

		bCalcular = new JButton("Calcular");
		bCalcular.setBounds(20, 160, 100, 30);
		bCalcular.addActionListener(this);
		add(bCalcular);

		lResultado = new JLabel("");
		lResultado.setBounds(130, 160, 220, 30);
		add(lResultado);
	}

	public void actionPerformed(ActionEvent e) {

		try {
			int a = Integer.parseInt(tA.getText());
			int b = Integer.parseInt(tB.getText());
			int c = Integer.parseInt(tC.getText());

			Parcial p = new Parcial(a, b, c);
			lResultado.setText(p.raices(a, b, c));

		} catch (Exception ex) {
			lResultado.setText("Ingrese números enteros");
		} 
	}

	public static void main(String[] args) {
		FPrincipal fp = new FPrincipal();
		fp.setVisible(true);
	}
	
	

}
