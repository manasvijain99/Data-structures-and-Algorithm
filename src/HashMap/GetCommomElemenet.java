package HashMap;

import java.util.*;

public class GetCommomElemenet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l1=sc.nextInt();
        int[] arr1=new int[l1];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        int l2=sc.nextInt();
        int[] arr2=new int[l1];
        for(int i=0;i<arr1.length;i++){
            arr2[i]=sc.nextInt();
        }

        HashMap<Integer,Integer> hm=new HashMap<>();
        for(Integer ch:arr1){
            if(hm.containsKey(ch)){
                int of=hm.get(ch);
                int nf=of+1;
                hm.put(ch,nf);
            }else {
                hm.put(ch,1);
            }
        }

        for(int key: arr2){
            if(hm.containsKey(key)&& hm.get(key)>1){
                System.out.print(key);
                int of=hm.get(key);
                int nf=of-1;
                hm.put(key,nf);

            }
        }



    }
}
