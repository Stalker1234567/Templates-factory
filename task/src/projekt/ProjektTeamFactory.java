package projekt;

public interface ProjektTeamFactory {
    Developer getDeveloper();
    Manual getTester();
    ProjektManager getProjektManager();
}
