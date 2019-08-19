package AssignmentSession5;

import java.util.Scanner;

public class MatricesCalculator {

	public static void main(String[] args) {
		MatricesCalculator mc = new MatricesCalculator();
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to your Matrix Calculator. You will find options below!");
		System.out.println();
		while(true) {
			System.out.println("\nEnter 'A' for addition, \n'S' for subtraction, \n'M' for multiplication, \nand 'T' to see a demonstration of a transpose! \nIf you would like to exit this calculator, enter 'L'." );
			String decision = input.next();
			
			if(decision.equalsIgnoreCase("A")) {
				 System.out.print("Enter number of rows: ");
			       int rows = input.nextInt();
			       System.out.print("Enter number of columns: ");
			       int columns = input.nextInt();
			       System.out.println();
			       System.out.println("Enter first matrix");
			       int[][] a = readMatrix(rows, columns);
			       System.out.println();
			       System.out.println("Enter second matrix");
			       int[][] b = readMatrix(rows, columns);
			       int[][] sum = add(a, b);
			       System.out.println("The sum of the matrix values you entered are below: ");
			       printMatrix(sum);
			}
			else if(decision.equalsIgnoreCase("S")) {
				 System.out.print("Enter number of rows: ");
			       int rows = input.nextInt();
			       System.out.print("Enter number of columns: ");
			       int columns = input.nextInt();
			       System.out.println();
			       System.out.println("Enter first matrix");
			       int[][] a = readMatrix(rows, columns);
			       System.out.println();
			       System.out.println("Enter second matrix");
			       int[][] b = readMatrix(rows, columns);
			       int[][] difference1 = subtract(a, b);
			       System.out.println("The difference between your 'a' - 'b' value is below: ");
			       printMatrix(difference1);
			}
			else if(decision.equalsIgnoreCase("M")) {
				System.out.print("Enter number of rows: ");
			       int rows = input.nextInt();
			       System.out.print("Enter number of columns: ");
			       int columns = input.nextInt();
			       System.out.println();
			       System.out.println("Enter first matrix");
			       int[][] a = readMatrix(rows, columns);
			       System.out.println();
			       System.out.println("Enter second matrix");
			       int[][] b = readMatrix(rows, columns);
			       int[][] quotient = multiply(a, b);
			       System.out.println("The quotient of the matrix values you entered are below: ");
			       printMatrix(quotient);
			}
			else if(decision.equalsIgnoreCase("T")) {
				System.out.print("Enter number of rows: ");
			       int rows = input.nextInt();
			       System.out.print("Enter number of columns: ");
			       int columns = input.nextInt();
			       System.out.println();
			       System.out.println("Enter first matrix");
			       int[][] a = readMatrix(rows, columns);
			       System.out.println("This is your matrix transposed below: ");
			       int[][] transposed = transposeMatrix(a);
			       printMatrix(transposed);
			}
			else if(decision.equalsIgnoreCase("L")) {
				System.out.println("You are leaving your matrix calculator. Goodbye!");
				System.exit(0);
			}
		}
		
	/*	//Scanner scanner = new Scanner(System.in);
	      // System.out.print("Enter number of rows: ");
	      // int rows = input.nextInt();
	       System.out.print("Enter number of columns: ");
	       int columns = input.nextInt();
	       System.out.println();
	       System.out.println("Enter first matrix");
	       int[][] a = readMatrix(rows, columns);
	       System.out.println();
	       System.out.println("Enter second matrix");
	       int[][] b = readMatrix(rows, columns);
	       int[][] sum = add(a, b);
	       int[][] difference1 = subtract(a, b);
	       int[][] difference2 = subtract(b, a);
	       int[][] quotient = multiply(a, b);
	       System.out.println();
	       System.out.println("The sum of the matrix values you entered are below: ");
	       printMatrix(sum);
	       System.out.println();
	       System.out.println("The difference between your 'a' - 'b' value is below: ");
	       printMatrix(difference1);
	       System.out.println();
	       System.out.println("The difference between your 'b' - 'a' value is also below: ");
	       printMatrix(difference2);	
	       System.out.println("The quotient of the matrix values you entered are below: ");
	       printMatrix(quotient);
	*/       
	       
	}
	  public static int[][] readMatrix(int rows, int columns) {
	       int[][] result = new int[rows][columns];
	       Scanner s = new Scanner(System.in);
	       for (int i = 0; i < rows; i++) {
	           for (int j = 0; j < columns; j++) {
	               result[i][j] = s.nextInt();
	           }
	       }
	       return result;
	   }
	  public static int[][] add(int[][] a, int[][] b) {
	       int rows = a.length;
	       int columns = a[0].length;
	       int[][] result = new int[rows][columns];
	       for (int i = 0; i < rows; i++) {
	           for (int j = 0; j < columns; j++) {
	               result[i][j] = a[i][j] + b[i][j];
	           }
	       }
	       return result;
	   }
	  public static int[][] subtract(int[][] a, int[][] b) {
	       int rows = a.length;
	       int columns = a[0].length;
	       int[][] result = new int[rows][columns];
	       for (int i = 0; i < rows; i++) {
	           for (int j = 0; j < columns; j++) {
	               result[i][j] = a[i][j] - b[i][j];
	           }
	       }
	       return result;
	   }
	  public static int[][] multiply(int[][] a, int[][] b) {
		  int rows = a.length;
	       int columns = a[0].length;
	       int[][] result = new int[rows][columns];
	       for (int i = 0; i < rows; i++) {
	           for (int j = 0; j < columns; j++) {
	               result[i][j] = a[i][j] * b[i][j];
	               //result[i][j] = (a[i][(Integer) null] * b[i][(Integer) null]) + (a[j][(Integer) null] * b[j][(Integer) null]);
	           }
	       }
	       return result;
	  }
	 
	  
	  public static void printMatrix(int[][] matrix) {
	       int rows = matrix.length;
	       int columns = matrix[0].length;
	       for (int i = 0; i < rows; i++) {
	           for (int j = 0; j < columns; j++) {
	               System.out.print(matrix[i][j] + " ");
	           }
	           System.out.println();
	       }
	   }
	  public static int[][] transposeMatrix(int [][] m){
	        int[][] temp = new int[m[0].length][m.length];
	        for (int i = 0; i < m.length; i++)
	            for (int j = 0; j < m[0].length; j++)
	                temp[j][i] = m[i][j];
	        return temp;
	    }
	  public static double[][] readMatrixD(double rows, double columns) {
	       double[][] result = new double[(int) rows][(int) columns];
	       Scanner s = new Scanner(System.in);
	       for (int i = 0; i < rows; i++) {
	           for (int j = 0; j < columns; j++) {
	               result[i][j] = s.nextInt();
	           }
	       }
	       return result;
	   }
	  public static void printMatrix(double[][] matrix) {
	       int rows = matrix.length;
	       int columns = matrix[0].length;
	       for (int i = 0; i < rows; i++) {
	           for (int j = 0; j < columns; j++) {
	               System.out.print(matrix[i][j] + " ");
	           }
	           System.out.println();
	       }
	   }
}
