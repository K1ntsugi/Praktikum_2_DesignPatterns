package Observer;

public class Abbonent implements NewsObserver {
	private Newsletter newsletter;

	public Abbonent(){
		newsletter = new Newsletter();
	}

	public String aktualisiere(){
		return newsletter.toString();
	};
	


}
