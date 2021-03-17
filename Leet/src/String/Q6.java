package String;

import java.util.ArrayList;
import java.util.List;

public class Q6 {
    public static String convert(String s, int numRows) {
        StringBuilder res = new StringBuilder();
        if(numRows < 2){
            return s;
        }
        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }
        int i = 0;
        int flag = -1;
        for (char c: s.toCharArray()) {
            rows.get(i).append(c);
            if(i==0 || i==numRows-1){
                flag = -flag;
            }
            i += flag;
        }
        for (StringBuilder row: rows
             ) {
            res.append(row);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        convert("PAYPALISHIRING",3);
    }
}
