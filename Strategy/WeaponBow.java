import java.util.Random;
public class WeaponBow implements WeaponBehavior {
    public String attack() {
        Random rand = new Random();
        int random = rand.nextInt(2);
        switch(random) {
            case 0:
                return "Draw and loose an arrow";
            case 1:
                return "Shoot arrow high in the sky";
        }
        return "0";
    }
}