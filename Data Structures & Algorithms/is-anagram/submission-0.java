class Solution {
    public boolean isAnagram(String s, String t) {
       char[] s1=s.toCharArray();
       char[] t1=t.toCharArray();
        
        HashMap<Character,Integer> m1=new HashMap<>();
        HashMap<Character,Integer> m2=new HashMap<>();
       //Insert the frequency of s1 into HashMap
        
        for(char c:s1){
            m1.put(c,m1.getOrDefault(c,0)+1);
        }

        //Insert the frequency of t1 into HashMap

        for(char c1 :t1){
            m2.put(c1,m2.getOrDefault(c1,0)+1);
        }

        return m1.equals(m2);
       
    }
}
