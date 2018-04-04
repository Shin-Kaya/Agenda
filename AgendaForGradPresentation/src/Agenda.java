
/*
 * @author Shin Kaya (2018.April.04)
 * just an exercise :)
 */
import java.awt.event.ActionEvent;

class Agenda extends ComIT implements GoogleListener {
	short introduction;
	short storyOfmyProject;
	short aboutChallenges;
	short nextSteps;

	static short totalPresentationTime;

	// default constructor (#1)
	Agenda() {
		this((short) 10); // Presentation time in minutes per person
	}

	// constructor (#2)
	Agenda(short totalPresentationTime) {
		Agenda.totalPresentationTime = totalPresentationTime;
		introduction = reservePercent(20);
		storyOfmyProject = reservePercent(30);
		aboutChallenges = reservePercent(20);
		nextSteps = reservePercent(30);
	}

	public static short reservePercent(int percent) {
		return ((short) ((short) totalPresentationTime * percent / 100)); // minutes in time
	}

	public void printAttributes() {
		System.out.println(this.getClass() + ":\t\t min." + "\n ---------------------------- " + "\n introduction \t\t "
				+ introduction + "\n storyOfmyProject \t " + storyOfmyProject + "\n aboutChallenges \t "
				+ aboutChallenges + "\n nextSteps \t\t " + nextSteps + "\n ---------------------------- "
				+ "\n TOTAL\t\t\t " + totalPresentationTime);
	}

	public static void main(String[] args) {
		Agenda towardEmployment = new Agenda();
		towardEmployment.printAttributes();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

}
