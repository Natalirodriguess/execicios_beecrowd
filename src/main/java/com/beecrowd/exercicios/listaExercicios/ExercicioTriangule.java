package com.beecrowd.exercicios.listaExercicios;

import java.io.IOException;
import java.util.Scanner;

public class ExercicioTriangule {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        if(A+B > C && B+C> A && A+C> B){
            double perimetro = A + B + C;
            System.out.printf("Perimetro = %.1f%n", perimetro);
        }else {
            double area = ((A+B)*C)/2;
            System.out.printf("Area = %.1f%n", area);
        }
    }
}
