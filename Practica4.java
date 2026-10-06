package ultimorepaso;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
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
import javax.swing.SwingConstants;
import javax.swing.text.StyledEditorKit;

public class Practica4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco4 miMarco=new Marco4();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class Marco4 extends JFrame
{
	private JMenuBar barraMenu;
	private JMenu fuente,estilo,tam;
	private JPanel laminaPrincipal;
	private JTextPane miArea;
	private JToolBar barraHerramientas;
	
	public Marco4()
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
		tam=new JMenu("Tamaño");
		
		barraMenu.add(fuente);
		barraMenu.add(estilo);
		barraMenu.add(tam);
		this.setJMenuBar(barraMenu);
		
		crearElementoMenu4("fuente","Arial","Arial",9,9);
		crearElementoMenu4("fuente","Verdana","Verdana",9,9);
		crearElementoMenu4("fuente","Serif","Serif",9,9);
		crearElementoMenu4("fuente","Comic Sans MS","Comic Sans MS",9,9);
		
		crearElementoMenu4("estilo","Negrita","",Font.BOLD,9);
		crearElementoMenu4("estilo","Cursiva","",Font.ITALIC,9);
		
		crearElementoMenu4("tamaño","12","",9,12);
		crearElementoMenu4("tamaño","18","",9,18);
		crearElementoMenu4("tamaño","22","",9,22);
		crearElementoMenu4("tamaño","24","",9,24);
		
		barraHerramientas=new JToolBar();
		/*
		JButton negritaHerramientas=new JButton(new ImageIcon("src/imagenes/negrita.jpg"));
		JButton cursivaHerramientas=new JButton(new ImageIcon("src/imagenes/cursiva.jpg"));
		JButton subrayadoHerramientas=new JButton(new ImageIcon("src/imagenes/subrayado.jpg"));
		JButton rojoHerramientas=new JButton(new ImageIcon("src/imagenes/rojo.jpg"));
		JButton amarilloHerramientas=new JButton(new ImageIcon("src/imagenes/amarillo.jpg"));
		JButton verdeHerramientas=new JButton(new ImageIcon("src/imagenes/verde.jpg"));
		JButton aIzquierda=new JButton(new ImageIcon("src/imagenes/aligizquierda.jpg"));
		JButton aCentro=new JButton(new ImageIcon("src/imagenes/aligcentro.jpg"));
		JButton aDerecha=new JButton(new ImageIcon("src/imagenes/aligderecha.jpg"));
		JButton aJustificar=new JButton(new ImageIcon("src/imagenes/aligjustificar.jpg"));
		
		negritaHerramientas.addActionListener(new StyledEditorKit.BoldAction());
		cursivaHerramientas.addActionListener(new StyledEditorKit.ItalicAction());
		subrayadoHerramientas.addActionListener(new StyledEditorKit.UnderlineAction());
		rojoHerramientas.addActionListener(new StyledEditorKit.ForegroundAction("Rojo",Color.RED));
		amarilloHerramientas.addActionListener(new StyledEditorKit.ForegroundAction("Amarillo",Color.YELLOW));
		verdeHerramientas.addActionListener(new StyledEditorKit.ForegroundAction("Verde",Color.GREEN));
		aIzquierda.addActionListener(new StyledEditorKit.AlignmentAction("Izquierda",0));
		aCentro.addActionListener(new StyledEditorKit.AlignmentAction("Centro",1));
		aDerecha.addActionListener(new StyledEditorKit.AlignmentAction("Derecha",2));
		aJustificar.addActionListener(new StyledEditorKit.AlignmentAction("Justificar",3));
		
		barraHerramientas.add(negritaHerramientas);
		barraHerramientas.add(cursivaHerramientas);
		barraHerramientas.addSeparator();
		barraHerramientas.add(subrayadoHerramientas);
		barraHerramientas.addSeparator();
		barraHerramientas.add(rojoHerramientas);
		barraHerramientas.add(amarilloHerramientas);
		barraHerramientas.add(verdeHerramientas);
		barraHerramientas.addSeparator();
		barraHerramientas.add(aIzquierda);
		barraHerramientas.add(aCentro);
		barraHerramientas.add(aDerecha);
		barraHerramientas.add(aJustificar);
		*/
		
