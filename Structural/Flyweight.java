import java.util.HashMap;

import javax.print.DocFlavor.STRING;

interface Player {
    public String getName(String name);

    public String getRole();
}

class Bowler implements Player {
    final String ROLE = "BOWLING";

    @Override
    public String getName(String name) {
        return name;
    }

    @Override
    public String getRole() {
        return ROLE;
    }

}

class Batsman implements Player {
    final String ROLE = "BATTING";

    @Override
    public String getName(String name) {
        return name;
    }

    @Override
    public String getRole() {
        return ROLE;
    }

}

class PlayerFactory {
    HashMap<String, Player> hash = new HashMap<>();

    Player getPlayer(String type) {
        Player player = null;
        if (hash.containsKey(type))
            return hash.get(type);
        else if (type == "Batsman") {
            player = new Batsman();
        } else if (type == "Bowler")
            player = new Bowler();
        hash.put(type, player);
        return player;
    }

}

/**
 * Flyweight
 */
public class Flyweight {
    public static void main(String[] args) {
        PlayerFactory playerFactory = new PlayerFactory();
        Player player = playerFactory.getPlayer("Batsman");
        String name = player.getName("kiran vellanki");
        System.out.println(name);
        System.out.println(player.getRole());
        player = playerFactory.getPlayer("Batsman");
        name = player.getName("kiran ");
        System.out.println(name);
        System.out.println(player.getRole());

    }

}