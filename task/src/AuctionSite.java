import projekt.Developer;
import projekt.Manual;
import projekt.ProjektManager;
import projekt.ProjektTeamFactory;
import webSite.WebSiteTeamFactory;

public class AuctionSite {
    public static void main(String[] args) {
        ProjektTeamFactory projektTeamFactory = new WebSiteTeamFactory();
        Developer developer = projektTeamFactory.getDeveloper();
        Manual manual = projektTeamFactory.getTester();
        ProjektManager projektManager = projektTeamFactory.getProjektManager();

        developer.writeCode();
        manual.ManualTesting();
        projektManager.commandGive();
    }
}
