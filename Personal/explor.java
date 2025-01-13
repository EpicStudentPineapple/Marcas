import java.util.Scanner;
public class explor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*Definición de código */
		String[] tipoEstrella = {"Enana roja", "Mediana roja", "Grande roja", "Gigante roja", "Supergigante roja", "Enana naranaj", "Mediana naranja", "Grande naranja", "Supergigante naranja", "Enana amarilla", "Mediana amarilla", "Grande amarilla", "Supergigante amarilla", "Enana azul", "Mediana azul", "Grande azul", "Supergigante azul", "Estrella de Neutrones", "Quásar", "Agujero negro", "Protoestrella"};
		String[] tipoPlaneta = {"",};
		String[] tipoLuna = {};
				
		System.out.println("Ingrese el nombre del sistema");
		String nombre = sc.nextLine();
		while (true) { 
			int categoria = (int)(Math.random()*2 + 1);
			if (categoria == 1) {
				while (true) {
					int dadoEstrella = (int)(Math.random()*21 + 1);
					System.out.println(tipoEstrella[dadoEstrella]);
					break;
				}
				break;
			} else if (categoria == 2) {
				break;
			}
		}		
		sc.close();
	}
}
