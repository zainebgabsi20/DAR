package tp1;

public class StringManipulator {

    private String s;

    public StringManipulator(String s) {
        this.s = s;
    }

    public void reverse(){
        //do your stuff
        System.out.println("reverse : ");
    }

    public void isPalindrome(){
        //do your stuff
        System.out.println("isPalindrome : ");
    }

    public void toUpperCase(){
        //do your stuff
        System.out.println("uppercase : ");
    }

    public void toLowerCase(){
        //do your stuff
        System.out.println("lowercase : ");
    }

    public void getVowelNumber(){
        //do your stuff
        System.out.println("vowelNumber : ");
    }

    public static void main(String[] args) {
        StringManipulator stringManipulator = new StringManipulator("tene");
        stringManipulator.reverse();
        stringManipulator.isPalindrome();
        stringManipulator.toUpperCase();
        stringManipulator.toLowerCase();
        stringManipulator.getVowelNumber();
    }
}
