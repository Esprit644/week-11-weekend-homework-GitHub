public class Repository {

    private String name;
    private String description;
    private RepositoryType repoType;
    private String commits;

    public Repository(String name, String description, RepositoryType repoType, String commits){
        this.name = name;
        this.description = description;
        this.repoType = repoType;
        this.commits = commits;

    }
}
