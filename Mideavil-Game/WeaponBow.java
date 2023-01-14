import java.util.Random;
public class WeaponBow implements WeaponBeavior {
    public String attack() {
        int random = rand.nextInt(2);
        switch(random)
            case 0:
                return "Draw and loose an arrow";
                break;
            case 1:
                return "Shoot arrow high in the sky";
                break;
    }
}