package webSite;

import projekt.Developer;
import projekt.Manual;
import projekt.ProjektManager;
import projekt.ProjektTeamFactory;

public class WebSiteTeamFactory implements ProjektTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Manual getTester() {
        return new ManualTesterWebSite();
    }

    @Override
    public ProjektManager getProjektManager() {
        return new PMWebSite();
    }
}
