package ultimorepaso;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Practica5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco5 miMarco=new Marco5();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Marco5 extends JFrame
{
	public Marco5()
	{
		Toolkit ventana=Toolkit.getDefaultToolkit();
		Dimension tamagno=ventana.getScreenSize();
		int anchoVentana=tamagno.width;
		int altoVentana=tamagno.height;
		this.setSize(anchoVentana/2, altoVentana/2);
		this.setLocation(anchoVentana/4, altoVentana/4);
		Lienzo5 miLienzo=new Lienzo5();
		this.add(miLienzo);
	}
}

class Lienzo5 extends JPanel
{
	private Box cajaH1,cajaH2,cajaH3,cajaVertical;
	private JLabel usuario,pass;
	private JTextField cajaUsuario,cajaPass;
	private JButton enviar,cancelar;
	public Lienzo5()
	{
		this.setLayout(new BorderLayout());
		usuario=new JLabel("Usuario");
		pass=new JLabel("Password");
		cajaUsuario=new JTextField(10);
		cajaUsuario.setMaximumSize(cajaUsuario.getPreferredSize());
		cajaPass=new JTextField(10);
		cajaPass.setMaximumSize(cajaPass.getPreferredSize());
		enviar=new JButton("Enviar");
		cancelar=new JButton("Cancelar");
		
		cajaH1=Box.createHorizontalBox();
		cajaH1.add(usuario);
		cajaH1.add(Box.createHorizontalStrut(15));
		cajaH1.add(cajaUsuario);
		
		cajaH2=Box.createHorizontalBox();
		cajaH2.add(pass);
		cajaH2.add(Box.createHorizontalStrut(15));
		cajaH2.add(cajaPass);
		
		cajaH3=Box.createHorizontalBox();
		cajaH3.add(enviar);
		cajaH3.add(Box.createGlue());
		cajaH3.add(cancelar);
		
		cajaVertical=Box.createVerticalBox();
		cajaVertical.add(cajaH1);
		cajaVertical.add(cajaH2);
		cajaVertical.add(cajaH3);
		
		this.add(cajaVertical,BorderLayout.CENTER);
		
	}
}
