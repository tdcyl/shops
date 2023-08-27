package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class master {
    Scanner sc = new Scanner(System.in);
    String name = "admin";
    String password = "123";
    boolean flag;

    public boolean lohin() {
        String a;
        String b;
        boolean flag = false;
        System.out.println("请输入你的账号");
        a = sc.next();
        System.out.println("请输入你的密码");
        b = sc.next();
        if (a.equals(name) && b.equals(password))
            flag = true;
        else
            flag = false;

        if (flag) {
            System.out.println("恭喜你登录成功!");
        } else {
            System.out.println("密码错误");
        }
        return flag;
    }

    public void changemyself() {
        System.out.println("输入新密码");
        password = sc.next();
    }

    public void list(servant s) {
        s.visit();
    }

    public void changeservant(servant s) {
        s.password = "null";
        System.out.println("密码已重置");
    }

    public void addgoods(goods good[]) {
        goods gd = new goods();
        System.out.println("商品序号");
        gd.number = sc.next();
        System.out.println("商品名字");
        gd.name = sc.next();
        System.out.println("生产厂家");
        gd.factory = sc.next();
        System.out.println("生产日期");
        gd.date = sc.next();
        System.out.println("商品售价");
        gd.price = sc.nextInt();
        System.out.println("商品库存");
        gd.total = sc.nextInt();
        int i = 0;
        if (!good[i].number.equals("wu"))
            i++;
        good[i] = gd;
    }
    public void changegoods(goods gd)
    {
        gd.change();
    }
    public void deletegoods(goods gd)
    {
        gd.number="wu";
        System.out.println("删除成功");
    }
    public void show(goods gd[])
    {
        int i=0;
        while(i<5)
        {
            if(gd[i]!=null){
                if(!gd[i].number.equals("wu"))
            gd[i].search();
            }
            i++;
        }

    }
    public void close()
    {
        System.out.println("退出登录");
        System.exit(0);
    }
}
