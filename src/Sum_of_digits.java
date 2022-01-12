public class Sum_of_digits {
    public static void main(String[] args) {
        int num=123;
        int i=0;
      while(num>0)
        {
           // int reverse= num%10;
            int rem=num%10;
            num=num/10;
            i += rem;
        }
        System.out.println(i);
    }
}
