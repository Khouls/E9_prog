package exemplos.ex1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Cursor;

public class Ex1Main {

	private JFrame frame;
	private JPanel panel_0;
	private JPanel panel_1;
	private JTextField txtUsuario;
	private JLabel lblNomeDoUsurio;
	private JLabel lblMensagem;
	private JPanel panel_2;
	private JButton btnProximo_1;
	private JButton btnAnterior_1;
	private JLabel msgSecreta;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex1Main window = new Ex1Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ex1Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		panel_0 = new JPanel();
		frame.getContentPane().add(panel_0, "name_152502752653200");
		panel_0.setLayout(null);
		
		JButton btnProximo = new JButton("Proximo");
		btnProximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_1.setVisible(true);
				panel_0.setVisible(false);
				panel_2.setVisible(false);
				String u = txtUsuario.getText();
				lblMensagem.setText(u);
			}
		});
		btnProximo.setBounds(172, 112, 89, 23);
		panel_0.add(btnProximo);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(47, 81, 137, 20);
		panel_0.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		lblNomeDoUsurio = new JLabel("Nome Do Usu\u00E1rio");
		lblNomeDoUsurio.setBounds(37, 56, 131, 14);
		panel_0.add(lblNomeDoUsurio);
		
		panel_1 = new JPanel();
		panel_1.setVisible(false);
		panel_1.setOpaque(false);
		panel_1.setBorder(null);
		panel_1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		frame.getContentPane().add(panel_1, "name_152505109759900");
		panel_1.setLayout(null);
		
		JButton btnAnterior = new JButton("Anterior");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_0.setVisible(true);
				panel_1.setVisible(false);
				panel_2.setVisible(false);
			}
		});
		btnAnterior.setBounds(0, 0, 89, 23);
		panel_1.add(btnAnterior);
		
		lblMensagem = new JLabel("Mensagem:");
		lblMensagem.setBounds(0, 215, 429, 35);
		panel_1.add(lblMensagem);
		
		btnProximo_1 = new JButton("Proximo");
		btnProximo_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_2.setVisible(true);
				panel_0.setVisible(false);
				panel_1.setVisible(false);
			}
		});
		btnProximo_1.setBounds(163, 11, 89, 23);
		panel_1.add(btnProximo_1);
		
		btnNewButton = new JButton("");
		btnNewButton.setFocusTraversalPolicyProvider(true);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		btnNewButton.setBorder(null);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				msgSecreta.setText("Parabéins");
			}
		});
		btnNewButton.setBounds(465, 199, 36, 10);
		panel_1.add(btnNewButton);
		
		panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, "name_153643417671900");
		panel_2.setLayout(null);
		
		btnAnterior_1 = new JButton("Anterior");
		btnAnterior_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(true);
				panel_0.setVisible(false);
				panel_2.setVisible(false);
			}
		});
		btnAnterior_1.setBounds(335, 11, 89, 23);
		panel_2.add(btnAnterior_1);
		
		msgSecreta = new JLabel("");
		msgSecreta.setFocusable(false);
		msgSecreta.setBounds(121, 153, 178, 14);
		panel_2.add(msgSecreta);
	}
}
