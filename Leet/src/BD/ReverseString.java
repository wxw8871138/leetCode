package BD;

public class ReverseString {
    public String solve (String str) {
        // write code here
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }
}
