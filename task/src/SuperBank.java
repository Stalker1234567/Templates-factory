import banking.JavaDeveloper;
import projekt.Developer;
import projekt.Manual;
import projekt.ProjektManager;
import projekt.ProjektTeamFactory;

public class SuperBank {
    public static void main(String[] args) {
        ProjektTeamFactory projektTeamFactory = new banking.ProjektTeamFactory();
        Developer developer = projektTeamFactory.getDeveloper();
        Manual manual = projektTeamFactory.getTester();
        ProjektManager projektManager = projektTeamFactory.getProjektManager();

        developer.writeCode();
        manual.ManualTesting();
        projektManager.commandGive();
    }
}
