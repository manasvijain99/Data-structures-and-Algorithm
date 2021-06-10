//Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
//
//Example 1:
//
//Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2]
package HashMap;
import java.util.*;

public class IntersectionOf2Arrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(Integer val:nums2){
            if(hm.containsKey(val)){
                int of=hm.get(val);
                int nf=of+1;
                hm.put(val,nf);
            }else{
                hm.put(val,1);
            }
        }
        ArrayList<Integer> arr=new ArrayList<>();
        for(Integer key:nums1){
            if(hm.containsKey(key)){
                arr.add(key);
                hm.remove(key);
            }
        }
        int[] result=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            result[i]=arr.get(i);
        }
        return result;

    }

    public static void main(String[] args) {
        int[] nums1={4,9,5};
        int[] nums2={9,4,9,8,4};

        int[] ans=intersection(nums1,nums2);
        for(int i=0;i< ans.length;i++){
            System.out.print(ans[i]+" ");

        }
    }
}
