package Observer;

import java.util.ArrayList;

public abstract class Subject {

	private ArrayList<NewsObserver> newsObserver;

	public Subject() {
		newsObserver = new ArrayList<>();
	}

	public void meldeAn(NewsObserver observ){
		if(!newsObserver.contains(observ)){
			newsObserver.add(observ);
		}
	};

	public void meldeAb(NewsObserver observ){
		if(!newsObserver.contains(observ)){
			newsObserver.remove(observ);
		}
	};

	public void benachrichtige(){
		for (NewsObserver o : newsObserver){
			o.aktualisiere();
		}
	};


}
