package epam.designPattern.factory;
/**
 * Sample program which demonstrates the Factory Design Pattern. 
 * Computer class which abstract overloads 
 * @author rohit
 *
 */
public abstract class Computer {
  //Indicates number of cores
  public abstract int getCPU();
  //Indicates primary memory in GB
  public abstract int getRAM();
}

class Server extends Computer{

	@Override
	public
	int getCPU() {
		return 16;
	}
    
	@Override
	public
	int getRAM() {
		return 16;
	}
	
}
class PC extends Computer{

	@Override
	public
	int getCPU() {
		return 4;
	}

	@Override
	public
	int getRAM() {
		return 2;
	}
	
}
