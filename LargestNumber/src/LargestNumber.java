public class LargestNumber {
    public int findLargestNumber(int[] numberArray) {
        int largest = 0;
        for(int i: numberArray) {
            if(i > largest) largest = i;
        }
        return largest;
    }

    public int findSecondLargestNumber(int[] numberArray) {
        int largest = 0;
        int secondLargest = 0;
        for(int i: numberArray) {
            if(i > largest) {
                secondLargest = largest;
                largest = i;
            } else if(i > secondLargest) {
                secondLargest = i;
            }
        }
        return secondLargest;
    }
}
