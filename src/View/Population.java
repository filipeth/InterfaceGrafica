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

public class Population extends JFrame {

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

	public   Population(String i[]) {
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
		
		JRadioButton rdbtnBrown = new JRadioButton("Aduntant");
		rdbtnBrown.setBounds(5, 137, 109, 23);
		contentPane.add(rdbtnBrown);

		JRadioButton rdbtnBuff = new JRadioButton("Cluestered");
		rdbtnBuff.setBounds(116, 137, 109, 23);
		contentPane.add(rdbtnBuff);
		
		JRadioButton rdbtnCinnamon = new JRadioButton("Numerous");
		rdbtnCinnamon.setBounds(227, 137, 109, 23);
		contentPane.add(rdbtnCinnamon);
		
		JRadioButton rdbtnGray= new JRadioButton("Scattered");
		rdbtnGray.setBounds(5, 163, 109, 23);
		contentPane.add(rdbtnGray);
				
		JRadioButton rdbtnPink = new JRadioButton("Several");
		rdbtnPink.setBounds(227, 163, 109, 23);
		contentPane.add(rdbtnPink);
		
		JRadioButton rdbtnPurple = new JRadioButton("Solitary");
		rdbtnPurple.setBounds(339, 137, 109, 23);
		contentPane.add(rdbtnPurple);
	
		
		
		
		JLabel lblCapshap = new JLabel("Population");
		lblCapshap.setBounds(116, 55, 198, 14);
		contentPane.add(lblCapshap);
		
		JButton btnProximo = new JButton("Proximo");
		btnProximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnBrown.isSelected()){
					i[20] = "a";
				}if (rdbtnBuff.isSelected()){
					i[20] = "c";
				}if (rdbtnCinnamon.isSelected()){
					i[20] = "n";
				}if (rdbtnGray.isSelected()){
					i[20] = "s";
				}if (rdbtnPink.isSelected()){
					i[20] = "v";
				}if (rdbtnPurple.isSelected()){
					i[20] = "y";
				}

				System.out.println("escolheu a opcao " + i[20] );
				new Habitat(i).setVisible(true);			}
		});
		btnProximo.setBounds(340, 227, 89, 23);
		contentPane.add(btnProximo);
		
		

	}
}
