class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
         
        for(int i=0;i<s.length();i++){

            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        
        int max=0;
        for(int frq:map.values()){
            if(frq>max){
                max=frq;
            }
        }
        StringBuilder result = new StringBuilder();
            while(max>0){
                for (char ch:map.keySet()){
           
            if(map.get(ch)==max){

                for(int i = 0; i < map.get(ch); i++){
                    result.append(ch);

            }
        }

            }max--;
           
        
        
       
        
    }
    return result.toString();
}
}