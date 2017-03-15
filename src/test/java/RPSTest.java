import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class RPSTest {

  @Test
  public void playerOneInputs_shouldBeAString_true() {

    RPS testRPS= new RPS();

    //String playerOneInput = testRPS.playerOneInput;
    String expectedResult = "Chose Rock";
    assertEquals(expectedResult, testRPS.runRPS("rock"));


    //
    // Integer user1input="rock";
    // Integer user2input="paper";
    // if (user1input === "rock" && user2Input === "paper"){
    //   String expected = "User 2 wins !";
    // }
    // assertEquals(expected, testRPS.runRPS("rock","paper"));
  }
}
