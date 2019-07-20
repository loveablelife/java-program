package com.array.redington;

public class FactArrayParameter {
	private int[] factorial=new int[5];
	public int[]  getFactorialNumber(int[] n)
	{	
		for(int i=0;i<n.length;i++)
		{
			int fact=1;
			for(int j=1;j<=n[i];j++)
			{
				fact=fact*j;
			}
			factorial[i]=fact;
		}
		return factorial;
	}
	

}
