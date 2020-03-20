package settings;

import java.util.HashMap;
import java.util.Map;

import model.*;

public class OperationConfiguration {
	public static Map<String, Operation> operationMap = new HashMap<String, Operation>();
	
	public static void configuration() {
		operationMap.put("+", new AdditionModel());
		operationMap.put("-", new SubstractionModel());
		operationMap.put("*", new MultiplicationModel());
		operationMap.put("/", new SubstractionModel());

	}
}
