import java.util.Random;
public class WeaponKnife implements WeaponBehavior {
    public String attack() {
        Random rand = new Random();
        int random = rand.nextInt(3);
        switch(random) {
            case 0:
                return "SLice with knife";
            case 1:
                return "Jab with knife";
            case 2:
                return "Sneak up on opponent with knife";
        }
        return "0";
    }
}