package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Odor extends JFrame {

	private JPanel contentPane;
	String i[] = new String[22];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	}

	/**
	 * Create the frame.
	 */

	public   Odor(String i[]) {
		this.i = i;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblClassificadorDeCogumelos = new JLabel("Classificador de Cogumelos");
		lblClassificadorDeCogumelos.setBounds(5, 5, 424, 14);
		contentPane.add(lblClassificadorDeCogumelos);
		
		JRadioButton rdbtnBrown = new JRadioButton("Almod");
		rdbtnBrown.setBounds(5, 137, 109, 23);
		contentPane.add(rdbtnBrown);

		JRadioButton rdbtnBuff = new JRadioButton("Anise");
		rdbtnBuff.setBounds(116, 137, 109, 23);
		contentPane.add(rdbtnBuff);
		
		JRadioButton rdbtnCinnamon = new JRadioButton("Cresote");
		rdbtnCinnamon.setBounds(227, 137, 109, 23);
		contentPane.add(rdbtnCinnamon);
		
		JRadioButton rdbtnGray= new JRadioButton("Fishy");
		rdbtnGray.setBounds(5, 163, 109, 23);
		contentPane.add(rdbtnGray);
				
		JRadioButton rdbtnGreen = new JRadioButton("Foul");
		rdbtnGreen.setBounds(116, 163, 109, 23);
		contentPane.add(rdbtnGreen);
		
		JRadioButton rdbtnPink = new JRadioButton("Musty");
		rdbtnPink.setBounds(227, 163, 109, 23);
		contentPane.add(rdbtnPink);
		
		JRadioButton rdbtnPurple = new JRadioButton("None");
		rdbtnPurple.setBounds(339, 137, 109, 23);
		contentPane.add(rdbtnPurple);
		
		JRadioButton rdbtnRed = new JRadioButton("Pungent");
		rdbtnRed.setBounds(340, 163, 109, 23);
		contentPane.add(rdbtnRed);
		
		JRadioButton rdbtnWhite = new JRadioButton("Spyci");
		rdbtnWhite.setBounds(5, 189, 109, 23);
		contentPane.add(rdbtnWhite);
		
		
		
		
		JLabel lblCapshap = new JLabel("Odor");
		lblCapshap.setBounds(116, 55, 198, 14);
		contentPane.add(lblCapshap);
		
		JButton btnProximo = new JButton("Proximo");
		btnProximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnBrown.isSelected()){
					i[4] = "a";
				}
				if (rdbtnBuff.isSelected()){
					i[4] = "l";
				}
				if (rdbtnCinnamon.isSelected()){
					i[4] = "c";
				}
				if (rdbtnGray.isSelected()){
					i[4] = "y";
				}if (rdbtnGreen.isSelected()){
					i[4] = "f";
				}if (rdbtnPink.isSelected()){
					i[4] = "m";
				}if (rdbtnPurple.isSelected()){
					i[4] = "n";
				}if (rdbtnRed.isSelected()){
					i[4] = "p";
				}if (rdbtnWhite.isSelected()){
					i[4] = "s";
				}

				System.out.println("escolheu a opcao " + i[4] );
				new GillAttachment(i).setVisible(true);			}
		});
		btnProximo.setBounds(340, 227, 89, 23);
		contentPane.add(btnProximo);

	}
}
