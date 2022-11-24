import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int[] ar1 = {14, 21, 56, 81, 12};
        //int size=7;
        int[] ar2 = new int[7];
       //ввод массива из консоли
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < ar2.length; i++) {
            System.out.println("введите число");
            ar2[i] = scanner.nextInt();
        }

        printArray(ar2);
        printArray(ar1);
    }

     static void printArray(int[] massiv)
    {//вывод массива поэлементно в консоль
        for (int i = 0; i < massiv.length ; i++) {
            //System.out.print(massiv[i]+ ((i != massiv.length-1) ? " " : "\n"));
            System.out.print(massiv[i]);
            if (i != massiv.length-1)
                System.out.print(" ");
            else
                System.out.print("\n");
        }
    }
}
