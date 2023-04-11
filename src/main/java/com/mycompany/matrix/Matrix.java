/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrix;
import java.util.Random;
public class Matrix {

    public static void main(String[] args) {
        // 5x5-ös mátrix létrehozása
        int[][] matrix = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = random.nextInt(10); // 0 és 9 közötti véletlen szám generálása
            }
        }
        
        System.out.println("Mátrix:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
       int mainDiagonalSum = 0;
        int aboveMainDiagonalSum = 0;
        int belowMainDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        int aboveSecondaryDiagonalSum = 0;
        int belowSecondaryDiagonalSum = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) { // főátló
                    mainDiagonalSum += matrix[i][j];
                } else if (i < j) { // főátló felett
                    aboveMainDiagonalSum += matrix[i][j];
                } else if (i > j) { // főátló alatt
                    belowMainDiagonalSum += matrix[i][j];
                }
                
                if (i + j == 4) { // mellékátló
                    secondaryDiagonalSum += matrix[i][j];
                } else if (i + j < 4) { // mellékátló felett
                    aboveSecondaryDiagonalSum += matrix[i][j];
                } else if (i + j > 4) { // mellékátló alatt
                    belowSecondaryDiagonalSum += matrix[i][j];
                }
            }
        }
        System.out.println("Főátló összege: " + mainDiagonalSum);
        System.out.println("Főátló feletti összeg: " + aboveMainDiagonalSum);
        System.out.println("Főátló alatti összeg: " + belowMainDiagonalSum);
        System.out.println("Mellékátló összege: " + secondaryDiagonalSum);
        System.out.println("Mellékátló feletti összeg: " + aboveSecondaryDiagonalSum);
        System.out.println("Mellékátló alatti összeg: " + belowSecondaryDiagonalSum);
    }
    }
}
