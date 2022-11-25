public class NumberSearch {
    public static int NumSearch(int nums[], int searchedNum){
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
        int nums[] = {1,3,5,6};
        int searchedNum = 20;
        var output = NumSearch(nums, searchedNum);
        System.out.println(output);
    }
}
