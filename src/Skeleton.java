public class Skeleton extends Boss{

    private int amountOfArrows;
    public Skeleton(String name, String race, int age, int level, boolean shield, Weapon weapon, int amountOfArrows) {
        super(name, race, age, level, shield, weapon);
        this.amountOfArrows = amountOfArrows;
    }

    public int getAmountOfArrows() {
        return amountOfArrows;
    }

    public void setAmountOfArrows(int amountOfArrows) {
        this.amountOfArrows = amountOfArrows;
    }

    @Override
    public String printInfo() {
        return super.printInfo();
    }
}
