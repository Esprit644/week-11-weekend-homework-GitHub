import java.util.HashMap;

public class Commit {

    private String commitDescription;
    private CommitType commitType;
    private int uniqueId;

    public Commit(int uniqueId, String commitDescription, CommitType commitType){
        this.commitDescription = commitDescription;
        this.commitType = commitType;
        this.uniqueId = uniqueId;
    }




    public String getCommitDescription() {
        return this.commitDescription;
    }

    public CommitType getCommitType() {
        return this.commitType;
    }

    public int getCommitId() {
        return this.uniqueId;
    }
}


