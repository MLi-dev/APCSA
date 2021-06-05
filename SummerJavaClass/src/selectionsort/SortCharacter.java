package selectionsort;

public class SortCharacter {
	public static void main(String[] args) {
		String hi = "Hello world";
		int leftSorted = 0;
		int maxIndex = 0;
		if (hi.length() < 1) {
			return;
		}
		char[] array = hi.toCharArray(); //Converts string hi to array of characters

		while (leftSorted < array.length - 1) { //"police" will stop at last person. 
			char max = array[leftSorted]; //police temporarily notes front suspect as max.
			maxIndex = leftSorted; //police temporarily records suspect position in front of him.
			for (int i = leftSorted; i < array.length; i++) { //police checks suspects to right. 
				if (max < array[i]) { //If suspect has number greater than max, police notes position and replaces max with suspect's number. 
					max = array[i];
					maxIndex = i; 
				}
			}
			char temp = array[maxIndex];
			array[maxIndex] = array[leftSorted]; //max and suspect in front of police switch.
			array[leftSorted] = temp; 
			leftSorted++; // Moves the "policeman" up by one
			// The index in front of policeman is assumed to be new maxIndex

		}
		for (char x : array) {
			System.out.print(x);
		}
	}

}
