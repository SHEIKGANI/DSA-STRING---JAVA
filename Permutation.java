public class Permutation {

    public static void permute(String str, int left,int right){
        //base Condition
        if(left==right){
            System.out.println(str);
        }else{
            for(int i=left;i<=right;i++){
                //swap
                str=swap(str, left, i);
                //recursive call
                permute(str, left+1, right);
                //backtrack
                str = swap(str, left, i);
            }
        }
    }
    public static String swap(String str,int left,int i){
        char [] ch = str.toCharArray();
        char temp = ch[left];
        ch[left]=ch[i];
        ch[i]=temp;
        return String.valueOf(ch);

    }
    public static void main(String[] args) {
        String str = "Gani";

        permute(str, 0, str.length()-1);
    }
}
