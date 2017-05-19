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

public class Bruises extends JFrame {

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

	public  Bruises(String i[]) {
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
		
		JRadioButton rdbtnFibrous = new JRadioButton("Yes");
		rdbtnFibrous.setBounds(5, 137, 109, 23);
		contentPane.add(rdbtnFibrous);
		
		JRadioButton rdbtnScaly = new JRadioButton("No");
		rdbtnScaly.setBounds(227, 137, 109, 23);
		contentPane.add(rdbtnScaly);
		
		JLabel lblCapshap = new JLabel("Bruises");
		lblCapshap.setBounds(116, 55, 198, 14);
		contentPane.add(lblCapshap);
				
		JButton btnProximo = new JButton("Proximo");
		btnProximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnFibrous.isSelected()){
					i[3] = "t";
				}
			
				if (rdbtnScaly.isSelected()){
					i[3] = "f";
				}
			

				System.out.println("escolheu a opcao " + i[3] );
				new Odor(i).setVisible(true);
			}
		});
		btnProximo.setBounds(116, 210, 89, 23);
		contentPane.add(btnProximo);
	}
}
