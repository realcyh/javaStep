package coins;

import java.util.HashMap;

public class Coin {
    private HashMap<Integer, String> coinNames = new HashMap<Integer, String>();

   public Coin() {
        coinNames.put(1, "penny");
        coinNames.put(10, "dime");
        coinNames.put(25, "quarter");
        coinNames.put(50, "half-dollar");
        coinNames.put(50, "wumao");
        System.out.println(coinNames);
        for (Integer k: coinNames.keySet()) {
            String s = coinNames.get(k);
            System.out.println(s);
        }
   }

    public String getName(int amount) {
       if ( coinNames.containsKey(amount) ) {
           return coinNames.get(amount);
       }
       else return "NOT FOUND";
    }

    public static void main(String[] args) {
        int amount = 15;
        Coin coin = new Coin();
        String name = coin.getName(amount);
        System.out.println(name);

    }
}
