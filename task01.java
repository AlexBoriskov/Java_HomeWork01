import java.util.Scanner;

// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

public class task01{
    public static float summa (int number){
        float result = 0;
        for (int i = 0; i<=number; i++) result += i;
        return result;
    }

    public static float factorial (int number){
        float result = 1;
        for (int i = 1; i<=number; i++) result *= i;
        return result;
    }
    
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Введите конечное число: ");
    int size = in.nextInt();
    in.close();
    float result_summa = summa (size);
    System.out.printf("Сумма от 1 до %d = %.0f \n", size, result_summa);
    float result_factorial = factorial(size);
    System.out.printf("Факториал от %d! = %.0f", size, result_factorial);
    }
}