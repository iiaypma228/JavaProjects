// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.io.Console;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Завдання 1
        System.out.println("Завдання 1");
        System.out.println("Оголошено змінну i цілого типу розміру 4 байти");
        int i;
        char c = 'A';
        System.out.println("Оголошено змінну c символьного типу з початковим значенням ");

        System.out.println("Оголошено дві змінні f1, f2 логічного типу, f1 має початкове значення false" );
        boolean f1 = false,f2 = true;

        System.out.println("Оголошено змінну b цілого типу довжиною 1 байт з початковим значенням 1" );
        short b = 1;

       //Завдання 2
       System.out.println("Завдання 2");
       i = b;
       System.out.println("Змнній i привласнюю поточне значення змінної b, i = " + i );

       f1 = f2;
       System.out.println("Змнній f1 привласнюю поточне значення змінної f2, f1 = " + f1 );
       var rand = new Random(System.currentTimeMillis());
       i = 5 + rand.nextInt(15 - 5 + 1);
       System.out.println("Змнній i привласнюю випадкове значення в діапазоні від 5 жо 15, i = " + i );


       b = (byte)i;
        System.out.println("Змнній b привласнюю  значення змінної i, b = " + b );

        System.out.println("Завдання 3");

        System.out.println("Результат виразу: " + (Math.sin(Math.pow(i,2)) + (Math.pow(Math.cos(i),2) / i + Math.sqrt(i))));


    }

}