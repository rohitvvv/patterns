package epam.test;

import org.junit.Test;
import static org.junit.Assert.*;
import epam.designPattern.factory.Computer;
import epam.designPattern.factory.ComputerFactory;;
public class FactoryTest {

	@Test
	public void factoryTest() {
		Computer pc = ComputerFactory.getComputer("PC");
	    Computer server = ComputerFactory.getComputer("Server");
	    assertEquals(16, server.getCPU());
	    assertEquals(16,server.getRAM());
	    assertEquals(2,pc.getRAM());
	    assertEquals(4,pc.getCPU());
	}
}
