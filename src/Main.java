import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int[] ar1 = {14, 21, 56, 81, 12};
        int size=7;
        int[] ar2 = new int[size];
       //���� ������� �� �������
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            System.out.println("������� �����");
            ar2[i] = scanner.nextInt();
        }

        //����� ������� ����������� � �������
        for (int i = 0; i < size; i++) {
            System.out.println(ar2[i]);
        }
    }
}
