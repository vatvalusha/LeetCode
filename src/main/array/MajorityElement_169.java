package array;

class MajorityElement_169 {

    public int majorityElement(int[] nums) {
        Sorting.bubbleSort(nums);
        int element = nums[0];
        int stableCounter = nums[0];
        int p1 = 0;
        int counter = 0;
        for (int p2 = 0; p2 < nums.length; p2++) {
            if (nums[p1] == nums[p2]) {
                counter++;
                if(counter > stableCounter){
                    stableCounter = counter;
                    element = nums[p1];
                }
            }

            if (nums[p1] != nums[p2]) {
                if(counter > stableCounter){
                    stableCounter = counter;
                    element = nums[p1];
                }
                int temp = p1;
                p1 = p2;
                p2 = temp;
                counter = 1;
            }
        }
        System.out.println("new raw for test");
        return element;
    }
}
