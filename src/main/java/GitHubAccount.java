import java.util.HashMap;

public class GitHubAccount {

    private String username;
    private String name;
    private HashMap<String, Repository> repositories;
    private AccountType accountType;

    public GitHubAccount(String username, String name, AccountType accountType){

        this.username = username;
        this.name = name;
        this.repositories = new HashMap<String, Repository>();
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
}

