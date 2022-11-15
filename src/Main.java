public class Main {
    public static void main(String[] args) {


        // Задача 1
        System.out.println("Задача 1");

        int salary = 89600;
        System.out.println("Значение переменной salary с типом данных int равно " + salary);
        byte days = 28;
        System.out.println("Значение переменной days с типом данных byte равно " + days);
        short cars = 29845;
        System.out.println("Значение переменной cars с типом данных short равно " + cars);
        long distanceNeptune = 4_300_000_000L;
        System.out.println("Значение переменной distanceNeptune с типом данных long равно " + distanceNeptune);
        float worldRecordBenchPress = 427.5f;
        System.out.println("Значение переменной worldRecordBenchPress с типом данных float равно " + worldRecordBenchPress);
        double bankDebt = 8.78921050;
        System.out.println("Значение переменной bankDebt с типом данных double равно " + bankDebt);


        // Задача 2
        System.out.println("Задача 2");

        float variable1 = 27.12f;
        long variable2 = 987678965549L;
        double variable3 = 2.786;
        boolean variable4 = false;
        short variable5 = -159;
        char variable6 = 569;
        int variable7 = 27897;
        byte variable8 = 67;


        // Задача 3
        System.out.println("Задача 3");

        byte studentsLyudmilaPavlovna = 23;
        byte studentsAnnaSergeevna = 27;
        byte studentsEkaterinaAndreevna = 30;
        int papersSheets = 480;
        System.out.println("На каждого ученика рассчитано " + (papersSheets / (studentsLyudmilaPavlovna + studentsAnnaSergeevna + studentsEkaterinaAndreevna)) + " листов бумаги");


        // Задача 4
        System.out.println("Задача 4");

        byte bottles = 16;
        byte timeProduction = 2;
        int made1Minute = bottles / timeProduction;
        int made20Minute = made1Minute * 20;
        System.out.println("За 20 минут машина произвела " + made20Minute + " бутылок");
        int madeInDay = made1Minute * (24 * 60);
        System.out.println("За сутки машина произвела " + madeInDay + " бутылок");
        int madeIn3Day = madeInDay * 3;
        System.out.println("За 3 дня машина произвела " + madeIn3Day + " бутылок");
        int made1Month = madeInDay * 30;
        System.out.println("За 1 месяц машина произвела " + made1Month + " бутылок");


        // Задача 5
        System.out.println("Задача 5");

        byte totalCans = 120;
        byte whiteCansPerClass = 2;
        byte BrownCansPerClass = 4;
        int totalClasses = totalCans / (whiteCansPerClass + BrownCansPerClass);
        System.out.println("В школе, где " + totalClasses + " классов, нужно "
                + (totalClasses * whiteCansPerClass) + " банок белой краски и "
                + (totalClasses * BrownCansPerClass) + " банок коричневой краски");


        // Задача 6
        System.out.println("Задача 6");

        byte bananas = 5;
        byte weight1Banana = 80;
        int bananasWeight =weight1Banana * bananas;

        byte milk = 2;
        byte milk100Ml = 105;
        int milkWeight = milk100Ml * milk;

        byte iceCreamSundae = 2;
        byte iceCreamSundae1Briquette = 100;
        int iceCreamSundaeWeight =iceCreamSundae1Briquette *  iceCreamSundae;

        byte rawEggs = 4;
        byte egg1Raw = 70;
        int rawEggsWeight = egg1Raw * rawEggs;
        double totalWeight = bananasWeight + milkWeight + iceCreamSundaeWeight + rawEggsWeight;
        System.out.println("Вес спорт-завтрака составляет " + (totalWeight / 1000) + " килограмм");


        // Задача 7
        System.out.println("Задача 7");

        short loseWeight = 7 * 1000;
        System.out.println("Сбростить " + loseWeight + " грамм");
        short diet1 = 250;
        System.out.println("Потеря " + diet1 + " грамм в день");
        short diet2 = 500;
        System.out.println("Потеря " + diet2 + " грамм в день");
        int dietaVerage = (diet1 + diet2) / 2;
        System.out.println("Потеря в среднем " + dietaVerage + " грамм в день");
        System.out.println("Потребуеться " + (loseWeight / diet1) + " дней, если спортсмен будет терять каждый день по 250 грамм");
        System.out.println("Потребуеться " + (loseWeight / diet2) + " дней, если спортсмен будет терять каждый день по 500 грамм");
        System.out.println("Потребуеться в среднем " + (loseWeight / dietaVerage) + " дней, при этом останеться сбросить ещё " + (loseWeight % dietaVerage) + " грамм");


        // Задача 8
        System.out.println("Задача 8");

        int mashaBefore = 67760;
        int denisBefore = 83690;
        int kristinaBefore = 76230;

        int masha10Percent = 67760 / 100 * 10;
        int denis10Percent = 83690 / 100 * 10;
        int kristina10Percent = 76230 / 100 * 10;

        int mashaАfter = mashaBefore + masha10Percent;
        int denisАfter = denisBefore + denis10Percent;
        int kristinaАfter = kristinaBefore + kristina10Percent;

        System.out.println("Маша теперь получает " + mashaАfter + " рублей. Годовой доход вырос на " + (mashaАfter * 12 - mashaBefore * 12) + " рублей");
        System.out.println("Денис теперь получает " + denisАfter + " рублей. Годовой доход вырос на " + (denisАfter * 12 - denisBefore * 12) + " рублей");
        System.out.println("Кристина теперь получает " + kristinaАfter + " рублей. Годовой доход вырос на " + (kristinaАfter * 12 - kristinaBefore * 12) + " рублей");
    }
}