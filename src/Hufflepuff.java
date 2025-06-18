public class Hufflepuff extends Hogwarts{
    private final int hardworking;
    private final int loyal;
    private final int honest;

    public Hufflepuff(int castScore, int transgressScore, int hardworking, int loyal, int honest, String fullName) {
        super(castScore, transgressScore, fullName);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    protected int sumPoints() {
        return sumBasePoints() + hardworking + loyal + honest;
    }

    @Override
    public String toString() {
        return String.format(
                "Hufflepuff(castScore=%d, transgressScore=%d, hardworking=%d, loyal=%d, honest=%d)",
                getCastScore(), getTransgressScore(), getHardworking(), getLoyal(), getHonest()
        );
    }

    public void compareHufflepuff(Hufflepuff hufflepuff) {
        int thisSum = sumPoints();
        int otherSum = hufflepuff.sumPoints();
        String msg = "%s лучше, чем %s\n";
        if (thisSum > otherSum) {
            System.out.printf(msg, this.getFullName(), hufflepuff.getFullName());
        }
        else if (thisSum < otherSum) {
            System.out.printf(msg, hufflepuff.getFullName(), this.getFullName());
        }
        else {
            System.out.printf("%s и %s одинаково хороши\n", this.getFullName(), hufflepuff.getFullName());
        }
    }
}
