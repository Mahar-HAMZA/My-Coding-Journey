import java.util.Arrays;
public class Main{
    public static String Permutation(String arr1, String arr2){
        int freq1[]=new int[26];
        int freq2[]=new int[26];
        if(arr1.length() > arr2.length()){
            return "False";
        }
        else {
            for (int i = 0; i < arr1.length(); i++) {
                freq1[arr1.charAt(i) - 'a']++;
                freq2[arr2.charAt(i) - 'a']++;
            }
            if(Arrays.equals(freq1, freq2)){
                return "True";
            }
            int left = arr1.length(), right = arr2.length() - 1, incre = 0;
            while (left <= right) {
                if (!Arrays.equals(freq1, freq2)) {
                    freq2[arr2.charAt(left) - 'a']++;
                    freq2[arr2.charAt(incre) - 'a']--;
                    incre++;
                    left++;
                    if(Arrays.equals(freq1, freq2)){
                        return "True";
                    }
                }
                else {
                    return "True";
                }
            }
        }
        return "False";
    }
    public static void main(String[] args) {
        String name1="ab";
        String name2="ab";
            System.out.println(Permutation(name1, name2));
    }
}