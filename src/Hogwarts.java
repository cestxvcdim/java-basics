public abstract class Hogwarts {
    private final int castScore;
    private final int transgressScore;
    private final String fullName;

    public void cast() {
        System.out.printf("Колдую с силой: %d\n", getCastScore());
    }
    public void transgress() {
        System.out.printf("Трансгрессирую на расстояние: %d\n", getTransgressScore());
    }

    protected Hogwarts(int castScore, int transgressScore, String fullName) {
        this.castScore = castScore;
        this.transgressScore = transgressScore;
        this.fullName = fullName;
    }

    public int getCastScore() {
        return castScore;
    }

    public int getTransgressScore() {
        return transgressScore;
    }

    public String getFullName() {
        return fullName;
    }

    protected int sumBasePoints() {
        return castScore + transgressScore;
    }

    public void compare(Hogwarts hogwarts) {
        int thisSum = sumBasePoints();
        int otherSum = hogwarts.sumBasePoints();
        String msg = "%s обладает большей мощностью магии, чем %s\n";
        if (thisSum > otherSum) {
            System.out.printf(msg, this.getFullName(), hogwarts.getFullName());
        }
        else if (thisSum < otherSum) {
            System.out.printf(msg, hogwarts.getFullName(), this.getFullName());
        }
        else {
            System.out.printf("Мощности магии %s и %s равны\n", this.getFullName(), hogwarts.getFullName());
        }
    }
}
