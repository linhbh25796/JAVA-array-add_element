import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int []arr = new int[3];
        int i=0;
        while (i< arr.length){
            System.out.print("Enter element "+i +": ");
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.println("List array: ");
        for (int j=0;j< arr.length;j++){
            System.out.print(arr[j]+"\t");
        }

        System.out.println("Enter value: ");
        int value = sc.nextInt();
        System.out.println("Enter index of array: ");
        int index = sc.nextInt();
        main.insertElement(arr,value,index);
        for (i=0; i < arr.length; i++){
            System.out.print(arr[i]+"\t");
        }
    }

     public static void insertElement(int[] x, int value, int index) {
        if (index >= 0 && index < x.length -1){

            for (int i = x.length-1;i>index;i--){
                x[i] =x[i-1];
            }
            x[index] = value;

        }else {
            System.out.println("Error.");
        }

     }

}
