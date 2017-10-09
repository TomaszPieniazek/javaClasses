package math.uni.lodz.pl.javaClasses;

public class MyFirstCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator brandNewCalc = new Calculator();
		Calculator firstCalc = new Calculator(5,5);
		firstCalc.add();
		
		firstCalc.setFirstNumber(3);
		firstCalc.setSecondNumber(2);
		
		Calculator secondCalc = new Calculator(5,5);
		Calculator thirdCalc = new Calculator(5,5);
		
		System.out.println(firstCalc.getResult());
		
	}

}
