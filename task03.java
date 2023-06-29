// 3) Реализовать простой калькулятор

import java.util.Scanner;

public class task03 {

    public static void summa (float a, float b){
        System.out.printf("\n Результат = %.0f \n", a+b);
    }

    public float paznica (float a, float b){
        return a-b;
    }

    public float proizv (float a, float b){
        return a*b;
    }

    public float delenie (float a, float b){
        return a/b;
    }

    public float stepen (float a, float b){
        float result = 1;
        if (b==0) return 1;
        else if (b>0)
        for (int i=1; i<=b; i++) result *= a;
            else {
                for (int i=-1; i>=b; i--) result /= a;}
        return result;
    }

    public static void calculator () {
        // Scanner in = new Scanner (System.in);
        // System.out.print("Введите первое число: ");
        // int number01 = in.nextInt();
        // System.out.print("Введите второе число: ");
        // int number02 = in.nextInt();

        System.out.print("\n МЕНЮ \n");
        System.out.print("1. Сложение: \n");
        System.out.print("2. Вычитание: \n");
        System.out.print("3. Умножение: \n");
        System.out.print("4. Деление: \n");
        System.out.print("5. Возведение в степень: \n");
        System.out.print("6. Выход! \n");

        Scanner in = new Scanner (System.in);
        System.out.print("\n Выберите действие: ");
        int choose = in.nextInt();

        if (choose == 1 ){
            System.out.print("\nВведите первое число: ");
            int number01 = in.nextInt();
            System.out.print("Введите второе число: ");
            int number02 = in.nextInt();
            summa (number01,number02);
            calculator();
        }
        in.close();
    }

    public static void main(String[] args) {
        calculator();
    }
}
