public class reverse {
    public static void main(String[] args) {
        int reverse=0;
        int num=11111;
        int temp=num;
        while(num>0)
        {
            int rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;
        }
        System.out.println("The reverse of num is :"+reverse);
         if (reverse ==temp)
             System.out.println("Palindrome");
         else
             System.out.println("Not Palindrome");
    }
}
