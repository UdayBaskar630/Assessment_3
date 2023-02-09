package Assessment_3;

class Q2 
{
    public static String moveSpecialCharacters(String str) 
    {
        StringBuilder result = new StringBuilder();
        StringBuilder special = new StringBuilder();

        for (int i = 0; i < str.length(); i++) 
        {
            char c = str.charAt(i);
            if (!Character.isLetterOrDigit(c))
            {
                special.append(c);
            }
            else
            {
                result.append(c);
            }
        }

        result.append(special);
        return result.toString();
    }

    public static void main(String[] args)
    {
        String str = "He@#$llo!*&";
        System.out.println(moveSpecialCharacters(str));
    }
}