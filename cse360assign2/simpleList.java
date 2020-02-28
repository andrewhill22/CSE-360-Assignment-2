package assign1;

public class simpleList {

    private int[] list;
    private int count;

    public simpleList() {
        list = new int[10];
        count = 0;
    }

    //Add the given int to the array
    public void add(int number) {

        if (count==0) {

            list[0] = number;
            count++;

            return;

        }

        if (count!=0) {

            for (int arrayIndex = count- 1; arrayIndex > -1; arrayIndex--) {

                list[arrayIndex+1] = list[arrayIndex];

            }

            list[0] = number;

        }

        count++;

    }

    public void remove(int number) {

    }

    public int count() {
        return count;
    }

    // toString() returns the array as a string with spaces in between each value

    public String toString() {

        String returnString = " ";

        for (int arrayIndex = 0; arrayIndex < count; arrayIndex++) {

            returnString += list[arrayIndex] + " ";

        }

        return returnString;

    }

    // Search returns a desired value from the array using an int input
    // Returns the index of the given array element

    public int search(int search) {

        int returnIndex = -99;

        for (int arrayIndex = 0; arrayIndex < count; arrayIndex++) {

            if (list[arrayIndex] == search) {

                returnIndex = list[arrayIndex];

            }

        }

        return returnIndex;

    }

}
