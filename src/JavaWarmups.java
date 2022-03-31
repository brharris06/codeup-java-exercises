public class JavaWarmups {

        //Jason Example//
        public static void returnFirstCapitalLetter (String string) {
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z') return;
            }
        }

        public static void main (String[]args){
            returnFirstCapitalLetter("hELLo");
        }
    }

