import java.util.Random;

public class Team {
    private String[] goalkeepers;
    private String[] defenders;
    private String[] midfielders;
    private String[] forwards;
    private Random random = new Random();

    public Team(String[] goalkeepers, String[] defenders, String[] midfielders, String[] forwards) {
        this.goalkeepers = goalkeepers;
        this.defenders = defenders;
        this.midfielders = midfielders;
        this.forwards = forwards;
    }

    public String getGoalkeeper() {
        return goalkeepers[this.random.nextInt(this.goalkeepers.length)];
    }

    public String getDefender() {
        return defenders[this.random.nextInt(this.defenders.length)];
    }

    public String getMidfielder() {
        return midfielders[this.random.nextInt(this.midfielders.length)];
    }

    public String getForward() {
        return forwards[this.random.nextInt(this.forwards.length)];
    }
}
