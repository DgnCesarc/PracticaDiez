package ultimorepaso;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Practica9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco9 miMarco=new Marco9();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Marco9 extends JFrame
{
	public Marco9()
	{
		Toolkit ventana=Toolkit.getDefaultToolkit();
		Dimension tamagno=ventana.getScreenSize();
		int anchoVentana=tamagno.width;
		int altoVentana=tamagno.height;
		this.setSize(anchoVentana/2, altoVentana/2);
		this.setLocation(anchoVentana/4, altoVentana/4);
		Lienzo9 miLienzo=new Lienzo9();
		this.add(miLienzo);
	}
}

class Lienzo9 extends JPanel
{
	
	private JLabel nombre,apellido;
	private JTextField cNombre,cApellido;
	
	public Lienzo9()
	{
		this.setLayout(new OrdenaComponentes());
		nombre=new JLabel("Nombre");
		cNombre=new JTextField();
		apellido=new JLabel("Apellido");
		cApellido=new JTextField();
		
		this.add(nombre);
		this.add(cNombre);
		this.add(apellido);
		this.add(cApellido);
	}
}

class OrdenaComponentes implements LayoutManager
{

	
	public void addLayoutComponent(String name, Component comp) {
		
		
	}

	
	public void removeLayoutComponent(Component comp) {
		
		
	}

	
	public Dimension preferredLayoutSize(Container parent) {
		
		return null;
	}

	
	public Dimension minimumLayoutSize(Container parent) {
		
		return null;
	}

	
	public void layoutContainer(Container miContenedor) {
		
		int contador=0;
		int n=miContenedor.getComponentCount();
		for(int i=0;i<n;i++)
		{
			contador++;
			Component c=miContenedor.getComponent(i);
			c.setBounds(x, y, 100, 30);
			x+=100;
			if(contador %2==0)
			{
				x=20;
				y=80;
			}
			
		}
	}
	
	private int x=20;
	private int y=20;
	
}
