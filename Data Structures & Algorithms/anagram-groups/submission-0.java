class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Check Empty Inputs
        if(strs==null||strs.length==0){
        return new ArrayList<>();
         }
     
        Map<String,List<String>> map=new HashMap<>();

        for(String str:strs){
            String frequencyString=getFrequencyString(str);

            if(map.containsKey(frequencyString)){
                map.get(frequencyString).add(str);
            }else{
            List<String> list=new ArrayList<>();
            list.add(str);
            map.put(frequencyString,list);
            }
        }

      return new ArrayList<>(map.values());

    }

    public static String getFrequencyString(String str){
        int[] freq=new int[26];

        for(char c:str.toCharArray()){
            freq[c-'a']++;
        }
        
        //Attach the frequencies along with characters

        StringBuilder sb=new StringBuilder();
        
        char c='a';
        
        for(int i:freq){
            sb.append(c);
            sb.append(i);
            c++;
        }

        return sb.toString();
    }
}
