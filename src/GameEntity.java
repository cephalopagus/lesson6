public class GameEntity {
    private String name, race;
    private int age, level;
    private boolean shield;

    public GameEntity(String name, String race, int age, int level, boolean shield) {
        this.name = name;
        this.race = race;
        this.age = age;
        this.level = level;
        this.shield = shield;
    }
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isShield() {
        return shield;
    }

    public void setShield(boolean shield) {
        this.shield = shield;
    }
}
