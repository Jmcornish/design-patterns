import java.util.Random;
public class WeaponNone implements WeaponBehavior {
    public String attack() {
        Random rand = new Random();
        int random = rand.nextInt(2);
        switch(random) {
            case 0:
                return "Oh no! I lost my weapon";
            case 1:
                return "No one let's me have a weapon :(";
        }
        return "0";
    }
}