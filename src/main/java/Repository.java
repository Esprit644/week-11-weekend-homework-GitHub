import java.util.ArrayList;

public class Repository {

    private String name;
    private String description;
    private RepositoryType repoType;
    public ArrayList<Commit> commits;

    public Repository(String name, String description, RepositoryType repoType){
        this.name = name;
        this.description = description;
        this.repoType = repoType;
        this.commits = new ArrayList<Commit>();

    }

    public RepositoryType getRepoType() {

        return this.repoType;
    }

    public String getRepoName() {
        return this.name;
    }

    public int getAmountOfCommits() {
        return this.commits.size();
    }

    public String getDescription() {
        return this.description;
    }


    public void addCommitToRepositoryArray(Commit commit) {
        this.commits.add(commit);

    }
}
