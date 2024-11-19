package cartProject;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mongodb.internal.operation.SyncOperations;

public class ArithmeticOperationTest {
	
	@Test
	public void add() {
		System.out.println("Two numbers are added");
	}

	@Test
	public void mulitply() {
		System.out.println("Multiplication of two numbers");
	}

	@Test
	public void subtract() {
		System.out.println("Subtraction of two numbers");
		System.out.println("hello");
	}

	@Test
	public void divide() {
		System.out.println("Division done");
	}

}
