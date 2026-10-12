class Solution {
    public String convert(String s, int numRows) {
        if(s.length() == 0 || numRows == 1)return s;
        if(s.length() == 1)return s;
        StringBuilder sb = new StringBuilder("");
        int step = 2*numRows - 2;
        for(int i = 0 ; i< numRows ; i++){
            int j = i;
            while(j<s.length() ){
                sb.append(s.charAt(j));
                if(i>0 && i<numRows-1 && ((j+step)-2*i) < s.length()){
                    sb.append(s.charAt((j+step)-2*i));
                }
                j+= step;
            }
        }
        return sb.toString();
    }
}