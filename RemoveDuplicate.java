public class RemoveDuplicate {
    public static void main(String[] args) {
        
        String str = "programming";

        String res = "";


        /////////--------removing duplicate character--------////////
        // for(int i = 0 ; i < str.length() ; i++ ){
        //     char temp = str.charAt(i);

        //     if(res.indexOf(temp)==-1){
        //         res +=temp;
        //     }
        // }
        // System.out.println("After removing Duplicate....."+res);




        //////////--------finding duplicate character---------//////////
        
        for(int i = 0;i< str.length();i++){
            char temp = str.charAt(i);

            if(str.indexOf(temp) != str.lastIndexOf(temp) && res.indexOf(temp) == -1){
                res += temp;
            }
        }
        System.out.println("Finding duplicate are......"+ res);
    }
}
