package client.controller;

import java.io.IOException;
import java.net.UnknownHostException;

import client.view.CalculatorSocketClient;
import client.view.CalculatorView;
import model.*;
import settings.OperationFactory;

public class RunSocketClientController {
	private CalculatorView view;
	private OperationModel operationModel;
	
	public RunSocketClientController(CalculatorView calculator) {
		super();
		this.view = calculator;
	}

	public void doOperation(double x, String operation, double y) throws UnknownHostException, ClassNotFoundException, IOException, InterruptedException {
		operationModel = CalculatorSocketClient.call(new OperationModel(x, y, operation));
		
		view.displayResult(operationModel.getResultat());
	}
	
	public CalculatorView getCalculator() {
		return view;
	}
	
	public void setCalculator(CalculatorView calculator) {
		this.view = calculator;
	}

}
