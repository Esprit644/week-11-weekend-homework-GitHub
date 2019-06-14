import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GitHubAccountTest {

    GitHubAccount gitHubAccount;
    AccountType accountType;

    @Before
    public void before(){
        gitHubAccount = new GitHubAccount("Jimbo111", "Jim James", AccountType.FREE );

    }

    @Test
    public void canGetAccountType(){
        assertEquals( AccountType.FREE, gitHubAccount.getAccount());
    }

    @Test
    public void canGetName(){
        assertEquals("Jim James", gitHubAccount.getName());
    }

    @Test
    public void canGetUsersName(){
        assertEquals("Jimbo111", gitHubAccount.getUserName());
    }


}
