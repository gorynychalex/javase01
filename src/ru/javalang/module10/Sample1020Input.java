package ru.javalang.module10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sample1020Input {
    public static void main(String[] args) {

        int num = correctInput();
        System.out.println(num);
    }

    public static int correctInput(){
        System.out.println("Введите ЦЕЛОЕ число для вычисления ... :");
        int n = 0;
        boolean c = false;
        while (!c) {
            try {
                n = new Scanner(System.in).nextInt();
                c = true;
            } catch (InputMismatchException e) {
                System.out.println("нужно ввести число!");
            }
        }
        return n;
    }
}
