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

public class CapShape extends JFrame {

	private JPanel contentPane;
	String i[] = new String[22];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CapShape frame = new CapShape();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CapShape() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblClassificadorDeCogumelos = new JLabel("Classificador de Cogumelos");
		lblClassificadorDeCogumelos.setBounds(5, 5, 424, 14);
		contentPane.add(lblClassificadorDeCogumelos);
		
		JRadioButton rdbtnBell = new JRadioButton("Bell");
		rdbtnBell.setBounds(5, 137, 109, 23);
		contentPane.add(rdbtnBell);

		
		JRadioButton rdbtnConical = new JRadioButton("Conical");
		rdbtnConical.setBounds(116, 137, 109, 23);
		contentPane.add(rdbtnConical);
		
		JRadioButton rdbtnConvex = new JRadioButton("Convex");
		rdbtnConvex.setBounds(227, 137, 109, 23);
		contentPane.add(rdbtnConvex);
		
		JRadioButton rdbtnFlat = new JRadioButton("Flat");
		rdbtnFlat.setBounds(5, 163, 109, 23);
		contentPane.add(rdbtnFlat);
		
		JRadioButton rdbtnKnobbed = new JRadioButton("Knobbed");
		rdbtnKnobbed.setBounds(116, 163, 109, 23);
		contentPane.add(rdbtnKnobbed);
		
		JRadioButton rdbtnSunken = new JRadioButton("Sunken");
		rdbtnSunken.setBounds(227, 163, 109, 23);
		contentPane.add(rdbtnSunken);
		
		JLabel lblCapshap = new JLabel("Cap-Shape");
		lblCapshap.setBounds(116, 55, 198, 14);
		contentPane.add(lblCapshap);
		
		JButton btnProximo = new JButton("Proximo");
		btnProximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnBell.isSelected()){
					i[0] = "b";
				}
				if (rdbtnConical.isSelected()){
					i[0] = "c";
				}
				if (rdbtnConvex.isSelected()){
					i[0] = "x";
				}
				if (rdbtnFlat.isSelected()){
					i[0] = "f";
				}
				if (rdbtnKnobbed.isSelected()){
					i[0] = "k";
				}
				if (rdbtnSunken.isSelected()){
					i[0] = "s";
				}
				System.out.println("escolheu a opcao " + i[0] );
				new CapSurface(i).setVisible(true);
			}
		});
		btnProximo.setBounds(116, 210, 89, 23);
		contentPane.add(btnProximo);
	}
}
