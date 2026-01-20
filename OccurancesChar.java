public class OccurancesChar {
    public static void main(String[] args) {
        
        String str = "SHEIK USMAN GANI" ;

        char RemoveChar = 'A';

        String res= "";

        for (int i = 0 ; i < str.length() ; i++){

            char temp = str.charAt(i);

            if(temp!=RemoveChar){
                res += temp;
            }
        }

        System.out.println(res);

    }
}
