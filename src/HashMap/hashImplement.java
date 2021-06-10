package HashMap;

import java.util.ArrayList;
import java.util.LinkedList;

public class hashImplement {

    public static void main(String[] args) {
        
    }


    public static class HashMap<K,V>{
        private class HMNode{  //k,v are generics there data types will be decided later
            K key;             // key and value are of data type k and v
            V value;
            HMNode(K key, V value){
                this.key=key;
                this.value=value;
            }
        }
        private int size; //n
        private LinkedList<HMNode>[] buckets;// N=bucket.length()
        // LinkedList array is created with name buckets. the data stored in it are key and value so hmnode class is given as input
        // There is no one ll made here instead we have array of ll.
        public HashMap(){
            initbucket(4);
            size=0;
        }
        private void initbucket(int N){
            buckets=new LinkedList[4];// This is only creating 4 linkedlist whose size is 0
            for(int i=0;i<buckets.length;i++){
                buckets[i]= new LinkedList<>();// this is assigning null ll to each array index
            }
        }
        public void put(K key,V value){
            int bi=hashfn(key); // key is passed in hashfn which will return the index
            int di=getIndexWithinBucket(key,bi); //this method will search that index within the bucket
            if(di!=-1){
                HMNode node=buckets[bi].get(di); //now we go to that particular index by using the get method and store that value in node var which is of hmnode type and so it has value and key in it and now the value is going to get changed in next line
                node.value=value;//here value is updated
            }else {
                HMNode node=new HMNode(key,value);
                buckets[bi].add(node);
                size++;
            }
            double lambda=size*1.0/buckets.length;
            if(lambda>2.0){rehash();}
        }
        private void rehash(){
            LinkedList<HMNode>[] oba=buckets;
            initbucket(oba.length*2);
            size=0;
            for(int i=0;i< oba.length;i++){
                for(HMNode node:oba[i]){
                    put(node.key,node.value);
                }
            }
        }
        private int hashfn(K key){
            int hc=key.hashCode(); // this hashcode is an in built function which returns any type of value +ve,-ve,decimal
            return Math.abs(hc) % buckets.length;// we take abs of hc because it cannot be -ve and divide it by buckets.length so that it returns the index in the range of arrays length
        }
        private int getIndexWithinBucket(K key, int bi){
            int di=0;
            for(HMNode node:buckets[bi]){ //Traversing through each node of ll of bucket at index bi
                if(node.key.equals(key)){// check if the key at that position is equla to the new key which is to be put
                    return di;// if yes return that index which is stored in var di here
                }
                di++; //else keep inc it
            }
            return -1; //if not found then return -1
        }
        public boolean containsKey(K key){
            int bi=hashfn(key);
            int di=getIndexWithinBucket(key,bi);
            if(di!=-1){return true;}
            else {return false;}
        }
        public V get(K key){
            int bi=hashfn(key);
            int di=getIndexWithinBucket(key,bi);

            if(di!=-1){
                HMNode node=buckets[bi].get(di);
                return node.value;//here value is updated
            }else {return null;}


        }
        public V remove(K key){
            int bi=hashfn(key);
            int di=getIndexWithinBucket(key,bi);

            if(di!=-1) {
                HMNode node = buckets[bi].remove(di);
                size--;
                return node.value;
            }else{
                return null;
            }
        }
        public int size(){
            return size;
        }
        public ArrayList<K> keyset() {
            ArrayList<K> keys = new ArrayList<>();

            for (int i = 0; i < buckets.length; i++) {
                for (HMNode node : buckets[i]){
                    keys.add(node.key);
                }
            }
            return keys;
        }












    }
}
