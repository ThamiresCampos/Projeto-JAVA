package javaGUI;
import javax.swing.*;  


public class FirstSwingExample {  
public static void main(String[] args) {  
	
	//ele substitui o titulo do awt//
JFrame f=new JFrame("Exemplo de frame");
          
JButton b=new JButton("click"); 
b.setBounds(130,100,100, 40);
          
f.add(b);
          
f.setSize(400,500);
f.setLayout(null); 
f.setVisible(true);
}  
}  
//o botao de fechar funciona//