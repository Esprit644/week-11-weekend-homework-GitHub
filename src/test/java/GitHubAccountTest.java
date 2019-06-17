import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class GitHubAccountTest {

    GitHubAccount gitHubAccount1;

    HashMap<String, Repository> repositoriesHash;



    Repository repository;
    Repository repository2;
    Repository repository3;

    Commit commit1;
    Commit commit2;
    Commit commit3;
    Commit commit4;

    AccountType accountType;

    @Before
    public void before() {
        gitHubAccount1 = new GitHubAccount("Jimbo111", "Jim James", AccountType.FREE);

        repository = new Repository("Repo A", "Week 1 homework", RepositoryType.PUBLIC);
        repository2 = new Repository("Repo B", "Week 2 homework", RepositoryType.PRIVATE);
        repository3 = new Repository("Repo C", "Week 3 homework", RepositoryType.PUBLIC);

        commit1  = new Commit(33, "Initial commit", CommitType.BUGFIX );
        commit2  = new Commit(34, "Second commit", CommitType.FEATURE );
        commit3  = new Commit(35, "Third commit", CommitType.OTHER );
        commit4  = new Commit(36, "Fourth commit", CommitType.FEATURE );

    }

    @Test
    public void canGetAccountType() {
        assertEquals(AccountType.FREE, gitHubAccount1.getAccount());
    }

    @Test
    public void canGetName() {
        assertEquals("Jim James", gitHubAccount1.getName());
    }

    @Test
    public void canGetUsersName() {
        assertEquals("Jimbo111", gitHubAccount1.getUserName());
    }

    @Test
    public void canChangeAccountType() {
        assertEquals("FREE", gitHubAccount1.changeAccountType("PRO"));
    }

    @Test
    public void __canChangeAccountType() {
        assertEquals("Your account is already FREE", gitHubAccount1.changeAccountType("FREE"));
    }

    @Test
    public void canRepoHashCount(){
        assertEquals(0, gitHubAccount1.repoHashCount());

    }

    @Test
    public void canAddToRepoHash(){
        gitHubAccount1.addTorepositoriesHash("Repo A", repository  );
        gitHubAccount1.addTorepositoriesHash("Repo B", repository2 );
        assertEquals(2, gitHubAccount1.repoHashCount());
    }


}
