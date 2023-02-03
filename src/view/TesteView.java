package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TesteView extends JFrame {

	private String imagePane1 = "imagen11.png";
	
	
	
	JTextField codigoProduto = new JTextField();

	private void digitar(String caractere) {
		if (codigoProduto.getText().equals("0,00")) {
			codigoProduto.setText(caractere);
		}else {
			if(caractere.equals(",") && codigoProduto.getText().contains(",")) {
				
			}else {
				codigoProduto.setText(codigoProduto.getText().concat(caractere));
			}
		}
	}
	
	//botoes numericos
	BorderBut botao1 = new BorderBut();
	BorderBut botao2 = new BorderBut();
	BorderBut botao3 = new BorderBut();
	BorderBut botao4 = new BorderBut();
	BorderBut botao5 = new BorderBut();
	BorderBut botao6 = new BorderBut();
	BorderBut botao7 = new BorderBut();
	BorderBut botao8 = new BorderBut();
	BorderBut botao9 = new BorderBut();
	BorderBut botao0 = new BorderBut();
	BorderBut botaoVirgula = new BorderBut();
	BorderBut botaoX = new BorderBut();
	
	//botoes especificos
	
	BorderBut bmenu = new BorderBut();
	BorderBut bTotal = new BorderBut();
	BorderBut bEntrar = new BorderBut();
	BorderBut bCancelar = new BorderBut();
	BorderBut bLimpar = new BorderBut();
	BorderBut bPbm = new BorderBut();
	BorderBut bGerencia = new BorderBut();

	public TesteView() {

		setSize(1150, 850);
		setTitle(" nova farmacia");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);

		ImagePanel imagePanel = new ImagePanel(imagePane1);
		this.setContentPane(imagePanel);

		setLayout(null);
		
		
		
		codigoProduto.setBounds(640, 100, 150, 150);
        codigoProduto.setText("0,00");
		// botoes numericos
		botao1.setBounds(640, 455, 109, 68);
		botao1.setText("1");
		botao1.setFont(new Font("Arial black", ABORT, 25));
		botao1.setColorOver(new Color(90, 200,78));
	    botao1.setColorClick(new Color(215, 215, 21));
		botao1.setBorderColor(new Color(220, 220, 220));
		botao1.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				digitar("1");
			  
				
			}
		});
		
		botao2.setBounds(764, 455, 110, 68);
		botao2.setText("2");
		botao2.setFont(new Font("Arial black", ABORT, 25));
		
		botao3.setBounds(890, 455, 110, 68);
		botao3.setText("3");
		botao3.setFont(new Font("Arial black", ABORT, 25));
		
		botao4.setBounds(640, 377, 110, 68);
		botao4.setText("4");
		botao4.setFont(new Font("Arial black", ABORT, 25));
		
		botao5.setBounds(764, 377, 110, 68);
		botao5.setText("5");
		botao5.setFont(new Font("Arial black", ABORT, 25));
		
		botao6.setBounds(890, 377, 110, 68);
		botao6.setText("6");
		botao6.setFont(new Font("Arial black", ABORT, 25));
		
		
		botao7.setBounds(640, 300, 110, 68);
		botao7.setText("7");
		botao7.setFont(new Font("Arial black", ABORT, 25));
		
		botao8.setBounds(764, 300, 110, 68);
		botao8.setText("8");
		botao8.setFont(new Font("Arial black", ABORT, 25));
		
		botao9.setBounds(890, 300, 110, 68);
		botao9.setText("9");
		botao9.setFont(new Font("Arial black", ABORT, 25));
		

		botaoX.setBounds(640, 532, 110, 68);
		botaoX.setText("X");
		botaoX.setFont(new Font("Arial black", ABORT, 25));
		
		botao0.setBounds(764, 532, 110, 68);
		botao0.setText("0");
		botao0.setFont(new Font("Arial black", ABORT, 25));
		
		botaoVirgula.setBounds(890, 532, 110, 68);
		botaoVirgula.setText(",");
		botaoVirgula.setFont(new Font("Arial black", ABORT, 25));
		
		//botoes especificos
		
		bGerencia.setBounds(640, 223, 110, 68);
		bGerencia.setText("GERENCIA");
		bGerencia.setFont(new Font("Arial black", ABORT, 13));
		
		bPbm.setBounds(764, 223, 110, 68);
		bPbm.setText("PBM");
		bPbm.setFont(new Font("Arial black", ABORT, 20));
		
		bTotal.setBounds(890, 223, 110, 68);
		bTotal.setText("TOTAL");
		bTotal.setFont(new Font("Arial black", ABORT, 20));
		bTotal.setBackground(new Color(65,65,65));
		
		
		

		//adiciona a tela
		
		//adicionando botoes numericos
		add(codigoProduto);
		add(botao1);
		add(botao2);
		add(botao3);
		add(botao4);
		add(botao5);
		add(botao6);
		add(botao7);
		add(botao8);
		add(botao9);
		add(botaoX);
		add(botao0);
		add(botaoVirgula);
		
		//adicionando botoes especificos
		add(bGerencia);
		add(bPbm);
		add(bTotal);

		setVisible(true);

	}

	public static void main(String[] args) {
		new TesteView();
	}

}
