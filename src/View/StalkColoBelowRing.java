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

public class StalkColoBelowRing extends JFrame {

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

	public  StalkColoBelowRing(String i[]) {
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
		
		JRadioButton rdbtnBrown = new JRadioButton("Brown");
		rdbtnBrown.setBounds(5, 137, 109, 23);
		contentPane.add(rdbtnBrown);

		JRadioButton rdbtnBuff = new JRadioButton("Buff");
		rdbtnBuff.setBounds(116, 137, 109, 23);
		contentPane.add(rdbtnBuff);
		
		JRadioButton rdbtnCinnamon = new JRadioButton("Cinnamon");
		rdbtnCinnamon.setBounds(227, 137, 109, 23);
		contentPane.add(rdbtnCinnamon);
		
		JRadioButton rdbtnGray= new JRadioButton("Gray");
		rdbtnGray.setBounds(5, 163, 109, 23);
		contentPane.add(rdbtnGray);
				
		JRadioButton rdbtnGreen = new JRadioButton("Green");
		rdbtnGreen.setBounds(116, 163, 109, 23);
		contentPane.add(rdbtnGreen);
		
		JRadioButton rdbtnPink = new JRadioButton("Pink");
		rdbtnPink.setBounds(227, 163, 109, 23);
		contentPane.add(rdbtnPink);
		
		JRadioButton rdbtnPurple = new JRadioButton("Purple");
		rdbtnPurple.setBounds(339, 137, 109, 23);
		contentPane.add(rdbtnPurple);
		
		JRadioButton rdbtnRed = new JRadioButton("Red");
		rdbtnRed.setBounds(340, 163, 109, 23);
		contentPane.add(rdbtnRed);
		
		JRadioButton rdbtnWhite = new JRadioButton("White");
		rdbtnWhite.setBounds(5, 189, 109, 23);
		contentPane.add(rdbtnWhite);
		
		JRadioButton rdbtnYellow = new JRadioButton("Yellow");
		rdbtnYellow.setBounds(116, 189, 109, 23);
		contentPane.add(rdbtnYellow);
		
		
		JLabel lblCapshap = new JLabel("stalk-color-below-ring");
		lblCapshap.setBounds(116, 55, 198, 14);
		contentPane.add(lblCapshap);
		
		JButton btnProximo = new JButton("Proximo");
		btnProximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnBrown.isSelected()){
					i[14] = "n";
				}if (rdbtnBuff.isSelected()){
					i[14] = "b";
				}if (rdbtnCinnamon.isSelected()){
					i[14] = "c";
				}if (rdbtnGray.isSelected()){
					i[14] = "g";
				}if (rdbtnGreen.isSelected()){
					i[14] = "r";
				}if (rdbtnPink.isSelected()){
					i[14] = "p";
				}if (rdbtnPurple.isSelected()){
					i[14] = "u";
				}if (rdbtnRed.isSelected()){
					i[14] = "e";
				}if (rdbtnWhite.isSelected()){
					i[14] = "w";
				}if (rdbtnYellow.isSelected()){
					i[14] = "y";
				}

				System.out.println("escolheu a opcao " + i[14] );
				new VeilType(i).setVisible(true);			}
		});
		btnProximo.setBounds(340, 227, 89, 23);
		contentPane.add(btnProximo);

	}
}
