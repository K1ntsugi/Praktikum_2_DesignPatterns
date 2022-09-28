package Facade;

public class FacadeLuggageManagement {
    public enum FacadeEnum {
        Undefiniert,
        Erhalten,
        Erfasst,
        Verpackt,
        Versandt,
        InZustellzentrum,
        Zugestellt
    }

    public static FacadeEnum trace(String sendungsNr){
        int length = sendungsNr.length();
        switch (length){
            case 6: //BetterLuggageCompany
                LuggageState state = BetterLuggageCompany.trace(Integer.parseInt(sendungsNr));
                return betterLuggageCompanyStatus2FassadenStatus(state);
            case 9:
                try {
                    DeliveryState dState = new GenericLuggageCompany().checkDeliverystate(sendungsNr);
                    return genericLuggaCompanyStatus2FassadenStatus(dState);
                } catch (RuntimeException e){
                    return FacadeEnum.Undefiniert;
                }
            default:
                return FacadeEnum.Undefiniert;
        }
    }

    private static FacadeEnum genericLuggaCompanyStatus2FassadenStatus(DeliveryState dState) {
        return FacadeEnum.Erhalten;
    }

    private static FacadeEnum betterLuggageCompanyStatus2FassadenStatus(LuggageState state) {
        return FacadeEnum.Verpackt;
    }
}
