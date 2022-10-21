class prime {
    
    static boolean isPrime(int num, int i)
    {
        // Base cases
        if (num <= 2) 
           return (num == 2) ? true : false; 
       if (num % i == 0) 
           return false; 
       if (i * i > num)
            return true;
    
        return isPrime(num, i + 1);
    }
    static void prime_no(int num)
    {
        if (num == 10)
            return;

        if (isPrime(num, 2)) {
            System.out.println(num);
        }
        prime_no(num+1);
    }
    
    public static void main(String[] args) {
        System.out.println("Prime Numbers between 1 and 10 are: ");
        prime_no(1);
        
    }
}
