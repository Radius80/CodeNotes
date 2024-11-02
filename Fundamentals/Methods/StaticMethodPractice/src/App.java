public class App {
    public static void main(String[] args) throws Exception {
       //System.out.println(App.Abselute(-5));
       //System.out.println(App.isPrime(6));
       //System.out.println(App.isPrime2(7));
       //System.out.println(App.SquareRoot(5.0));
       //System.out.println(App.sqrt(5.0));
       //System.out.println(App.Hyp(6.0, 7.0));
       System.out.println(App.H(9));
       double sum = 1;
       sum = sum + 1/5;
       System.out.println(sum);

    }
    public static int Abselute(int intt)
    {
        if( intt < 0)
        {
            return -1*intt;
        }
        else
            {
                return intt;
            }
    }

    public static boolean isPrime(int pi)
    {
        boolean iPrim = false;
        int div = pi;
        if(div < 2 )
        {
           iPrim = false;
        }
        else{
            iPrim = true;
            while(div > 2)
                {
                    div--;
                    if(pi % div == 0)
                    {
                        iPrim = false;
                        break;
                    }
                }
            }
        return iPrim;
    }

    public static boolean isPrime2(int N)
    {
        if(N < 2)
            return false;
        for(int i = 2; i*i < N; i++)
            if(N % i == 0)
                return false;
    return true;
    }

    public static double SquareRoot(double a)
    {
        double XZero = a - 0.001;
        double Xone = 0;
        for(int i = 0; i < 10; i ++)
        {
            Xone = (0.5)*(XZero + (a/XZero));
            if(Xone == XZero)
                break;
            XZero = Xone;
        }
        
        return Xone;
    }
    public static double sqrt(double c)
    {
        if (c < 0) return Double.NaN;
        double err = 1e-15;
        double t = c;
        while (Math.abs(t - c/t) > err * t)
        {
            t = (c/t + t) / 2.0;
            //System.out.println(err * t + " " + Math.abs(t - c/t) );
        }
        
        return t;
    }

    public static double Hyp(double a, double b)
    {
        return App.sqrt((a*a) + (b*b));
    }

    public static double H(int N)
    {
        double sum = 0.0;
        for(int i = 1; i <= N; i++)
            sum += 1.0/i;
        return sum;
    }
}
