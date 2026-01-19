public class Vowels {
    public static void main(String[] args) {
        
        String str = "VARSHA MAM";

        int vowels = 0;
        int consonants = 0;

        str=str.toLowerCase();

        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vowels++;
            }else if(ch >='a' && ch <= 'z'){
                consonants++;
            }
        }
        System.err.println("VOWELS " + vowels  );
        System.out.println("CONSONANTS "+consonants);
    }
}
