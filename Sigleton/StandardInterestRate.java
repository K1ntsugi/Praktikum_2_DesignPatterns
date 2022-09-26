package Sigleton;

class StandardInterestRate {

	private float interestRate;

	private static StandardInterestRate instance = null;

	private StandardInterestRate() {
		this.interestRate = 3.0F;
	}

	/*
	 * Wenn Konstruktor überladen wird, muss entsprechend in der getInstance-Methode
	 * durch Parameter abgefangen werden
	 * 
	 * private StandardInterestRate(float interestRate) {
	 * this.interestRate = interestRate;
	 * };
	 */

	// falls Parralellisiert -> gleih instanziieren oder Methode synchronisieren,
	// ersteres ist effizienter
	public static StandardInterestRate getInstance() {
		if (instance == null)
			instance = new StandardInterestRate();
		return instance;
	}

	public float getInterestRate() {
		return this.interestRate;
	}

	public void setInterestRate(float x) {
		interestRate = x;
	}

}
