import java.util.Random;
public class WeaponAxe implements WeaponBeavior {
    public String attack() {
        int random = rand.nextInt(2);
        switch(random)
            case 0:
                return "Swing an Axe";
                break;
            case 1:
                return "Twirl with an Axe";
                break;
    }
}