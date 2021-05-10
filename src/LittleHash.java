public class LittleHash implements I_hash {
    public int hash(String s) {
        {
            String lower = s.toLowerCase();
            char chars[] = lower.toCharArray();
            int count = s.length();
            for (int i = 0; i < chars.length; i++) {
                if (i != lower.indexOf(chars[i])) {
                    count--;
                }
            }
            return count;
        }
    }
}
