package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double cm, kg,BMI ;
        int m;
        m=100;

        Scanner input = new Scanner(System.in);
        System.out.println("Это прога рассчитывает индекс массы тела");

        try
        {
            System.out.println("Введите рост ");
            kg = input.nextDouble();

            System.out.println("Введите вес");
            cm=input.nextDouble();

            kg=kg/m;
            BMI =cm/(kg*kg);

            

            if (BMI <16.4){
                System.out.println("Крайний недостаток веса "+BMI );
            }
            if (BMI >=16.5 && BMI <=18.4 ) {
                System.out.println("Недостаток в весе "+BMI );
            }
            if (BMI >=18.5 && BMI <=24.9 ) {
                System.out.println("нормальный вес "+BMI );
            }
            if (BMI >=25 && BMI <=30 ) {
                System.out.println("Избыточный вес "+BMI );
            }
            if (BMI >=30.1 && BMI <=34.9 ) {
                System.out.println( "Ожирение (Класс I) "+BMI );
            }
            if (BMI >=35 && BMI <=40) {
                System.out.println("Ожирение (Класс II - тяжелое "+BMI );
            }
            if (BMI >40 ) {
                System.out.println("Класс III - крайне тяжелое) "+BMI );
            }


        }
        catch (Exception e ){
            System.out.println("Ошибка");

        }


    }
}