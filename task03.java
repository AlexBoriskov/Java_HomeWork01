// 3) Реализовать простой калькулятор

import java.util.Scanner;

public class task03 {
    
    public static void summa (float a, float b){
        System.out.printf("\n Результат = %.2f \n", a+b);
    }

    public static void raznica (float a, float b){
        System.out.printf("\n Результат = %.2f \n", a-b);
    }

    public static void proizv (float a, float b){
       System.out.printf("\n Результат = %.2f \n", a*b);
    }

    public static void delenie (float a, float b){
        System.out.printf("\n Результат = %.2f \n", a/b);
    }

    public static void stepen (float a, float b){
        float result = 1;
        if (b==0) System.out.printf("\n Результат = %.0f \n", 1);
        else if (b>0)
        for (int i=1; i<=b; i++) result *= a;
            else {
                for (int i=-1; i>=b; i--) result /= a;}
        System.out.printf("\n Результат = %.5f \n", result);
    }

    public static void calculator () {
        System.out.print("\n МЕНЮ \n");
        System.out.print("1. Сложение\n");
        System.out.print("2. Вычитание\n");
        System.out.print("3. Умножение\n");
        System.out.print("4. Деление\n");
        System.out.print("5. Возведение в степень\n");
        System.out.print("6. Выход!\n");

        Scanner in = new Scanner (System.in);
        System.out.print("\n Выберите действие: ");
        int choose = in.nextInt();

        if (choose == 1 ){
            System.out.print("\nВведите первое число: ");
            float number01 = in.nextFloat();
            System.out.print("Введите второе число: ");
            float number02 = in.nextFloat();
            summa (number01,number02);
            calculator();
        }
        if (choose == 2 ){
            System.out.print("\nВведите первое число: ");
            float number01 = in.nextFloat();
            System.out.print("Введите второе число: ");
            float number02 = in.nextFloat();
            raznica (number01,number02);
            calculator();
        }
        if (choose == 3 ){
            System.out.print("\nВведите первое число: ");
            float number01 = in.nextFloat();
            System.out.print("Введите второе число: ");
            float number02 = in.nextFloat();
            proizv (number01,number02);
            calculator();
        }
        if (choose == 4 ){
            System.out.print("\nВведите первое число: ");
            float number01 = in.nextFloat();
            System.out.print("Введите второе число: ");
            float number02 = in.nextFloat();
            delenie (number01,number02);
            calculator();
        }
        if (choose == 5 ){
            System.out.print("\nВведите первое число: ");
            float number01 = in.nextFloat();
            System.out.print("Введите второе число: ");
            float number02 = in.nextFloat();
            stepen (number01,number02);
            calculator();
        }
        if (choose == 6){
            System.out.print("Пока");
        }
        in.close();
    }

    public static void main(String[] args) {
        calculator();
    }
}
