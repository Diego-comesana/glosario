public class Aleatorios {
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		// Número entero aleatorio entre 0 y 9
		int entero = rand.nextInt(10);
		System.out.println("Aleatorio entre 0 y 9: " + entero);
		
		// Número entero aleatorio entre 1 y 10
		int entre1y10 = rand.nextInt(10) + 1;
		System.out.println("Aleatorio entre 1 y 10: " + entre1y10);
		
		// Número booleano aleatorio
		boolean bool = rand.nextBoolean();
		System.out.println("Booleano aleatorio: " + bool);
		
		// Número long aleatorio
		long uno = rand.nextLong();
		System.out.println("Long aleatorio: " + uno);
	}

}
