package ultimorepaso;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class Practica2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco2 miMarco=new Marco2();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Marco2 extends JFrame
{
	
	private JMenuBar barraMenu;
	private JMenu menu;
	private JPanel lamina;
	private JButton botonRojo,botonAmarillo,botonVerde;
	private JToolBar barraHerramientas;
	
	public Marco2()
	{
		Toolkit ventana=Toolkit.getDefaultToolkit();
		lamina=new JPanel();
		Dimension tamagno=ventana.getScreenSize();
		int anchoVentana=tamagno.width;
		int altoVentana=tamagno.height;
		this.setSize(anchoVentana/2, altoVentana/2);
		this.setLocation(anchoVentana/4, altoVentana/4);
		
		EventoAccion2 colorRojo=new EventoAccion2("Rojo",new ImageIcon("src/imagenes/rojo.jpg"),Color.RED,lamina);
		EventoAccion2 colorAmarillo=new EventoAccion2("Amarillo",new ImageIcon("src/imagenes/amarillo.jpg"),Color.YELLOW,lamina);
		EventoAccion2 colorVerde=new EventoAccion2("Verde",new ImageIcon("src/imagenes/verde.jpg"),Color.GREEN,lamina);
		
		barraMenu=new JMenuBar();
		menu=new JMenu("Color");
		menu.add(colorRojo);
		menu.add(colorAmarillo);
		menu.add(colorVerde);
		barraMenu.add(menu);
		this.setJMenuBar(barraMenu);
		
		barraHerramientas=new JToolBar();
		barraHerramientas.add(colorRojo);
		barraHerramientas.add(colorAmarillo);
		barraHerramientas.add(colorVerde);
		this.add(barraHerramientas,BorderLayout.NORTH);
		
		
		
		
		botonRojo=new JButton("Rojo");
		botonAmarillo=new JButton("Amarillo");
		botonVerde=new JButton("Verde");
		lamina.add(botonRojo);
		lamina.add(botonAmarillo);
		lamina.add(botonVerde);
		this.add(lamina);
		
	}
	
	private class EventoAccion2 extends AbstractAction
	{
		
		private JPanel laminaColor;

		public EventoAccion2(String nombre,Icon imagen,Color c,JPanel miLamina)
		{
			putValue(Action.NAME,nombre);
			putValue(Action.SMALL_ICON,imagen);
			putValue(Action.SHORT_DESCRIPTION,"El color de fondo es "+nombre);
			putValue("color_fondo",c);
			laminaColor=miLamina;
		}
		public void actionPerformed(ActionEvent e) {
			
			laminaColor.setBackground((Color) getValue("color_fondo"));
			
		}
		
	}
}
