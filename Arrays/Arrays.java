
//Take an array of names as input from the user and print them on the screen.
import java.util.*;

public class Arrays {

public static void main(String[] args) {
    Scanner S = new Scanner(System.in);

    System.out.print("How many numbers you want to enter : ");
     int size  = S.nextInt();
     S.nextLine();
     int[] numbers = new int[size]; 
     for (int i =1; i <= size; i++ )
     {
        System.out.print(i + ": Enter number : ");
        int num = S.nextInt();
        S.nextLine();
        numbers[i-1] = num;

     }

     int min =numbers[0];
     int max = numbers[0];
     for (int i =1; i<numbers.length; i++){
        if (numbers[i] > max )
        {
            max = numbers[i];
        }
        if (numbers [i] < min) {
            min = numbers[i];   
        }
     
     }
     System.out.println("The maximum number present in array is "+max);
     System.out.println("The minimum number present in array is "+min);

     S.close();
}    
}
