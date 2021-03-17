package String;

public class Q14 {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        String common = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int l1 = common.length();
            int l2 = strs[i].length();
            int j = 0;
            for(;j<l1 && j<l2;j++){
                if(common.charAt(j)!=strs[i].charAt(j)){
                    break;
                }
            }
            common = common.substring(0,j);
        }
        return common;
    }

    public static void main(String[] args) {
        String[] s = {"flower","flow","flight"};
        longestCommonPrefix(s);
    }
}
