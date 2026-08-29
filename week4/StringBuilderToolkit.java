class StringBuilderToolkit{
static String reverse(String text) {
        if(text==null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(text);
        return sb.reverse().toString();
    }

    static String repeat(String text, int count) {
        if(text==null || count<=0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<count;i++) {
            sb.append(text);
        }

        return sb.toString();
    }

    static String joinWords(String[] words, String separator) {
        if(words==null) {
            return null;
        }
        if(separator==null) {
            separator = "";
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<words.length;i++) {
            if(i>0) {
                sb.append(separator);
            }
            if(words[i]!=null) {
                sb.append(words[i]);
            }
        }

        return sb.toString();
    }

    static String removeCharacterAt(String text, int index) {
        if(text==null || index<0 || index>=text.length()) {
            return text;
        }

        StringBuilder sb = new StringBuilder(text);
        sb.deleteCharAt(index);
        return sb.toString();
    }

    static String replaceCharacterAt(String text, int index, char replacement) {
        if(text==null || index<0 || index>=text.length()) {
            return text;
        }

        StringBuilder sb = new StringBuilder(text);
        sb.setCharAt(index, replacement);
        return sb.toString();
    }

    static String buildNumberedList(String[] items) {
        if(items==null) {
            return null;
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<items.length;i++) {
            sb.append(i + 1).append(". ");
            if(items[i]!=null) {
                sb.append(items[i]);
            }
            if(i<items.length - 1) {
                sb.append("\n");
            }
        }

        return sb.toString();
    }
}