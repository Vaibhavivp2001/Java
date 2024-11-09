class Bank
{ int getMaxInterestRate()
   { return 16;
   }
}
class Cooperative extends Bank
{ int getMaxInterestRate()
   { return 12;
   }
}
class Nationalize extends Bank 
{ int getMaxInterestRate()
   { return 8;
   }
}
public  class BankApplication
{  public static void main(String x[])
   {   Bank b = new Cooperative();
	   int cir=b.getMaxInterestRate();
	   b=new Nationalize();
	   System.out.println("Cooperative interest rate is "+cir);
	   int nir=b.getMaxInterestRate();
	   System.out.println("Nationalize interest rate is "+nir);
   }
}
