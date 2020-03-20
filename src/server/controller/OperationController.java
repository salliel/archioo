package server.controller;

import java.io.IOException;
import java.net.UnknownHostException;

import model.*;
import settings.OperationFactory;

public class OperationController {
	private Operation model;
	
	public OperationController( ) {
		super();
	}

	public double doOperation(double a, String operation, double b) throws UnknownHostException, ClassNotFoundException, IOException, InterruptedException {
		model = OperationFactory.initOperation(operation);
		
		return model.calculate(a, b);
	}
}
