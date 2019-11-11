package exercicios.e1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JSlider;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Main {

	private JFrame frame;
	private JPanel menu;
	private JPanel cadastro;
	private JPanel remocao;
	private JPanel consulta;
	private JTextField nomeBanda;
	private JLabel lblCadastro;
	private JLabel lblNome;
	private JLabel label;
	private JTextField integrantes_banda;
	private JButton btnCadastrar;
	private JButton btnMenuCadastro;
	private JTextArea txtAreaConsulta;
	private JSlider slider;
	private JTextPane textPaneRemocao;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ArrayList<Banda> bandas = new ArrayList<Banda>();
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("res\\B.png"));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		menu = new JPanel();
		frame.getContentPane().add(menu, "name_155381106714000");
		menu.setLayout(null);
		
		JButton cadastrar = new JButton("Cadastrar nova banda");
		cadastrar.setIcon(new ImageIcon("C:\\Users\\guilherme.flach\\Desktop\\WokeSpace\\T3_Aula09\\res\\B.png"));
		cadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastro.setVisible(true);
				menu.setVisible(false);
			}
		});
		cadastrar.setBounds(133, 12, 278, 59);
		menu.add(cadastrar);
		
		JButton consultar = new JButton("Consultar bandas");
		consultar.setIcon(new ImageIcon("C:\\Users\\guilherme.flach\\Desktop\\WokeSpace\\T3_Aula09\\res\\B.png"));
		consultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consulta.setVisible(true);
				menu.setVisible(false);
				txtAreaConsulta.setText("");
				for (int i = 0; i < bandas.size(); i++) {
					Banda banda = bandas.get(i);
					txtAreaConsulta.append(banda.getNome());
					txtAreaConsulta.append("");
					txtAreaConsulta.append(banda.getIntegrantes());
					txtAreaConsulta.append("\n");
				}
			}
		});
		consultar.setBounds(40, 46, 138, 35);
		menu.add(consultar);
		
		JButton remover = new JButton("Remover uma banda");
		remover.setIcon(new ImageIcon("C:\\Users\\guilherme.flach\\Desktop\\WokeSpace\\T3_Aula09\\res\\B.png"));
		remover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				remocao.setVisible(true);
				menu.setVisible(false);
				slider.setMaximum(bandas.size()-1);
			}
		});
		remover.setBounds(184, 82, 215, 204);
		menu.add(remover);
		
		JButton sair = new JButton("Sair do programa");
		sair.setIcon(new ImageIcon("C:\\Users\\guilherme.flach\\Desktop\\WokeSpace\\T3_Aula09\\res\\B.png"));
		sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		sair.setBounds(-77, 82, 338, 214);
		menu.add(sair);
		
		Jpanel_Background background = new Jpanel_Background();
		background.setBounds(0, 0, 434, 261);
		menu.add(background);
		
		JLabel label_1 = new JLabel(".");
		label_1.setBounds(0, 0, 434, 261);
		menu.add(label_1);
		
		cadastro = new JPanel();
		frame.getContentPane().add(cadastro, "name_155382432865900");
		cadastro.setLayout(null);
		
		nomeBanda = new JTextField();
		nomeBanda.setBounds(50, 97, 338, 20);
		cadastro.add(nomeBanda);
		nomeBanda.setColumns(10);
		
		lblCadastro = new JLabel("Cadastro");
		lblCadastro.setFont(new Font("Monotype Corsiva", Font.BOLD | Font.ITALIC, 39));
		lblCadastro.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastro.setBounds(10, 11, 414, 41);
		cadastro.add(lblCadastro);
		
		lblNome = new JLabel("Integrantes");
		lblNome.setFont(new Font("Gill Sans MT", Font.BOLD | Font.ITALIC, 35));
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome.setBounds(83, 117, 258, 54);
		cadastro.add(lblNome);
		
		label = new JLabel("Nome");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Italic", Font.BOLD | Font.ITALIC, 35));
		label.setBounds(73, 49, 228, 54);
		cadastro.add(label);
		
		integrantes_banda = new JTextField();
		integrantes_banda.setFont(new Font("Swis721 Blk BT", Font.ITALIC, 5));
		integrantes_banda.setColumns(10);
		integrantes_banda.setBounds(50, 173, 338, 20);
		cadastro.add(integrantes_banda);
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] integrantes = integrantes_banda.getText().split(" ");
				String nome = nomeBanda.getText();
				Banda b = new Banda(nome, integrantes);
				bandas.add(b);
				txtAreaConsulta.setText("");
				for (int i = 0; i < bandas.size(); i++) {
					Banda banda = bandas.get(i);
					txtAreaConsulta.append(banda.getNome());
					txtAreaConsulta.append("");
					txtAreaConsulta.append(banda.getIntegrantes());
					txtAreaConsulta.append("\n");
					
				}
				
			}
		});
		btnCadastrar.setForeground(new Color(0, 102, 51));
		btnCadastrar.setBackground(new Color(204, 0, 51));
		btnCadastrar.setBounds(165, 227, 332, 23);
		cadastro.add(btnCadastrar);
		
		btnMenuCadastro = new JButton("Menu");
		btnMenuCadastro.setFont(new Font("Sitka Banner", Font.PLAIN, 33));
		btnMenuCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu.setVisible(true);
				cadastro.setVisible(false);
			}
		});
		btnMenuCadastro.setBounds(10, 204, 89, 23);
		cadastro.add(btnMenuCadastro);
		
		remocao = new JPanel();
		frame.getContentPane().add(remocao, "name_155384023382100");
		remocao.setLayout(null);
		
		slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				try {
					textPaneRemocao.setText(bandas.get(slider.getValue()).toString());
				} catch (Exception e) {
					// TODO: handle exception
				}

			}
		});
		slider.setMinimum(0);
		slider.setMaximum(bandas.size()-1);
		slider.setBounds(151, 27, 200, 26);
		remocao.add(slider);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int banda_remover = slider.getValue();
				bandas.remove(banda_remover);
				slider.setMaximum(bandas.size()-1);
				
			}
		});
		btnRemover.setBackground(new Color(0, 153, 0));
		btnRemover.setForeground(new Color(0, 102, 51));
		btnRemover.setBounds(178, 149, 89, 139);
		remocao.add(btnRemover);
		
		JButton menuRemocao = new JButton("Menu");
		menuRemocao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu.setVisible(true);
				remocao.setVisible(false);
			}
		});
		menuRemocao.setFont(new Font("Arial Narrow", Font.BOLD, 40));
		menuRemocao.setBackground(new Color(204, 0, 51));
		menuRemocao.setBounds(30, 62, 89, 23);
		remocao.add(menuRemocao);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(151, 65, 200, 73);
		remocao.add(scrollPane);
		
		textPaneRemocao = new JTextPane();
		scrollPane.setViewportView(textPaneRemocao);
		textPaneRemocao.setFocusTraversalKeysEnabled(false);
		textPaneRemocao.setFocusable(false);
		textPaneRemocao.setEditable(false);
		textPaneRemocao.setFocusCycleRoot(false);
		
		consulta = new JPanel();
		frame.getContentPane().add(consulta, "name_155385821211700");
		consulta.setLayout(null);
		
		JButton menuConsulta = new JButton("menu");
		menuConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu.setVisible(true);
				consulta.setVisible(false);
			}
		});
		menuConsulta.setFont(new Font("Segoe UI Semilight", Font.BOLD, 24));
		menuConsulta.setBounds(0, -40, 34, 301);
		consulta.add(menuConsulta);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(32, 0, 411, 261);
		consulta.add(scrollPane_1);
		
		txtAreaConsulta = new JTextArea();
		scrollPane_1.setViewportView(txtAreaConsulta);
	}
}
