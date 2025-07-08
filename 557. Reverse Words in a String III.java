class Solution {
    public String reverseWords(String s)
    {
    char[] arr=s.toCharArray();
    int l=0,r=0;
    while(r<arr.length)
    {
        if(arr[r]==' ')
        {
            reverse(arr,l,r-1);
            l=r+1;
        }
        r++;
    }
    reverse(arr,l,r-1);
    return new String(arr);
    }
    public void reverse(char[] a,int  l,int r)
    {
        while(l<r)
        {
            char t = a[l];
            a[l] = a[r];
            a[r] = t;
            l++;
            r--;
        }
    }    
}
