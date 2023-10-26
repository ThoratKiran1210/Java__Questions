// class Fibonacci{  
//     public static void main(String args[])  
//     {    
//      int n1=0,n2=1,n3,i,count=10;    
//      System.out.print(n1+" "+n2);    
        
//      for(i=4;i<count;++i)  
//      {    
//       n3=n1+n2;    
//       System.out.print(" "+n3);    
//       n1=n2;    
//       n2=n3;    
//      }    
      
//     }} 

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of 'n' for the Fibonacci sequence: ");
        int n = scanner.nextInt();
        scanner.close();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Fibonacci Sequence up to the " + n + "-th term:");
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
