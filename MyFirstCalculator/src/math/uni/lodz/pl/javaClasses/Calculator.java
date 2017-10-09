package math.uni.lodz.pl.javaClasses;

public class Calculator {

	private int firstNumber;
	private int secondNumber;
	private int result;

	public Calculator(int firstNumber, int secondNumber) {
		this.firstNumber=firstNumber;
		this.secondNumber=secondNumber;
		
	}

	public Calculator() {
		// TODO Auto-generated constructor stub
	}

	public void add() {
		// TODO Auto-generated method stub
		this.result=firstNumber+secondNumber;
	}
	
public void setFirstNumber(int firstNumber) {
	this.firstNumber = firstNumber;
}
public void setSecondNumber(int secondNumber) {
	this.secondNumber = secondNumber;
}
public int getResult() {
	return result;
}
}
