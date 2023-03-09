package Ejemplos;

public class Calculadora {
	
	private int num1;
	private int num2;

	public Calculadora(int a,int b) {

		num1=a;
		num2=b;
		
	}
	public int suma() {
		int resultado=num1 + num2;
		return resultado;
	}
	public int resta() {
		int resultado=num1 - num2;
		return resultado;
	}
	public int multiplicacion() {
		int resultado=num1 * num2;
		return resultado;
	}
	public double division() {
		double resultado=num1 / num2;
		return resultado;
	}
	public double division0() {
		
		double resultado;
		if(num2==0) {
			throw new ArithmeticException("División por 0");
		}
		resultado=division();
		return resultado;
	}

}
