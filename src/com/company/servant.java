package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class servant {
Scanner sc=new Scanner(System.in);
String name;
String password;
String grade;
String data;
int money=0;
String []goodsnumber=new String[5];
int [] goodstotal=new int[5];
public void visit()
     {
         System.out.println("账号"+name);
         System.out.println("密码"+password);
         System.out.println("用户等级"+grade);
         System.out.println("注册日期"+data);
     }
     public void changepassword()
     {
         System.out.println("新密码");
         password=sc.next();
     }
     public void shopping(goods gd[])
     {
         int i=0;
         int j;
         for( i=0;i<5;i++)
         {
             if(gd[i]!=null)
                 gd[i].search();
         }
         int m=0;
         while(m!=2) {
             System.out.println("输入购买商品的序号谢谢喵");
             String num = sc.next();
             System.out.println("输入购买数量谢谢喵");
             j = sc.nextInt();
             for (i = 0; i < 5; i++) {
                 if (goodsnumber[i] == null && goodstotal[i] == 0) {
                     goodsnumber[i] = num;
                     goodstotal[i] = j;
                     break;
                 }
             }
             System.out.println("输入2退出购物,否则继续购买");
             m=sc.nextInt();
         }
     }
     public void delete()
     {
         int i;
         System.out.println("输入删除购物车的货物序号");
         String s=sc.next();
         for( i=0;i<5;i++)
         {
             if(goodsnumber[i].equals(s))
             break;
         }
         goodsnumber[i]=null;
         goodstotal[i]=0;
     }
     public void give()
     {
         System.out.println("支付成功,金额为"+money);
     }
     public void pay(goods gd[])
     {
         int i,j;
         for(i=0;i<5;i++)
         {
             if(goodsnumber[i]!=null&&goodstotal[i]!=0)
            {
                j=0;
              while(j<4)
               {
                    if(goodsnumber[i].equals(gd[j].number))
                        break;
                       j++;
               }
                money=money+gd[j].sale(goodstotal[i]);
             }
         }
         give();
     }
     public void seeing()
     {
         int i;
         for( i=0;i<5;i++)
         {
             if(goodsnumber[i]!=null&&goodstotal[i]!=0)
             {
                 System.out.println("商品序号"+goodsnumber[i]);
                 System.out.println("数量"+goodstotal[i]);
             }
         }
     }
     public void close()
     {
         System.out.println("已退出");
         System.exit(0);
     }
}
