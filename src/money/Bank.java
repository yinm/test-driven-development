package money;

class Bank {
	Money reduce(Expression source, String to) {
		Sum sum = (Sum) source;
		return sum.reduce(to);
	}
}