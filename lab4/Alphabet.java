public class Alphabet
{
    public static void main(String args[])
    {
        PrintAlphabet al = new PrintAlphabet();
        al.Order();
        al.ReverseOrder();
    }
}

class PrintAlphabet
{
    char[] alphabet= {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    public void Order()
    {
        for(int i = 0; i <= 25; i ++)
        {
            System.out.printf("%c ", alphabet[i]);
        }
        System.out.printf("\n");
    }
    public void ReverseOrder()
    {
        for(int i = 25; i >= 0; i--)
        {
            System.out.printf("%c ", alphabet[i]);
        }
        System.out.printf("\n");
    }
}
