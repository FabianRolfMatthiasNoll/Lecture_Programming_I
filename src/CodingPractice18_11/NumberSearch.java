public class NumberSearch {
    public static int numSearch(int[] nums, int searchedNum){
        int index = nums.length / 2; //starting in the middle of an array because its sorted
        for(int i = index; i < nums.length; i++){
            if(nums[i] > searchedNum || index == nums.length - 1) break;
            if(nums[i] == searchedNum) return index;
            index++;
        }
        for(int i = index; i >= 0; i--){
            if(nums[i] < searchedNum) break;
            if(nums[i] == searchedNum) return index;
            index--;
        }
        return index + 1;
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        for (int i = 0; i < 16; i++) {
            var output = numSearch(nums, i);
            System.out.println(output);
        }

    }
}
