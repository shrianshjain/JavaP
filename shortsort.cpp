#include<iostream>
using namespace std;
int main()
{
  int a[10],hash[9999],i,lar=0;
  for(i=0;i<5;i++)
   {
     cin>>a[i];
     if(lar<a[i])
      lar=a[i];
     hash[a[i]]=9;
   }
  for(i=0;i<=lar;i++)
   if(hash[i]==9)
    cout<<i<<endl;
  return 0;
}
