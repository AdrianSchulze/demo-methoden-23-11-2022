public class Main {
    public static boolean length(String str) {
        return str.length() > 20;
    }

    public static boolean isFancy(String str) {
        return str.contains("fancy");
    }

    public static void check(String str) {
        if (length(str) && isFancy(str)) {
            System.out.println("Your String is longer than 20 symbols and contains the word 'fancy'");
        }
        else if (length(str)) {
            System.out.println("Your String is longer than 20");
        }
        else if (isFancy(str)) {
            System.out.println("Your String contains fancy");
        }
        else {
            System.out.println("Your string is dumb lol");
        }
    }

    public static void main(String[] args){
        check("This text wqrewre bababooey");
    }

}
