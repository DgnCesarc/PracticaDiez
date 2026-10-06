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

public class Practica7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco7 miMarco=new Marco7();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Marco7 extends JFrame
{
	public Marco7()
	{
		Toolkit ventana=Toolkit.getDefaultToolkit();
		Dimension tamagno=ventana.getScreenSize();
		int anchoVentana=tamagno.width;
		int altoVentana=tamagno.height;
		this.setSize(anchoVentana/2, altoVentana/2);
		this.setLocation(anchoVentana/4, altoVentana/4);
		Lienzo7 miLienzo=new Lienzo7();
		this.add(miLienzo);
		
	}
}

class Lienzo7 extends JPanel
{
	private Box cajaH1,cajaH2,cajaH3,cajaVertical;
	private JLabel usuario,password;
	private JTextField cusuario,cpassword;
	private JButton enviar,cancelar;
	
	public Lienzo7()
	{
		this.setLayout(new BorderLayout());
		usuario=new JLabel("Usuario");
		cusuario=new JTextField(10);
		cusuario.setMaximumSize(cusuario.getPreferredSize());
		
		password=new JLabel("Password");
		cpassword=new JTextField(10);
		cpassword.setMaximumSize(cpassword.getPreferredSize());
		cajaH2=Box.createHorizontalBox();
		
		cajaH1=Box.createHorizontalBox();
		cajaH1.add(usuario);
		cajaH1.add(Box.createHorizontalStrut(15));
		cajaH1.add(cusuario);
		
		cajaH2.add(password);
		cajaH2.add(cajaH2.createHorizontalStrut(15));
		cajaH2.add(cpassword);
		
		enviar=new JButton("Enviar");
		cancelar=new JButton("Cancelar");
		cajaH3=Box.createHorizontalBox();
		cajaH3.add(enviar);
		cajaH3.add(cajaH3.createGlue());
		cajaH3.add(cancelar);
		
		
		cajaVertical=Box.createVerticalBox();
		cajaVertical.add(cajaH1);
		cajaVertical.add(cajaVertical.createVerticalStrut(5));
		cajaVertical.add(cajaH2);
		cajaVertical.add(cajaVertical.createVerticalStrut(5));
		cajaVertical.add(cajaH3);
		
		this.add(cajaVertical, BorderLayout.CENTER);
	}
}



























