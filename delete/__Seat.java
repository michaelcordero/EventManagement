import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Seat {
    /*
        Properties
      */

    private boolean isPurchased;
    private boolean isVIP;
    private String  tier;

    protected enum Attributes {
        PURCHASED, VIP, TIER;
    }

    /*

    Constructors
     */

    public Seat(){

    }

    public Seat(Map<Attributes, String> map) {
        isPurchased = Boolean.valueOf(map.get(Attributes.PURCHASED));
        isVIP = Boolean.valueOf(map.get(Attributes.VIP));
        tier = map.get(Attributes.TIER);
    }
    /*

    Accessors
     */

    public boolean isPurchased() {
        return isPurchased;
    }

    public void setPurchased(boolean purchased) {
        isPurchased = purchased;
    }

    public boolean isVIP() {
        return isVIP;
    }

    public void setVIP(boolean VIP) {
        isVIP = VIP;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    /*
    Private
     */

    /*
    Protected
     */

    /*

    Public
     */

    public static Map<Attributes, String> mapping (String [] values) {
        Map<Seat.Attributes, String> returnMap = HashMap<>();
        for (String value : values) {
            switch (value) {
                case "unsold":
                case "sold":
                    returnMap.put(Attributes.PURCHASED, value);
                    break;
                case "regular":
                case "vip":
                    returnMap.put(Attributes.TIER, value);
                    break;

                default:
                    return null;
            }
        }
        return returnMap;
    }



//Arrays.stream(values).forEach(value -> seatAttributesMap.put());
}


