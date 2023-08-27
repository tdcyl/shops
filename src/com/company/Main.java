package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

public static void main(String[] args) {
goods [] good=new goods[5];
goods g1=new goods();
good[0]=g1;
good[0].number="1";
good[0].name="bed";
good[0].factory="china";
good[0].date="1.1";
good[0].price=10000;
good[0].total=10;
servant[]servants=new servant[5];
servant s1=new servant();
servants[0]=s1;
servants[0].name="tuzaiqaq";
servants[0].password="123456";
servants[0].data="365";
servants[0].grade="gold";
boolean flag;
System.out.println("选择你的职业,1为管理,2为客户");
Scanner sc=new Scanner(System.in);
int i;
int j;
int h;
int i1=0;
int i2;
String a;
String b;
i=sc.nextInt();
if(i==1)
{
    master ms=new master();
    flag=ms.lohin();
    if(flag) {
        while (i1 != 10){
            System.out.println("输入3修改自己密码,4查询客户信息,5重置客户密码,6添加商品,7修改商品信息,8删除商品,10退出登录");
        i1 = sc.nextInt();
            if (i1 == 3) {
                ms.changemyself();
                flag = ms.lohin();
                if (flag) {
                    System.out.println("输入3修改自己密码,4查询客户信息,5重置客户密码,6添加商品,7修改商品信息,8删除商品,10退出登录");
                    i1 = sc.nextInt();
                } else
                    System.exit(0);
            }
            if (i1 == 4) {
                System.out.println("输入要查询的客户的账号");
                a = sc.next();
                System.out.println("输入要查询的客户的密码");
                b = sc.next();
                j = 0;
                while (j < 5) {
                    if (servants[j].name.equals(a) && servants[j].password.equals(b))
                        break;
                    j++;
                }
                ms.list(servants[j]);
            } else if (i1 == 5) {
                j = 0;
                System.out.println("输入要查询的客户的账号");
                a = sc.next();
                System.out.println("输入要查询的客户的密码");
                b = sc.next();
                while (j < 5) {
                    if (servants[j].name.equals(a) && servants[j].password.equals(b))
                        break;
                    j++;
                }
                ms.changeservant(servants[j]);
                ms.list(servants[j]);
            } else if (i1 == 6) {
                ms.addgoods(good);
                ms.show(good);
            } else if (i1 == 7) {
                j = 0;
                System.out.println("输入修改商品的序号");
                a = sc.next();
                while (j < 5) {
                    if (good[j].number.equals(a))
                        break;
                    j++;
                }
                ms.changegoods(good[j]);
                ms.show(good);
            } else if (i1 == 8) {
                j = 0;
                System.out.println("输入删除商品的序号");
                a = sc.next();
                while (j < 5) {
                    if (good[j].number.equals(a))
                        break;
                    j++;
                }
                ms.deletegoods(good[j]);
                ms.show(good);
            }
        }
        if(i1==10)
            ms.close();
    }
}
else if(i==2)
{
   System.out.println("输入9登录10注册");
    loginservant ls = new loginservant();
    i2=sc.nextInt();
     if(i2==10) {
         ls.sign(servants);
         i2=9;
     }
    if(i2==9)
    {
        h = ls.login(servants);
        if(h==6)
        {
            System.out.println("密码错误");
            System.exit(0);
        }
        if (h!= 6)
        {
           System.out.println("输入1修改密码2购物");
            {
                int i3=sc.nextInt();
                if(i3==1) {
                    ls.changepassword(servants[h]);
                    h=ls.login(servants);
                    if (h!= 6);
                    i3=2;
                }
                if(i3==2)
                {
                    servants[h].shopping(good);
                    System.out.println("是否要删除购物车的商品,1是2否");
                    int i4=sc.nextInt();
                    if(i4==1)
                        servants[h].delete();
                    servants[h].pay(good);
                    servants[h].seeing();
                    System.out.println("购物已结束,自动退出登录");
                    servants[h].close();
                }
            }
        }
    }

    }
}
    }
