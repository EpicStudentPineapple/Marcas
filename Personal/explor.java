import java.util.Scanner;
public class explor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*Definición de código */
		String[] tipoEstrella = {"'Enana roja'", "'Mediana roja'", "'Grande roja'", "'Gigante roja'", "'Supergigante roja'", "'Enana naranja'", "'Mediana naranja'", "'Grande naranja'", "'Supergigante naranja'", "'Enana amarilla'", "'Mediana amarilla'", "'Grande amarilla'", "'Supergigante amarilla'", "'Enana azul'", "'Mediana azul'", "'Grande azul'", "'Supergigante azul'", "'Estrella de Neutrones'", "'Quásar'", "'Agujero negro'", "'Protoestrella'"};
		String[] tipoSistema = {"'Estrella sin mundos'", "'Estrella con planeta solitario'", "'Estrella con varios mundos'"};
		String[] planetasTerrenales = {"Planeta de carbono", "Planeta helado", "Mundo océano", "Subtierra", "Super Tierra", "Super Habitable", "Planeta de hierro"};
		String[] planetasGaseosos = {"Gigante de gas", "Enana marron", "Mini-Neptuno", "Neptuno Caliente", "Júpiter caliente", "Gigante de oro"};
		String[] tipoLuna = {"Inerte", "Tiranide", "Mina Orbitante", "Super Luna", "Luna congelada", "Luna oceánica"};
				
		System.out.print(
				"Ingrese el nombre del sistema:");
		String nombre = sc.nextLine();
		
		while (true) { 
			int categoria = (int)(Math.random()*2 + 1);
			if (categoria == 1) {
				while (true) {
					int dadoEstrella = (int)(Math.random()*21 + 1);
					int Estrella = dadoEstrella-1;
					/* Tipo de sistema solar*/
					int Cantidad = 0;
					int SisType = (int)(Math.random()*100+1);
					if (SisType >= 1 && SisType <= 20 ) {
						Cantidad = 1;
					} else if (SisType >= 21 && SisType <= 60) {
						Cantidad = 2;
					} else {
						Cantidad = 3;
					}
					/* Cantidad de mundos*/
					switch (Cantidad) {
					case 1:
						System.out.println("Se ha descubrido una "+ tipoEstrella[Estrella]+" clasificada como "+tipoSistema[Cantidad-1]);
					break;
					
					case 2:
						System.out.println("Se ha descubrido una "+ tipoEstrella[Estrella]+" clasificada como "+ tipoSistema[Cantidad-1]);
						/*Definición de planeta terrenal o gaseoso*/
						int gasTerra = (int)(Math.random()*100+1);
						if (gasTerra >= 1 && gasTerra <= 60 ) {
							int planetaGaseoso = (int)(Math.random()*6+1);
							System.out.println("El planeta que la orbita es un "+planetasGaseosos[planetaGaseoso-1]+" y es de tipo gaseoso");
						} else if (gasTerra >= 61 && gasTerra <= 100) {
							int planetaTerrenal = (int)(Math.random()*6+1);
							System.out.println("El planeta que la orbita es un "+planetasTerrenales[planetaTerrenal-1]+" y es de tipo Terrenal");
						}
					break;
					
					case 3:
						System.out.println("Se ha descubrido una "+ tipoEstrella[Estrella]+" clasificada como "+ tipoSistema[Cantidad-1]);
						int cantidadPlaneta = (int)((Math.random()*6+1)+3);
						System.out.println("Hay un total de "+cantidadPlaneta+" planetas orbitando la estrella");
						int con = 0;
						while (con != cantidadPlaneta) {
							int gasTerra2 = (int)(Math.random()*100+1);
							if (gasTerra2 >= 1 && gasTerra2 <= 60 ) {
								int planetaGaseoso = (int)(Math.random()*6+1);
								System.out.println("El planeta que la orbita es un "+planetasGaseosos[planetaGaseoso-1]+" y es de tipo gaseoso");
							} else if (gasTerra2 >= 61 && gasTerra2 <= 100) {
								int planetaTerrenal = (int)(Math.random()*6+1);
								System.out.println("El planeta que la orbita es un "+planetasTerrenales[planetaTerrenal-1]+" y es de tipo Terrenal");
							}
							con++;
						}
					break;
					} 
					
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
