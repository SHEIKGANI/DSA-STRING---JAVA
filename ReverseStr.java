public class ReverseStr {

    // -------------------////////ITERATIVE APPROACH///////////------------
    // public static void main(String[] args) {
    //     String str = "SHEIK" ;
    //     String reversed = " ";

    //     for(int i = str.length()-1;i>=0;i--){
    //         reversed=reversed+str.charAt(i);
    //     }
    //     System.out.println(reversed);
    // }

    public static String reverse(String str){
        //BASE CONDITION
       if(str.isEmpty())
        return str;
        //Recursion
        return reverse(str.substring(1))+str.charAt(0);
    }
    public static void main(String[] args) {
        String str = "USMANGANI";
        String result = reverse(str);
        System.out.println(result);
    }
}
