package com.test.math.example;

public class Main {
    public static void main(String[] args) {
      //  Math math1 = new Math();
      //  double score = math1.add(10,20);

        double score = Math.add(10,10);
        System.out.println(score);

        double score2 = Math.PI;
        System.out.println(score2);

        double score3 = Math.minus(5,4);
        System.out.println(score3);

        Customer customer1 = new Customer("Tomasz");
        Customer customer2 = new Customer("Tom");
        Customer customer3 = new Customer("Tome");
        Customer customer4 = new Customer("To");

        int idC1 = customer1.id;
        String namC1 = customer1.name;
        double nC1 = customer1.numberCustom;
        System.out.println(idC1 + " "+ namC1 + " " + nC1);

        int idC2 = customer2.id;
        String namC2 = customer2.name;
        double nC2 = customer2.numberCustom;
        System.out.println(idC2 + " "+ namC2 + " " + nC2);

        int idC3 = customer3.id;
        String namC3 = customer3.name;
        double nC3 = customer3.numberCustom;
        System.out.println(idC3 + " "+ namC3 + " " + nC3);

        int idC4 = customer4.id;
        String namC4 = customer4.name;
        double nC4 = customer4.numberCustom;
        System.out.println(idC4 + " " + namC4 + " " + nC4);

        Test.a = 4;
        System.out.println(Test.a);

    }

}
