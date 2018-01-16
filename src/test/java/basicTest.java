import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

public class basicTest {

    Logger logger = LoggerFactory.getLogger(User.class);

    private long start;

    @Before
    public void before() throws InterruptedException {
        logger.info("Starting test");
        start = System.currentTimeMillis();
        Thread.sleep(10);
    }

    @After
    public void after() throws InterruptedException {
        logger.info("Done.");
        Thread.sleep(10);
        logger.info("Took: " + (System.currentTimeMillis() - start) + " ms.");
    }

    @Test
    public void positiveTest(){
        String expName = "Puper";
        String expSurname = "Poohpeer";
        User userA = new User(expName, expSurname);
        User userB = new User(expName, expSurname);
        System.out.println("");
        assertEquals("It's pizdetz! Users arn't equal", userA, userB);
    }

//    @Test
//    public void negativeTest(){
//        User userA = new User("Puper", "Shmuper");
//        User userB = new User("Shchult", "Huyultz");
//        assertEquals("Bad!!! Users arn't equal!", userA, userB);
//    }
}
