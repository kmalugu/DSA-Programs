import java.util.Scanner;

public class linear_search {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,i,key;
        System.out.println("Enter the Array Size:");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements:");
        for(i=0; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        key = sc.nextInt();
        for(i=0; i<arr.length; i++)
        {
            if (arr[i] == key)
            {
                System.out.println("Element Found at: " + i);
            }
            System.out.println("Element Not Found");
        }
        sc.close();
    }
}
