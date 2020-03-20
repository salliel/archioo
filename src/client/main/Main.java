package client.main;

import java.io.IOException;

import client.controller.RunSocketClientController;
import client.view.CalculatorSocketClient;
import client.view.CalculatorView;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, IOException, InterruptedException {
		
		CalculatorView view = new CalculatorView();
		CalculatorSocketClient socketClient = new CalculatorSocketClient();
	
		RunSocketClientController controller = new RunSocketClientController(view);
		
		view.setControl(controller);
		view.display();
	}
}
