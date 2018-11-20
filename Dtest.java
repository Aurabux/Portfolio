public static void main(String args[])
   {
      long X1, X2, X3, X4;
      double Y, D1;
      
      DecimalFormat df = new DecimalFormat("#.######");
      //D1 = Double.parseDouble(args[0]); 
      X1 = Long.parseLong(args[0]);
      X2 = Long.parseLong(args[1]);
      // X3 = Long.parseLong(args[2]);
      // X4 = Long.parseLong(args[3]);
      
      //Y = Permutations(X1, X2);
      Y = Combinations(X1, X2);
      //Y = HyperGeometric(X1, X2, X3, X4);
      //Y = Binomial(D1, X1, X2);
      //Y = Poisson(D1, X1);
      
      
      System.out.println(df.format(Y));
   }

   