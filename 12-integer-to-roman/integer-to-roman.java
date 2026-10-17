class Solution {
    public String intToRoman(int nums){
        int[]arr = {1,5,10,50,100,500,1000};
        StringBuilder ans = new StringBuilder("");
        int a = 1;
        int indx = 3;
        while(nums != 0){
            if(nums % 10  == 0){
                a*=10;
                indx ++;
                nums/=10;
            }
            int curr = nums%10 ;
            StringBuilder temp = new StringBuilder("");
            int num = curr * a;

            if(num / (9*a) == 1  && num % (9*a) == 0){
               for(int i = 0 ; i<arr.length ;i+=2){
                   if(arr[i]-num >0){
                      ans.append(matches(arr[i]));
                      ans.append(matches(arr[i]-num));
                      break;
                   }
               }
            }else if(num / (4*a) == 1  && num % (4*a )== 0){
                for(int i = 1 ; i<arr.length ;i+=2){
                    if(arr[i]-num >0){
                        ans.append(matches(arr[i]));
                        ans.append(matches(arr[i]-num));
                        break;
                    }
                }
            }else{
                while(num > 0){
                    for(int i = indx ; i>=0 ; i--){
                        if(num - arr[i] >= 0){
                            num-= arr[i];
                            temp.append(matches(arr[i]));
                            break;
                        }
                    }
                }
                ans.append(temp.reverse());
            }
            a*=10;
            indx ++;
            nums/=10;
        }
        return ans.reverse().toString();
    }
    
    public char matches(int num){
        char ch = switch (num){
            case 1 -> 'I';
            case 5 -> 'V';
            case 10 -> 'X';
            case 50 -> 'L';
            case 100 -> 'C';
            case 500 -> 'D';
            case 1000 -> 'M';
            default -> '0';
        };
        return ch;
    }
}