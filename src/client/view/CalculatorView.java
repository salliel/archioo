package client.view;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Scanner;

import client.controller.RunSocketClientController;;

public class CalculatorView {
	private Scanner sc = new Scanner(System.in);
	private RunSocketClientController controller;
	
	public void display() throws UnknownHostException, ClassNotFoundException, IOException, InterruptedException {
		
		this.embellishDisplay("Calculator archioo");
		
		double x, y;
		String operation;
		System.out.println("Veuillez saisir un nombre : ");
		x = sc.nextDouble();
		System.out.println("operation : (+, -, *, /)");
		operation = sc.next();
		System.out.println("Veuillez saisir un autre nombre : ");
		y = sc.nextDouble();
		
		controller.doOperation(x, operation, y);
		
		this.embellishDisplay("Calculator fin");

	}
	
	public void displayResult(double result) {
		System.out.println("result : " + result);
	}

	public RunSocketClientController getController() {
		return controller;
	}

	public void setControl(RunSocketClientController control) {
		this.controller = control;
	}
	
	private void embellishDisplay(String s){
		int size = ((100 - s.length())/2) - 1;
		for (int i = 0; i < 100; i++) {
			System.out.print("*");
		}

		System.out.print("\n*");
		
		for (int i = 0; i < size; i++) {
			System.out.print(" ");
		}
		System.out.print(s);
		
		for (int i = 0; i < size; i++) {
			System.out.print(" ");
		}
		System.out.println("*");
		
		for (int i = 0; i < 100; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

	
}
