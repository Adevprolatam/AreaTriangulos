/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package adevprolatam.sumaareastriangulos;

import java.util.Scanner;

public class SumaAreasTriangulos {

    public static void main(String[] args) {
        int n, op;
        double lado1, lado2, lado3;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("MENU\n=========================");
            System.out.println("1. Calcular Área de un Triángulo");
            System.out.println("2. Salir\n=========================");
            System.out.println("Seleccione una opción correcta\n==========================");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Ingrese el número de triángulos: ");
                    n = scanner.nextInt();
                    Triangulo[] triangle = new Triangulo[n];
                    double sumaAreas = 0;
                    for (int i = 0; i < n; i++) {
                        System.out.println("====================\n");
                        System.out.println("TRIÁNGULO #" + i + "\n");
                        System.out.println("Ingrese el primer lado");
                        lado1 = scanner.nextDouble();
                        System.out.println("Ingrese el segundo lado");
                        lado2 = scanner.nextDouble();
                        System.out.println("Ingrese el tercer lado");
                        lado3 = scanner.nextDouble();
                        triangle[i] = new Triangulo(lado1, lado2, lado3);
                        sumaAreas += triangle[i].area(); 
                    }
                    System.out.println("La suma total de áreas de los triángulos es: " + sumaAreas);
                    break;         
                    case 2:
                    break;
                default: System.out.println("Ingrese una opcion correcta ");
            }
        } while (op != 2);
    }
}
