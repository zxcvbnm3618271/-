package 比赛题;

#include <math.h>
#include <algorithm>
#include <stdio.h>
#include <set>
#include <map>
#include <string.h>
#include <string>
#include<iostream>
using namespace std;
const int M=1e5+100;
int a[M];
int B,belong[M],lazy[M],r[M],l[M],num;
//map<int,int>mp[M];
int sum[M];//记录某值在序列中出现的次数
void build(int n)
{
    B=sqrt(n);
    num=n/B;
    if(n%B)
    {
        num++;
    }
    for(int i=1;i<=num;i++)
    {
        l[i]=B*(i-1)+1;
        r[i]=B*i;
    }
    r[num]=n;
    for(int i=1;i<=num;i++)
    {
        lazy[i]=-1;
        for(int j=l[i];j<=r[i];j++)
        {
            belong[j]=i;
            a[j]=1;
        }
    }
    sum[1]=n;
}
void push_down(int x)//在更新跟查找时，如果要进入某一段，首先释放lazy标记，然后在再区间中查找
{
    if(lazy[x]!=-1)
    {
        for(int i=l[x];i<=r[x];i++)
        {
            a[i]=lazy[x];
        }
    lazy[x]=-1;
    }
}
void update(int x,int y,int v)
{
    if(belong[x]==belong[y])
    {
        if(lazy[belong[x]]!=-1)
            push_down(belong[x]);
        for(int i=x;i<=y;i++)
        {
            sum[a[i]]--;
            sum[v]++;
            a[i]=v;
        }
    }
    else
    {
        int b_st=belong[x];
        if(lazy[b_st]!=-1)
          push_down(b_st);
        for(int i=x;i<=r[b_st];i++)
        {
             sum[a[i]]--;
            sum[v]++;
            a[i]=v;
        }
        for(b_st++;b_st<belong[y];b_st++)
        {
            if(lazy[b_st]!=-1)
            {
                if(lazy[b_st]!=v)
                {
                    sum[lazy[b_st]]-=B;
                    sum[v]+=B;
                    lazy[b_st]=v;
                }
            }
            else
            {
                for(int j=l[b_st];j<=r[b_st];j++)
                {
                    if(a[j]!=v)
                    {
                        sum[a[j]]--;
                        sum[v]++;
                        a[j]=v;
                    }
                }
                lazy[b_st]=v;
            }
        }
        if(lazy[b_st]!=-1)
        push_down(b_st);
       // int ed=min(r,n);
        for(int i=l[b_st];i<=y;i++)
        {
             sum[a[i]]--;
            sum[v]++;
            a[i]=v;
        }
    }
}
int main()
{
    int n,m,q;
    cin>>n>>m>>q;
    build(n);
    int x,y;
    long long  aa,bb;
    while(q--)
    {
        scanf("%d%d%lld%lld",&x,&y,&aa,&bb);
        aa%=n;
        bb%=n;
        long long   p=sum[x];
        long long ll=(aa+((p+bb)*(p+bb))%(long long)n)%n+1;
        long long  rr=(aa+((p*bb)%n*(p*bb)%n)%(long long)n)%n+1;
        if(ll>rr)
            swap(ll,rr);
        update(ll,rr,y);
    }
    int maxn=0;
    for(int i=1;i<=m;i++)
    {
        if(sum[i]>maxn)
            maxn=sum[i];
 
    }
    cout<<maxn<<endl;
    return 0;
}
--------------------- 
作者：Black__wing 
来源：CSDN 
原文：https://blog.csdn.net/black__wing/article/details/86092038 
版权声明：本文为博主原创文章，转载请附上博文链接！
