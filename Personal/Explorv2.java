public class Explorv2 {
	public static void main(String[] args) {
		int con = 0;
		int viabilidad = 0;
		int tipoLuna = 0;
		int planetaTerrenal = 0;
		int planetaGaseoso = 0;
		int cantMundos = (int)(Math.random()*100+1);
		String[] tipoEstrella = {"'Enana roja'", "'Mediana roja'", "'Grande roja'", "'Gigante roja'", "'Supergigante roja'", "'Enana naranja'", "'Mediana naranja'", "'Grande naranja'", "'Supergigante naranja'", "'Enana amarilla'", "'Mediana amarilla'", "'Grande amarilla'", "'Supergigante amarilla'", "'Enana azul'", "'Mediana azul'", "'Grande azul'", "'Supergigante azul'", "'Estrella de Neutrones'", "'Quásar'", "'Agujero negro'", "'Protoestrella'"};
		int numTipoEstrella = 0;
		int kill = 0;
		int pew = 0;
		
		int cantidadEstrellas = (int)(Math.random()*2+1);
		if (cantidadEstrellas == 1) {
			numTipoEstrella = (int)(Math.random()*21+1);
			if (cantMundos >= 21 && cantMundos <= 60) {
				if (numTipoEstrella == 19 || numTipoEstrella == 20) {
					System.out.println("El \"" + tipoEstrella[cantMundos-1] + "\" tiene un mundo");
					int terraGas = (int)(Math.random()*100+1);
					if (terraGas >= 1 && terraGas <= 60) {
						planetaGaseoso = (int)(Math.random()*6+1);
						switch (planetaGaseoso) {
						case 1:
							System.out.println("[Gigante de gas]");
							while (con != 2) {
								tipoLuna = (int)(Math.random()*6+1);
								switch (tipoLuna) {
								case 1:
									System.out.println((con+1)+" [Luna Inerte] ");
									break;
								case 2:
									System.out.print((con+1)+" [Luna Tiraníde] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 3:
									System.out.println((con+1)+" [Mina Orbitante] ");
									break;
								case 4:
									System.out.print((con+1)+" [Super Luna] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 5:
									System.out.print((con+1)+" [Luna Congelada] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 6:
									System.out.print((con+1)+" [Luna Oceánica] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								}
								con++;
							}
							break;
						case 2:
							System.out.println("[Enana Marrón]");
							while (con != 3) {
								tipoLuna = (int)(Math.random()*6+1);
								switch (tipoLuna) {
								case 1:
									System.out.println((con+1)+" [Luna Inerte] ");
									break;
								case 2:
									System.out.print((con+1)+" [Luna Tiraníde] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 3:
									System.out.println((con+1)+" [Mina Orbitante] ");
									break;
								case 4:
									System.out.print((con+1)+" [Super Luna] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 5:
									System.out.print((con+1)+" [Luna Congelada] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 6:
									System.out.print((con+1)+" [Luna Oceánica] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								}
								con++;
							}
							break;
						case 3:
							System.out.println("[Mini-Neptuno]");
							while (con != 4) {
								tipoLuna = (int)(Math.random()*6+1);
								switch (tipoLuna) {
								case 1:
									System.out.println((con+1)+" [Luna Inerte] ");
									break;
								case 2:
									System.out.print((con+1)+" [Luna Tiraníde] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 3:
									System.out.println((con+1)+" [Mina Orbitante] ");
									break;
								case 4:
									System.out.print((con+1)+" [Super Luna] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 5:
									System.out.print((con+1)+" [Luna Congelada] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 6:
									System.out.print((con+1)+" [Luna Oceánica] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								}
								con++;
							}
							break;
						case 4:
							System.out.println("[Neptuno Caliente]");
							while (con != 2) {
								tipoLuna = (int)(Math.random()*6+1);
								switch (tipoLuna) {
								case 1:
									System.out.println((con+1)+" [Luna Inerte] ");
									break;
								case 2:
									System.out.print((con+1)+" [Luna Tiraníde] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 3:
									System.out.println((con+1)+" [Mina Orbitante] ");
									break;
								case 4:
									System.out.print((con+1)+" [Super Luna] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 5:
									System.out.print((con+1)+" [Luna Congelada] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 6:
									System.out.print((con+1)+" [Luna Oceánica] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								}
								con++;
							}
							break;
						case 5:
							System.out.println("[Júpiter Caliente]");
							tipoLuna = (int)(Math.random()*6+1);
							switch (tipoLuna) {
							case 1:
								System.out.println((con+1)+" [Luna Inerte] ");
								break;
							case 2:
								System.out.print((con+1)+" [Luna Tiraníde] ");
								viabilidad = (int)(Math.random()*100+1);
								if (viabilidad <= 45) {
									System.out.println("[Desolación absoluta]");
								} 
								
								if (viabilidad >= 46 && viabilidad <= 60){
									System.out.println("[Potencial de vida]");
								}
								if (viabilidad >= 61 && viabilidad <= 80) {
									System.out.println("[Vida simple]");
									
								}
								if (viabilidad >= 81 && viabilidad <= 90) {
									System.out.println("[Vida compleja]");
									
								}
								if (viabilidad >= 91 && viabilidad <= 100) {
									System.out.print("[Vida inteligente ");
									int vidIntel = (int)(Math.random()*100+1);
									if (vidIntel <= 90) {
										int tipoBeta = (int)(Math.random()*5+1);
										switch (tipoBeta) {
										case 1:
											System.out.println("Prehistorica]");
											break;
										case 2:
											System.out.println("en Edad de Hierro]");
											break;
										case 3:
											System.out.println("en la Edad Media]");
											break;
										case 4:
											System.out.println("en la Edad Industrial]");
											break;
										case 5:
											System.out.println("en la Edad contemporanea]");
										}
									} else if (vidIntel > 91 && vidIntel < 100) {
										System.out.println("de tipo Alpha, en era espacial]");
									}
								}
								break;
							case 3:
								System.out.println((con+1)+" [Mina Orbitante] ");
								break;
							case 4:
								System.out.print((con+1)+" [Super Luna] ");
								viabilidad = (int)(Math.random()*100+1);
								if (viabilidad <= 45) {
									System.out.println("[Desolación absoluta]");
								} 
								
								if (viabilidad >= 46 && viabilidad <= 60){
									System.out.println("[Potencial de vida]");
								}
								if (viabilidad >= 61 && viabilidad <= 80) {
									System.out.println("[Vida simple]");
									
								}
								if (viabilidad >= 81 && viabilidad <= 90) {
									System.out.println("[Vida compleja]");
									
								}
								if (viabilidad >= 91 && viabilidad <= 100) {
									System.out.print("[Vida inteligente ");
									int vidIntel = (int)(Math.random()*100+1);
									if (vidIntel <= 90) {
										int tipoBeta = (int)(Math.random()*5+1);
										switch (tipoBeta) {
										case 1:
											System.out.println("Prehistorica]");
											break;
										case 2:
											System.out.println("en Edad de Hierro]");
											break;
										case 3:
											System.out.println("en la Edad Media]");
											break;
										case 4:
											System.out.println("en la Edad Industrial]");
											break;
										case 5:
											System.out.println("en la Edad contemporanea]");
										}
									} else if (vidIntel > 91 && vidIntel < 100) {
										System.out.println("de tipo Alpha, en era espacial]");
									}
								}
								break;
							case 5:
								System.out.print((con+1)+" [Luna Congelada] ");
								viabilidad = (int)(Math.random()*100+1);
								if (viabilidad <= 45) {
									System.out.println("[Desolación absoluta]");
								} 
								
								if (viabilidad >= 46 && viabilidad <= 60){
									System.out.println("[Potencial de vida]");
								}
								if (viabilidad >= 61 && viabilidad <= 80) {
									System.out.println("[Vida simple]");
									
								}
								if (viabilidad >= 81 && viabilidad <= 90) {
									System.out.println("[Vida compleja]");
									
								}
								if (viabilidad >= 91 && viabilidad <= 100) {
									System.out.print("[Vida inteligente ");
									int vidIntel = (int)(Math.random()*100+1);
									if (vidIntel <= 90) {
										int tipoBeta = (int)(Math.random()*5+1);
										switch (tipoBeta) {
										case 1:
											System.out.println("Prehistorica]");
											break;
										case 2:
											System.out.println("en Edad de Hierro]");
											break;
										case 3:
											System.out.println("en la Edad Media]");
											break;
										case 4:
											System.out.println("en la Edad Industrial]");
											break;
										case 5:
											System.out.println("en la Edad contemporanea]");
										}
									} else if (vidIntel > 91 && vidIntel < 100) {
										System.out.println("de tipo Alpha, en era espacial]");
									}
								}
								break;
							case 6:
								System.out.print((con+1)+" [Luna Oceánica] ");
								viabilidad = (int)(Math.random()*100+1);
								if (viabilidad <= 45) {
									System.out.println("[Desolación absoluta]");
								} 
								
								if (viabilidad >= 46 && viabilidad <= 60){
									System.out.println("[Potencial de vida]");
								}
								if (viabilidad >= 61 && viabilidad <= 80) {
									System.out.println("[Vida simple]");
									
								}
								if (viabilidad >= 81 && viabilidad <= 90) {
									System.out.println("[Vida compleja]");
									
								}
								if (viabilidad >= 91 && viabilidad <= 100) {
									System.out.print("[Vida inteligente ");
									int vidIntel = (int)(Math.random()*100+1);
									if (vidIntel <= 90) {
										int tipoBeta = (int)(Math.random()*5+1);
										switch (tipoBeta) {
										case 1:
											System.out.println("Prehistorica]");
											break;
										case 2:
											System.out.println("en Edad de Hierro]");
											break;
										case 3:
											System.out.println("en la Edad Media]");
											break;
										case 4:
											System.out.println("en la Edad Industrial]");
											break;
										case 5:
											System.out.println("en la Edad contemporanea]");
										}
									} else if (vidIntel > 91 && vidIntel < 100) {
										System.out.println("de tipo Alpha, en era espacial]");
									}
								}
								break;
							}
							break;
						case 6:
							System.out.println("[Gigante de oro]");
							while (con != 5) {
								tipoLuna = (int)(Math.random()*6+1);
								switch (tipoLuna) {
								case 1:
									System.out.println((con+1)+" [Luna Inerte] ");
									break;
								case 2:
									System.out.print((con+1)+" [Luna Tiraníde] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 3:
									System.out.println((con+1)+" [Mina Orbitante] ");
									break;
								case 4:
									System.out.print((con+1)+" [Super Luna] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 5:
									System.out.print((con+1)+" [Luna Congelada] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 6:
									System.out.print((con+1)+" [Luna Oceánica] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								}
								con++;
							}
							break;
						}
					} else if (terraGas >= 61 && terraGas <= 100) {
						planetaTerrenal = (int)(Math.random()*6+1);
						switch (planetaTerrenal) {
						case 1:
							System.out.println("[Planeta de Carbono] ");
							while (con != 2) {
								tipoLuna = (int)(Math.random()*6+1);
								switch (tipoLuna) {
								case 1:
									System.out.println((con+1)+" [Luna Inerte] ");
									break;
								case 2:
									System.out.print((con+1)+" [Luna Tiraníde] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 3:
									System.out.println((con+1)+" [Mina Orbitante] ");
									break;
								case 4:
									System.out.print((con+1)+" [Super Luna] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 5:
									System.out.print((con+1)+" [Luna Congelada] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 6:
									System.out.print((con+1)+" [Luna Oceánica] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								}
								con++;
							}
							con = 0;
							break;
						case 2:
							System.out.println("[Planeta Helado]");
							tipoLuna = (int)(Math.random()*6+1);
							switch (tipoLuna) {
							case 1:
								System.out.println((con+1)+" [Luna Inerte] ");
								break;
							case 2:
								System.out.print((con+1)+" [Luna Tiraníde] ");
								viabilidad = (int)(Math.random()*100+1);
								if (viabilidad <= 45) {
									System.out.println("[Desolación absoluta]");
								} 
								
								if (viabilidad >= 46 && viabilidad <= 60){
									System.out.println("[Potencial de vida]");
								}
								if (viabilidad >= 61 && viabilidad <= 80) {
									System.out.println("[Vida simple]");
									
								}
								if (viabilidad >= 81 && viabilidad <= 90) {
									System.out.println("[Vida compleja]");
									
								}
								if (viabilidad >= 91 && viabilidad <= 100) {
									System.out.print("[Vida inteligente ");
									int vidIntel = (int)(Math.random()*100+1);
									if (vidIntel <= 90) {
										int tipoBeta = (int)(Math.random()*5+1);
										switch (tipoBeta) {
										case 1:
											System.out.println("Prehistorica]");
											break;
										case 2:
											System.out.println("en Edad de Hierro]");
											break;
										case 3:
											System.out.println("en la Edad Media]");
											break;
										case 4:
											System.out.println("en la Edad Industrial]");
											break;
										case 5:
											System.out.println("en la Edad contemporanea]");
										}
									} else if (vidIntel > 91 && vidIntel < 100) {
										System.out.println("de tipo Alpha, en era espacial]");
									}
								}
								break;
							case 3:
								System.out.println((con+1)+" [Mina Orbitante] ");
								break;
							case 4:
								System.out.print((con+1)+" [Super Luna] ");
								viabilidad = (int)(Math.random()*100+1);
								if (viabilidad <= 45) {
									System.out.println("[Desolación absoluta]");
								} 
								
								if (viabilidad >= 46 && viabilidad <= 60){
									System.out.println("[Potencial de vida]");
								}
								if (viabilidad >= 61 && viabilidad <= 80) {
									System.out.println("[Vida simple]");
									
								}
								if (viabilidad >= 81 && viabilidad <= 90) {
									System.out.println("[Vida compleja]");
									
								}
								if (viabilidad >= 91 && viabilidad <= 100) {
									System.out.print("[Vida inteligente ");
									int vidIntel = (int)(Math.random()*100+1);
									if (vidIntel <= 90) {
										int tipoBeta = (int)(Math.random()*5+1);
										switch (tipoBeta) {
										case 1:
											System.out.println("Prehistorica]");
											break;
										case 2:
											System.out.println("en Edad de Hierro]");
											break;
										case 3:
											System.out.println("en la Edad Media]");
											break;
										case 4:
											System.out.println("en la Edad Industrial]");
											break;
										case 5:
											System.out.println("en la Edad contemporanea]");
										}
									} else if (vidIntel > 91 && vidIntel < 100) {
										System.out.println("de tipo Alpha, en era espacial]");
									}
								}
								break;
							case 5:
								System.out.print((con+1)+" [Luna Congelada] ");
								viabilidad = (int)(Math.random()*100+1);
								if (viabilidad <= 45) {
									System.out.println("[Desolación absoluta]");
								} 
								
								if (viabilidad >= 46 && viabilidad <= 60){
									System.out.println("[Potencial de vida]");
								}
								if (viabilidad >= 61 && viabilidad <= 80) {
									System.out.println("[Vida simple]");
									
								}
								if (viabilidad >= 81 && viabilidad <= 90) {
									System.out.println("[Vida compleja]");
									
								}
								if (viabilidad >= 91 && viabilidad <= 100) {
									System.out.print("[Vida inteligente ");
									int vidIntel = (int)(Math.random()*100+1);
									if (vidIntel <= 90) {
										int tipoBeta = (int)(Math.random()*5+1);
										switch (tipoBeta) {
										case 1:
											System.out.println("Prehistorica]");
											break;
										case 2:
											System.out.println("en Edad de Hierro]");
											break;
										case 3:
											System.out.println("en la Edad Media]");
											break;
										case 4:
											System.out.println("en la Edad Industrial]");
											break;
										case 5:
											System.out.println("en la Edad contemporanea]");
										}
									} else if (vidIntel > 91 && vidIntel < 100) {
										System.out.println("de tipo Alpha, en era espacial]");
									}
								}
								break;
							case 6:
								System.out.print((con+1)+" [Luna Oceánica] ");
								viabilidad = (int)(Math.random()*100+1);
								if (viabilidad <= 45) {
									System.out.println("[Desolación absoluta]");
								} 
								
								if (viabilidad >= 46 && viabilidad <= 60){
									System.out.println("[Potencial de vida]");
								}
								if (viabilidad >= 61 && viabilidad <= 80) {
									System.out.println("[Vida simple]");
									
								}
								if (viabilidad >= 81 && viabilidad <= 90) {
									System.out.println("[Vida compleja]");
									
								}
								if (viabilidad >= 91 && viabilidad <= 100) {
									System.out.print("[Vida inteligente ");
									int vidIntel = (int)(Math.random()*100+1);
									if (vidIntel <= 90) {
										int tipoBeta = (int)(Math.random()*5+1);
										switch (tipoBeta) {
										case 1:
											System.out.println("Prehistorica]");
											break;
										case 2:
											System.out.println("en Edad de Hierro]");
											break;
										case 3:
											System.out.println("en la Edad Media]");
											break;
										case 4:
											System.out.println("en la Edad Industrial]");
											break;
										case 5:
											System.out.println("en la Edad contemporanea]");
										}
									} else if (vidIntel > 91 && vidIntel < 100) {
										System.out.println("de tipo Alpha, en era espacial]");
									}
								}
								break;
							}
							break;
						case 3:
							System.out.println("[Planeta de Lava]");
							while (con != 2) {
								tipoLuna = (int)(Math.random()*6+1);
								switch (tipoLuna) {
								case 1:
									System.out.println((con+1)+" [Luna Inerte] ");
									break;
								case 2:
									System.out.print((con+1)+" [Luna Tiraníde] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 3:
									System.out.println((con+1)+" [Mina Orbitante] ");
									break;
								case 4:
									System.out.print((con+1)+" [Super Luna] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 5:
									System.out.print((con+1)+" [Luna Congelada] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 6:
									System.out.print((con+1)+" [Luna Oceánica] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								}
								con++;
							}
							con = 0;
							break;
						case 4:
							System.out.println("[Mundo océano]");
							while (con != 3) {
								tipoLuna = (int)(Math.random()*6+1);
								switch (tipoLuna) {
								case 1:
									System.out.println((con+1)+" [Luna Inerte] ");
									break;
								case 2:
									System.out.print((con+1)+" [Luna Tiraníde] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 3:
									System.out.println((con+1)+" [Mina Orbitante] ");
									break;
								case 4:
									System.out.print((con+1)+" [Super Luna] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 5:
									System.out.print((con+1)+" [Luna Congelada] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 6:
									System.out.print((con+1)+" [Luna Oceánica] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								}
								con++;
							}
							con = 0;
							break;
						case 5:
							System.out.println("[Subtierra]");
							tipoLuna = (int)(Math.random()*6+1);
							switch (tipoLuna) {
							case 1:
								System.out.println((con+1)+" [Luna Inerte] ");
								break;
							case 2:
								System.out.print((con+1)+" [Luna Tiraníde] ");
								viabilidad = (int)(Math.random()*100+1);
								if (viabilidad <= 45) {
									System.out.println("[Desolación absoluta]");
								} 
								
								if (viabilidad >= 46 && viabilidad <= 60){
									System.out.println("[Potencial de vida]");
								}
								if (viabilidad >= 61 && viabilidad <= 80) {
									System.out.println("[Vida simple]");
									
								}
								if (viabilidad >= 81 && viabilidad <= 90) {
									System.out.println("[Vida compleja]");
									
								}
								if (viabilidad >= 91 && viabilidad <= 100) {
									System.out.print("[Vida inteligente ");
									int vidIntel = (int)(Math.random()*100+1);
									if (vidIntel <= 90) {
										int tipoBeta = (int)(Math.random()*5+1);
										switch (tipoBeta) {
										case 1:
											System.out.println("Prehistorica]");
											break;
										case 2:
											System.out.println("en Edad de Hierro]");
											break;
										case 3:
											System.out.println("en la Edad Media]");
											break;
										case 4:
											System.out.println("en la Edad Industrial]");
											break;
										case 5:
											System.out.println("en la Edad contemporanea]");
										}
									} else if (vidIntel > 91 && vidIntel < 100) {
										System.out.println("de tipo Alpha, en era espacial]");
									}
								}
								break;
							case 3:
								System.out.println((con+1)+" [Mina Orbitante] ");
								break;
							case 4:
								System.out.print((con+1)+" [Super Luna] ");
								viabilidad = (int)(Math.random()*100+1);
								if (viabilidad <= 45) {
									System.out.println("[Desolación absoluta]");
								} 
								
								if (viabilidad >= 46 && viabilidad <= 60){
									System.out.println("[Potencial de vida]");
								}
								if (viabilidad >= 61 && viabilidad <= 80) {
									System.out.println("[Vida simple]");
									
								}
								if (viabilidad >= 81 && viabilidad <= 90) {
									System.out.println("[Vida compleja]");
									
								}
								if (viabilidad >= 91 && viabilidad <= 100) {
									System.out.print("[Vida inteligente ");
									int vidIntel = (int)(Math.random()*100+1);
									if (vidIntel <= 90) {
										int tipoBeta = (int)(Math.random()*5+1);
										switch (tipoBeta) {
										case 1:
											System.out.println("Prehistorica]");
											break;
										case 2:
											System.out.println("en Edad de Hierro]");
											break;
										case 3:
											System.out.println("en la Edad Media]");
											break;
										case 4:
											System.out.println("en la Edad Industrial]");
											break;
										case 5:
											System.out.println("en la Edad contemporanea]");
										}
									} else if (vidIntel > 91 && vidIntel < 100) {
										System.out.println("de tipo Alpha, en era espacial]");
									}
								}
								break;
							case 5:
								System.out.print((con+1)+" [Luna Congelada] ");
								viabilidad = (int)(Math.random()*100+1);
								if (viabilidad <= 45) {
									System.out.println("[Desolación absoluta]");
								} 
								
								if (viabilidad >= 46 && viabilidad <= 60){
									System.out.println("[Potencial de vida]");
								}
								if (viabilidad >= 61 && viabilidad <= 80) {
									System.out.println("[Vida simple]");
									
								}
								if (viabilidad >= 81 && viabilidad <= 90) {
									System.out.println("[Vida compleja]");
									
								}
								if (viabilidad >= 91 && viabilidad <= 100) {
									System.out.print("[Vida inteligente ");
									int vidIntel = (int)(Math.random()*100+1);
									if (vidIntel <= 90) {
										int tipoBeta = (int)(Math.random()*5+1);
										switch (tipoBeta) {
										case 1:
											System.out.println("Prehistorica]");
											break;
										case 2:
											System.out.println("en Edad de Hierro]");
											break;
										case 3:
											System.out.println("en la Edad Media]");
											break;
										case 4:
											System.out.println("en la Edad Industrial]");
											break;
										case 5:
											System.out.println("en la Edad contemporanea]");
										}
									} else if (vidIntel > 91 && vidIntel < 100) {
										System.out.println("de tipo Alpha, en era espacial]");
									}
								}
								break;
							case 6:
								System.out.print((con+1)+" [Luna Oceánica] ");
								viabilidad = (int)(Math.random()*100+1);
								if (viabilidad <= 45) {
									System.out.println("[Desolación absoluta]");
								} 
								
								if (viabilidad >= 46 && viabilidad <= 60){
									System.out.println("[Potencial de vida]");
								}
								if (viabilidad >= 61 && viabilidad <= 80) {
									System.out.println("[Vida simple]");
									
								}
								if (viabilidad >= 81 && viabilidad <= 90) {
									System.out.println("[Vida compleja]");
									
								}
								if (viabilidad >= 91 && viabilidad <= 100) {
									System.out.print("[Vida inteligente ");
									int vidIntel = (int)(Math.random()*100+1);
									if (vidIntel <= 90) {
										int tipoBeta = (int)(Math.random()*5+1);
										switch (tipoBeta) {
										case 1:
											System.out.println("Prehistorica]");
											break;
										case 2:
											System.out.println("en Edad de Hierro]");
											break;
										case 3:
											System.out.println("en la Edad Media]");
											break;
										case 4:
											System.out.println("en la Edad Industrial]");
											break;
										case 5:
											System.out.println("en la Edad contemporanea]");
										}
									} else if (vidIntel > 91 && vidIntel < 100) {
										System.out.println("de tipo Alpha, en era espacial]");
									}
								}
								break;
							}
							break;
						case 6:
							System.out.println("[Super Tierra]");
							tipoLuna = (int)(Math.random()*6+1);
							switch (tipoLuna) {
							case 1:
								System.out.println((con+1)+" [Luna Inerte] ");
								break;
							case 2:
								System.out.print((con+1)+" [Luna Tiraníde] ");
								viabilidad = (int)(Math.random()*100+1);
								if (viabilidad <= 45) {
									System.out.println("[Desolación absoluta]");
								} 
								
								if (viabilidad >= 46 && viabilidad <= 60){
									System.out.println("[Potencial de vida]");
								}
								if (viabilidad >= 61 && viabilidad <= 80) {
									System.out.println("[Vida simple]");
									
								}
								if (viabilidad >= 81 && viabilidad <= 90) {
									System.out.println("[Vida compleja]");
									
								}
								if (viabilidad >= 91 && viabilidad <= 100) {
									System.out.print("[Vida inteligente ");
									int vidIntel = (int)(Math.random()*100+1);
									if (vidIntel <= 90) {
										int tipoBeta = (int)(Math.random()*5+1);
										switch (tipoBeta) {
										case 1:
											System.out.println("Prehistorica]");
											break;
										case 2:
											System.out.println("en Edad de Hierro]");
											break;
										case 3:
											System.out.println("en la Edad Media]");
											break;
										case 4:
											System.out.println("en la Edad Industrial]");
											break;
										case 5:
											System.out.println("en la Edad contemporanea]");
										}
									} else if (vidIntel > 91 && vidIntel < 100) {
										System.out.println("de tipo Alpha, en era espacial]");
									}
								}
								break;
							case 3:
								System.out.println((con+1)+" [Mina Orbitante] ");
								break;
							case 4:
								System.out.print((con+1)+" [Super Luna] ");
								viabilidad = (int)(Math.random()*100+1);
								if (viabilidad <= 45) {
									System.out.println("[Desolación absoluta]");
								} 
								
								if (viabilidad >= 46 && viabilidad <= 60){
									System.out.println("[Potencial de vida]");
								}
								if (viabilidad >= 61 && viabilidad <= 80) {
									System.out.println("[Vida simple]");
									
								}
								if (viabilidad >= 81 && viabilidad <= 90) {
									System.out.println("[Vida compleja]");
									
								}
								if (viabilidad >= 91 && viabilidad <= 100) {
									System.out.print("[Vida inteligente ");
									int vidIntel = (int)(Math.random()*100+1);
									if (vidIntel <= 90) {
										int tipoBeta = (int)(Math.random()*5+1);
										switch (tipoBeta) {
										case 1:
											System.out.println("Prehistorica]");
											break;
										case 2:
											System.out.println("en Edad de Hierro]");
											break;
										case 3:
											System.out.println("en la Edad Media]");
											break;
										case 4:
											System.out.println("en la Edad Industrial]");
											break;
										case 5:
											System.out.println("en la Edad contemporanea]");
										}
									} else if (vidIntel > 91 && vidIntel < 100) {
										System.out.println("de tipo Alpha, en era espacial]");
									}
								}
								break;
							case 5:
								System.out.print((con+1)+" [Luna Congelada] ");
								viabilidad = (int)(Math.random()*100+1);
								if (viabilidad <= 45) {
									System.out.println("[Desolación absoluta]");
								} 
								
								if (viabilidad >= 46 && viabilidad <= 60){
									System.out.println("[Potencial de vida]");
								}
								if (viabilidad >= 61 && viabilidad <= 80) {
									System.out.println("[Vida simple]");
									
								}
								if (viabilidad >= 81 && viabilidad <= 90) {
									System.out.println("[Vida compleja]");
									
								}
								if (viabilidad >= 91 && viabilidad <= 100) {
									System.out.print("[Vida inteligente ");
									int vidIntel = (int)(Math.random()*100+1);
									if (vidIntel <= 90) {
										int tipoBeta = (int)(Math.random()*5+1);
										switch (tipoBeta) {
										case 1:
											System.out.println("Prehistorica]");
											break;
										case 2:
											System.out.println("en Edad de Hierro]");
											break;
										case 3:
											System.out.println("en la Edad Media]");
											break;
										case 4:
											System.out.println("en la Edad Industrial]");
											break;
										case 5:
											System.out.println("en la Edad contemporanea]");
										}
									} else if (vidIntel > 91 && vidIntel < 100) {
										System.out.println("de tipo Alpha, en era espacial]");
									}
								}
								break;
							case 6:
								System.out.print((con+1)+" [Luna Oceánica] ");
								viabilidad = (int)(Math.random()*100+1);
								if (viabilidad <= 45) {
									System.out.println("[Desolación absoluta]");
								} 
								
								if (viabilidad >= 46 && viabilidad <= 60){
									System.out.println("[Potencial de vida]");
								}
								if (viabilidad >= 61 && viabilidad <= 80) {
									System.out.println("[Vida simple]");
									
								}
								if (viabilidad >= 81 && viabilidad <= 90) {
									System.out.println("[Vida compleja]");
									
								}
								if (viabilidad >= 91 && viabilidad <= 100) {
									System.out.print("[Vida inteligente ");
									int vidIntel = (int)(Math.random()*100+1);
									if (vidIntel <= 90) {
										int tipoBeta = (int)(Math.random()*5+1);
										switch (tipoBeta) {
										case 1:
											System.out.println("Prehistorica]");
											break;
										case 2:
											System.out.println("en Edad de Hierro]");
											break;
										case 3:
											System.out.println("en la Edad Media]");
											break;
										case 4:
											System.out.println("en la Edad Industrial]");
											break;
										case 5:
											System.out.println("en la Edad contemporanea]");
										}
									} else if (vidIntel > 91 && vidIntel < 100) {
										System.out.println("de tipo Alpha, en era espacial]");
									}
								}
								break;
							}
							break;
						case 7:
							System.out.println("[Planeta Super Habitable]");
							while (con != 2) {
								tipoLuna = (int)(Math.random()*6+1);
								switch (tipoLuna) {
								case 1:
									System.out.println((con+1)+" [Luna Inerte] ");
									break;
								case 2:
									System.out.print((con+1)+" [Luna Tiraníde] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 3:
									System.out.println((con+1)+" [Mina Orbitante] ");
									break;
								case 4:
									System.out.print((con+1)+" [Super Luna] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 5:
									System.out.print((con+1)+" [Luna Congelada] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 6:
									System.out.print((con+1)+" [Luna Oceánica] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								}
								con++;
							}
							con = 0;
							break;
						case 8:
							System.out.println("[Planeta de hierro]");
							while (con != 2) {
								tipoLuna = (int)(Math.random()*6+1);
								switch (tipoLuna) {
								case 1:
									System.out.println((con+1)+" [Luna Inerte] ");
									break;
								case 2:
									System.out.print((con+1)+" [Luna Tiraníde] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 3:
									System.out.println((con+1)+" [Mina Orbitante] ");
									break;
								case 4:
									System.out.print((con+1)+" [Super Luna] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 5:
									System.out.print((con+1)+" [Luna Congelada] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 6:
									System.out.print((con+1)+" [Luna Oceánica] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								}
								con++;
							}
							con = 0;
							break;
						}
					}
				} else {
					System.out.println("La \"" + tipoEstrella[cantMundos-1] + "\" tiene un mundo");
					int terraGas = (int)(Math.random()*100+1);
					if (terraGas >= 1 && terraGas <= 60) {
						planetaGaseoso = (int)(Math.random()*6+1);
						switch (planetaGaseoso) {
						case 1:
							System.out.println("[Gigante de gas]");
							while (con != 2) {
								tipoLuna = (int)(Math.random()*6+1);
								switch (tipoLuna) {
								case 1:
									System.out.println((con+1)+" [Luna Inerte] ");
									break;
								case 2:
									System.out.print((con+1)+" [Luna Tiraníde] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 3:
									System.out.println((con+1)+" [Mina Orbitante] ");
									break;
								case 4:
									System.out.print((con+1)+" [Super Luna] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 5:
									System.out.print((con+1)+" [Luna Congelada] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 6:
									System.out.print((con+1)+" [Luna Oceánica] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								}
								con++;
							}
							break;
						case 2:
							System.out.println("[Enana Marrón]");
							while (con != 3) {
								tipoLuna = (int)(Math.random()*6+1);
								switch (tipoLuna) {
								case 1:
									System.out.println((con+1)+" [Luna Inerte] ");
									break;
								case 2:
									System.out.print((con+1)+" [Luna Tiraníde] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 3:
									System.out.println((con+1)+" [Mina Orbitante] ");
									break;
								case 4:
									System.out.print((con+1)+" [Super Luna] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 5:
									System.out.print((con+1)+" [Luna Congelada] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 6:
									System.out.print((con+1)+" [Luna Oceánica] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								}
								con++;
							}
							break;
						case 3:
							System.out.println("[Mini-Neptuno]");
							while (con != 4) {
								tipoLuna = (int)(Math.random()*6+1);
								switch (tipoLuna) {
								case 1:
									System.out.println((con+1)+" [Luna Inerte] ");
									break;
								case 2:
									System.out.print((con+1)+" [Luna Tiraníde] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 3:
									System.out.println((con+1)+" [Mina Orbitante] ");
									break;
								case 4:
									System.out.print((con+1)+" [Super Luna] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 5:
									System.out.print((con+1)+" [Luna Congelada] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 6:
									System.out.print((con+1)+" [Luna Oceánica] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								}
								con++;
							}
							break;
						case 4:
							System.out.println("[Neptuno Caliente]");
							while (con != 2) {
								tipoLuna = (int)(Math.random()*6+1);
								switch (tipoLuna) {
								case 1:
									System.out.println((con+1)+" [Luna Inerte] ");
									break;
								case 2:
									System.out.print((con+1)+" [Luna Tiraníde] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 3:
									System.out.println((con+1)+" [Mina Orbitante] ");
									break;
								case 4:
									System.out.print((con+1)+" [Super Luna] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 5:
									System.out.print((con+1)+" [Luna Congelada] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 6:
									System.out.print((con+1)+" [Luna Oceánica] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								}
								con++;
							}
							break;
						case 5:
							System.out.println("[Júpiter Caliente]");
							tipoLuna = (int)(Math.random()*6+1);
							switch (tipoLuna) {
							case 1:
								System.out.println((con+1)+" [Luna Inerte] ");
								break;
							case 2:
								System.out.print((con+1)+" [Luna Tiraníde] ");
								viabilidad = (int)(Math.random()*100+1);
								if (viabilidad <= 45) {
									System.out.println("[Desolación absoluta]");
								} 
								
								if (viabilidad >= 46 && viabilidad <= 60){
									System.out.println("[Potencial de vida]");
								}
								if (viabilidad >= 61 && viabilidad <= 80) {
									System.out.println("[Vida simple]");
									
								}
								if (viabilidad >= 81 && viabilidad <= 90) {
									System.out.println("[Vida compleja]");
									
								}
								if (viabilidad >= 91 && viabilidad <= 100) {
									System.out.print("[Vida inteligente ");
									int vidIntel = (int)(Math.random()*100+1);
									if (vidIntel <= 90) {
										int tipoBeta = (int)(Math.random()*5+1);
										switch (tipoBeta) {
										case 1:
											System.out.println("Prehistorica]");
											break;
										case 2:
											System.out.println("en Edad de Hierro]");
											break;
										case 3:
											System.out.println("en la Edad Media]");
											break;
										case 4:
											System.out.println("en la Edad Industrial]");
											break;
										case 5:
											System.out.println("en la Edad contemporanea]");
										}
									} else if (vidIntel > 91 && vidIntel < 100) {
										System.out.println("de tipo Alpha, en era espacial]");
									}
								}
								break;
							case 3:
								System.out.println((con+1)+" [Mina Orbitante] ");
								break;
							case 4:
								System.out.print((con+1)+" [Super Luna] ");
								viabilidad = (int)(Math.random()*100+1);
								if (viabilidad <= 45) {
									System.out.println("[Desolación absoluta]");
								} 
								
								if (viabilidad >= 46 && viabilidad <= 60){
									System.out.println("[Potencial de vida]");
								}
								if (viabilidad >= 61 && viabilidad <= 80) {
									System.out.println("[Vida simple]");
									
								}
								if (viabilidad >= 81 && viabilidad <= 90) {
									System.out.println("[Vida compleja]");
									
								}
								if (viabilidad >= 91 && viabilidad <= 100) {
									System.out.print("[Vida inteligente ");
									int vidIntel = (int)(Math.random()*100+1);
									if (vidIntel <= 90) {
										int tipoBeta = (int)(Math.random()*5+1);
										switch (tipoBeta) {
										case 1:
											System.out.println("Prehistorica]");
											break;
										case 2:
											System.out.println("en Edad de Hierro]");
											break;
										case 3:
											System.out.println("en la Edad Media]");
											break;
										case 4:
											System.out.println("en la Edad Industrial]");
											break;
										case 5:
											System.out.println("en la Edad contemporanea]");
										}
									} else if (vidIntel > 91 && vidIntel < 100) {
										System.out.println("de tipo Alpha, en era espacial]");
									}
								}
								break;
							case 5:
								System.out.print((con+1)+" [Luna Congelada] ");
								viabilidad = (int)(Math.random()*100+1);
								if (viabilidad <= 45) {
									System.out.println("[Desolación absoluta]");
								} 
								
								if (viabilidad >= 46 && viabilidad <= 60){
									System.out.println("[Potencial de vida]");
								}
								if (viabilidad >= 61 && viabilidad <= 80) {
									System.out.println("[Vida simple]");
									
								}
								if (viabilidad >= 81 && viabilidad <= 90) {
									System.out.println("[Vida compleja]");
									
								}
								if (viabilidad >= 91 && viabilidad <= 100) {
									System.out.print("[Vida inteligente ");
									int vidIntel = (int)(Math.random()*100+1);
									if (vidIntel <= 90) {
										int tipoBeta = (int)(Math.random()*5+1);
										switch (tipoBeta) {
										case 1:
											System.out.println("Prehistorica]");
											break;
										case 2:
											System.out.println("en Edad de Hierro]");
											break;
										case 3:
											System.out.println("en la Edad Media]");
											break;
										case 4:
											System.out.println("en la Edad Industrial]");
											break;
										case 5:
											System.out.println("en la Edad contemporanea]");
										}
									} else if (vidIntel > 91 && vidIntel < 100) {
										System.out.println("de tipo Alpha, en era espacial]");
									}
								}
								break;
							case 6:
								System.out.print((con+1)+" [Luna Oceánica] ");
								viabilidad = (int)(Math.random()*100+1);
								if (viabilidad <= 45) {
									System.out.println("[Desolación absoluta]");
								} 
								
								if (viabilidad >= 46 && viabilidad <= 60){
									System.out.println("[Potencial de vida]");
								}
								if (viabilidad >= 61 && viabilidad <= 80) {
									System.out.println("[Vida simple]");
									
								}
								if (viabilidad >= 81 && viabilidad <= 90) {
									System.out.println("[Vida compleja]");
									
								}
								if (viabilidad >= 91 && viabilidad <= 100) {
									System.out.print("[Vida inteligente ");
									int vidIntel = (int)(Math.random()*100+1);
									if (vidIntel <= 90) {
										int tipoBeta = (int)(Math.random()*5+1);
										switch (tipoBeta) {
										case 1:
											System.out.println("Prehistorica]");
											break;
										case 2:
											System.out.println("en Edad de Hierro]");
											break;
										case 3:
											System.out.println("en la Edad Media]");
											break;
										case 4:
											System.out.println("en la Edad Industrial]");
											break;
										case 5:
											System.out.println("en la Edad contemporanea]");
										}
									} else if (vidIntel > 91 && vidIntel < 100) {
										System.out.println("de tipo Alpha, en era espacial]");
									}
								}
								break;
							}
							break;
						case 6:
							System.out.println("[Gigante de oro]");
							while (con != 5) {
								tipoLuna = (int)(Math.random()*6+1);
								switch (tipoLuna) {
								case 1:
									System.out.println((con+1)+" [Luna Inerte] ");
									break;
								case 2:
									System.out.print((con+1)+" [Luna Tiraníde] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 3:
									System.out.println((con+1)+" [Mina Orbitante] ");
									break;
								case 4:
									System.out.print((con+1)+" [Super Luna] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 5:
									System.out.print((con+1)+" [Luna Congelada] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 6:
									System.out.print((con+1)+" [Luna Oceánica] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								}
								con++;
							}
							break;
						}
					} else if (terraGas >= 61 && terraGas <= 100) {
						planetaTerrenal = (int)(Math.random()*6+1);
						switch (planetaTerrenal) {
						case 1:
							System.out.println("[Planeta de Carbono] ");
							while (con != 2) {
								tipoLuna = (int)(Math.random()*6+1);
								switch (tipoLuna) {
								case 1:
									System.out.println((con+1)+" [Luna Inerte] ");
									break;
								case 2:
									System.out.print((con+1)+" [Luna Tiraníde] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 3:
									System.out.println((con+1)+" [Mina Orbitante] ");
									break;
								case 4:
									System.out.print((con+1)+" [Super Luna] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 5:
									System.out.print((con+1)+" [Luna Congelada] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 6:
									System.out.print((con+1)+" [Luna Oceánica] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								}
								con++;
							}
							con = 0;
							break;
						case 2:
							System.out.println("[Planeta Helado]");
							tipoLuna = (int)(Math.random()*6+1);
							switch (tipoLuna) {
							case 1:
								System.out.println((con+1)+" [Luna Inerte] ");
								break;
							case 2:
								System.out.print((con+1)+" [Luna Tiraníde] ");
								viabilidad = (int)(Math.random()*100+1);
								if (viabilidad <= 45) {
									System.out.println("[Desolación absoluta]");
								} 
								
								if (viabilidad >= 46 && viabilidad <= 60){
									System.out.println("[Potencial de vida]");
								}
								if (viabilidad >= 61 && viabilidad <= 80) {
									System.out.println("[Vida simple]");
									
								}
								if (viabilidad >= 81 && viabilidad <= 90) {
									System.out.println("[Vida compleja]");
									
								}
								if (viabilidad >= 91 && viabilidad <= 100) {
									System.out.print("[Vida inteligente ");
									int vidIntel = (int)(Math.random()*100+1);
									if (vidIntel <= 90) {
										int tipoBeta = (int)(Math.random()*5+1);
										switch (tipoBeta) {
										case 1:
											System.out.println("Prehistorica]");
											break;
										case 2:
											System.out.println("en Edad de Hierro]");
											break;
										case 3:
											System.out.println("en la Edad Media]");
											break;
										case 4:
											System.out.println("en la Edad Industrial]");
											break;
										case 5:
											System.out.println("en la Edad contemporanea]");
										}
									} else if (vidIntel > 91 && vidIntel < 100) {
										System.out.println("de tipo Alpha, en era espacial]");
									}
								}
								break;
							case 3:
								System.out.println((con+1)+" [Mina Orbitante] ");
								break;
							case 4:
								System.out.print((con+1)+" [Super Luna] ");
								viabilidad = (int)(Math.random()*100+1);
								if (viabilidad <= 45) {
									System.out.println("[Desolación absoluta]");
								} 
								
								if (viabilidad >= 46 && viabilidad <= 60){
									System.out.println("[Potencial de vida]");
								}
								if (viabilidad >= 61 && viabilidad <= 80) {
									System.out.println("[Vida simple]");
									
								}
								if (viabilidad >= 81 && viabilidad <= 90) {
									System.out.println("[Vida compleja]");
									
								}
								if (viabilidad >= 91 && viabilidad <= 100) {
									System.out.print("[Vida inteligente ");
									int vidIntel = (int)(Math.random()*100+1);
									if (vidIntel <= 90) {
										int tipoBeta = (int)(Math.random()*5+1);
										switch (tipoBeta) {
										case 1:
											System.out.println("Prehistorica]");
											break;
										case 2:
											System.out.println("en Edad de Hierro]");
											break;
										case 3:
											System.out.println("en la Edad Media]");
											break;
										case 4:
											System.out.println("en la Edad Industrial]");
											break;
										case 5:
											System.out.println("en la Edad contemporanea]");
										}
									} else if (vidIntel > 91 && vidIntel < 100) {
										System.out.println("de tipo Alpha, en era espacial]");
									}
								}
								break;
							case 5:
								System.out.print((con+1)+" [Luna Congelada] ");
								viabilidad = (int)(Math.random()*100+1);
								if (viabilidad <= 45) {
									System.out.println("[Desolación absoluta]");
								} 
								
								if (viabilidad >= 46 && viabilidad <= 60){
									System.out.println("[Potencial de vida]");
								}
								if (viabilidad >= 61 && viabilidad <= 80) {
									System.out.println("[Vida simple]");
									
								}
								if (viabilidad >= 81 && viabilidad <= 90) {
									System.out.println("[Vida compleja]");
									
								}
								if (viabilidad >= 91 && viabilidad <= 100) {
									System.out.print("[Vida inteligente ");
									int vidIntel = (int)(Math.random()*100+1);
									if (vidIntel <= 90) {
										int tipoBeta = (int)(Math.random()*5+1);
										switch (tipoBeta) {
										case 1:
											System.out.println("Prehistorica]");
											break;
										case 2:
											System.out.println("en Edad de Hierro]");
											break;
										case 3:
											System.out.println("en la Edad Media]");
											break;
										case 4:
											System.out.println("en la Edad Industrial]");
											break;
										case 5:
											System.out.println("en la Edad contemporanea]");
										}
									} else if (vidIntel > 91 && vidIntel < 100) {
										System.out.println("de tipo Alpha, en era espacial]");
									}
								}
								break;
							case 6:
								System.out.print((con+1)+" [Luna Oceánica] ");
								viabilidad = (int)(Math.random()*100+1);
								if (viabilidad <= 45) {
									System.out.println("[Desolación absoluta]");
								} 
								
								if (viabilidad >= 46 && viabilidad <= 60){
									System.out.println("[Potencial de vida]");
								}
								if (viabilidad >= 61 && viabilidad <= 80) {
									System.out.println("[Vida simple]");
									
								}
								if (viabilidad >= 81 && viabilidad <= 90) {
									System.out.println("[Vida compleja]");
									
								}
								if (viabilidad >= 91 && viabilidad <= 100) {
									System.out.print("[Vida inteligente ");
									int vidIntel = (int)(Math.random()*100+1);
									if (vidIntel <= 90) {
										int tipoBeta = (int)(Math.random()*5+1);
										switch (tipoBeta) {
										case 1:
											System.out.println("Prehistorica]");
											break;
										case 2:
											System.out.println("en Edad de Hierro]");
											break;
										case 3:
											System.out.println("en la Edad Media]");
											break;
										case 4:
											System.out.println("en la Edad Industrial]");
											break;
										case 5:
											System.out.println("en la Edad contemporanea]");
										}
									} else if (vidIntel > 91 && vidIntel < 100) {
										System.out.println("de tipo Alpha, en era espacial]");
									}
								}
								break;
							}
							break;
						case 3:
							System.out.println("[Planeta de Lava]");
							while (con != 2) {
								tipoLuna = (int)(Math.random()*6+1);
								switch (tipoLuna) {
								case 1:
									System.out.println((con+1)+" [Luna Inerte] ");
									break;
								case 2:
									System.out.print((con+1)+" [Luna Tiraníde] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 3:
									System.out.println((con+1)+" [Mina Orbitante] ");
									break;
								case 4:
									System.out.print((con+1)+" [Super Luna] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 5:
									System.out.print((con+1)+" [Luna Congelada] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 6:
									System.out.print((con+1)+" [Luna Oceánica] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								}
								con++;
							}
							con = 0;
							break;
						case 4:
							System.out.println("[Mundo océano]");
							while (con != 3) {
								tipoLuna = (int)(Math.random()*6+1);
								switch (tipoLuna) {
								case 1:
									System.out.println((con+1)+" [Luna Inerte] ");
									break;
								case 2:
									System.out.print((con+1)+" [Luna Tiraníde] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 3:
									System.out.println((con+1)+" [Mina Orbitante] ");
									break;
								case 4:
									System.out.print((con+1)+" [Super Luna] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 5:
									System.out.print((con+1)+" [Luna Congelada] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 6:
									System.out.print((con+1)+" [Luna Oceánica] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								}
								con++;
							}
							con = 0;
							break;
						case 5:
							System.out.println("[Subtierra]");
							tipoLuna = (int)(Math.random()*6+1);
							switch (tipoLuna) {
							case 1:
								System.out.println((con+1)+" [Luna Inerte] ");
								break;
							case 2:
								System.out.print((con+1)+" [Luna Tiraníde] ");
								viabilidad = (int)(Math.random()*100+1);
								if (viabilidad <= 45) {
									System.out.println("[Desolación absoluta]");
								} 
								
								if (viabilidad >= 46 && viabilidad <= 60){
									System.out.println("[Potencial de vida]");
								}
								if (viabilidad >= 61 && viabilidad <= 80) {
									System.out.println("[Vida simple]");
									
								}
								if (viabilidad >= 81 && viabilidad <= 90) {
									System.out.println("[Vida compleja]");
									
								}
								if (viabilidad >= 91 && viabilidad <= 100) {
									System.out.print("[Vida inteligente ");
									int vidIntel = (int)(Math.random()*100+1);
									if (vidIntel <= 90) {
										int tipoBeta = (int)(Math.random()*5+1);
										switch (tipoBeta) {
										case 1:
											System.out.println("Prehistorica]");
											break;
										case 2:
											System.out.println("en Edad de Hierro]");
											break;
										case 3:
											System.out.println("en la Edad Media]");
											break;
										case 4:
											System.out.println("en la Edad Industrial]");
											break;
										case 5:
											System.out.println("en la Edad contemporanea]");
										}
									} else if (vidIntel > 91 && vidIntel < 100) {
										System.out.println("de tipo Alpha, en era espacial]");
									}
								}
								break;
							case 3:
								System.out.println((con+1)+" [Mina Orbitante] ");
								break;
							case 4:
								System.out.print((con+1)+" [Super Luna] ");
								viabilidad = (int)(Math.random()*100+1);
								if (viabilidad <= 45) {
									System.out.println("[Desolación absoluta]");
								} 
								
								if (viabilidad >= 46 && viabilidad <= 60){
									System.out.println("[Potencial de vida]");
								}
								if (viabilidad >= 61 && viabilidad <= 80) {
									System.out.println("[Vida simple]");
									
								}
								if (viabilidad >= 81 && viabilidad <= 90) {
									System.out.println("[Vida compleja]");
									
								}
								if (viabilidad >= 91 && viabilidad <= 100) {
									System.out.print("[Vida inteligente ");
									int vidIntel = (int)(Math.random()*100+1);
									if (vidIntel <= 90) {
										int tipoBeta = (int)(Math.random()*5+1);
										switch (tipoBeta) {
										case 1:
											System.out.println("Prehistorica]");
											break;
										case 2:
											System.out.println("en Edad de Hierro]");
											break;
										case 3:
											System.out.println("en la Edad Media]");
											break;
										case 4:
											System.out.println("en la Edad Industrial]");
											break;
										case 5:
											System.out.println("en la Edad contemporanea]");
										}
									} else if (vidIntel > 91 && vidIntel < 100) {
										System.out.println("de tipo Alpha, en era espacial]");
									}
								}
								break;
							case 5:
								System.out.print((con+1)+" [Luna Congelada] ");
								viabilidad = (int)(Math.random()*100+1);
								if (viabilidad <= 45) {
									System.out.println("[Desolación absoluta]");
								} 
								
								if (viabilidad >= 46 && viabilidad <= 60){
									System.out.println("[Potencial de vida]");
								}
								if (viabilidad >= 61 && viabilidad <= 80) {
									System.out.println("[Vida simple]");
									
								}
								if (viabilidad >= 81 && viabilidad <= 90) {
									System.out.println("[Vida compleja]");
									
								}
								if (viabilidad >= 91 && viabilidad <= 100) {
									System.out.print("[Vida inteligente ");
									int vidIntel = (int)(Math.random()*100+1);
									if (vidIntel <= 90) {
										int tipoBeta = (int)(Math.random()*5+1);
										switch (tipoBeta) {
										case 1:
											System.out.println("Prehistorica]");
											break;
										case 2:
											System.out.println("en Edad de Hierro]");
											break;
										case 3:
											System.out.println("en la Edad Media]");
											break;
										case 4:
											System.out.println("en la Edad Industrial]");
											break;
										case 5:
											System.out.println("en la Edad contemporanea]");
										}
									} else if (vidIntel > 91 && vidIntel < 100) {
										System.out.println("de tipo Alpha, en era espacial]");
									}
								}
								break;
							case 6:
								System.out.print((con+1)+" [Luna Oceánica] ");
								viabilidad = (int)(Math.random()*100+1);
								if (viabilidad <= 45) {
									System.out.println("[Desolación absoluta]");
								} 
								
								if (viabilidad >= 46 && viabilidad <= 60){
									System.out.println("[Potencial de vida]");
								}
								if (viabilidad >= 61 && viabilidad <= 80) {
									System.out.println("[Vida simple]");
									
								}
								if (viabilidad >= 81 && viabilidad <= 90) {
									System.out.println("[Vida compleja]");
									
								}
								if (viabilidad >= 91 && viabilidad <= 100) {
									System.out.print("[Vida inteligente ");
									int vidIntel = (int)(Math.random()*100+1);
									if (vidIntel <= 90) {
										int tipoBeta = (int)(Math.random()*5+1);
										switch (tipoBeta) {
										case 1:
											System.out.println("Prehistorica]");
											break;
										case 2:
											System.out.println("en Edad de Hierro]");
											break;
										case 3:
											System.out.println("en la Edad Media]");
											break;
										case 4:
											System.out.println("en la Edad Industrial]");
											break;
										case 5:
											System.out.println("en la Edad contemporanea]");
										}
									} else if (vidIntel > 91 && vidIntel < 100) {
										System.out.println("de tipo Alpha, en era espacial]");
									}
								}
								break;
							}
							break;
						case 6:
							System.out.println("[Super Tierra]");
							tipoLuna = (int)(Math.random()*6+1);
							switch (tipoLuna) {
							case 1:
								System.out.println((con+1)+" [Luna Inerte] ");
								break;
							case 2:
								System.out.print((con+1)+" [Luna Tiraníde] ");
								viabilidad = (int)(Math.random()*100+1);
								if (viabilidad <= 45) {
									System.out.println("[Desolación absoluta]");
								} 
								
								if (viabilidad >= 46 && viabilidad <= 60){
									System.out.println("[Potencial de vida]");
								}
								if (viabilidad >= 61 && viabilidad <= 80) {
									System.out.println("[Vida simple]");
									
								}
								if (viabilidad >= 81 && viabilidad <= 90) {
									System.out.println("[Vida compleja]");
									
								}
								if (viabilidad >= 91 && viabilidad <= 100) {
									System.out.print("[Vida inteligente ");
									int vidIntel = (int)(Math.random()*100+1);
									if (vidIntel <= 90) {
										int tipoBeta = (int)(Math.random()*5+1);
										switch (tipoBeta) {
										case 1:
											System.out.println("Prehistorica]");
											break;
										case 2:
											System.out.println("en Edad de Hierro]");
											break;
										case 3:
											System.out.println("en la Edad Media]");
											break;
										case 4:
											System.out.println("en la Edad Industrial]");
											break;
										case 5:
											System.out.println("en la Edad contemporanea]");
										}
									} else if (vidIntel > 91 && vidIntel < 100) {
										System.out.println("de tipo Alpha, en era espacial]");
									}
								}
								break;
							case 3:
								System.out.println((con+1)+" [Mina Orbitante] ");
								break;
							case 4:
								System.out.print((con+1)+" [Super Luna] ");
								viabilidad = (int)(Math.random()*100+1);
								if (viabilidad <= 45) {
									System.out.println("[Desolación absoluta]");
								} 
								
								if (viabilidad >= 46 && viabilidad <= 60){
									System.out.println("[Potencial de vida]");
								}
								if (viabilidad >= 61 && viabilidad <= 80) {
									System.out.println("[Vida simple]");
									
								}
								if (viabilidad >= 81 && viabilidad <= 90) {
									System.out.println("[Vida compleja]");
									
								}
								if (viabilidad >= 91 && viabilidad <= 100) {
									System.out.print("[Vida inteligente ");
									int vidIntel = (int)(Math.random()*100+1);
									if (vidIntel <= 90) {
										int tipoBeta = (int)(Math.random()*5+1);
										switch (tipoBeta) {
										case 1:
											System.out.println("Prehistorica]");
											break;
										case 2:
											System.out.println("en Edad de Hierro]");
											break;
										case 3:
											System.out.println("en la Edad Media]");
											break;
										case 4:
											System.out.println("en la Edad Industrial]");
											break;
										case 5:
											System.out.println("en la Edad contemporanea]");
										}
									} else if (vidIntel > 91 && vidIntel < 100) {
										System.out.println("de tipo Alpha, en era espacial]");
									}
								}
								break;
							case 5:
								System.out.print((con+1)+" [Luna Congelada] ");
								viabilidad = (int)(Math.random()*100+1);
								if (viabilidad <= 45) {
									System.out.println("[Desolación absoluta]");
								} 
								
								if (viabilidad >= 46 && viabilidad <= 60){
									System.out.println("[Potencial de vida]");
								}
								if (viabilidad >= 61 && viabilidad <= 80) {
									System.out.println("[Vida simple]");
									
								}
								if (viabilidad >= 81 && viabilidad <= 90) {
									System.out.println("[Vida compleja]");
									
								}
								if (viabilidad >= 91 && viabilidad <= 100) {
									System.out.print("[Vida inteligente ");
									int vidIntel = (int)(Math.random()*100+1);
									if (vidIntel <= 90) {
										int tipoBeta = (int)(Math.random()*5+1);
										switch (tipoBeta) {
										case 1:
											System.out.println("Prehistorica]");
											break;
										case 2:
											System.out.println("en Edad de Hierro]");
											break;
										case 3:
											System.out.println("en la Edad Media]");
											break;
										case 4:
											System.out.println("en la Edad Industrial]");
											break;
										case 5:
											System.out.println("en la Edad contemporanea]");
										}
									} else if (vidIntel > 91 && vidIntel < 100) {
										System.out.println("de tipo Alpha, en era espacial]");
									}
								}
								break;
							case 6:
								System.out.print((con+1)+" [Luna Oceánica] ");
								viabilidad = (int)(Math.random()*100+1);
								if (viabilidad <= 45) {
									System.out.println("[Desolación absoluta]");
								} 
								
								if (viabilidad >= 46 && viabilidad <= 60){
									System.out.println("[Potencial de vida]");
								}
								if (viabilidad >= 61 && viabilidad <= 80) {
									System.out.println("[Vida simple]");
									
								}
								if (viabilidad >= 81 && viabilidad <= 90) {
									System.out.println("[Vida compleja]");
									
								}
								if (viabilidad >= 91 && viabilidad <= 100) {
									System.out.print("[Vida inteligente ");
									int vidIntel = (int)(Math.random()*100+1);
									if (vidIntel <= 90) {
										int tipoBeta = (int)(Math.random()*5+1);
										switch (tipoBeta) {
										case 1:
											System.out.println("Prehistorica]");
											break;
										case 2:
											System.out.println("en Edad de Hierro]");
											break;
										case 3:
											System.out.println("en la Edad Media]");
											break;
										case 4:
											System.out.println("en la Edad Industrial]");
											break;
										case 5:
											System.out.println("en la Edad contemporanea]");
										}
									} else if (vidIntel > 91 && vidIntel < 100) {
										System.out.println("de tipo Alpha, en era espacial]");
									}
								}
								break;
							}
							break;
						case 7:
							System.out.println("[Planeta Super Habitable]");
							while (con != 2) {
								tipoLuna = (int)(Math.random()*6+1);
								switch (tipoLuna) {
								case 1:
									System.out.println((con+1)+" [Luna Inerte] ");
									break;
								case 2:
									System.out.print((con+1)+" [Luna Tiraníde] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 3:
									System.out.println((con+1)+" [Mina Orbitante] ");
									break;
								case 4:
									System.out.print((con+1)+" [Super Luna] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 5:
									System.out.print((con+1)+" [Luna Congelada] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 6:
									System.out.print((con+1)+" [Luna Oceánica] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								}
								con++;
							}
							con = 0;
							break;
						case 8:
							System.out.println("[Planeta de hierro]");
							while (con != 2) {
								tipoLuna = (int)(Math.random()*6+1);
								switch (tipoLuna) {
								case 1:
									System.out.println((con+1)+" [Luna Inerte] ");
									break;
								case 2:
									System.out.print((con+1)+" [Luna Tiraníde] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 3:
									System.out.println((con+1)+" [Mina Orbitante] ");
									break;
								case 4:
									System.out.print((con+1)+" [Super Luna] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 5:
									System.out.print((con+1)+" [Luna Congelada] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 6:
									System.out.print((con+1)+" [Luna Oceánica] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								}
								con++;
							}
							con = 0;
							break;
						}
					}
				}
			} else if (cantMundos >= 61 && cantMundos <= 100) {
				int mulMundos = (int)((Math.random()*6+1)+3);
				if (numTipoEstrella == 19 || numTipoEstrella == 20) {
					System.out.println("El \"" + tipoEstrella[cantMundos-1] + "\" tiene varios mundos:");
					while (pew != mulMundos) {
						int terraGas = (int)(Math.random()*100+1);
						if (terraGas >= 1 && terraGas <= 60) {
							planetaGaseoso = (int)(Math.random()*6+1);
							switch (planetaGaseoso) {
							case 1:
								System.out.println("[Gigante de gas]");
								while (con != 2) {
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									con++;
								}
								break;
							case 2:
								System.out.println("[Enana Marrón]");
								while (con != 3) {
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									con++;
								}
								break;
							case 3:
								System.out.println("[Mini-Neptuno]");
								while (con != 4) {
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									con++;
								}
								break;
							case 4:
								System.out.println("[Neptuno Caliente]");
								while (con != 2) {
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									con++;
								}
								break;
							case 5:
								System.out.println("[Júpiter Caliente]");
								tipoLuna = (int)(Math.random()*6+1);
								switch (tipoLuna) {
								case 1:
									System.out.println((con+1)+" [Luna Inerte] ");
									break;
								case 2:
									System.out.print((con+1)+" [Luna Tiraníde] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 3:
									System.out.println((con+1)+" [Mina Orbitante] ");
									break;
								case 4:
									System.out.print((con+1)+" [Super Luna] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 5:
									System.out.print((con+1)+" [Luna Congelada] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 6:
									System.out.print((con+1)+" [Luna Oceánica] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								}
								break;
							case 6:
								System.out.println("[Gigante de oro]");
								while (con != 5) {
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									con++;
								}
								break;
							}
						} else if (terraGas >= 61 && terraGas <= 100) {
							planetaTerrenal = (int)(Math.random()*6+1);
							switch (planetaTerrenal) {
							case 1:
								System.out.println("[Planeta de Carbono] ");
								while (con != 2) {
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									con++;
								}
								con = 0;
								break;
							case 2:
								System.out.println("[Planeta Helado]");
								tipoLuna = (int)(Math.random()*6+1);
								switch (tipoLuna) {
								case 1:
									System.out.println((con+1)+" [Luna Inerte] ");
									break;
								case 2:
									System.out.print((con+1)+" [Luna Tiraníde] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 3:
									System.out.println((con+1)+" [Mina Orbitante] ");
									break;
								case 4:
									System.out.print((con+1)+" [Super Luna] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 5:
									System.out.print((con+1)+" [Luna Congelada] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 6:
									System.out.print((con+1)+" [Luna Oceánica] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								}
								break;
							case 3:
								System.out.println("[Planeta de Lava]");
								while (con != 2) {
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									con++;
								}
								con = 0;
								break;
							case 4:
								System.out.println("[Mundo océano]");
								while (con != 3) {
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									con++;
								}
								con = 0;
								break;
							case 5:
								System.out.println("[Subtierra]");
								tipoLuna = (int)(Math.random()*6+1);
								switch (tipoLuna) {
								case 1:
									System.out.println((con+1)+" [Luna Inerte] ");
									break;
								case 2:
									System.out.print((con+1)+" [Luna Tiraníde] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 3:
									System.out.println((con+1)+" [Mina Orbitante] ");
									break;
								case 4:
									System.out.print((con+1)+" [Super Luna] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 5:
									System.out.print((con+1)+" [Luna Congelada] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 6:
									System.out.print((con+1)+" [Luna Oceánica] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								}
								break;
							case 6:
								System.out.println("[Super Tierra]");
								tipoLuna = (int)(Math.random()*6+1);
								switch (tipoLuna) {
								case 1:
									System.out.println((con+1)+" [Luna Inerte] ");
									break;
								case 2:
									System.out.print((con+1)+" [Luna Tiraníde] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 3:
									System.out.println((con+1)+" [Mina Orbitante] ");
									break;
								case 4:
									System.out.print((con+1)+" [Super Luna] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 5:
									System.out.print((con+1)+" [Luna Congelada] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 6:
									System.out.print((con+1)+" [Luna Oceánica] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								}
								break;
							case 7:
								System.out.println("[Planeta Super Habitable]");
								while (con != 2) {
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									con++;
								}
								con = 0;
								break;
							case 8:
								System.out.println("[Planeta de hierro]");
								while (con != 2) {
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									con++;
								}
								con = 0;
								break;
							}
						}
						pew++;
					}
					pew=0;
				} else {
					System.out.println("La \"" + tipoEstrella[cantMundos-1] + "\" tiene varios mundos");
					while (pew != mulMundos) {
						int terraGas = (int)(Math.random()*100+1);
						if (terraGas >= 1 && terraGas <= 60) {
							planetaGaseoso = (int)(Math.random()*6+1);
							switch (planetaGaseoso) {
							case 1:
								System.out.println("[Gigante de gas]");
								while (con != 2) {
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									con++;
								}
								break;
							case 2:
								System.out.println("[Enana Marrón]");
								while (con != 3) {
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									con++;
								}
								break;
							case 3:
								System.out.println("[Mini-Neptuno]");
								while (con != 4) {
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									con++;
								}
								break;
							case 4:
								System.out.println("[Neptuno Caliente]");
								while (con != 2) {
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									con++;
								}
								break;
							case 5:
								System.out.println("[Júpiter Caliente]");
								tipoLuna = (int)(Math.random()*6+1);
								switch (tipoLuna) {
								case 1:
									System.out.println((con+1)+" [Luna Inerte] ");
									break;
								case 2:
									System.out.print((con+1)+" [Luna Tiraníde] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 3:
									System.out.println((con+1)+" [Mina Orbitante] ");
									break;
								case 4:
									System.out.print((con+1)+" [Super Luna] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 5:
									System.out.print((con+1)+" [Luna Congelada] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 6:
									System.out.print((con+1)+" [Luna Oceánica] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								}
								break;
							case 6:
								System.out.println("[Gigante de oro]");
								while (con != 5) {
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									con++;
								}
								break;
							}
						} else if (terraGas >= 61 && terraGas <= 100) {
							planetaTerrenal = (int)(Math.random()*6+1);
							switch (planetaTerrenal) {
							case 1:
								System.out.println("[Planeta de Carbono] ");
								while (con != 2) {
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									con++;
								}
								con = 0;
								break;
							case 2:
								System.out.println("[Planeta Helado]");
								tipoLuna = (int)(Math.random()*6+1);
								switch (tipoLuna) {
								case 1:
									System.out.println((con+1)+" [Luna Inerte] ");
									break;
								case 2:
									System.out.print((con+1)+" [Luna Tiraníde] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 3:
									System.out.println((con+1)+" [Mina Orbitante] ");
									break;
								case 4:
									System.out.print((con+1)+" [Super Luna] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 5:
									System.out.print((con+1)+" [Luna Congelada] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 6:
									System.out.print((con+1)+" [Luna Oceánica] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								}
								break;
							case 3:
								System.out.println("[Planeta de Lava]");
								while (con != 2) {
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									con++;
								}
								con = 0;
								break;
							case 4:
								System.out.println("[Mundo océano]");
								while (con != 3) {
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									con++;
								}
								con = 0;
								break;
							case 5:
								System.out.println("[Subtierra]");
								tipoLuna = (int)(Math.random()*6+1);
								switch (tipoLuna) {
								case 1:
									System.out.println((con+1)+" [Luna Inerte] ");
									break;
								case 2:
									System.out.print((con+1)+" [Luna Tiraníde] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 3:
									System.out.println((con+1)+" [Mina Orbitante] ");
									break;
								case 4:
									System.out.print((con+1)+" [Super Luna] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 5:
									System.out.print((con+1)+" [Luna Congelada] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 6:
									System.out.print((con+1)+" [Luna Oceánica] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								}
								break;
							case 6:
								System.out.println("[Super Tierra]");
								tipoLuna = (int)(Math.random()*6+1);
								switch (tipoLuna) {
								case 1:
									System.out.println((con+1)+" [Luna Inerte] ");
									break;
								case 2:
									System.out.print((con+1)+" [Luna Tiraníde] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 3:
									System.out.println((con+1)+" [Mina Orbitante] ");
									break;
								case 4:
									System.out.print((con+1)+" [Super Luna] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 5:
									System.out.print((con+1)+" [Luna Congelada] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 6:
									System.out.print((con+1)+" [Luna Oceánica] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								}
								break;
							case 7:
								System.out.println("[Planeta Super Habitable]");
								while (con != 2) {
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									con++;
								}
								con = 0;
								break;
							case 8:
								System.out.println("[Planeta de hierro]");
								while (con != 2) {
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									con++;
								}
								con = 0;
								break;
							}
						}
						pew++;
					}
					pew=0;
				}
			} else {
				if (numTipoEstrella == 19 || numTipoEstrella == 20) {
					System.out.println("El \"" + tipoEstrella[cantMundos-1] + "\" no tiene mundos");
				} else {
					System.out.println("La \"" + tipoEstrella[cantMundos-1] + "\" no tiene mundos");
				}
			}
		}else if (cantidadEstrellas == 2) {
			while (kill != 2) {
				numTipoEstrella = (int)(Math.random()*21+1);
				if (cantMundos >= 21 && cantMundos <= 60) {
					if (numTipoEstrella == 19 || numTipoEstrella == 20) {
						System.out.println("El \"" + tipoEstrella[cantMundos-1] + "\" tiene un mundo");
						int terraGas = (int)(Math.random()*100+1);
						if (terraGas >= 1 && terraGas <= 60) {
							planetaGaseoso = (int)(Math.random()*6+1);
							switch (planetaGaseoso) {
							case 1:
								System.out.println("[Gigante de gas]");
								while (con != 2) {
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									con++;
								}
								break;
							case 2:
								System.out.println("[Enana Marrón]");
								while (con != 3) {
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									con++;
								}
								break;
							case 3:
								System.out.println("[Mini-Neptuno]");
								while (con != 4) {
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									con++;
								}
								break;
							case 4:
								System.out.println("[Neptuno Caliente]");
								while (con != 2) {
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									con++;
								}
								break;
							case 5:
								System.out.println("[Júpiter Caliente]");
								tipoLuna = (int)(Math.random()*6+1);
								switch (tipoLuna) {
								case 1:
									System.out.println((con+1)+" [Luna Inerte] ");
									break;
								case 2:
									System.out.print((con+1)+" [Luna Tiraníde] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 3:
									System.out.println((con+1)+" [Mina Orbitante] ");
									break;
								case 4:
									System.out.print((con+1)+" [Super Luna] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 5:
									System.out.print((con+1)+" [Luna Congelada] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 6:
									System.out.print((con+1)+" [Luna Oceánica] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								}
								break;
							case 6:
								System.out.println("[Gigante de oro]");
								while (con != 5) {
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									con++;
								}
								break;
							}
						} else if (terraGas >= 61 && terraGas <= 100) {
							planetaTerrenal = (int)(Math.random()*6+1);
							switch (planetaTerrenal) {
							case 1:
								System.out.println("[Planeta de Carbono] ");
								while (con != 2) {
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									con++;
								}
								con = 0;
								break;
							case 2:
								System.out.println("[Planeta Helado]");
								tipoLuna = (int)(Math.random()*6+1);
								switch (tipoLuna) {
								case 1:
									System.out.println((con+1)+" [Luna Inerte] ");
									break;
								case 2:
									System.out.print((con+1)+" [Luna Tiraníde] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 3:
									System.out.println((con+1)+" [Mina Orbitante] ");
									break;
								case 4:
									System.out.print((con+1)+" [Super Luna] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 5:
									System.out.print((con+1)+" [Luna Congelada] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 6:
									System.out.print((con+1)+" [Luna Oceánica] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								}
								break;
							case 3:
								System.out.println("[Planeta de Lava]");
								while (con != 2) {
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									con++;
								}
								con = 0;
								break;
							case 4:
								System.out.println("[Mundo océano]");
								while (con != 3) {
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									con++;
								}
								con = 0;
								break;
							case 5:
								System.out.println("[Subtierra]");
								tipoLuna = (int)(Math.random()*6+1);
								switch (tipoLuna) {
								case 1:
									System.out.println((con+1)+" [Luna Inerte] ");
									break;
								case 2:
									System.out.print((con+1)+" [Luna Tiraníde] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 3:
									System.out.println((con+1)+" [Mina Orbitante] ");
									break;
								case 4:
									System.out.print((con+1)+" [Super Luna] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 5:
									System.out.print((con+1)+" [Luna Congelada] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 6:
									System.out.print((con+1)+" [Luna Oceánica] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								}
								break;
							case 6:
								System.out.println("[Super Tierra]");
								tipoLuna = (int)(Math.random()*6+1);
								switch (tipoLuna) {
								case 1:
									System.out.println((con+1)+" [Luna Inerte] ");
									break;
								case 2:
									System.out.print((con+1)+" [Luna Tiraníde] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 3:
									System.out.println((con+1)+" [Mina Orbitante] ");
									break;
								case 4:
									System.out.print((con+1)+" [Super Luna] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 5:
									System.out.print((con+1)+" [Luna Congelada] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 6:
									System.out.print((con+1)+" [Luna Oceánica] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								}
								break;
							case 7:
								System.out.println("[Planeta Super Habitable]");
								while (con != 2) {
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									con++;
								}
								con = 0;
								break;
							case 8:
								System.out.println("[Planeta de hierro]");
								while (con != 2) {
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									con++;
								}
								con = 0;
								break;
							}
						}
					} else {
						System.out.println("La \"" + tipoEstrella[cantMundos-1] + "\" tiene un mundo");
						int terraGas = (int)(Math.random()*100+1);
						if (terraGas >= 1 && terraGas <= 60) {
							planetaGaseoso = (int)(Math.random()*6+1);
							switch (planetaGaseoso) {
							case 1:
								System.out.println("[Gigante de gas]");
								while (con != 2) {
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									con++;
								}
								break;
							case 2:
								System.out.println("[Enana Marrón]");
								while (con != 3) {
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									con++;
								}
								break;
							case 3:
								System.out.println("[Mini-Neptuno]");
								while (con != 4) {
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									con++;
								}
								break;
							case 4:
								System.out.println("[Neptuno Caliente]");
								while (con != 2) {
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									con++;
								}
								break;
							case 5:
								System.out.println("[Júpiter Caliente]");
								tipoLuna = (int)(Math.random()*6+1);
								switch (tipoLuna) {
								case 1:
									System.out.println((con+1)+" [Luna Inerte] ");
									break;
								case 2:
									System.out.print((con+1)+" [Luna Tiraníde] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 3:
									System.out.println((con+1)+" [Mina Orbitante] ");
									break;
								case 4:
									System.out.print((con+1)+" [Super Luna] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 5:
									System.out.print((con+1)+" [Luna Congelada] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 6:
									System.out.print((con+1)+" [Luna Oceánica] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								}
								break;
							case 6:
								System.out.println("[Gigante de oro]");
								while (con != 5) {
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									con++;
								}
								break;
							}
						} else if (terraGas >= 61 && terraGas <= 100) {
							planetaTerrenal = (int)(Math.random()*6+1);
							switch (planetaTerrenal) {
							case 1:
								System.out.println("[Planeta de Carbono] ");
								while (con != 2) {
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									con++;
								}
								con = 0;
								break;
							case 2:
								System.out.println("[Planeta Helado]");
								tipoLuna = (int)(Math.random()*6+1);
								switch (tipoLuna) {
								case 1:
									System.out.println((con+1)+" [Luna Inerte] ");
									break;
								case 2:
									System.out.print((con+1)+" [Luna Tiraníde] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 3:
									System.out.println((con+1)+" [Mina Orbitante] ");
									break;
								case 4:
									System.out.print((con+1)+" [Super Luna] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 5:
									System.out.print((con+1)+" [Luna Congelada] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 6:
									System.out.print((con+1)+" [Luna Oceánica] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								}
								break;
							case 3:
								System.out.println("[Planeta de Lava]");
								while (con != 2) {
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									con++;
								}
								con = 0;
								break;
							case 4:
								System.out.println("[Mundo océano]");
								while (con != 3) {
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									con++;
								}
								con = 0;
								break;
							case 5:
								System.out.println("[Subtierra]");
								tipoLuna = (int)(Math.random()*6+1);
								switch (tipoLuna) {
								case 1:
									System.out.println((con+1)+" [Luna Inerte] ");
									break;
								case 2:
									System.out.print((con+1)+" [Luna Tiraníde] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 3:
									System.out.println((con+1)+" [Mina Orbitante] ");
									break;
								case 4:
									System.out.print((con+1)+" [Super Luna] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 5:
									System.out.print((con+1)+" [Luna Congelada] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 6:
									System.out.print((con+1)+" [Luna Oceánica] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								}
								break;
							case 6:
								System.out.println("[Super Tierra]");
								tipoLuna = (int)(Math.random()*6+1);
								switch (tipoLuna) {
								case 1:
									System.out.println((con+1)+" [Luna Inerte] ");
									break;
								case 2:
									System.out.print((con+1)+" [Luna Tiraníde] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 3:
									System.out.println((con+1)+" [Mina Orbitante] ");
									break;
								case 4:
									System.out.print((con+1)+" [Super Luna] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 5:
									System.out.print((con+1)+" [Luna Congelada] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								case 6:
									System.out.print((con+1)+" [Luna Oceánica] ");
									viabilidad = (int)(Math.random()*100+1);
									if (viabilidad <= 45) {
										System.out.println("[Desolación absoluta]");
									} 
									
									if (viabilidad >= 46 && viabilidad <= 60){
										System.out.println("[Potencial de vida]");
									}
									if (viabilidad >= 61 && viabilidad <= 80) {
										System.out.println("[Vida simple]");
										
									}
									if (viabilidad >= 81 && viabilidad <= 90) {
										System.out.println("[Vida compleja]");
										
									}
									if (viabilidad >= 91 && viabilidad <= 100) {
										System.out.print("[Vida inteligente ");
										int vidIntel = (int)(Math.random()*100+1);
										if (vidIntel <= 90) {
											int tipoBeta = (int)(Math.random()*5+1);
											switch (tipoBeta) {
											case 1:
												System.out.println("Prehistorica]");
												break;
											case 2:
												System.out.println("en Edad de Hierro]");
												break;
											case 3:
												System.out.println("en la Edad Media]");
												break;
											case 4:
												System.out.println("en la Edad Industrial]");
												break;
											case 5:
												System.out.println("en la Edad contemporanea]");
											}
										} else if (vidIntel > 91 && vidIntel < 100) {
											System.out.println("de tipo Alpha, en era espacial]");
										}
									}
									break;
								}
								break;
							case 7:
								System.out.println("[Planeta Super Habitable]");
								while (con != 2) {
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									con++;
								}
								con = 0;
								break;
							case 8:
								System.out.println("[Planeta de hierro]");
								while (con != 2) {
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									con++;
								}
								con = 0;
								break;
							}
						}
					}
				} else if (cantMundos >= 61 && cantMundos <= 100) {
					int mulMundos = (int)((Math.random()*6+1)+3);
					if (numTipoEstrella == 19 || numTipoEstrella == 20) {
						System.out.println("El \"" + tipoEstrella[cantMundos-1] + "\" tiene varios mundos:");
						while (pew != mulMundos) {
							int terraGas = (int)(Math.random()*100+1);
							if (terraGas >= 1 && terraGas <= 60) {
								planetaGaseoso = (int)(Math.random()*6+1);
								switch (planetaGaseoso) {
								case 1:
									System.out.println("[Gigante de gas]");
									while (con != 2) {
										tipoLuna = (int)(Math.random()*6+1);
										switch (tipoLuna) {
										case 1:
											System.out.println((con+1)+" [Luna Inerte] ");
											break;
										case 2:
											System.out.print((con+1)+" [Luna Tiraníde] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 3:
											System.out.println((con+1)+" [Mina Orbitante] ");
											break;
										case 4:
											System.out.print((con+1)+" [Super Luna] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 5:
											System.out.print((con+1)+" [Luna Congelada] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 6:
											System.out.print((con+1)+" [Luna Oceánica] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										}
										con++;
									}
									break;
								case 2:
									System.out.println("[Enana Marrón]");
									while (con != 3) {
										tipoLuna = (int)(Math.random()*6+1);
										switch (tipoLuna) {
										case 1:
											System.out.println((con+1)+" [Luna Inerte] ");
											break;
										case 2:
											System.out.print((con+1)+" [Luna Tiraníde] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 3:
											System.out.println((con+1)+" [Mina Orbitante] ");
											break;
										case 4:
											System.out.print((con+1)+" [Super Luna] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 5:
											System.out.print((con+1)+" [Luna Congelada] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 6:
											System.out.print((con+1)+" [Luna Oceánica] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										}
										con++;
									}
									break;
								case 3:
									System.out.println("[Mini-Neptuno]");
									while (con != 4) {
										tipoLuna = (int)(Math.random()*6+1);
										switch (tipoLuna) {
										case 1:
											System.out.println((con+1)+" [Luna Inerte] ");
											break;
										case 2:
											System.out.print((con+1)+" [Luna Tiraníde] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 3:
											System.out.println((con+1)+" [Mina Orbitante] ");
											break;
										case 4:
											System.out.print((con+1)+" [Super Luna] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 5:
											System.out.print((con+1)+" [Luna Congelada] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 6:
											System.out.print((con+1)+" [Luna Oceánica] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										}
										con++;
									}
									break;
								case 4:
									System.out.println("[Neptuno Caliente]");
									while (con != 2) {
										tipoLuna = (int)(Math.random()*6+1);
										switch (tipoLuna) {
										case 1:
											System.out.println((con+1)+" [Luna Inerte] ");
											break;
										case 2:
											System.out.print((con+1)+" [Luna Tiraníde] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 3:
											System.out.println((con+1)+" [Mina Orbitante] ");
											break;
										case 4:
											System.out.print((con+1)+" [Super Luna] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 5:
											System.out.print((con+1)+" [Luna Congelada] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 6:
											System.out.print((con+1)+" [Luna Oceánica] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										}
										con++;
									}
									break;
								case 5:
									System.out.println("[Júpiter Caliente]");
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									break;
								case 6:
									System.out.println("[Gigante de oro]");
									while (con != 5) {
										tipoLuna = (int)(Math.random()*6+1);
										switch (tipoLuna) {
										case 1:
											System.out.println((con+1)+" [Luna Inerte] ");
											break;
										case 2:
											System.out.print((con+1)+" [Luna Tiraníde] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 3:
											System.out.println((con+1)+" [Mina Orbitante] ");
											break;
										case 4:
											System.out.print((con+1)+" [Super Luna] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 5:
											System.out.print((con+1)+" [Luna Congelada] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 6:
											System.out.print((con+1)+" [Luna Oceánica] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										}
										con++;
									}
									break;
								}
							} else if (terraGas >= 61 && terraGas <= 100) {
								planetaTerrenal = (int)(Math.random()*6+1);
								switch (planetaTerrenal) {
								case 1:
									System.out.println("[Planeta de Carbono] ");
									while (con != 2) {
										tipoLuna = (int)(Math.random()*6+1);
										switch (tipoLuna) {
										case 1:
											System.out.println((con+1)+" [Luna Inerte] ");
											break;
										case 2:
											System.out.print((con+1)+" [Luna Tiraníde] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 3:
											System.out.println((con+1)+" [Mina Orbitante] ");
											break;
										case 4:
											System.out.print((con+1)+" [Super Luna] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 5:
											System.out.print((con+1)+" [Luna Congelada] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 6:
											System.out.print((con+1)+" [Luna Oceánica] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										}
										con++;
									}
									con = 0;
									break;
								case 2:
									System.out.println("[Planeta Helado]");
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									break;
								case 3:
									System.out.println("[Planeta de Lava]");
									while (con != 2) {
										tipoLuna = (int)(Math.random()*6+1);
										switch (tipoLuna) {
										case 1:
											System.out.println((con+1)+" [Luna Inerte] ");
											break;
										case 2:
											System.out.print((con+1)+" [Luna Tiraníde] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 3:
											System.out.println((con+1)+" [Mina Orbitante] ");
											break;
										case 4:
											System.out.print((con+1)+" [Super Luna] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 5:
											System.out.print((con+1)+" [Luna Congelada] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 6:
											System.out.print((con+1)+" [Luna Oceánica] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										}
										con++;
									}
									con = 0;
									break;
								case 4:
									System.out.println("[Mundo océano]");
									while (con != 3) {
										tipoLuna = (int)(Math.random()*6+1);
										switch (tipoLuna) {
										case 1:
											System.out.println((con+1)+" [Luna Inerte] ");
											break;
										case 2:
											System.out.print((con+1)+" [Luna Tiraníde] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 3:
											System.out.println((con+1)+" [Mina Orbitante] ");
											break;
										case 4:
											System.out.print((con+1)+" [Super Luna] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 5:
											System.out.print((con+1)+" [Luna Congelada] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 6:
											System.out.print((con+1)+" [Luna Oceánica] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										}
										con++;
									}
									con = 0;
									break;
								case 5:
									System.out.println("[Subtierra]");
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									break;
								case 6:
									System.out.println("[Super Tierra]");
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									break;
								case 7:
									System.out.println("[Planeta Super Habitable]");
									while (con != 2) {
										tipoLuna = (int)(Math.random()*6+1);
										switch (tipoLuna) {
										case 1:
											System.out.println((con+1)+" [Luna Inerte] ");
											break;
										case 2:
											System.out.print((con+1)+" [Luna Tiraníde] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 3:
											System.out.println((con+1)+" [Mina Orbitante] ");
											break;
										case 4:
											System.out.print((con+1)+" [Super Luna] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 5:
											System.out.print((con+1)+" [Luna Congelada] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 6:
											System.out.print((con+1)+" [Luna Oceánica] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										}
										con++;
									}
									con = 0;
									break;
								case 8:
									System.out.println("[Planeta de hierro]");
									while (con != 2) {
										tipoLuna = (int)(Math.random()*6+1);
										switch (tipoLuna) {
										case 1:
											System.out.println((con+1)+" [Luna Inerte] ");
											break;
										case 2:
											System.out.print((con+1)+" [Luna Tiraníde] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 3:
											System.out.println((con+1)+" [Mina Orbitante] ");
											break;
										case 4:
											System.out.print((con+1)+" [Super Luna] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 5:
											System.out.print((con+1)+" [Luna Congelada] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 6:
											System.out.print((con+1)+" [Luna Oceánica] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										}
										con++;
									}
									con = 0;
									break;
								}
							}
							pew++;
						}
						pew=0;
					} else {
						System.out.println("La \"" + tipoEstrella[cantMundos-1] + "\" tiene varios mundos");
						while (pew != mulMundos) {
							int terraGas = (int)(Math.random()*100+1);
							if (terraGas >= 1 && terraGas <= 60) {
								planetaGaseoso = (int)(Math.random()*6+1);
								switch (planetaGaseoso) {
								case 1:
									System.out.println("[Gigante de gas]");
									while (con != 2) {
										tipoLuna = (int)(Math.random()*6+1);
										switch (tipoLuna) {
										case 1:
											System.out.println((con+1)+" [Luna Inerte] ");
											break;
										case 2:
											System.out.print((con+1)+" [Luna Tiraníde] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 3:
											System.out.println((con+1)+" [Mina Orbitante] ");
											break;
										case 4:
											System.out.print((con+1)+" [Super Luna] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 5:
											System.out.print((con+1)+" [Luna Congelada] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 6:
											System.out.print((con+1)+" [Luna Oceánica] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										}
										con++;
									}
									break;
								case 2:
									System.out.println("[Enana Marrón]");
									while (con != 3) {
										tipoLuna = (int)(Math.random()*6+1);
										switch (tipoLuna) {
										case 1:
											System.out.println((con+1)+" [Luna Inerte] ");
											break;
										case 2:
											System.out.print((con+1)+" [Luna Tiraníde] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 3:
											System.out.println((con+1)+" [Mina Orbitante] ");
											break;
										case 4:
											System.out.print((con+1)+" [Super Luna] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 5:
											System.out.print((con+1)+" [Luna Congelada] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 6:
											System.out.print((con+1)+" [Luna Oceánica] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										}
										con++;
									}
									break;
								case 3:
									System.out.println("[Mini-Neptuno]");
									while (con != 4) {
										tipoLuna = (int)(Math.random()*6+1);
										switch (tipoLuna) {
										case 1:
											System.out.println((con+1)+" [Luna Inerte] ");
											break;
										case 2:
											System.out.print((con+1)+" [Luna Tiraníde] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 3:
											System.out.println((con+1)+" [Mina Orbitante] ");
											break;
										case 4:
											System.out.print((con+1)+" [Super Luna] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 5:
											System.out.print((con+1)+" [Luna Congelada] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 6:
											System.out.print((con+1)+" [Luna Oceánica] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										}
										con++;
									}
									break;
								case 4:
									System.out.println("[Neptuno Caliente]");
									while (con != 2) {
										tipoLuna = (int)(Math.random()*6+1);
										switch (tipoLuna) {
										case 1:
											System.out.println((con+1)+" [Luna Inerte] ");
											break;
										case 2:
											System.out.print((con+1)+" [Luna Tiraníde] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 3:
											System.out.println((con+1)+" [Mina Orbitante] ");
											break;
										case 4:
											System.out.print((con+1)+" [Super Luna] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 5:
											System.out.print((con+1)+" [Luna Congelada] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 6:
											System.out.print((con+1)+" [Luna Oceánica] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										}
										con++;
									}
									break;
								case 5:
									System.out.println("[Júpiter Caliente]");
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									break;
								case 6:
									System.out.println("[Gigante de oro]");
									while (con != 5) {
										tipoLuna = (int)(Math.random()*6+1);
										switch (tipoLuna) {
										case 1:
											System.out.println((con+1)+" [Luna Inerte] ");
											break;
										case 2:
											System.out.print((con+1)+" [Luna Tiraníde] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 3:
											System.out.println((con+1)+" [Mina Orbitante] ");
											break;
										case 4:
											System.out.print((con+1)+" [Super Luna] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 5:
											System.out.print((con+1)+" [Luna Congelada] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 6:
											System.out.print((con+1)+" [Luna Oceánica] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										}
										con++;
									}
									break;
								}
							} else if (terraGas >= 61 && terraGas <= 100) {
								planetaTerrenal = (int)(Math.random()*6+1);
								switch (planetaTerrenal) {
								case 1:
									System.out.println("[Planeta de Carbono] ");
									while (con != 2) {
										tipoLuna = (int)(Math.random()*6+1);
										switch (tipoLuna) {
										case 1:
											System.out.println((con+1)+" [Luna Inerte] ");
											break;
										case 2:
											System.out.print((con+1)+" [Luna Tiraníde] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 3:
											System.out.println((con+1)+" [Mina Orbitante] ");
											break;
										case 4:
											System.out.print((con+1)+" [Super Luna] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 5:
											System.out.print((con+1)+" [Luna Congelada] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 6:
											System.out.print((con+1)+" [Luna Oceánica] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										}
										con++;
									}
									con = 0;
									break;
								case 2:
									System.out.println("[Planeta Helado]");
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									break;
								case 3:
									System.out.println("[Planeta de Lava]");
									while (con != 2) {
										tipoLuna = (int)(Math.random()*6+1);
										switch (tipoLuna) {
										case 1:
											System.out.println((con+1)+" [Luna Inerte] ");
											break;
										case 2:
											System.out.print((con+1)+" [Luna Tiraníde] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 3:
											System.out.println((con+1)+" [Mina Orbitante] ");
											break;
										case 4:
											System.out.print((con+1)+" [Super Luna] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 5:
											System.out.print((con+1)+" [Luna Congelada] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 6:
											System.out.print((con+1)+" [Luna Oceánica] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										}
										con++;
									}
									con = 0;
									break;
								case 4:
									System.out.println("[Mundo océano]");
									while (con != 3) {
										tipoLuna = (int)(Math.random()*6+1);
										switch (tipoLuna) {
										case 1:
											System.out.println((con+1)+" [Luna Inerte] ");
											break;
										case 2:
											System.out.print((con+1)+" [Luna Tiraníde] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 3:
											System.out.println((con+1)+" [Mina Orbitante] ");
											break;
										case 4:
											System.out.print((con+1)+" [Super Luna] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 5:
											System.out.print((con+1)+" [Luna Congelada] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 6:
											System.out.print((con+1)+" [Luna Oceánica] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										}
										con++;
									}
									con = 0;
									break;
								case 5:
									System.out.println("[Subtierra]");
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									break;
								case 6:
									System.out.println("[Super Tierra]");
									tipoLuna = (int)(Math.random()*6+1);
									switch (tipoLuna) {
									case 1:
										System.out.println((con+1)+" [Luna Inerte] ");
										break;
									case 2:
										System.out.print((con+1)+" [Luna Tiraníde] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 3:
										System.out.println((con+1)+" [Mina Orbitante] ");
										break;
									case 4:
										System.out.print((con+1)+" [Super Luna] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 5:
										System.out.print((con+1)+" [Luna Congelada] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									case 6:
										System.out.print((con+1)+" [Luna Oceánica] ");
										viabilidad = (int)(Math.random()*100+1);
										if (viabilidad <= 45) {
											System.out.println("[Desolación absoluta]");
										} 
										
										if (viabilidad >= 46 && viabilidad <= 60){
											System.out.println("[Potencial de vida]");
										}
										if (viabilidad >= 61 && viabilidad <= 80) {
											System.out.println("[Vida simple]");
											
										}
										if (viabilidad >= 81 && viabilidad <= 90) {
											System.out.println("[Vida compleja]");
											
										}
										if (viabilidad >= 91 && viabilidad <= 100) {
											System.out.print("[Vida inteligente ");
											int vidIntel = (int)(Math.random()*100+1);
											if (vidIntel <= 90) {
												int tipoBeta = (int)(Math.random()*5+1);
												switch (tipoBeta) {
												case 1:
													System.out.println("Prehistorica]");
													break;
												case 2:
													System.out.println("en Edad de Hierro]");
													break;
												case 3:
													System.out.println("en la Edad Media]");
													break;
												case 4:
													System.out.println("en la Edad Industrial]");
													break;
												case 5:
													System.out.println("en la Edad contemporanea]");
												}
											} else if (vidIntel > 91 && vidIntel < 100) {
												System.out.println("de tipo Alpha, en era espacial]");
											}
										}
										break;
									}
									break;
								case 7:
									System.out.println("[Planeta Super Habitable]");
									while (con != 2) {
										tipoLuna = (int)(Math.random()*6+1);
										switch (tipoLuna) {
										case 1:
											System.out.println((con+1)+" [Luna Inerte] ");
											break;
										case 2:
											System.out.print((con+1)+" [Luna Tiraníde] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 3:
											System.out.println((con+1)+" [Mina Orbitante] ");
											break;
										case 4:
											System.out.print((con+1)+" [Super Luna] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 5:
											System.out.print((con+1)+" [Luna Congelada] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 6:
											System.out.print((con+1)+" [Luna Oceánica] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										}
										con++;
									}
									con = 0;
									break;
								case 8:
									System.out.println("[Planeta de hierro]");
									while (con != 2) {
										tipoLuna = (int)(Math.random()*6+1);
										switch (tipoLuna) {
										case 1:
											System.out.println((con+1)+" [Luna Inerte] ");
											break;
										case 2:
											System.out.print((con+1)+" [Luna Tiraníde] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 3:
											System.out.println((con+1)+" [Mina Orbitante] ");
											break;
										case 4:
											System.out.print((con+1)+" [Super Luna] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 5:
											System.out.print((con+1)+" [Luna Congelada] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										case 6:
											System.out.print((con+1)+" [Luna Oceánica] ");
											viabilidad = (int)(Math.random()*100+1);
											if (viabilidad <= 45) {
												System.out.println("[Desolación absoluta]");
											} 
											
											if (viabilidad >= 46 && viabilidad <= 60){
												System.out.println("[Potencial de vida]");
											}
											if (viabilidad >= 61 && viabilidad <= 80) {
												System.out.println("[Vida simple]");
												
											}
											if (viabilidad >= 81 && viabilidad <= 90) {
												System.out.println("[Vida compleja]");
												
											}
											if (viabilidad >= 91 && viabilidad <= 100) {
												System.out.print("[Vida inteligente ");
												int vidIntel = (int)(Math.random()*100+1);
												if (vidIntel <= 90) {
													int tipoBeta = (int)(Math.random()*5+1);
													switch (tipoBeta) {
													case 1:
														System.out.println("Prehistorica]");
														break;
													case 2:
														System.out.println("en Edad de Hierro]");
														break;
													case 3:
														System.out.println("en la Edad Media]");
														break;
													case 4:
														System.out.println("en la Edad Industrial]");
														break;
													case 5:
														System.out.println("en la Edad contemporanea]");
													}
												} else if (vidIntel > 91 && vidIntel < 100) {
													System.out.println("de tipo Alpha, en era espacial]");
												}
											}
											break;
										}
										con++;
									}
									con = 0;
									break;
								}
							}
							pew++;
						}
						pew=0;
					}
				} else {
					if (numTipoEstrella == 19 || numTipoEstrella == 20) {
						System.out.println("El \"" + tipoEstrella[cantMundos-1] + "\" no tiene mundos");
					} else {
						System.out.println("La \"" + tipoEstrella[cantMundos-1] + "\" no tiene mundos");
					}
				}
				kill++;
			}
		}				
	}
}
		
		