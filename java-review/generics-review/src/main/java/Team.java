import java.util.ArrayList;

public class Team<T extends Player> {  // Excepting only child classes from Player

    // not using Lombok to do quick refresh on pure Java

    private String name;
    private ArrayList<T> members = new ArrayList();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(T player) {
        if (members.contains(player)) {
            //   System.out.print(((Player) player).getName() + " is already in this team!");
            System.out.print(player.getName() + " is already in this team!");
        } else {
            members.add(player);
            // System.out.println(((Player) player).getName() + " picked for team " + this.name + " to play");
            System.out.println(player.getName() + " picked for team " + this.name + " to play");
        }
    }

    public int numPlayers() {
        return this.members.size();

    }
}
