

public abstract class Character {
    protected String name;
    protected weaponBehavior WeaponBehavior;

    public void character(String name) {
        this.name = name;
    }
    public String attack() {
        return weaponBehavior.attack;
    }
    public void setWeaponBehavior(WeaponBeavior wb) {
        weaponBehavior = wb;
    }
    public String toString() {

    }
}