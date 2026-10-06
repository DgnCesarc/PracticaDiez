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

public class Practica10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco10 miMarco=new Marco10();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class Marco10 extends JFrame
{
	public Marco10()
	{
		Toolkit ventana=Toolkit.getDefaultToolkit();
		Dimension tamagno=ventana.getScreenSize();
		int anchoVentana=tamagno.width;
		int altoVentana=tamagno.height;
		this.setSize(anchoVentana/2, altoVentana/2);
		this.setLocation(anchoVentana/4, altoVentana/4);
		
		Lienzo10 miLienzo=new Lienzo10();
		this.add(miLienzo);
		
	}
}

class Lienzo10 extends JPanel
{
	private JLabel usuario,password,correo;
	private JTextField cUsuario,cPassword,ccorreo;
	
	
	public Lienzo10()
	{
		this.setLayout(new OrdenaElementos() );
		usuario=new JLabel("Usuario");
		cUsuario=new JTextField();
		password=new JLabel("Password");
		cPassword=new JTextField();
		correo=new JLabel("Correo");
		ccorreo=new JTextField();
		
		this.add(usuario);
		this.add(cUsuario);
		this.add(password);
		this.add(cPassword);
		this.add(correo);
		this.add(ccorreo);
	}
}

class OrdenaElementos implements LayoutManager
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
		
		int d=miContenedor.getWidth();
		x=d/2;
		int contador=0;
		int n=miContenedor.getComponentCount();
		
		for(int i=0;i<n;i++)
		{
			contador++;
			Component c=miContenedor.getComponent(i);
			c.setBounds(x-120, y, 120, 20);
			x+=140;
			if(contador%2==0)
			{
				x=d/2;
				y+=60;
			}
			
		}
	}
	
	private int x;
	private int y=20;
	
}


























