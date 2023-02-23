package ar.fusion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] nombres = new String[3];
        Scanner scanner=new Scanner(System.in);
        System.out.println("A continuacion ingrese 3 nombres");
        System.out.println("Primer nombre: ");
        nombres[0]=scanner.next();
        System.out.println("Segundo nombre: ");
        nombres[1]=scanner.next();
        System.out.println("Tercer nombre: ");
        nombres[2]=scanner.next();

        System.out.println("------------------------");
        String nombresIngresados="";
        //for (String nombre:nombres) nombresIngresados += nombre + "-";
        //Lo haré con While, para chequear el ultimo nombre, y no agregar el guión (-)
        int i=0;
        while (i< nombres.length){
            if(i==nombres.length-1){
                nombresIngresados += nombres[i];
            }else{
                nombresIngresados += nombres[i]+" - ";
            }
            i++;
        }
        System.out.println("los nombres que ingresaste son: "+nombresIngresados);

    }
}