class Solution {
    public static int romanToInt(String s) {
        int ans = 0;
        for(int i = 0 ; i<s.length() ; i++){
            if((i<s.length()-1) && (s.charAt(i) == 'I') && (s.charAt(i+1) == 'V' || s.charAt(i+1)=='X')){
                int num = switch (""+ s.charAt(i) + s.charAt(i+1)){
                    case "IV" -> 4;
                    case "IX" -> 9;
                    default -> 0;
                };
                ans+=num;
                i++;
            }else if((i<s.length()-1) && (s.charAt(i) == 'X') && (s.charAt(i+1) == 'L' || s.charAt(i+1)=='C')){
                int num = switch (""+ s.charAt(i) + s.charAt(i+1)){
                    case "XL" -> 40;
                    case "XC" -> 90;
                    default -> 0;
                };
                ans+=num;
                i++;
            }else if((i<s.length()-1) && (s.charAt(i) == 'C') && (s.charAt(i+1) == 'D' || s.charAt(i+1)=='M')){
                int num = switch (""+ s.charAt(i) + s.charAt(i+1)){
                    case "CD" -> 400;
                    case "CM" -> 900;
                    default -> 0;
                };
                ans+=num;
                i++;
            }else{
                int inp = s.charAt(i);
                int num = switch(inp){
                    case 'I' -> 1;
                    case 'V' -> 5;
                    case 'X' -> 10;
                    case 'L' -> 50;
                    case 'C' -> 100;
                    case 'D' -> 500;
                    case 'M' -> 1000;
                    default -> 0;
                };
                ans+=num;
            }

        }
        return ans;
    }
}