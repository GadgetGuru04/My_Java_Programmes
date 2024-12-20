public class PassStringAsArg {
    static void display(String[] s) {
        for(int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }

    public static void main(String[] args) {
        // Creating a string array
        String[] strArray = {"Hello", "World", "This", "Is", "Java"};

        display(strArray);
    }
}
