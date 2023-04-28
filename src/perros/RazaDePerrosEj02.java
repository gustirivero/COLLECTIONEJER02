/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perros;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class RazaDePerrosEj02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.*/
        Scanner leer = new Scanner(System.in);
        ArrayList<String> razasDeperros = new ArrayList();
        String validar;

        do {

            System.out.println("Ingrese la raza de perros que desea guardar en la lista: ");
            razasDeperros.add(leer.nextLine());

            System.out.println("Desea agregar otra raza? si/no");
            validar = leer.nextLine();

        } while (validar.toLowerCase().equals("si"));

        System.out.println("Las razas de la lista son: ");
        for (String lista : razasDeperros) {

            System.out.println(lista);
        }

        System.out.println("Elija una raza para saber si se encuentra en la lista: ");
      
        String raza = leer.next();

        Iterator it = razasDeperros.iterator();
        
        System.out.println("Elementos de la lista: ");
        System.out.println("");
        
        while (it.hasNext()) {
            Object next = it.next();

            if (next.equals(raza)) {
                it.remove();
               
                for (String razasDeperro : razasDeperros) {
                    System.out.println("Las razas son: ");
                    System.out.println(razasDeperro);
                    
                }
                break;

            } else {
                System.out.println("La raza que está buscando no se encuentra en la lista: ");
                System.out.println("");
                System.out.println("Las razas son: ");
                for (String razasDeperro : razasDeperros) {
                    System.out.println(razasDeperro);
                }
                break;
            }
           
        }
 
    }
    
}
