class Solution {
    public int reverse(int x) {
        if(x>Integer.MAX_VALUE||x<Integer.MIN_VALUE){
            return 0;
        }
        long reversed=0;
        if(x>0){
            while(x>0){
                int digit=x%10;
                reversed=(reversed*10)+digit;
                 x=x/10;
             }}
        else{
            x*=(-1);
            while(x>0){
                int digit=x%10;
                reversed=(reversed*10)+digit;
                 x=x/10;
             }
            reversed*=(-1);
        }
        if(reversed>Integer.MAX_VALUE||reversed<Integer.MIN_VALUE){
            return 0;
        }
        return (int) reversed;
    }
}