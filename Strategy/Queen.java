public class Queen extends Character {

    public Queen(String name) {
        super(name);
        setWeaponBehavior(new WeaponKnife());
    }

    public String toString() {
        return name + " is a Beautiful Queen";
    }
}