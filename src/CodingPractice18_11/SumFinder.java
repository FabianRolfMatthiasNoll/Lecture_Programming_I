public class SumFinder {
    public static void main(String[] args){
        int[] nums = {1,2,4};
        int sum = 5;
        var output = FindSumIndex(nums,sum);
        if(!(output[0] == 0 && output[1] == 0)){
            System.out.println("Index 1: " + output[0] + "| Index 2: " + output[1]);
            System.out.println("Calculation: " + nums[output[0]] + " + " + nums[output[1]] + " = " + sum);
        } else {
            System.out.println("No possible Solution found!");
        }
    }
    public static int[] FindSumIndex(int[] nums, int sum){
        int[] indexSum = {0,0};

        for(int i = 0; i < nums.length; i++){
            indexSum[0] = i;
            for(int x = 1; x < nums.length; x++){
                indexSum[1] = x;
                if(x == i) continue;
                if(nums[i] + nums[x] == sum) return indexSum;
            }
        }
        indexSum[0] = 0;
        indexSum[1] = 0;
        return indexSum;
    }
}
