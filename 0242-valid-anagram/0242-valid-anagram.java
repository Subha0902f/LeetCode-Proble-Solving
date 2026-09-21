class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] chr1 = s.toCharArray();
        Arrays.sort(chr1);
        char[] chr2 = t.toCharArray();
        Arrays.sort(chr2);
        for(int i=0;i<chr1.length;i++){
            if(chr1[i]==chr2[i]){
            continue;
        }
        else{
            return false;
        }
        }
        return true;
    }
}