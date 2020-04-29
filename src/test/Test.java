/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.Arrays;
import static domain.Main.filling;
import static domain.Main.transposition;


/**
 *
 * @author admin
 */
public class Test {
        public static void main(String[] args) {
        int [][] matrix;
        int x=13;
        int n=5;
        matrix=filling(n, x);
        System.out.println("Заповнена матриця: ");
        for(int[] row:matrix)
            System.out.println(Arrays.toString(row));
        matrix=transposition(matrix);
        System.out.println("\nТранспонована матриця:");
        for(int[] row:matrix)
            System.out.println(Arrays.toString(row));
    }
}
