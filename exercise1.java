public class exercise1 {
    
    static Boolean iwillNotCheat = true;
    static Boolean iwillWin = true;

public static void main (String[] args) throws Exception{

//Precondition
assert iwillNotCheat == true: "SLAY MADAM";

enterCompetition();

//Postcondition
assert iwillWin == true: "LUH so sad";

}

static void enterCompetition() {

    iwillWin = false;

    }
}
