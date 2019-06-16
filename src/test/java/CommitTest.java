import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommitTest {

    Commit commit1;
    Commit commit2;

    @Before
    public void before(){

        commit1  = new Commit(33, "Initial commit", CommitType.BUGFIX );
        commit2  = new Commit(34, "Second commit", CommitType.FEATURE );
    }

    @Test
    public void canGetCommitDescription(){
        assertEquals("Initial commit", commit1.getCommitDescription());
    }

    @Test
    public void canGetCommitType(){
        assertEquals(CommitType.BUGFIX, commit1.getCommitType());
    }

    @Test
    public void canGetUniqueId(){
        assertEquals(33, commit1.getCommitId());
    }

}
