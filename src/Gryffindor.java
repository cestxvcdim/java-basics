public class Gryffindor extends Hogwarts {
    private final int noble;
    private final int honor;
    private final int brave;

    public Gryffindor(int castScore, int transgressScore, int noble, int honor, int brave, String fullName) {
        super(castScore, transgressScore, fullName);
        this.noble = noble;
        this.honor = honor;
        this.brave = brave;
    }

    public int getNoble() {
        return noble;
    }

    public int getHonor() {
        return honor;
    }

    public int getBrave() {
        return brave;
    }

    protected int sumPoints() {
        return sumBasePoints() + noble + honor + brave;
    }

    @Override
    public String toString() {
        return String.format(
                "Gryffindor(castScore=%d, transgressScore=%d, noble=%d, honor=%d, brave=%d)",
                getCastScore(), getTransgressScore(), getNoble(), getHonor(), getBrave()
        );
    }

    public void compareGryffindor(Gryffindor gryffindor) {
        int thisSum = sumPoints();
        int otherSum = gryffindor.sumPoints();
        String msg = "%s лучше, чем %s\n";
        if (thisSum > otherSum) {
            System.out.printf(msg, this.getFullName(), gryffindor.getFullName());
        }
        else if (thisSum < otherSum) {
            System.out.printf(msg, gryffindor.getFullName(), this.getFullName());
        }
        else {
            System.out.printf("%s и %s одинаково хороши\n", this.getFullName(), gryffindor.getFullName());
        }
    }
}
