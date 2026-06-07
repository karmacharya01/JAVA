

public class StringMethods {
    public static void main(String[] args) {
        String str="WelCome To";
        String str1="Java Programming";
        char char1=str.charAt(3);
        System.out.println("Char :"+char1);
        System.out.println("Concat two Strings:" +str.concat(str1));
        System.out.println("String equals to:"+str.equals(str1));
        System.out.println("Uppercase:"+str1.toUpperCase());
        System.out.println("Lowercase:"+str1.toLowerCase());
        System.out.println("Substring:"+str1.substring(4,12));
        System.out.println("Replace:"+str.replace('C', 'c'));
        System.out.println("Removes extra space:"+str1.trim());
        System.out.println(str.compareTo(str1));

        String str2="Welcome.to.Java.Programming";
        String[]a=str2.split(".");

        System.out.println("Split Method:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
