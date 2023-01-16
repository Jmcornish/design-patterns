public class Knight extends Character {

    public Knight(String name) {
        super(name);
        setWeaponBehavior(new WeaponBow());
    }

    public String toString() {
        return name + " is a valiant Knight";
    }
}