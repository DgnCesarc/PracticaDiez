package ultimorepaso;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Spring;
import javax.swing.SpringLayout;

public class Practica8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco8 miMarco=new Marco8();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Marco8 extends JFrame
{
	public Marco8()
	{
		Toolkit ventana=Toolkit.getDefaultToolkit();
		Dimension tamagno=ventana.getScreenSize();
		int anchoVentana=tamagno.width;
		int altoVentana=tamagno.height;
		this.setSize(anchoVentana/2, altoVentana/2);
		this.setLocation(anchoVentana/4, altoVentana/4);
		Lienzo8 miLienzo=new Lienzo8();
		this.add(miLienzo);
		
	}
}

class Lienzo8 extends JPanel
{
	private JButton boton1,boton2,boton3;
	public Lienzo8()
	{
		SpringLayout miLayout=new SpringLayout();
		this.setLayout(miLayout);
		
		Spring miMuelle=Spring.constant(0, 10, 100);
		
		boton1=new JButton("Boton 1");
		boton2=new JButton("Boton 2");
		boton3=new JButton("Boton 3");
		this.add(boton1);
		this.add(boton2);
		this.add(boton3);
		
		miLayout.putConstraint(SpringLayout.WEST, boton1, miMuelle, SpringLayout.WEST, this);
		
		miLayout.putConstraint(SpringLayout.WEST, boton2, miMuelle, SpringLayout.EAST, boton1);
		
		miLayout.putConstraint(SpringLayout.WEST, boton3, miMuelle, SpringLayout.EAST, boton2);
		
		miLayout.putConstraint(SpringLayout.EAST, this, miMuelle, SpringLayout.EAST, boton3);
		
	}
}
