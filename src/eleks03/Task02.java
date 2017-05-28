package eleks03;
public class Task02 {
    public static void main(String[] args) {
        String inputString = "my name is mr.bean sdd ssss"; //args[0];

        getNumberOfWords(inputString);

    }

    static void getNumberOfWords(String sentence) {
        String[] words = sentence.split(" ");
        int countOfWords = words.length;

        System.out.println(countOfWords);
    }
}