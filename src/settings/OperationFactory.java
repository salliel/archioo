package settings;

import model.*;

public class OperationFactory {
	public static Operation initOperation(String operation) {
		OperationConfiguration.configuration();
		
		return OperationConfiguration.operationMap.get(operation);
	}
}
