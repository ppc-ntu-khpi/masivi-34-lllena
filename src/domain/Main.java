package domain;

/**
 * Main class
 * @author admin
 */


public class Main {
    /**
     * method for filling a matrix from a given number
     * @param n matrix size
     * @param x the element from whith the countdown begins
     * @return 
     */
    public static int[][] filling (int n, int x){
       int[][] arr = new int[n][n]; //we create a matrix of a given size
       for(int i=0;i<n;i++){        //fill it with values
           for(int j=0;j<n;j++)
           {
               arr[i][j]=x++;
           } 
       }
       return arr;                  //return the result  
    }
    
    /**
     * transpose method
     * @param arr matrix
     * @return 
     */
      public static int[][] transposition (int[][] arr) {      
        for (int i = 0; i < arr.length; i++) {          //iteration over a string
            for (int j = i+1; j < arr[i].length; j++) { //iteration over a column
                int x = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = x;
            }
        }
        return arr;                 //return the result 
    }
    }

