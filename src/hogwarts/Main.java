package hogwarts;

public class Main {
    public static void main(String[] args) {
        DataGenerator gen = new DataGenerator();

        Gryffindor Potter = gen.generate(Gryffindor.class, "Гарри Поттер");
        Gryffindor Granger = gen.generate(Gryffindor.class, "Гермиона Грейнджер");
        Gryffindor Weasley = gen.generate(Gryffindor.class, "Рон Уизли");

        Hufflepuff Smith = gen.generate(Hufflepuff.class, "Захария Смит");
        Hufflepuff Diggory = gen.generate(Hufflepuff.class, "Седрик Диггори");
        Hufflepuff FinchFletchley = gen.generate(Hufflepuff.class, "Джастин Финч-Флетчли");

        Ravenclaw Chang = gen.generate(Ravenclaw.class, "Чжоу Чанг");
        Ravenclaw Patil = gen.generate(Ravenclaw.class, "Падма Патил");
        Ravenclaw Belby = gen.generate(Ravenclaw.class, "Маркус Белби");

        Slytherin Malfoy = gen.generate(Slytherin.class, "Драко Малфой");
        Slytherin Montague = gen.generate(Slytherin.class, "Грэхэм Монтегю");
        Slytherin Goyle = gen.generate(Slytherin.class, "Грегори Гойл");

        Chang.cast();
        Smith.transgress();
        System.out.println();

        printCompareStats(Potter, Malfoy);
        printCompareStats(Granger, Weasley);
        printCompareStats(Diggory, FinchFletchley);
        printCompareStats(Patil, Belby);
        printCompareStats(Montague, Goyle);
    }

    public static void printCompareStats(Hogwarts first, Hogwarts second) {
        System.out.println(first);
        System.out.println(second);
        first.compare(second);
        System.out.println();
    }
}