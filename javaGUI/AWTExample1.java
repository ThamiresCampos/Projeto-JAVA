package javaGUI;
import java.awt.*;


		
		public class AWTExample1 extends Frame {
			
			AWTExample1() {
				
				Button b = new Button ("Clique Aqui!");
				
				//tamanho do botao, x,y width, heigth//
				b.setBounds(30,100,80,30);
				
				
				//vc esta atribuindo o b no frame//
				add(b);
				
				//tamanho do frame//
				setSize(300,300);
				
				//titulo do exercicio//
				setTitle("Exemplo1 Frame");
				
				//configuracao do layouts do frame//
				setLayout(null);
				
				
				//configurar se o frame vai aparecer ou não//
				setVisible(true);
			}
			
			public static void main (String args[]) {
			
				AWTExample1 f = new AWTExample1();
			}
	}


