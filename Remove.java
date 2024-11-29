import java.util.*;
class Remove {
    public int removeElement(int[] nums, int val) {
        int idx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[idx++]=nums[i];
            }
        }
        System.out.println(idx);
        return idx;
    }
    public static void main(String args[]){
        Remove a =new Remove();
        int[] nums={2,1,3,1,2};
        int val=2;
        a.removeElement(nums, val);
    }
}