public class Ravenclaw extends Hogwarts{
    private final int smart;
    private final int wise;
    private final int witty;
    private final int creative;

    public Ravenclaw(int castScore, int transgressScore, int smart, int wise, int witty, int creative, String fullName) {
        super(castScore, transgressScore, fullName);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreative() {
        return creative;
    }

    protected int sumPoints() {
        return sumBasePoints() + wise + witty + creative + smart;
    }

    @Override
    public String toString() {
        return String.format(
                "Ravenclaw(castScore=%d, transgressScore=%d, smart=%d, wise=%d, witty=%d, creative=%d)",
                getCastScore(), getTransgressScore(), getSmart(), getWise(), getWitty(), getCreative()
        );
    }

    @Override
    public void compare(Hogwarts hogwarts) {
        if (hogwarts instanceof Ravenclaw) {
            this.compare((Ravenclaw) hogwarts);
        }
        else {
            super.compare(hogwarts);
        }
    }

    public void compare(Ravenclaw ravenclaw) {
        int thisSum = sumPoints();
        int otherSum = ravenclaw.sumPoints();
        String msg = "%s лучше, чем %s.\n";
        String msgEq = "%s и %s одинаково хороши.\n";
        compareBase(thisSum, otherSum, msg, msgEq, ravenclaw);
    }
}
