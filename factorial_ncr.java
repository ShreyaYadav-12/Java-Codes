package dsa;

public class factorial_ncr {

	public static void main(String[] args) {
		System.out.println(ncr(6,3));
	}
		public static int fact(int n)
		{
			int ans=1;
			for(int i=1;i<=n;i++) {
				ans*=i;
			}
			return ans;
		}
		public static int ncr(int n,int r)
		{
			int fact_n=fact(n);
			int fact_r=fact(r);
			int fact_nr=fact(n-r);
			return fact_n/(fact_r*fact_nr);
		}
}
