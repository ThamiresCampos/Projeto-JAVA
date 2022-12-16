package javaGUI;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;



	public class WindowExample extends Frame {
	
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		WindowExample() {
			
			addWindowListener (new WindowAdapter () {
				public void windowClosing(WindowEvent e) {
					dispose();
				}
				
			});
			
			setSize(400,400);
			setLayout(null);
			setVisible(true);
			
		}

		public static void main (String args []) {
			
			new WindowExample();
		}
	

}
