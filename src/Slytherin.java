public class Slytherin extends Hogwarts{
    private final int cunning;
    private final int decisive;
    private final int ambitious;
    private final int resourceful;
    private final int bossy;

    public Slytherin(int castScore, int transgressScore, int cunning, int decisive, int ambitious, int resourceful, int bossy, String fullName) {
        super(castScore, transgressScore, fullName);
        this.cunning = cunning;
        this.decisive = decisive;
        this.ambitious = ambitious;
        this.resourceful = resourceful;
        this.bossy = bossy;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDecisive() {
        return decisive;
    }

    public int getAmbitious() {
        return ambitious;
    }

    public int getResourceful() {
        return resourceful;
    }

    public int getBossy() {
        return bossy;
    }

    protected int sumPoints() {
        return sumBasePoints() + cunning + decisive + ambitious + resourceful + bossy;
    }

    @Override
    public String toString() {
        return String.format(
                "Slytherin(castScore=%d, transgressScore=%d, cunning=%d, decisive=%d, ambitious=%d, resourceful=%d, bossy=%d)",
                getCastScore(), getTransgressScore(), getCunning(), getDecisive(), getAmbitious(),
                getResourceful(), getBossy()
        );
    }

    @Override
    public void compare(Hogwarts hogwarts) {
        if (hogwarts instanceof Slytherin) {
            this.compare((Slytherin) hogwarts);
        }
        else {
            super.compare(hogwarts);
        }
    }

    public void compare(Slytherin slytherin) {
        int thisSum = sumPoints();
        int otherSum = slytherin.sumPoints();
        String msg = "%s лучше, чем %s.\n";
        String msgEq = "%s и %s одинаково хороши.\n";
        compareBase(thisSum, otherSum, msg, msgEq, slytherin);
    }
}
