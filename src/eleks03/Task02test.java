package eleks03;

public class Task02test {
    public static void main(String[] args) {
        int result = findNumberOfWords("star is a super star");
        System.out.println(result);
    }

    public static int findNumberOfWords (String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) != ' ' && s.charAt(i+1) == ' '){
                count++;
            }
        }
        return count;
    }
}