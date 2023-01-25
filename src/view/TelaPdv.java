package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaPdv  extends JFrame{
	
	ImageIcon imagen1 = new ImageIcon(getClass().getResource("Frame1.png"));
	JLabel label = new JLabel(imagen1);
	JButton botao1 = new JButton("1"); 
		
	
	
	
	private  TelaPdv() {
		
		//inicio da janela
		setSize(1200, 850);
		setTitle(" nova farmacia");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		
		setLayout(null);
		
		//tela fundo
		label.setBounds(0, 0, 1200, 800);
		add(label);
		
		
		//botoes
		botao1.setBounds(658, 544, 130, 70);
		botao1.setForeground(Color.magenta);
		//botao1.setOpaque(false);
		botao1.setContentAreaFilled(false);
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

				botao1.setText("ola");
			}
		});
		add(botao1);
		
		
		
		
		
		
		
		//fim da janela
		setVisible(true);
	}
	public static void main(String[] args) {
		new TelaPdv();
	}
}
