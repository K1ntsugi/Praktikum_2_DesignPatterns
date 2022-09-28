package Facade;

public class GenericLuggageCompany {
    public DeliveryState checkDeliverystate(String sendumgsNr){
        if(sendumgsNr.length() != 9){
            throw new RuntimeException("Ungültige Sendungsnummer");
        }
        return DeliveryState.InZustellzentrum;
    }
}
