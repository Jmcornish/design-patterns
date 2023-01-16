import java.util.Random;
public class WeaponAxe implements WeaponBehavior {
    public String attack() {
        Random rand = new Random();
        int random = rand.nextInt(2);
        switch(random) {
            case 0:
                return "Swing an Axe";
            case 1:
                return "Twirl with an Axe"; 
        }
        return "0";
    }
}