		creaElementosBarraHerramientas("src/imagenes/negrita.jpg").addActionListener(new StyledEditorKit.BoldAction());
		creaElementosBarraHerramientas("src/imagenes/cursiva.jpg").addActionListener(new StyledEditorKit.ItalicAction());
		barraHerramientas.addSeparator();
		creaElementosBarraHerramientas("src/imagenes/subrayado.jpg").addActionListener(new StyledEditorKit.UnderlineAction());
		barraHerramientas.addSeparator();
		creaElementosBarraHerramientas("src/imagenes/rojo.jpg").addActionListener(new StyledEditorKit.ForegroundAction("Rojo",Color.RED));
		creaElementosBarraHerramientas("src/imagenes/amarillo.jpg").addActionListener(new StyledEditorKit.ForegroundAction("Amarillo",Color.YELLOW));
		creaElementosBarraHerramientas("src/imagenes/verde.jpg").addActionListener(new StyledEditorKit.ForegroundAction("Verde",Color.GREEN));
		barraHerramientas.addSeparator();
		creaElementosBarraHerramientas("src/imagenes/aligizquierda.jpg").addActionListener(new StyledEditorKit.AlignmentAction("Izquierda",0));
		creaElementosBarraHerramientas("src/imagenes/aligcentro.jpg").addActionListener(new StyledEditorKit.AlignmentAction("Centro",1));
		creaElementosBarraHerramientas("src/imagenes/aligderecha.jpg").addActionListener(new StyledEditorKit.AlignmentAction("Derecha",2));
		creaElementosBarraHerramientas("src/imagenes/aligjustificar.jpg").addActionListener(new StyledEditorKit.AlignmentAction("Justificar",3));
		
		
		
		
		this.add(barraHerramientas,BorderLayout.NORTH);
		
		laminaPrincipal=new JPanel();
		laminaPrincipal.setLayout(new BorderLayout());
		miArea=new JTextPane();
		laminaPrincipal.add(miArea,BorderLayout.CENTER);
		this.add(laminaPrincipal);
		
		JPopupMenu menuEmergente=new JPopupMenu();
		JMenuItem negritaEmergente=new JMenuItem("Negrita",new ImageIcon("src/imagenes/negrita.jpg"));
		JMenuItem cursivaEmergente=new JMenuItem("Cursiva",new ImageIcon("src/imagenes/cursiva.jpg"));
		negritaEmergente.addActionListener(new StyledEditorKit.BoldAction() );
		cursivaEmergente.addActionListener(new StyledEditorKit.ItalicAction());
		menuEmergente.add(negritaEmergente);
		menuEmergente.add(cursivaEmergente);
		miArea.setComponentPopupMenu(menuEmergente);
		
		
	}
	
	public JButton creaElementosBarraHerramientas(String ruta)
	{
		JButton boton=new JButton(new ImageIcon(ruta));
		barraHerramientas.add(boton);
		return boton;
		
	}
	
	public void crearElementoMenu4(String menu,String rotulo,String tipoFuente,int tipoEstilo,int tipoTamagno)
	{
		JMenuItem elemento=new JMenuItem(rotulo);
		if(menu.equalsIgnoreCase("fuente"))
		{
			elemento.addActionListener(new StyledEditorKit.FontFamilyAction("tipo_fuente",tipoFuente));
			fuente.add(elemento);
		}
		else if(menu.equalsIgnoreCase("estilo"))
		{
			if(rotulo.equalsIgnoreCase("Negrita"))
			{
				elemento.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
				elemento.addActionListener(new StyledEditorKit.BoldAction());
			}
			else if(rotulo.equalsIgnoreCase("Cursiva"))
			{
				elemento.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_DOWN_MASK));
				elemento.addActionListener(new StyledEditorKit.ItalicAction());
			}
			estilo.add(elemento);
		}
		else if(menu.equalsIgnoreCase("tamaño"))
		{
			elemento.addActionListener(new StyledEditorKit.FontSizeAction("tam_letra",tipoTamagno));
			tam.add(elemento);
		}
	}
	
	
}




















