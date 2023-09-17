package Accenture;

public class pseudo1 {
	public static void main(String[] args) {
		int p=9,q=5,r=8;
		for(r=5;r<=6;r++)
		{
			if((p+r)<(r-p) || q<p)
				q=p+r;
			if((r&3)<p)
			{
				p=p^r;
				continue;
			}
			p=p+p;
		}
		System.out.println(p+q+r);
	}
}
