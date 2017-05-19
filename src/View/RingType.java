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

public class RingType extends JFrame {

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

	public  RingType(String i[]) {
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
		
		JRadioButton rdbtnBrown = new JRadioButton("Cobwebby");
		rdbtnBrown.setBounds(5, 137, 109, 23);
		contentPane.add(rdbtnBrown);

		JRadioButton rdbtnBuff = new JRadioButton("Evanescent");
		rdbtnBuff.setBounds(116, 137, 109, 23);
		contentPane.add(rdbtnBuff);
		
		JRadioButton rdbtnCinnamon = new JRadioButton("Flaring");
		rdbtnCinnamon.setBounds(227, 137, 109, 23);
		contentPane.add(rdbtnCinnamon);
		
		JRadioButton rdbtnGray= new JRadioButton("Large");
		rdbtnGray.setBounds(5, 163, 109, 23);
		contentPane.add(rdbtnGray);
				
		JRadioButton rdbtnGreen = new JRadioButton("None");
		rdbtnGreen.setBounds(116, 163, 109, 23);
		contentPane.add(rdbtnGreen);
		
		JRadioButton rdbtnPink = new JRadioButton("Pendant");
		rdbtnPink.setBounds(227, 163, 109, 23);
		contentPane.add(rdbtnPink);
		
		JRadioButton rdbtnPurple = new JRadioButton("Seathing");
		rdbtnPurple.setBounds(339, 137, 109, 23);
		contentPane.add(rdbtnPurple);
		
		JRadioButton rdbtnRed = new JRadioButton("Zone");
		rdbtnRed.setBounds(340, 163, 109, 23);
		contentPane.add(rdbtnRed);
	
		
		
		JLabel lblCapshap = new JLabel("Ring Type");
		lblCapshap.setBounds(116, 55, 198, 14);
		contentPane.add(lblCapshap);
		
		JButton btnProximo = new JButton("Proximo");
		btnProximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnBrown.isSelected()){
					i[18] = "c";
				}if (rdbtnBuff.isSelected()){
					i[18] = "e";
				}if (rdbtnCinnamon.isSelected()){
					i[18] = "f";
				}if (rdbtnGray.isSelected()){
					i[18] = "l";
				}if (rdbtnGreen.isSelected()){
					i[18] = "n";
				}if (rdbtnPink.isSelected()){
					i[18] = "p";
				}if (rdbtnPurple.isSelected()){
					i[18] = "s";
				}if (rdbtnRed.isSelected()){
					i[18] = "z";
				}

				System.out.println("escolheu a opcao " + i[18] );
				new SporePrintColor(i).setVisible(true);			}
		});
		btnProximo.setBounds(340, 227, 89, 23);
		contentPane.add(btnProximo);

	}
}
