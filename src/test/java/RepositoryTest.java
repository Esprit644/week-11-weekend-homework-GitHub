import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepositoryTest {

    Repository repository;
    Repository repository2;
    Repository repository3;

    Commit commit1;
    Commit commit2;
    Commit commit3;

    @Before
    public void before() {
        repository = new Repository("Repo A", "Week 1 homework", RepositoryType.PUBLIC);
        repository2 = new Repository("Repo A", "Week 2 homework", RepositoryType.PUBLIC);
        repository3 = new Repository("Repo A", "Week 3 homework", RepositoryType.PUBLIC);

        commit1  = new Commit(33, "Initial commit", CommitType.BUGFIX );
        commit2  = new Commit(34, "Second commit", CommitType.FEATURE );
        commit3  = new Commit(35, "Third commit", CommitType.OTHER );
    }

    @Test
    public void canGetRepoType() {
        assertEquals(RepositoryType.PUBLIC, repository.getRepoType());
    }

    @Test
    public void canGetRepoName() {
        assertEquals("Repo A", repository.getRepoName());
    }

    @Test
    public void canGetCommit() {
        assertEquals(0, repository.getAmountOfCommits());
    }

    @Test
    public void canGetDescription() {
        assertEquals("Week 1 homework", repository.getDescription());
    }

   @Test
    public void canAddCommitToArrayList(){
        repository.addCommitToRepositoryArray(commit1);
        repository.addCommitToRepositoryArray(commit2);
        repository.addCommitToRepositoryArray(commit3);
        assertEquals(3, repository.getAmountOfCommits());
   }


}
