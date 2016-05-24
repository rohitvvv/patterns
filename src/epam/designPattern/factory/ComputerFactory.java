package epam.designPattern.factory;

public class ComputerFactory {
	public static Computer getComputer(String computer){
 		if("PC".equals(computer)){
 			return new PC();
 		}
 		if("Server".equals(computer)){
 			return new Server();
 		}
 		return null;
	}
}