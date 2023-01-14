import java.util.Random;
public class WeaponKnife implements WeaponBeavior {
    public String attack() {
        int random = rand.nextInt(3);
        switch(random)
            case 0:
                return "SLice with knife";
                break;
            case 1:
                return "Jab with knife";
                break;
            case 2:
                return "Sneak up on opponent with knife";
                break;
    }
}