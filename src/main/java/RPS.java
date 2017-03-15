import java.util.ArrayList;
import java.util.List;
import java.io.Console;

public class RPS {
  // String playerOneInput = "rock";

//public void? is returning necessary?
  public List<Object> runRPS (String userInput){
    mUserInput =  userInput;
    List<Object> result=new ArrayList<Object>();
    // Console myConsole = System.console();
    //String playerOneInput = myConsole.readLine();
    // String playerOneInput = "rock";

    if (mUserInput.equals("rock")){
      System.out.println("Chose rock!");
      //String result = "Chose Rock";
      result.add("Chose Rock");
      //return result;
    }
    return result;
  }
}
