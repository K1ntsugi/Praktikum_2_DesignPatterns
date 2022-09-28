package Facade;

public class BetterLuggageCompany {

    private BetterLuggageCompany(){
        throw new AssertionError();
    }

    public static LuggageState trace(int lieferNr){
        if(lieferNr < 1000000){
            return LuggageState.Undefiniert;
        }
        return LuggageState.Zugestellt;
    }


}
