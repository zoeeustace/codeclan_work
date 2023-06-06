import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<String, String> favouriteGreggs = new HashMap<String, String>();

        favouriteGreggs.put("Jen", "Mexican Chicken");
        favouriteGreggs.put("Tom", "Bacon Baguette");
        favouriteGreggs.put("Sean", "Spikey Mikey");

        System.out.println(favouriteGreggs.get("Sean"));
    }
}
