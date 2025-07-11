public class Sumavg 
{
    public static void main(String[] args) 
    {
        int sum = 0;
        int count = 10;
        for (int i = 1; i <= 10; i++) 
        { 
            sum += i;
        }
        int avg = sum / count;
        System.out.println("Average: " + avg);
        System.out.println("Sum: " + sum);
    }
}

