package com.training.ds;

public class ArrayDuplicateRemoval {

    public static int removeDuplicate(int[] nums) {
        int totalElement = 0;
        int elementCount = 0;

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            int currentElement = nums[i];
            if (i != 0 && nums[i] != nums[i - 1]) {
                elementCount = 0;
            }

            if (elementCount < 2) {
                elementCount += 1;
                nums[index] = currentElement;
                totalElement += 1;
                index++;
            }
        }

        return totalElement;
    }

}
