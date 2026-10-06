package ultimorepaso;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.text.StyledEditorKit;

public class Practica6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco6 miMarco=new Marco6();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Marco6 extends JFrame
{
	private JMenuBar barraMenu;
	private JMenu fuente,estilo,tamano;
	private JTextPane miArea;
	private JPanel lienzoPrincipal;
	private Font miFuente;
	private JToolBar barraHerramientas;
	
	public Marco6()
	{
		this.setLayout(new BorderLayout());
		Toolkit ventana=Toolkit.getDefaultToolkit();
		Dimension tamagno=ventana.getScreenSize();
		int anchoVentana=tamagno.width;
		int altoVentana=tamagno.height;
		this.setSize(anchoVentana/2, altoVentana/2);
		this.setLocation(anchoVentana/4, altoVentana/4);
		
		
		
			
		
		
		barraMenu=new JMenuBar();
		fuente=new JMenu("Fuente");
		estilo=new JMenu("Estilo");
		tamano=new JMenu("Tamaño");

		creaElementosMenu("fuente","Arial","Arial",9,9);
		creaElementosMenu("fuente","Verdana","Verdana",9,9);
		creaElementosMenu("fuente","Times New Roman","Times New Roman",9,9);
		creaElementosMenu("fuente","Comic Sans MS","Comic Sans MS",9,9);
		
		creaElementosMenu("estilo","Negrita","",Font.BOLD,9);
		creaElementosMenu("estilo","Cursiva","",Font.ITALIC,9);
		
		creaElementosMenu("tamaño","12","",9,12);
		creaElementosMenu("tamaño","18","",9,18);
		creaElementosMenu("tamaño","22","",9,22);
		creaElementosMenu("tamaño","24","",9,24);
		
		barraMenu.add(fuente);
		barraMenu.add(estilo);
		barraMenu.add(tamano);
		
		lienzoPrincipal=new JPanel();
		lienzoPrincipal.setLayout(new BorderLayout());
		miArea=new JTextPane();
		miArea.setFont(new Font("Arial",Font.PLAIN,12));
		lienzoPrincipal.add(miArea,BorderLayout.CENTER);
		
		this.setJMenuBar(barraMenu);
		this.add(lienzoPrincipal,BorderLayout.CENTER);
		
		JPopupMenu barraEmergente=new JPopupMenu();
		JMenuItem negritaEmergente=new JMenuItem("Negrita",new ImageIcon("src/imagenes/negrita.jpg"));
		JMenuItem cursivaEmergente=new JMenuItem("Cursiva",new ImageIcon("src/imagenes/cursiva.jpg"));
		negritaEmergente.addActionListener(new StyledEditorKit.BoldAction());
		cursivaEmergente.addActionListener(new StyledEditorKit.ItalicAction());
		barraEmergente.add(negritaEmergente);
		barraEmergente.add(cursivaEmergente);
		miArea.setComponentPopupMenu(barraEmergente);
		
		barraHerramientas=new JToolBar();
		creaBarraHerramientas("src/imagenes/negrita.jpg").addActionListener(new StyledEditorKit.BoldAction());
		creaBarraHerramientas("src/imagenes/cursiva.jpg").addActionListener(new StyledEditorKit.ItalicAction());
		creaBarraHerramientas("src/imagenes/subrayado.jpg").addActionListener(new StyledEditorKit.UnderlineAction());
		creaBarraHerramientas("src/imagenes/aligizquierda.jpg").addActionListener(new StyledEditorKit.AlignmentAction("izq",0));
		creaBarraHerramientas("src/imagenes/aligcentro.jpg").addActionListener(new StyledEditorKit.AlignmentAction("cent",1));
		creaBarraHerramientas("src/imagenes/aligderecha.jpg").addActionListener(new StyledEditorKit.AlignmentAction("dere",2));
		creaBarraHerramientas("src/imagenes/aligjustificar.jpg").addActionListener(new StyledEditorKit.AlignmentAction("just",3));
		creaBarraHerramientas("src/imagenes/rojo.jpg").addActionListener(new StyledEditorKit.ForegroundAction("rojo",Color.RED));
		creaBarraHerramientas("src/imagenes/amarillo.jpg").addActionListener(new StyledEditorKit.ForegroundAction("amarillo",Color.YELLOW));
		creaBarraHerramientas("src/imagenes/verde.jpg").addActionListener(new StyledEditorKit.ForegroundAction("verde",Color.GREEN));
		
	
		
		
		
		this.add(barraHerramientas,BorderLayout.NORTH);
		
	}
	
	public JButton creaBarraHerramientas(String ruta)
	{
		JButton elementoHerramientas=new JButton(new ImageIcon(ruta));
		barraHerramientas.add(elementoHerramientas);
		return elementoHerramientas;
		
	}
	
	public void creaElementosMenu(String menu,String rotulo,String tipoFuente,int tipoEstilo,int tipoTamagno)
	{
		JMenuItem elementoMenu=new JMenuItem(rotulo);
		if(menu.equalsIgnoreCase("fuente"))
		{
			fuente.add(elementoMenu);
			elementoMenu.addActionListener(new StyledEditorKit.FontFamilyAction("tipoLetra",tipoFuente));
		}
		else if(menu.equalsIgnoreCase("estilo"))
		{
			estilo.add(elementoMenu);
			if(rotulo.equalsIgnoreCase("Negrita"))
			{
				elementoMenu.addActionListener(new StyledEditorKit.BoldAction());
				elementoMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
			}
			else if(rotulo.equalsIgnoreCase("Cursiva"))
			{
				elementoMenu.addActionListener(new StyledEditorKit.ItalicAction());
				elementoMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_DOWN_MASK));
			}
		}
		else if(menu.equalsIgnoreCase("tamaño"))
		{
			tamano.add(elementoMenu);
			elementoMenu.addActionListener(new StyledEditorKit.FontSizeAction("tamLetra",tipoTamagno));
		}
		
		
	}
	
	
	
}
