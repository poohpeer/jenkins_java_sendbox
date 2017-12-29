import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

public class basicTest {

    Logger logger = LoggerFactory.getLogger(User.class);

    @Before
    public void before(){
        logger.info("Starting test");
    }

    @After
    public void after(){
        logger.info("Done.");
    }

    @Test
    public void positiveTest(){
        String expName = "Puper";
        String expSurname = "Poohpeer";
        User userA = new User(expName, expSurname);
        User userB = new User(expName, expSurname);
        assertEquals("It's pizdetz! Users arn't equal", userA, userB);
    }

    @Test
    public void negativeTest(){
        User userA = new User("Puper", "Shmuper");
        User userB = new User("Shchult", "Huyultz");
        assertEquals("Bad!!! Users arn't equal!", userA, userB);
    }
}
