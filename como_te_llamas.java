import java.util.Scanner;

public class como_te_llamas {

	public static void main(String[] args) {

		
		String nombre;
		Scanner lector= new Scanner(System.in);
		
		System.out.println("como te llamas?");
		nombre = lector.nextLine();
		
		System.out.println("el nombre del alumno es: "+nombre);
	} 

}
