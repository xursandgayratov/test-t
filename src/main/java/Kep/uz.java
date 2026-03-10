package main.java.Kep;

public class uz {
        public static void main(String[] args) {
            String text = "Upper Case";
            String text1 = "Upper Case";
            String text2 = "Lower Case u uchun alohida method bor uchun";
            String text3 = " Text ";

            System.out.println(text.length());
            System.out.println(text.toUpperCase());
            System.out.println(text1.toLowerCase());
            System.out.println(text2.indexOf("uchun"));
            System.out.println(text.charAt(6));
            System.out.println(text.equals(text1));
            System.out.println("Dastlabki holat: "+"["+text3+"]");
            System.out.println("Keyingi holat:   "+"["+text3.trim()+"]");

        }
    }


