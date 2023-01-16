import java.util.Random;
public class WeaponSword implements WeaponBehavior {
    public String attack() {
        Random rand = new Random();
        int random = rand.nextInt(3);
        switch(random) {
            case 0:
                return "Lunge and strike with sword";
            case 1:
                return "Fancy turn and slice with sword";
            case 2:
                return "Jam opponents blade with sword";
        }
        return "0";
    }
}