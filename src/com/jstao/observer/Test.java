package com.jstao.observer;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {
    //mydb是我自己建的数据库
    //user=root 我自己数据库的用户名
    //password=wizardfu 我自己的数据库的密码
//    public static final String URL = "jdbc:mysql://localhost:3306/books" +
//            "user=root&password=123456789";
//    public static void main(String[] args) {
//        try {
//        	System.out.print(11111);
//        	 Class.forName("com.mysql.jdbc.Driver");  //加载MYSQL JDBC驱动程序  
//            DriverManager.getConnection("jdbc:mysql://localhost:3306/books","root","123456789");//输入数据库的用户密码
//            System.out.println("成功加载MYSQL驱动");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
	public static void main(String[] args) {
        WechatServer server = new WechatServer();
        
        Observer userZhang = new User("ZhangSan");
        Observer userLi = new User("LiSi");
        Observer userWang = new User("WangWu");
        
        server.registerObserver(userZhang);
        server.registerObserver(userLi);
        server.registerObserver(userWang);
        server.setInfomation("PHP是世界上最好用的语言！");
        
        System.out.println("----------------------------------------------");
        server.removeObserver(userZhang);
        server.setInfomation("JAVA是世界上最好用的语言！");
        
    }
}
