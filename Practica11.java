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

public class Practica11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco11 miMarco=new Marco11();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Marco11 extends JFrame
{
	public Marco11()
	{
		Toolkit ventana=Toolkit.getDefaultToolkit();
		Dimension tamagno=ventana.getScreenSize();
		int anchoVentana=tamagno.width;
		int altoVentana=tamagno.height;
		this.setSize(anchoVentana/2, altoVentana/2);
		this.setLocation(anchoVentana/4, altoVentana/4);
		Lienzo11 miLienzo=new Lienzo11();
		this.add(miLienzo);
	}
}


class Lienzo11 extends JPanel
{
	private JLabel usuario,password,correo;
	private JTextField cusuario,cpassword,ccorreo;
	
	public Lienzo11()
	{
		this.setLayout(new OrdenaComponentes11());
		usuario=new JLabel("Usuario");
		cusuario=new JTextField();
		password=new JLabel("Password");
		cpassword=new JTextField();
		correo=new JLabel("Correo");
		ccorreo=new JTextField();
		this.add(usuario);
		this.add(cusuario);
		this.add(password);
		this.add(cpassword);
		this.add(correo);
		this.add(ccorreo);
		
	}
}

class OrdenaComponentes11 implements LayoutManager
{
	
	private int x;
	private int y=20;

	@Override
	public void addLayoutComponent(String name, Component comp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeLayoutComponent(Component comp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Dimension preferredLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dimension minimumLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void layoutContainer(Container miContenedor) {
		
		int d=miContenedor.getWidth();
		x=d/2;
		int contador=0;
		int n=miContenedor.getComponentCount();
		for(int i=0;i<n;i++)
		{
			contador ++;
			miContenedor.getComponent(i).setBounds(x-120, y, 120, 20);
			x+=100;
			if(contador%2==0)
			{
				x=d/2;
				y+=40;
			}
		}
		
	}
	
}
