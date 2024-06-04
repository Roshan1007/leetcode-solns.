import java.util.ArrayList;
import java.util.List;

public class Find_All_Numbers_Disappeared_in_an_Array {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct =nums[i]-1;
            if(nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else{
                i++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                ans.add(i+1);
            }
        }
        return ans;
    }
}
