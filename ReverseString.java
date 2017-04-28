
public class ReverseString {
    public static String reverseString(String input){

        StringBuilder output = new StringBuilder(input);

        char temp;
        for(int i = 0; i<output.length()/2; i++){
            temp = output.charAt(i);
            output.setCharAt(i, output.charAt(output.length()-i-1));
            output.setCharAt(output.length()-i-1, temp);
        }
        return output.toString();
    }

    public static void main(String[] args) {

        System.out.println(ReverseString.reverseString(("welcom")));
    }
}
