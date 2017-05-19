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

public class GillColor extends JFrame {

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

	public   GillColor(String i[]) {
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
		
		JRadioButton rdbtnBrown = new JRadioButton("Black");
		rdbtnBrown.setBounds(5, 137, 109, 23);
		contentPane.add(rdbtnBrown);

		JRadioButton rdbtnBuff = new JRadioButton("Brown");
		rdbtnBuff.setBounds(116, 137, 109, 23);
		contentPane.add(rdbtnBuff);
		
		JRadioButton rdbtnCinnamon = new JRadioButton("Buff");
		rdbtnCinnamon.setBounds(227, 137, 109, 23);
		contentPane.add(rdbtnCinnamon);
		
		JRadioButton rdbtnGray= new JRadioButton("Chocolate");
		rdbtnGray.setBounds(5, 163, 109, 23);
		contentPane.add(rdbtnGray);
				
		JRadioButton rdbtnGreen = new JRadioButton("Gray");
		rdbtnGreen.setBounds(116, 163, 109, 23);
		contentPane.add(rdbtnGreen);
		
		JRadioButton rdbtnPink = new JRadioButton("Green");
		rdbtnPink.setBounds(227, 163, 109, 23);
		contentPane.add(rdbtnPink);
		
		JRadioButton rdbtnPurple = new JRadioButton("Orange");
		rdbtnPurple.setBounds(339, 137, 109, 23);
		contentPane.add(rdbtnPurple);
		
		JRadioButton rdbtnRed = new JRadioButton("Pink");
		rdbtnRed.setBounds(340, 163, 109, 23);
		contentPane.add(rdbtnRed);
		
		JRadioButton rdbtnWhite = new JRadioButton("Purple");
		rdbtnWhite.setBounds(5, 189, 109, 23);
		contentPane.add(rdbtnWhite);
		
		JRadioButton rdbtnYellow = new JRadioButton("Red");
		rdbtnYellow.setBounds(116, 189, 109, 23);
		contentPane.add(rdbtnYellow);
		
		JRadioButton rdbtnWhite_1 = new JRadioButton("White");
		rdbtnWhite_1.setBounds(227, 189, 109, 23);
		contentPane.add(rdbtnWhite_1);
		
		JRadioButton rdbtnYellow_1 = new JRadioButton("Yellow");
		rdbtnYellow_1.setBounds(339, 189, 109, 23);
		contentPane.add(rdbtnYellow_1);
		
		
		JLabel lblCapshap = new JLabel("Cap-Color");
		lblCapshap.setBounds(116, 55, 198, 14);
		contentPane.add(lblCapshap);
		
		JButton btnProximo = new JButton("Proximo");
		btnProximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnBrown.isSelected()){
					i[8] = "k";
				}if (rdbtnBuff.isSelected()){
					i[8] = "n";
				}if (rdbtnCinnamon.isSelected()){
					i[8] = "b";
				}if (rdbtnGray.isSelected()){
					i[8] = "h";
				}if (rdbtnGreen.isSelected()){
					i[8] = "g";
				}if (rdbtnPink.isSelected()){
					i[8] = "r";
				}if (rdbtnPurple.isSelected()){
					i[8] = "o";
				}if (rdbtnRed.isSelected()){
					i[8] = "p";
				}if (rdbtnWhite.isSelected()){
					i[8] = "u";
				}if (rdbtnYellow.isSelected()){
					i[8] = "e";
				}
				if (rdbtnWhite_1.isSelected()){
					i[8] = "w";
				}if (rdbtnYellow_1.isSelected()){
					i[8] = "yB";
				}

				System.out.println("escolheu a opcao " + i[8] );
				new StalkShape(i).setVisible(true);			}
		});
		btnProximo.setBounds(340, 227, 89, 23);
		contentPane.add(btnProximo);
		
		

	}
}
