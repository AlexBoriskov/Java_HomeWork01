// 2) Вывести все простые числа от 1 до 1000
import java.util.Scanner;

public class task02 {
    public static void prostoe (int number){
    int count = 0;
    for (int i = 2; i<=number; i++){
        for (int j=2; j<i+1; j++) if (i % j == 0) count ++;
        if (count == 1) System.out.printf("%d ", i);
        count = 0; 
    }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int size = in.nextInt();
        prostoe(size);
        in.close();
    }
}
