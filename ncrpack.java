package ncrPac;

import java.io.*;
public class ncrpack
{
public int ncrmethod(int n,int d)
{
int i;
int result=1,result1=1,result2;
for(i=1;i<=n;i++)
{
result=result*i;
}
for(i=1;i<=d;i++)
{
result1=result1*i;
}
result2=result/result1;
return result2;
}
}
