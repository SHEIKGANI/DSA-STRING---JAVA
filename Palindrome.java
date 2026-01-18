public class Palindrome {

    // -----------//////-------iterative approach-------////////--------------
    // public static Boolean palindrome(String str){
    //     int left = 0 ; int right = str.length()-1;
    //     while(left<right){
    //         if(str.charAt(left) != str.charAt(right)){
    //             return false;
    //         }
    //         left++;
    //         right--;
    //     }
    //     return true;
    // }
    // public static void main(String[] args) {
    //     String str = "MADAM";
    //     boolean result = palindrome(str);
    //     System.out.println(result);
    // }


                   /////////------RECURSION APPROACH-----/////////
    public static Boolean palindrome(String str,int left,int right){
        if(left>=right)
            return true;
        if(str.charAt(left) != str.charAt(right))
            return false;
        return palindrome(str, left, right-1);

    }
    public static void main(String[] args) {
        String str = "madam";
        Boolean result = palindrome(str, 0, str.length()-1);
        System.out.println(result);
    }
}
