import java.util.ArrayList;
import java.util.List;
import java.io.Console;

public class RPS {

  //public void? is returning necessary?
  // public List<Object> runRPS (String userInput){

  public runRPS(String userInput, String user2Input){
    mUserInput =  userInput;
    mUser2Input= user2Input;

    if (mUserInput.equals("rock") && mUser2Input.equals("rock")){
      String result="Tie";
    }
    else if (mUserInput.equals("rock") && mUser2Input.equals("paper")){
      String result="user 2 wins";
    }
  } else if  (mUserInput.equals("rock") && mUser2Input.equals("scissors")){
      String result="user 1 wins";
  }
  else if (mUserInput.equals("paper") && mUser2Input.equals("rock")){
      String result="user 1 wins";
  }
  else if 

    // List<Object> result=new ArrayList<Object>();
    // Console myConsole = System.console();
    // String playerOneInput = myConsole.readLine();
    // String playerOneInput = "rock";

    if (mUserInput.equals("rock")){
      System.out.println("Chose rock!");
      //String result = "Chose Rock";
      result.add("Chose Rock");
      //return result;
    }


  }

  // Let's define each element as values



    return result;
  }
}
