package by.academy.lesson9.interfaces;

public interface Hockey extends Sport {
	
	void homeGoalScored();

	void visitingGoalScored();

	void endOfPeriod(int period);

	void overtimePeriod(int ot);
}
