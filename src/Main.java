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

        System.out.println(Potter);
        System.out.println(Malfoy);

        Potter.compare(Malfoy);

        System.out.println(Granger);
        System.out.println(Weasley);
        Granger.compareGryffindor(Weasley);

        System.out.println(Diggory);
        System.out.println(FinchFletchley);
        Diggory.compareHufflepuff(FinchFletchley);

        System.out.println(Patil);
        System.out.println(Belby);
        Patil.compareRaveclaw(Belby);

        System.out.println(Montague);
        System.out.println(Goyle);
        Montague.compareSlytherin(Goyle);
    }
}