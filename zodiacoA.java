package prolog;

import java.awt.JobAttributes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class zodiaco {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String nombre,apellido;
		int edad,noControl,dia,mes,año;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  Scanner sc = new Scanner(System.in);
				  
		System.out.println("Ingrese Nombre:");
		nombre = sc.nextLine();
		
		System.out.println("Ingrese Apellidos");
		apellido = sc.nextLine();
		
		
		System.out.println("Ingrese Edad");
		edad = sc.nextInt(); 
		
		
		System.out.println("Ingrese No.Control");
		noControl= sc.nextInt(); 
		
		System.out.println("Ingrese dia");
		dia = sc.nextInt(); 
		
		System.out.println("Ingrese mes");
		mes = sc.nextInt(); 
		
		System.out.println("Ingrese año");
		año = sc.nextInt(); 


		switch(mes) {		
		  case 1: 
		    // Enero
		    if (dia>=20)
		      System.out.println("Acuario");
		    else
		      System.out.println("Capricornio");				
		    break;
		  case 2:
		    // Febrero
		    if (dia>=19)
		      System.out.println("Piscis");
		    else
		      System.out.println("Acuario");
		    break;
		case 3:
		    // Marzo
		    if (dia>=21)
		      System.out.println("Aries");
		    else
		      System.out.println("Picis");
		    break;
		case 4:
		    // Abril
		    if (dia>=20)
		      System.out.println("Tauro");
		    else
		      System.out.println("Aries");
		    break;
		 case 5:
		    // Mayo
		    if (dia>=21)
		      System.out.println("Geminis");
		    else
		      System.out.println("Tauro");
		    break;
		case 6:
		    // Junio
		    if (dia>=21)
		      System.out.println("Cancer");
		    else
		      System.out.println("Geminis");
		    break;
		 case 7:
		    // Julio
		    if (dia>=23)
		      System.out.println("Leo");
		    else
		      System.out.println("Cancer");
		    break;  
		case 8:
		    // Agosto
		    if (dia>=23)
		      System.out.println("Virgo");
		    else
		      System.out.println("Leo");
		    break; 
	        case 9:
		    // Septiembre
		    if (dia>=23)
		      System.out.println("Libra");
		    else
		      System.out.println("Virgo");
		    break; 
		case 10:
		    // Octubre
		    if (dia>=23)
		      System.out.println("Escorpion");
		    else
		      System.out.println("Libra");
		    break;
		case 11:
		    // Noviembre
		    if (dia>=22)
		      System.out.println("Sagitario");
		    else
		      System.out.println("Escorpion");
		    break;
		case 12:
		    // Diciembre
		    if (dia>=22)
		      System.out.println("Capricornio");
		    else
		      System.out.println("sagitario");
		    break;
		}
	

}}