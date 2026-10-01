/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;
import java.util.Scanner;

/**
 *
 * @author gaelg
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double primeraNota,segundaNota,terceraNota,resultado;
        Scanner lector = new Scanner(System.in);
        System.out.print("Primera nota: ");
        primeraNota = lector.nextDouble();
        Scanner lector2 = new Scanner(System.in);
        System.out.print("Segunda nota: ");
        segundaNota = lector.nextDouble();
        Scanner lector3 = new Scanner(System.in);
        System.out.print("tercera nota: ");
        terceraNota = lector3.nextDouble();
        resultado = (primeraNota + segundaNota + terceraNota) / 3;
        System.out.printf("Your note %.2f", resultado);
        if (resultado <= 4.9){
            System.out.println(" muy mal");
        }
        else if(resultado >= 5){
            System.out.println(" muy bien");
        }
        else if(resultado >=8){
            System.out.println(" increible");
        }
    }
    }
