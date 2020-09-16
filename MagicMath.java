public class MagicMath {
	public static void main(String[] args) {
    int myNumber = 9;
		// Referred to as the 'original' number from this point onwards
   
    int stepOne = myNumber * myNumber;
    int stepTwo = stepOne + myNumber;
    int stepThree = stepTwo / myNumber;
    int stepFour = stepThree + 17;
    int stepFive = stepFour - myNumber;
    int stepSix = stepFive / 6;

    System.out.println(stepSix);
	}
}
