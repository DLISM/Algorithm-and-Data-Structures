package leetcode.String;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        if(strs==null || strs.length==0)
            return "";

        String result=strs[0];

        for(int i=0; i<strs.length; i++){
            while (strs[i].indexOf(result)!=0){
                result =result.substring(0, result.length()-1);
                if (result.isEmpty()){
                    return "";
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix=new LongestCommonPrefix();
       String result = longestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"});
       System.out.println(result);
    }
}
