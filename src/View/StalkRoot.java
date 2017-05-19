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

public class StalkRoot extends JFrame {

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

	public   StalkRoot(String i[]) {
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
		
		JRadioButton rdbtnBrown = new JRadioButton("Bulbous");
		rdbtnBrown.setBounds(5, 137, 109, 23);
		contentPane.add(rdbtnBrown);

		JRadioButton rdbtnBuff = new JRadioButton("Club");
		rdbtnBuff.setBounds(116, 137, 109, 23);
		contentPane.add(rdbtnBuff);
		
		JRadioButton rdbtnCinnamon = new JRadioButton("Cup");
		rdbtnCinnamon.setBounds(227, 137, 109, 23);
		contentPane.add(rdbtnCinnamon);
		
		JRadioButton rdbtnGray= new JRadioButton("Equal");
		rdbtnGray.setBounds(5, 163, 109, 23);
		contentPane.add(rdbtnGray);
				
		JRadioButton rdbtnGreen = new JRadioButton("Rhizomorphs");
		rdbtnGreen.setBounds(116, 163, 109, 23);
		contentPane.add(rdbtnGreen);
		
		JRadioButton rdbtnPink = new JRadioButton("Rooted");
		rdbtnPink.setBounds(227, 163, 109, 23);
		contentPane.add(rdbtnPink);
		
		JRadioButton rdbtnPurple = new JRadioButton("Missing");
		rdbtnPurple.setBounds(339, 137, 109, 23);
		contentPane.add(rdbtnPurple);
		
		
		
		JLabel lblCapshap = new JLabel("Stalk-Root");
		lblCapshap.setBounds(116, 55, 198, 14);
		contentPane.add(lblCapshap);
		
		JButton btnProximo = new JButton("Proximo");
		btnProximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnBrown.isSelected()){
					i[10] = "b";
				}if (rdbtnBuff.isSelected()){
					i[10] = "c";
				}if (rdbtnCinnamon.isSelected()){
					i[10] = "u";
				}if (rdbtnGray.isSelected()){
					i[10] = "e";
				}if (rdbtnGreen.isSelected()){
					i[10] = "z";
				}if (rdbtnPink.isSelected()){
					i[10] = "r";
				}if (rdbtnPurple.isSelected()){
					i[10] = "locura";
				}

				System.out.println("escolheu a opcao " + i[10] );
				new StalkSurfaceAboveRing(i).setVisible(true);			}
		});
		btnProximo.setBounds(340, 227, 89, 23);
		contentPane.add(btnProximo);
		
		

	}
}
