package server.controller;

import java.io.IOException;
import java.net.UnknownHostException;

import model.OperationModel;

public class Calculate {

    private static OperationController operationController;

	public static OperationModel calculate(OperationModel operation) throws UnknownHostException, ClassNotFoundException, IOException, InterruptedException {

		double resultat = operationController.doOperation(operation.getX(), operation.getOperation(), operation.getY());
		
		operation.setResultat(resultat);
		return operation;
	}

}
