package practica2;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class signos {
	
	public static void main (String args[]){
		int a,b;
		System.out.println("Ingrese el día y el mes de su nacimiento");
		System.out.print("Dia = ");
		Scanner dia= new Scanner(System.in);
		a= dia.nextInt();
		System.out.print("Mes = ");
		Scanner mes= new Scanner(System.in);
		b= mes.nextInt();
		
			if (a>=22&&b==12){
				System.out.println("Su signo es capricornio");}
			if (a<20&&b==1){
				System.out.println("Su signo es capricornio");}
			if (a>=21&&b==1){
				System.out.println("Su signo es acuario");}
			if (a<=20&&b==2){
				System.out.println("Su signo es acuario");}
			if (a>=21&&b==2){
				System.out.println("Su signo es piscis");}
			if (a<=20&&b==3){
				System.out.println("Su signo es piscis");}
			if (a>=21&&b==3){
				System.out.println("Su signo es aries");}
			if (a<=19&&b==4){
				System.out.println("Su signo es aries");}
			if (a>=20&&b==4){
				System.out.println("Su signo es tauro");}
			if (a<=20&&b==5){
				System.out.println("Su signo es tauro");}
			if (a>=21&&b==5){
				System.out.println("Su signo es geminis");}
			if (a<=21&&b==6){
				System.out.println("Su signo es geminis");}
			if (a>=22&&b==6){
				System.out.println("Su signo es cancer");}
			if (a<=21&&b==7){
				System.out.println("Su signo es cancer");}
			if (a>=22&&b==7){
			    System.out.println("Su signo es leo");}
			if (a<=21&&b==8){
			    System.out.println("Su signo es leo");}
			if (a>=22&&b==8){
				System.out.println("Su signo es Virgo");}
			if (a<=22&&b==9){
				System.out.println("Su signo es Virgo");}
			if (a>=23&&b==9){
				System.out.println("Su signo es Libra");}
			if (a<=21&&b==10){
				System.out.println("Su signo es Libra");}
			if (a>=22&&b==10){
				System.out.println("Su signo es Escorpio");}
			if (a<=21&&b==11){
				System.out.println("Su signo es Escorpio");}
			if (a>=22&&b==11){
				System.out.println("Su signo es Sagitario");}
			if (a<=21&&b==12){
				System.out.println("Su signo es Sagitario");}

}
}
