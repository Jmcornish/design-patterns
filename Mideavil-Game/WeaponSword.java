import java.util.Random;
public class WeaponSword implements WeaponBeavior {
    public String attack() {
        int random = rand.nextInt(3);
        switch(random)
            case 0:
                return "Lunge and strike with sword";
                break;
            case 1:
                return "Fancy turn and slice with sword";
                break;
            case 2:
                return "Jam opponents blade with sword";
                break;
    }
}