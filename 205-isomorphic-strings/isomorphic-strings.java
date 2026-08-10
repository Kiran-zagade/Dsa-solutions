class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();
        //counting freuency of each character at s
        for(int i=0;i<s.length();i++){
                Character chS=s.charAt(i);
                Character chT=t.charAt(i);

              if(mapST.containsKey(chS)){
                     if(mapST.get(chS)!=chT){
                        return false;
                     }
              }else{
                mapST.put(chS,chT);
              }

              if(mapTS.containsKey(chT)){
                     if(mapTS.get(chT)!=chS){
                        return false;
                     }
              }else{
                mapTS.put(chT,chS);

        }
        


        }return true;
        


    }
}