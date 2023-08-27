package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class goods {
Scanner sc=new Scanner(System.in);
String number;
String name;
String factory;
String date;
int price;
int total;
public void search()
        {
            System.out.println("商品序号："+number);
            System.out.println("商品名字："+name);
            System.out.println("商品厂家："+factory);
            System.out.println("生产日期："+date);
            System.out.println("商品价格："+price);
            System.out.println("商品总量："+total);
        }
public void change()
{
    System.out.println("输入要修改的货物属性,1售价2存货");
    int a1=sc.nextInt();
    if(a1==1)
    {
        System.out.println("输入新数据");
        price = sc.nextInt();
    }
    if(a1==2)
    {
        System.out.println("输入新数据");
        total=sc.nextInt();
    }
}
public int sale(int a)
{
    total=total-a;
    return price*a;
}
}
