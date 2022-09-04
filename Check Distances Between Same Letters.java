# 2399 task
class Solution {
    public boolean checkDistances(String s, int[] distance) {
        for (int i=0; i<s.length();i++){
            char index = s.charAt(i);
            int j = s.indexOf(index, i+1);
            if (j!=-1 && (j-i-1) != distance[index - 'a'])
                return false;
        }
        return true;
    }
}
