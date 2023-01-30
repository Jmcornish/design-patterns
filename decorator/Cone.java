package decorator;
/**
 * @author Jadon Cornish
 */
public class Cone extends IceCream {
    protected ConeType coneType;

    public Cone(ConeType coneType) {
        this.coneType = coneType;
        this.description = convertEnum(coneType);
    }
    /**
     * @return cost based on the type of cone
     */
    public double getCost() {
        switch(this.coneType) {
            case SUGAR_CONE:
                return 0.75;
            case WAFFLE_CONE:
                return 1.2;
            case Pretzel_Cone:
                return 1.8;
            case CHOCOLATE_DIPPED_CONE:
                return 1.5;
        }
        return 0;
    } 
    private String convertEnum(ConeType coneType) {
        String enumeration = coneType.toString();
        enumeration = enumeration.toLowerCase();
        String enu = enumeration.substring(0,1);
        enumeration = enumeration.replace("_", " ");
        enumeration = enumeration.replaceFirst(enu, enu.toUpperCase());
        return enumeration;
    }
    
}
