class Solution {
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int first = 0; 
        int second = ch.length-1;
        while(first<second){
            if(matching(ch[first]) & matching(ch[second])){
                char temp = ch[first];
                ch[first] = ch[second];
                ch[second] = temp;
                 first++;
                 second--;
            }else if(!matching(ch[first]) & matching(ch[second])){
                first++;
            }else if(matching(ch[first]) & !matching(ch[second])){
                second--;
            }else{
                 first++;
                 second--;
            }
        }
    
        return new String(ch);
    }
    public boolean matching(char ch){
        char a = Character.toLowerCase(ch);
        if(a == 'a' || a == 'e' || a == 'i' ||a == 'o' || a== 'u'){
            return true;
        }
        return false;
    }
}