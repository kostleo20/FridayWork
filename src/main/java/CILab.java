public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        String word = getString();
        int caps = 0;
        for(int i = 0; i < word.length(); i++) {
            if(('A' <= word.charAt(i) && 'Z' >= word.charAt(i)) || ('a' <= word.charAt(i) && 'z' >= word.charAt(i))) {
                if (Character.isUpperCase(word.charAt(i))) {
                    caps++;
                }
            }
            else {
                return false;
            }
        }
        if(caps == word.length() || caps == 0) return true;
        return caps == 1 & Character.isUpperCase(word.charAt(0));
    }

}

