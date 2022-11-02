package banking;

import projekt.Developer;
import projekt.Manual;
import projekt.ProjektManager;

public class ProjektTeamFactory implements projekt.ProjektTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Manual getTester() {
        return new Tester();
    }

    @Override
    public ProjektManager getProjektManager() {
        return new banking.ProjektManager();
    }
}
