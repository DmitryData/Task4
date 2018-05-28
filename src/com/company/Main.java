package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите предложение");
        String input = sc.nextLine();

        int counter = 0;
        int inpLen = input.length();

        if(inpLen != 0){
            counter++;
            for (int i = 0; i < inpLen; i++) {
                boolean print = true;
                switch (input.charAt(i)){
                    case ' ':
                        print = false;
                        counter++;
                        System.out.println();
                        break;
                    case ',':
                        print = false;
                        if (input.charAt(i+1) == ' ') i = i + 1;
                        counter++;
                        System.out.println();
                        break;
                }
                if (print) System.out.print(input.charAt(i));
            }
        }
        System.out.println('\n' + "Вы ввели " + counter + " слов");
    }
}
