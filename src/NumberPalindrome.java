public class NumberPalindrome {

    public static boolean isPalindrome (int number)
    {
        int revnum = 0 ;
        int temp = number ;
        while (temp != 0)
        {
            int digit = temp % 10 ;
            revnum = (revnum * 10) + digit ;
            temp /= 10 ;

            //System.out.println(temp);

        }
        if (number != revnum)
        {
            return false ;
        }
        else
        {
            return true ;
        }


    }
}
