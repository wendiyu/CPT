// using awt to create GUI design
import java.awt.EventQueue;

// Creat game windows/appliation

public class App {	
	
	public static GUI gui;
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() { 
			public void run() {
				
				try {
					gui = new GUI();
					
					gui.createGameWindow();
					
				// Diagnosing an exceptions
				} catch (Exception e) {
					
					e.printStackTrace();
				}
			}
		});
		
	}

}
