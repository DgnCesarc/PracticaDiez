package ultimorepaso;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoPrueba miMarco=new MarcoPrueba();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoPrueba extends JFrame
{
	private JButton boton;
	
	public MarcoPrueba()
	{
		this.setSize(500, 300);
		this.setLocation(200, 200);
		boton=new JButton("Bton Prueba");
		this.add(boton);
	}
}
