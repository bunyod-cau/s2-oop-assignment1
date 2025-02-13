import java.util.Arrays;
import java.util.Random;

public class FootballClub {
    private String name;
    private String manager;
    private Team players;

    public FootballClub(String name, String manager, Team players) {
        this.name = name;
        this.manager = manager;
        this.players = players;
    }

    public String[] makeSquad() {
        Random random = new Random();
        int[][] formations = {{4, 4, 2}, {4, 3, 3}, {3, 5, 2}, {5, 3, 2}, {3, 4, 3}};
        int[] formation = formations[random.nextInt(formations.length)];
        int i = 0;

        String[] squad = new String[11];
        squad[i] = this.players.getGoalkeeper();
        i++;

        while (i <= formation[0]) {
            String defender = this.players.getDefender();
            if (!Arrays.asList(squad).contains(defender)) {
                squad[i] = defender;
                i++;
            }
        }

        while (i <= formation[0] + formation[1]) {
            String midfielder = this.players.getMidfielder();
            if (!Arrays.asList(squad).contains(midfielder)) {
                squad[i] = midfielder;
                i++;
            }
        }

        while (i < 11) {
            String forward = this.players.getForward();
            if (!Arrays.asList(squad).contains(forward)) {
                squad[i] = forward;
                i++;
            }
        }

        return squad;
    }

    public String getName() {
        return this.name;
    }

    public String getManager() {
        return this.manager;
    }
}
