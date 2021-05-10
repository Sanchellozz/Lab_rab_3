public class BigHash implements I_hash
{
    public int hash(String s)
    {
        int summ = 0;
        for (int i = 0; i < s.length(); i++)
        {
            char Chars = s.charAt(i);
            int hashInt = (int) Chars;
            summ += hashInt*i;
        }
        return summ;
    }
}