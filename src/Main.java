public class Main {
    public static void main(String[] args) {

        // Задача 1.
        System.out.println();
        System.out.println("Задача 1.");
        int dog = 8;
        short cat = 1;
        long apple = 35123568L;
        float price = 10.94f;
        byte item = 38;

        double weight = 70.5;
        boolean isBool = true;
        System.out.println("Значение переменной cat с типом int равно " + cat);
        System.out.println("Значение переменной dog с типом short равно " + dog);
        System.out.println("Значение переменной apple с типом long равно " + apple);
        System.out.println("Значение переменной price с типом float равно " + price);
        System.out.println("Значение переменной weight с типом double равно " + weight);
        System.out.println("Значение переменной isBool с типом boolean равно " + isBool);
        System.out.println("Значение переменной item с типом byte равно " + item);



        // Задача 2.
        System.out.println();
        System.out.println("Задача 2.");
        float number1 = 27.12f;
        long bigNum = 987678965549L;
        float number2 = 2.786f;
        boolean isLog = false;
        int value1 = 569;
        int value2 = -159;
        int value3 = 27897;
        short value4 = 67;

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(bigNum);
        System.out.println(isLog);
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);

        // Задача 3.
        System.out.println();
        System.out.println("Задача 3");
        int student1 = 23;
        int student2 = 27;
        int student3 = 30;
        int totalPapers = 480;
        int oneStudentPaper = totalPapers / (student1 + student2 + student3);
        System.out.println("На каждого ученика рассчитано " + oneStudentPaper + " листов бумаги.");

        // Задача 4.
        System.out.println();
        System.out.println("Задача 4");

        int time1 = 20; // минут
        int time2 = 24 * 60; // в сутки
        int time3 = 3 * 24 * 60; // 3 дня
        int time4 = 30 * 24 * 60; // за 1 месяц - 30
        int bottles = 16;
        int timeBottles = 2;
        int countBottle1 = (time1 / timeBottles) * bottles;
        int countBottle2 = (time2 / timeBottles) * bottles;
        int countBottle3 = (time3 / timeBottles) * bottles;
        int countBottle4 = (time4 / timeBottles) * bottles;
        System.out.println("За " + time1 + " машины произвела бутылок " + countBottle1 + " штук.");
        System.out.println("За " + time2 + " машины произвела бутылок " + countBottle2 + " штук.");
        System.out.println("За " + time3 + " машины произвела бутылок " + countBottle3 + " штук.");
        System.out.println("За " + time4 + " машины произвела бутылок " + countBottle4 + " штук.");
        // Задача 5.
        System.out.println();
        System.out.println("Задача 5");

        int whitePaints = 2;
        int brownPaints = 4;
        int totalPaints = 120;
        int roomCount = totalPaints / (whitePaints + brownPaints);
        int totalWhitePaints = roomCount * whitePaints;
        int totalBrownPaints = roomCount * brownPaints;
        System.out.println("В школе, где " + roomCount + " классов, нужно " + totalWhitePaints + " банок белой краски и " + totalBrownPaints + " банок коричневой краски.");




        // Задача 6.
        System.out.println();
        System.out.println("Задача 6");
        int bananasWeight = 80;
        int milkWeight = 105;
        int iceWeight = 100;
        int eggs = 70;
        int totalWeightGram = bananasWeight * 5 + milkWeight * 2 + eggs * 4 + iceWeight * 2;
        int totalWeightKg = totalWeightGram / 1000;
        System.out.println("вес (количество грамм) такого спорт-завтрака: " + totalWeightGram + "г.");
        System.out.println("вес (количество кг) такого спорт-завтрака: " + totalWeightKg + "кг.");

        // Задача 7.
        System.out.println();
        System.out.println("Задача 7.");
        int throwOffWeight1 = 250;
        int throwOffWeight2 = 500;

        int dayThrowOffWeight1 = 7 * 1000 / throwOffWeight1;
        int dayThrowOffWeight2 = 7 * 1000 / throwOffWeight2;

        System.out.println("сколько дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм : " + dayThrowOffWeight1 + "дней .");
        System.out.println("сколько дней уйдёт на похудение, если спортсмен будет терять каждый день по 500 грамм : " + dayThrowOffWeight2 + "дней .");

        int avgDaysThrowOffWeight = (dayThrowOffWeight1 + dayThrowOffWeight2) / 2;
        System.out.println("в среднем потребуется : " + avgDaysThrowOffWeight + "дней.");

        // Задача 8.
        System.out.println();
        System.out.println("Задача 8.");

        int salaryMasha =  67760;
        int salaryDenis = 83690;
        int salaryCristina = 76230;

        double raisingSalaryMasha =  salaryMasha * 0.1;
        double raisingSalaryDenis = salaryDenis * 0.1;
        double raisingSalaryCristina = salaryCristina * 0.1;

        double incomeSalaryMasha =  salaryMasha + raisingSalaryMasha;
        double incomeSalaryDenis = salaryDenis + raisingSalaryDenis;
        double incomeSalaryCristina = salaryCristina + raisingSalaryCristina;

        double incomeYearMasha = (incomeSalaryMasha - salaryMasha) * 12;
        double incomeYearDenis = (incomeSalaryDenis - salaryDenis) * 12;
        double incomeYearCristina = (incomeSalaryCristina - salaryCristina) * 12;

        System.out.println("Маша теперь получает " + incomeSalaryMasha + " рублей.  Годовой доход вырос на " + incomeYearMasha + " рублей");
        System.out.println("Денис теперь получает " + incomeSalaryDenis + " рублей.  Годовой доход вырос на " + incomeYearDenis + " рублей");
        System.out.println("Кристина теперь получает " + incomeSalaryCristina + " рублей.  Годовой доход вырос на " + incomeYearCristina + " рублей");

    }
}