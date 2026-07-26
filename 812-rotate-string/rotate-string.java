class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length())return false;
        StringBuilder sb = new StringBuilder(s);
        for(int i  = 0 ; i<s.length() ; i++){
            sb.append(s.charAt(i));
        }
        if(sb.toString().contains(goal))return true;
        return false;
    }
}