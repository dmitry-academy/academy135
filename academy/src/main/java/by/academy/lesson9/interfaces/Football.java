package by.academy.lesson9.interfaces;

public interface Football extends Sport, TVProgram {

	void homeTeamScored(int points);

	void visitingTeamScored(int points);

	void endOfQuarter(int quarter);
}
