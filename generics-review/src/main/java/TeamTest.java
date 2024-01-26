public class TeamTest {

    public static void main(String[] args) {

        FootballPlayer mike = new FootballPlayer("Mike");

        BaseballPlayer john = new BaseballPlayer("John");

        SoccerPlayer messi = new SoccerPlayer("Messi");

//      Team soccerTeam = new Team("ChicagoFire");                        // no Type so everyone can join

//        Team<String> brokenLogic = new Team<>("Not gonna work");        // Only players extended from Player class can join
//        brokenLogic.addPlayer(john);

        Team<SoccerPlayer> soccerTeam = new Team<>("ChicagoFire");  // generic Type selected - not everybody can join
        soccerTeam.addPlayer(messi);
//        soccerTeam.addPlayer(john);
//        soccerTeam.addPlayer(mike);

        System.out.println(soccerTeam.numPlayers());

    }
}
