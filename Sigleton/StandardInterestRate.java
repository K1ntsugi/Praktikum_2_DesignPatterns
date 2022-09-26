package Sigleton;

class StandardInterestRate {

	private float interestRate;

	private static StandardInterestRate instance = null;

	private StandardInterestRate() {
		this.interestRate = 3.0F;
	}

	private StandardInterestRate(float interestRate) {
		this.interestRate = interestRate;
	};

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
