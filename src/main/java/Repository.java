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



    public String locateCommitDescriptionById( int ID) {
        String result = null;
        int i = 0;

        for( i = 0; i < this.commits.size(); i++) {
            if (this.commits.get(i).getCommitId() == ID) {
                result = this.commits.get(i).getCommitDescription();
            }
        }

        return result;
    }

    public int getCommitsByType(String type) {
        int result = 0;
        int i = 0;

        for (i=0;i<this.commits.size();i++){
            if(this.commits.get(i).getCommitType().toString().equals(type)){
                result += 1;
            }
        }
        return result;
    }
}
