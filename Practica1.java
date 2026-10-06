package ultimorepaso;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class Practica1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco1 miMarco=new Marco1();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Marco1 extends JFrame
{
	public Marco1()
	{
		Toolkit ventana=Toolkit.getDefaultToolkit();
		Dimension tamagno=ventana.getScreenSize();
		int anchoVentana=tamagno.width;
		int altoVentana=tamagno.height;
		this.setSize(anchoVentana/2, altoVentana/2);
		this.setLocation(anchoVentana/4, altoVentana/4);
		Lienzo1 miLienzo=new Lienzo1();
		this.add(miLienzo);
		
	}
}

class Lienzo1 extends JPanel
{
	private JMenuBar barraMenu;
	private JMenu menu;
	private JToolBar barraHerramientas;
	private JPanel lienzoSuperior;
	
	public Lienzo1()
	{
		this.setLayout(new BorderLayout());
		lienzoSuperior=new JPanel();
		lienzoSuperior.setLayout(new GridLayout(2,1));
		EventoAccion colorRojo=new EventoAccion("Rojo",new ImageIcon("src/imagenes/rojo.jpg"),Color.RED);
		EventoAccion colorAmarillo=new EventoAccion("Amarillo",new ImageIcon("src/imagenes/amarillo.jpg"),Color.YELLOW);
		EventoAccion colorVerde=new EventoAccion("Verde",new ImageIcon("src/imagenes/verde.jpg"),Color.GREEN);
		
		barraMenu=new JMenuBar();
		menu=new JMenu("Color");
		menu.add(colorRojo);
		menu.add(colorAmarillo);
		menu.add(colorVerde);
		barraMenu.add(menu);
		lienzoSuperior.add(barraMenu);
		
		
		
		barraHerramientas=new JToolBar();
		barraHerramientas.add(colorRojo);
		barraHerramientas.add(colorAmarillo);
		barraHerramientas.add(colorVerde);
		lienzoSuperior.add(barraHerramientas);
		this.add(lienzoSuperior,BorderLayout.NORTH);
		
		
	}
	
	private class EventoAccion extends AbstractAction
	{

		public EventoAccion(String nombre,Icon imagen,Color c)
		{
			putValue(Action.NAME,nombre);
			putValue(Action.SMALL_ICON,imagen);
			putValue(Action.SHORT_DESCRIPTION,"El color de fondo es "+nombre);
			putValue("color_fondo",c);
		}
		public void actionPerformed(ActionEvent e) {
			
			setBackground((Color)getValue("color_fondo"));
		}
		
	}
}
















