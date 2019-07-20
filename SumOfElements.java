package com.array.redington;

public class SumOfElements {
int sum =0;
int a[]={5,3,6,2};
int i=0;
public void sum()
{
if(i<a.length)
{
sum=sum+a[i];
i++;
System.out.println("POSITION :"+ i);
System.out.println("SUM :" +sum);

sum();

}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfElements se=new SumOfElements();
		se.sum();
	}

}
