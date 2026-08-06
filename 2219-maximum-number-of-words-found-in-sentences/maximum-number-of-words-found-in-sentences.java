class Solution {
    public int mostWordsFound(String[] sentences) {

        int max = 0;

        for(int i = 0; i < sentences.length; i++) {

            int word = 1;
            String s = sentences[i];

            for(int j = 0; j < s.length(); j++) {

                if(s.charAt(j) == ' ') {
                    word++;
                }

            }

            max = Math.max(max, word);
        }

        return max;
    }
}

      
    
