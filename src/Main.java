public class Main {
    public static void main(String[] args) {
        System.out.println(" Циклы, вторая часть:");
        int salary = 15000;
        int total = 0;
        int numberOfMonth = 0;
        while (total <= 2459000) {
            total = total + salary;
            numberOfMonth = numberOfMonth + 1;
            System.out.println(" Месяц " + numberOfMonth + " сумма накоплений равна " + total);
        }
        int eggs = 0;
        while (eggs < 10) {
            eggs = eggs + 1;
            System.out.print(" " + eggs);
        }
        System.out.println();
        for (eggs = 10; eggs >= 1; eggs = eggs - 1) {
            System.out.print(" " + eggs);
        }
        System.out.println();
        int lifers = 12000000;
        int god = 0;
        while (god < 10) {
            lifers = (lifers / 1000) * (1000 - 8 + 17);
            god = god + 1;
            System.out.println("Год " + god + ", численность населения составляет " + lifers);
        }
        int deposit = 15000;
        int money = 0;
        while (deposit < 12000000) {
            deposit = deposit + deposit / 100 * 7;
            money = money + 1;
            if (money % 6 == 0) {
                System.out.println(" Месяц " + money + ", вклад равен " + deposit);
            }
        }
        int period = 0;
        while (period < (9 * 12)) {
            deposit = deposit + deposit / 100 * 7;
            period = period + 1;
            if (period % 6 == 0)
                System.out.println(" Месяц " + period + " сумма вклада равна " + deposit);
        }
        int firstFriday = 4;
        int fullMonth = 0;
        while (fullMonth < 31) {
            fullMonth = fullMonth + 1;
            firstFriday = firstFriday + 7;
            if ((fullMonth - 4) % 7 == 0)
                System.out.println(" Сегодня пятница, " + fullMonth + "-е число. Необходимо подготовить отчет.");
            }
            int cycle = 0;
            while (cycle < 2024) {
                cycle = cycle + 79;
                if (cycle > 1824)
                    System.out.println(cycle);
            }
        }
    }