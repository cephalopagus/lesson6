public class Boss extends GameEntity{
    public Boss(String name, String race, int age, int level, boolean shield, Weapon weapon) {
        super(name, race, age, level, shield);
        this.weapon = weapon;
    }

    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo(){
        return "Boss: " + super.getName()
                + "\nRace: " + super.getRace()
                + "\nAge: " + super.getAge()
                + "\nLevel: " + super.getLevel()
                + "\nShield: " + super.isShield()
                + "\nWeaponType: " + this.weapon.getWeaponType()
                + "\nWeaponName: " + this.weapon.getWeaponName();
    }

}
