package cse360assign2;

public class simpleList {

    private int[] list;
    private int count;
    private int newSize = 10;

    public simpleList() {
        list = new int[newSize];
        count = 0;
    }

    //Add the given int to the array
    public void add(int number) {

        if (count==0) {

            list[0] = number;
            count++;

            return;

        }
        
        //if count is not 0
        if (count!=0) {
        	
        	if (count==newSize) {
        		newSize += (newSize*0.5);
        		
        		int temp[] = list;
        		list = new int[newSize];
        		//Copy the values from the old array into the new larger array
        		for(int arrayIndex = 0; arrayIndex < count; arrayIndex++) {
        			list[arrayIndex] = temp[arrayIndex];
        		}
        	}

            for (int arrayIndex = count- 1; arrayIndex > -1; arrayIndex--) {

                list[arrayIndex+1] = list[arrayIndex];

            }

            list[0] = number;

        }

        count++;

    }

    public void remove(int number) {
    	int removeIndex = search(number);
    	int max = count;
    	if (removeIndex!=-1) {
    		for(int arrayIndex = removeIndex; arrayIndex < max; arrayIndex++) {
    			if(arrayIndex != max - 1) {
    				list[arrayIndex] = list[arrayIndex + 1];
    			}
    		}
    		count--;
    	}
    	if((count/newSize)<=.75) {
    		newSize*=.75;
    		
    		int temp[] = list;
    		list = new int[newSize];
    		for(int arrayIndex = 0; arrayIndex < count; arrayIndex++) {
    			list[arrayIndex] = temp[arrayIndex];
    		}
    		
    	}
    	
    }

    public int count() {
    	// Returns the count of elements
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
    
    public void append(int number) {
        	
    		// using the same logic from the add method
        	if (count==newSize) {
        		newSize += (newSize*0.5);
        		//add .5 size to the new array
        		int temp[] = list;
        		list = new int[newSize];
        		//Copy the values from the old array into the new larger array
        		for(int arrayIndex = 0; arrayIndex < count; arrayIndex++) {
        			list[arrayIndex] = temp[arrayIndex];
        		}
        	}

            for (int arrayIndex = count- 1; arrayIndex > -1; arrayIndex--) {

                list[arrayIndex+1] = list[arrayIndex];

            }

            list[count] = number;
            
            count++;

    }
    
    public int first() {
    	//return the first value
    	return list[0];
    }
    
    public int last() {
    	//return the last value if its not also the first
    	if(count>0) {
    		return list[count - 1];
    	} else {
    		return -1;
    	}
    }
    
    public int size() {
    	//return size of array
    	return newSize;
    }

}
