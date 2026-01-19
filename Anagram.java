public class Anagram {

    // public static Boolean isAnagram(String str1, String str2){
    //     if(str1.length() != str2.length()){
    //         return false;
    //     }

    //     int [] charCount = new int[26];

    //     for(int i = 0 ;i <str1.length();i++){
    //         charCount [str1.charAt(i)-'a']++;
    //         charCount [str2.charAt(i)-'a']--;
    //     }

    //     for(int count : charCount){
    //         if(count != 0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // public static void main(String[] args) {
    //     String str1 = "RACE" ;

    //     String str2 = "CARE" ;

    //     boolean result = isAnagram(str1 , str2);

    //     if(result == true){
    //         System.out.println("This is an Anagram");
    //     }else{
    //         System.out.println("Not an Anagram");
    //     }
    // }
    public static boolean isAnagram(String str1, String str2){

        if(str1.length() != str2.length()){
            return false;
        }

            int[] charCount = new int[26];

            for (int i=0;i<str1.length(); i++){
                charCount[str1.charAt(i)- 'a']++;
                charCount[str2.charAt(i)- 'a']--;
            }

            for (int count : charCount){
                if (count != 0){
                    return false;
                }
            }

            return true;


    }
    public static void main(String[] args) {

       String str1 = "eat";

       String str2 = "ate";

     boolean result =   isAnagram(str1, str2);

     if (result == true){
        System.out.println("This is an Anagram");
     } else {
        System.out.println("Not an Anagram");
     }

    }
}
