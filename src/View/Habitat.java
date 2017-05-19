package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Habitat extends JFrame {

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

	public   Habitat(String i[]) {
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
		
		JRadioButton rdbtnBrown = new JRadioButton("Grassees");
		rdbtnBrown.setBounds(5, 137, 109, 23);
		contentPane.add(rdbtnBrown);

		JRadioButton rdbtnBuff = new JRadioButton("Leaves");
		rdbtnBuff.setBounds(116, 137, 109, 23);
		contentPane.add(rdbtnBuff);
		
		JRadioButton rdbtnCinnamon = new JRadioButton("Meadows");
		rdbtnCinnamon.setBounds(227, 137, 109, 23);
		contentPane.add(rdbtnCinnamon);
		
		JRadioButton rdbtnGray= new JRadioButton("Paths");
		rdbtnGray.setBounds(5, 163, 109, 23);
		contentPane.add(rdbtnGray);
				
		JRadioButton rdbtnPink = new JRadioButton("Urban");
		rdbtnPink.setBounds(227, 163, 109, 23);
		contentPane.add(rdbtnPink);
		
		JRadioButton rdbtnPurple = new JRadioButton("Waste");
		rdbtnPurple.setBounds(339, 137, 109, 23);
		contentPane.add(rdbtnPurple);
	
		JRadioButton rdbtnWoods = new JRadioButton("Woods");
		rdbtnWoods.setBounds(116, 163, 109, 23);
		contentPane.add(rdbtnWoods);
		
		
		JLabel lblCapshap = new JLabel("Habitat");
		lblCapshap.setBounds(116, 55, 198, 14);
		contentPane.add(lblCapshap);
		
		JButton btnProximo = new JButton("Proximo");
		btnProximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnBrown.isSelected()){
					i[21] = "g";
				}if (rdbtnBuff.isSelected()){
					i[21] = "l";
				}if (rdbtnCinnamon.isSelected()){
					i[21] = "m";
				}if (rdbtnGray.isSelected()){
					i[21] = "p";
				}if (rdbtnPink.isSelected()){
					i[21] = "u";
				}if (rdbtnPurple.isSelected()){
					i[21] = "w";
				}if (rdbtnWoods.isSelected()){
					i[21] = "d";
				}

				System.out.println("escolheu a opcao " + i[21] );
				double p = ArvoreDecisao.Odor(i);
				if (p == 0){
					JOptionPane.showMessageDialog(null, "COGUMELO COMESTIVEL");
				}else
					JOptionPane.showMessageDialog(null, "COGUMELO NAO COMESTIVEL");
			}
		});
		btnProximo.setBounds(340, 227, 89, 23);
		contentPane.add(btnProximo);
		
		
		
		

	}
}
