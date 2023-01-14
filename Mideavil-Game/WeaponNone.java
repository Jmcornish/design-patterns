import java.util.Random;
public class WeaponNone implements WeaponBeavior {
    public String attack() {
        int random = rand.nextInt(2);
        switch(random)
            case 0:
                return "Oh no! I lost my weapon";
                break;
            case 1:
                return "No one let's me have a weapon :(";
                break;
    }
}