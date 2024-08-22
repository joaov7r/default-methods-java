package services;

public class UsaInterestService implements InterestService{

	private double interestRate;

	public UsaInterestService(double interestRate) {
		super();
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}
}
