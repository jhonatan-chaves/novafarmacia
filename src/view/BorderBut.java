package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class BorderBut extends JButton {

	public BorderBut() {
		
		setContentAreaFilled(false);
		setBackground(new Color(220, 220, 220));
		setRadius(20);
		setBorderPainted(false);
		setFocusPainted(false);
	   
	    
	    addMouseListener(new MouseAdapter() {
	    	public void mouseEntered(MouseEvent me) {
	    		setBackground(colorOver);
	    		over = true;
	    	}
	    	public void mouseExited(MouseEvent me) {
	    		
	    		setBackground(new Color(220, 220, 220));
	    		over = false;
	    	}
	    	
	    	public void mousePressed(MouseEvent me) {
	    		setBackground(colorClick);
	    	}
	    	
	    	public void mouseReleased(MouseEvent me) {
	    		if (over) {
	    			setBackground(colorOver);
	    		}else {
	    			setBackground(color);
	    		}
	    	}
	    	
	    	
		});

	}

	

	private boolean over;
	private Color color;
	private Color colorOver;
	private Color colorClick;
	private Color borderColor;
	private int radius = 0;
	
	

	public Color getBorderColor() {
		return borderColor;
	}

	public void setBorderColor(Color borderColor) {
		this.borderColor = borderColor;
	}

	public boolean isOver() {
		return over;
	}

	public void setOver(boolean over) {
		this.over = over;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Color getColorOver() {
		return colorOver;
	}

	public void setColorOver(Color colorOver) {
		this.colorOver = colorOver;
	}

	public Color getColorClick() {
		return colorClick;
	}

	public void setColorClick(Color colorClick) {
		this.colorClick = colorClick;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	protected void paintComponent(Graphics grphcs) {
		
		Graphics2D g2 = (Graphics2D)grphcs;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		// paint border
		
		g2.setColor(borderColor);
		g2.fillRoundRect(0,  0, getWidth(), getHeight(), radius, radius);
		g2.setColor(getBackground());
		//border set 2 pixls
		g2.fillRoundRect(2, 2, getWidth() - 4, getHeight() -4, radius, radius);
		
		super.paintComponent(grphcs);
	}
	
	

}
