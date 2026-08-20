import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap <Character ,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            Character ch=s.charAt(i);
           if(map.containsKey(ch)){
            map.put(ch,map.get(ch)+1);
           }else{
            map.put(ch,1);
           }
            }
            for(int i=0;i<s.length();i++){
                Character ch=t.charAt(i);

                
                if(!map.containsKey(ch)){
                    return false;

                }
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)<0){
                    return false;
                }
                }return true;
            }

        }



    


