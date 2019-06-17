import java.util.HashMap;

public class GitHubAccount {

    private String username;
    private String name;
    private HashMap<String, Repository> repositoriesHash;
    private AccountType accountType;

    public GitHubAccount(String username, String name, AccountType accountType) {

        this.username = username;
        this.name = name;
        this.repositoriesHash = new HashMap<String, Repository>();
        this.accountType = accountType;

    }


    public AccountType getAccount() {
        return this.accountType;
    }

    public String getName() {
        return this.name;
    }

    public String getUserName() {
        return this.username;
    }

    public String changeAccountType(String type) {

        String banana1 = "Your account is already " + type;
        String banana2 = null;

        if (this.accountType.toString() == type) {
            return banana1;
        } else {
            if (type == "FREE") {
                this.accountType = AccountType.PRO;
                banana2 = this.accountType.toString();


            } else {
                if (type == "PRO") {
                    this.accountType = AccountType.FREE;
                    banana2 = this.accountType.toString();


                }

            }

        }
        return banana2;
    }

    public int repoHashCount() {
        return this.repositoriesHash.size();
    }

    public void addTorepositoriesHash(String repoName, Repository Repo) {
        repositoriesHash.put(repoName, Repo);

    }
}







