package college.util;


public class TextUtils {

    private static int counter=0;

    private TextUtils() {
    }

    public static String normalizeName(String name) {
        if(name==null||name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or blank");
        }

        name=name.trim();

        StringBuilder result=new StringBuilder();
        boolean space=false;

        for(int i=0;i<name.length();i++) {
            char ch=name.charAt(i);

            if(ch==' ') {
                if(!space) {
                    result.append(ch);
                    space=true;
                }
            } else {
                result.append(ch);
                space=false;
            }
        }

        StringBuilder finalName=new StringBuilder();
        boolean newWord=true;

        for(int i=0;i<result.length();i++) {
            char ch=result.charAt(i);

            if(ch==' ') {
                finalName.append(ch);
                newWord=true;
            } else {
                if(newWord) {
                    finalName.append(Character.toUpperCase(ch));
                    newWord=false;
                } else {
                    finalName.append(Character.toLowerCase(ch));
                }
            }
        }

        counter++;
        return finalName.toString();
    }

    public static int getCounter() {
        return counter;
    }
}