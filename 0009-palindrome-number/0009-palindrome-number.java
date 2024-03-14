class Solution {
    public boolean isPalindrome(int x) {
        int o=x;
        int rev=0;
        boolean status=true;
        while(x>0){
            int rem=x%10;
            
             rev=rev*10+rem;
              x=x/10;
        }
        if(rev==o){
            status=true;
        }else{
            status=false;
        }
        return status;
    }
}