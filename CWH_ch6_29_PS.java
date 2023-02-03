package com.company;
import java.util.Scanner;
public class CWH_ch6_29_PS {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
/*    Practice problem 1
        float []array=new float[5];
        float sum=0;
        System.out.println("Enter the Elements of Array you want to add: ");
        for(int i=0;i<array.length; i++) {
            array[i] =input.nextFloat();
            sum+=array[i];
        }
        System.out.println("Sum of All Elements "+sum);
 */

   /*     Practice problem 2
        float[] array = {55.6f, 98.6f, 88.2f, 45.3f, 12.1f, 2.3f, 45.2f};
        System.out.println("Elements of Array");
        for (int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }
        System.out.println("Enter the number you want to check: ");
        float num = input.nextFloat();
        boolean isArray = false;
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) {
             isArray = true;
             break;
            }
        }
        if (isArray){
            System.out.println(num + " is avalible");
        }
        else
            System.out.println("Not avalibel");
        }

    */

/*       Practice Problem 3
        int []subject=new int[5];
        System.out.println("Enter the Subject number you get:");
        int sum=0;
        for (int i=0;i< subject.length;i++){
            subject[i]=input.nextInt();
            sum+=subject[i];
        }
        int Average=sum/subject.length;
        System.out.println(Average+" Average of your Marks");
*/
      /*  Practice Problem 4
        int[][] mat1 = new int[2][3];
        int[][] mat2 = new int[2][3];
        int [][]result={{0,0,0,},{0,0,0}};
        System.out.println("Enter the Elements of Matrix-1");
        for (int i=0;i< mat1.length;i++){
            for (int j=0;j< mat1[i].length;j++) {
                mat1[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the Elements of Matrix-2");
        for (int i=0;i< mat2.length;i++){
            for (int j=0;j< mat2[i].length;j++) {
                mat1[i][j] = input.nextInt();
            }
        }
        for (int i=0;i< mat1.length;i++){
            for (int j=0;j< mat1[i].length;j++) {
                System.out.format("Setting value for i=%d and j=%d\n",i,j);
               result[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        for (int i=0;i< mat1.length;i++){
            for (int j=0;j< mat1[i].length;j++) {
                System.out.print(result[i][j]+" ");
                result[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        System.out.println(" ");
*/
   /*  Practice Poblem 5
        int []arr={1,2,3,4,5,6};
        int n=Math.floorDiv(arr.length, 2);
        int l=arr.length;
        int temp;
        for(int i=0;i<n;i++) {
           temp=arr[i];
           arr[i]=arr[l-i-1];
            arr[l-i-1]=temp;
        }
        for (int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
   */

//        Practice Problem 6
  /*      int []arr={1,2,88,512,5,6};
        int max=0;
        for(int i=0; i< arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println(max+" is Maximum");
*/
//        Practice Problem 7
        int []arr={1,2,3,4,5};
        int min=Integer.MAX_VALUE;
        for (int i=0;i< arr.length;i++){
            if(min>arr[i]) {
                min = arr[i];
            }
        }
      System.out.println(min+" is Minimum value");

//        Prectice Problem 8
        boolean sorted=true;
        int []sort={1,2,3,4,5,6,7};
           for(int i=0;i< sort.length-1;i++){
                if(sort[i]>sort[i+1])
                    sorted=false;
                break;
           }
           if(sorted)
               System.out.println("The array is sorted");
           else
               System.out.println("The array is not sorted");
    }
}

