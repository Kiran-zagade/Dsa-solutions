class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        
        HashMap <Character,Character>mapST=new HashMap<>();
        HashMap <Character,Character>mapTS=new HashMap<>();

        for(int i=0;i<s.length();i++){
            Character chs=s.charAt(i);
            Character cht=t.charAt(i);

        if(mapST.containsKey(chs)){
            if(mapST.get(chs)!=(cht)){
                return false;
            }
            }else{
               mapST.put(chs,cht);
            }
        
            if(mapTS.containsKey(cht)){
                if(mapTS.get(cht)!=(chs)){
                return false;
            }
            }else{
                mapTS.put(cht,chs);
            }
        

            }return true;
            
        }

        


        }
        


    
