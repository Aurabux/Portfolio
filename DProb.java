// Discrete Probability Library
public class DProb
{

  public static double Permutations(long N, long X)
  {
    double perm = 0.0;
    long l = N - (N - X);
    
    for (long i = 0; i < l; i++)
    {
         perm = perm * (double)(N - i);
    }


    return perm;
  }

  public static double Combinations(long N, long X)
  {
    double comb = 0.0;
   
       
      if (X == 0 || X == N)
      {
         comb = 1.0;
         return comb;
      }
      
      if ((N - X) <= X)
      {
         X = N - X;
      }
      
      for (long i = 0; i < X; i++)
      {
         comb = comb * (double)(N - i) / (double)(i + 1);
      }

    return comb;
  }

  public static double HyperGeometric(long Np, long Xp, long N, long X)
  {
    double probX = 0.0;
    
    probX = (Combinations(Xp, X) * Combinations((Np - Xp), (N - X))) / Combinations(Np, N);

    return probX;
  }

  public static double Binomial(double P, long N, long X)
  {
    double probX = 0.0;
    probX = Combinations(N, X) * Math.pow(P, (double)X) * Math.pow((1 - P), (N - X));

    return probX;
  }

   public static double Poisson(double Xmean, long X)
  {
    double probX = 0.0;
    double e = 2.71828183;
    long fact = 1;
   
    for (long i = 0; i < X; i++)
      {
         fact = fact * (X - i);
      }
      
    probX = Math.pow(e, (double)(-1 * Xmean)) * (Math.pow(Xmean, (double)X) / (double)fact);
  
    return probX;
  }

} // end class
