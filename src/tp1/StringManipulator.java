package tp1;

public class StringManipulator {

    private String s;

    public StringManipulator(String s) {
        this.s = s;
    }

    public void reverse() {
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed = reversed + s.charAt(i);
        }

        System.out.println("reverse : "+reversed);
    }

    public void isPalindrome(){
        int i=0;
        boolean palindrome=true ;
        while(i<(s.length()-1)/2 && palindrome){
            if(s.charAt(i)==s.charAt((s.length()-1)-i))
                palindrome = true;
            else
                palindrome = false;
            i++;
        }
        System.out.println("isPalindrome : "+palindrome);
    }

    public void toUpperCase(){
        System.out.println("uppercase : "+s.toUpperCase());
    }

    public void toLowerCase(){
        System.out.println("lowercase : "+s.toLowerCase());
    }

    public void getVowelNumber(){
        int vowel = 0;
        String c = s.toLowerCase();
        for(int i = 0; i < c.length(); i++) {
            char v = c.charAt(i);
            if(v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u') {
                vowel++;
            }
        }
        System.out.println("vowelNumber : "+vowel);
    }

    public static void main(String[] args) {
        StringManipulator stringManipulator = new StringManipulator("teNe");
        stringManipulator.reverse();
        stringManipulator.isPalindrome();
        stringManipulator.toUpperCase();
        stringManipulator.toLowerCase();
        stringManipulator.getVowelNumber();
    }
}
