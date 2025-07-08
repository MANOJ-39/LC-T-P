class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        int l=0;
        int r=n-1;
        s=s.toLowerCase().replace()
        while(l<=r){
            if(s.charAt(l)==s.charAt(r)){
                l++;
                r--;
            }
            else{
                return false;
            }
        }
        return true;
        
    }
}
