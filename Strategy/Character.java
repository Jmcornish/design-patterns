

public abstract class Character {
    protected String name;
    protected WeaponBehavior WeaponBehavior;

    public Character(String name) {
        this.name = name;
    }
    public String attack() {
        return WeaponBehavior.attack();
    }
    public void setWeaponBehavior(WeaponBehavior wb) {
        WeaponBehavior = wb;
    }
    public String toString() {
        return "H";
    }
}