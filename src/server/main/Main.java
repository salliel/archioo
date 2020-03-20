package server.main;

import java.io.IOException;

import server.controller.OperationsocketServer;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, IOException, InterruptedException {
		OperationsocketServer server = new OperationsocketServer();
		server.lunch();
	}

}
