package ultimorepaso;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.text.StyledEditorKit;

public class Practica3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco3 miMarco=new Marco3();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Marco3 extends JFrame
{
	private JMenuBar barraMenu;
	private JMenu fuente,estilo,tam;
	private JPanel lienzoPrincipal;
	private JTextPane miArea;
	public Marco3()
	{
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
		
		crearElementosMenu("fuente","Arial","Arial",9,9);
		crearElementosMenu("fuente","Verdana","Verdana",9,9);
		crearElementosMenu("fuente","Serif","Serif",9,9);
		crearElementosMenu("fuente","Comic Sans MS","Comic Sans MS",9,9);
		
		crearElementosMenu("estilo","Negrita","",Font.BOLD,9);
		crearElementosMenu("estilo","Cursiva","",Font.ITALIC,9);
		
		crearElementosMenu("tamaño","12","",9,12);
		crearElementosMenu("tamaño","18","",9,18);
		crearElementosMenu("tamaño","20","",9,20);
		crearElementosMenu("tamaño","24","",9,24);
		
		/*JToolBar barraHerramientas=new JToolBar();
		JButton negritaBarra=new JButton(new ImageIcon("src/imagenes/negrita.jpg"));
		JButton cursivaBarra=new JButton(new ImageIcon("src/imagenes/cursiva.jpg"));
		negritaBarra.addActionListener(new StyledEditorKit.BoldAction() );
		cursivaBarra.addActionListener(new StyledEditorKit.ItalicAction() );
		barraHerramientas.add(negritaBarra);
		barraHerramientas.add(cursivaBarra);
		this.add(barraHerramientas,BorderLayout.NORTH);*/
		
		
		lienzoPrincipal=new JPanel();
		lienzoPrincipal.setLayout(new BorderLayout());
		miArea=new JTextPane();
		miArea.setFont(new Font("Times New Roman",Font.PLAIN,14));
		lienzoPrincipal.add(miArea,BorderLayout.CENTER);
		
		JToolBar barraHerramientas=new JToolBar();
		barraHerramientas.setOrientation(SwingConstants.VERTICAL);
		JButton negritaBarra=new JButton(new ImageIcon("src/imagenes/negrita.jpg"));
		JButton cursivaBarra=new JButton(new ImageIcon("src/imagenes/cursiva.jpg"));
		negritaBarra.addActionListener(new StyledEditorKit.BoldAction() );
		cursivaBarra.addActionListener(new StyledEditorKit.ItalicAction() );
		barraHerramientas.add(negritaBarra);
		barraHerramientas.add(cursivaBarra);
		lienzoPrincipal.add(barraHerramientas,BorderLayout.WEST);
		
		this.add(lienzoPrincipal);
	}
	
	public void crearElementosMenu(String menu,String rotulo,String tipoLetra,int tipoEstilo,int tipoTamagno)
	{
		JMenuItem elementoMenu=new JMenuItem(rotulo);
		if(menu.equalsIgnoreCase("fuente"))
		{
			elementoMenu.addActionListener(new StyledEditorKit.FontFamilyAction("tipo_letra",tipoLetra));
			fuente.add(elementoMenu);
		}
		else if(menu.equalsIgnoreCase("estilo"))
		{
			if(rotulo.equalsIgnoreCase("Negrita"))
			{
				
				elementoMenu.addActionListener(new StyledEditorKit.BoldAction());
			}
			else if(rotulo.equalsIgnoreCase("Cursiva"))
			{
				elementoMenu.addActionListener(new StyledEditorKit.ItalicAction());
			}
			estilo.add(elementoMenu);
		}
		else if(menu.equalsIgnoreCase("tamaño"))
		{
			elementoMenu.addActionListener(new StyledEditorKit.FontSizeAction("tam_letra",tipoTamagno));
			tam.add(elementoMenu);
		}
	}
	
	
}
