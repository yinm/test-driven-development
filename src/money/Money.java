package money;

abstract class Money {
	protected int amount;
	
	abstract Money times(int multiplier);
	
	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount
			&& getClass().equals(money.getClass());
	}
	
	static Money dollar(int amount) {
		return new Dollar(amount);
	}
}