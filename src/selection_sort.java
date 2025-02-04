import java.util.Scanner;

public class selection_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,temp,n;
        System.out.println("Enter the size of array: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements:");
        for(i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Given Array is: ");
        for(i=0; i< arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        for(i=0;i<arr.length-1;i++)
        {
            int minIndex = i;
            for(j=i+1;j<arr.length;j++)
            {
                if(arr[j] < arr[minIndex])
                {
                    minIndex = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println("\nSorted Array is: ");
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
