package geco;


import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class LoginServiceTest
{

    @Test
    public void bob () {
        LoginService bob = new LoginService(new String[] {"ok", "boomer"});
        bob.addLogin("Chichir");
        bob.findAllLoginsStartingWith("Chi");
        bob.findAllLoginsStartingWith("peo");
        bob.findAllLogins();
    }

    @Test
    public void nomdetruc() {
        App.main(new String[] {"salut"});
        App bob2 = new App();
    }

}
