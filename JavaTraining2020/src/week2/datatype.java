package week2;

public class datatype {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		int e = a + 10;
		int f = b + d;
		int j = 4; 
		
		//utilisation de quelque operators
		System.out.println(a == b);
		System.out.println(c + d);
		System.out.println(d > e);
		System.out.println(e < f);
		System.out.println(j +=c);
		System.out.println(b <<= f);
		System.out.println(j %=4);
		//utlisation du  if,  else , else-if 
		
		if (a > b) {
			System.out.println("a is greater than b");
		}else {
			System.out.println("b is greater than a");
			
		}
		
		if ( d > 50) {
			System.out.println("la valeur de d est superieure a 50.");
		}else if (d == 50) {
			System.out.println("la valeur de d est egale a 50.");	
		}else {
			System.out.println("la valeur de d est inferieure a 50.");
		}
		
		}


	}
