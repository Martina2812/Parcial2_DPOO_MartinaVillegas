package logica;

public class Parcial {
	
	int a;
	int b;
	int c;
	
	public Parcial(int a, int b, int c) {

		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
	
	public String raices(int a, int b, int c) throws Exception {
		
		if(a == 0) {
			throw new Exception("No se puede dividir por 0.");
		}
		
		int raiz1 = (int) (((-1*b) + Math.sqrt((Math.pow(b, 2) - 4*a*c)))/(2*a));  
		int raiz2 = (int) (((-1*b) - Math.sqrt((Math.pow(b, 2) - 4*a*c)))/(2*a)); 
		
		return "x = " + raiz1 + ", x = " + raiz2;
	}
	
	
}
