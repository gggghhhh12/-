package com.jstao.observer;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {
    //mydb�����Լ��������ݿ�
    //user=root ���Լ����ݿ���û���
    //password=wizardfu ���Լ������ݿ������
//    public static final String URL = "jdbc:mysql://localhost:3306/books" +
//            "user=root&password=123456789";
//    public static void main(String[] args) {
//        try {
//        	System.out.print(11111);
//        	 Class.forName("com.mysql.jdbc.Driver");  //����MYSQL JDBC��������  
//            DriverManager.getConnection("jdbc:mysql://localhost:3306/books","root","123456789");//�������ݿ���û�����
//            System.out.println("�ɹ�����MYSQL����");
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
        server.setInfomation("PHP������������õ����ԣ�");
        
        System.out.println("----------------------------------------------");
        server.removeObserver(userZhang);
        server.setInfomation("JAVA������������õ����ԣ�");
        
    }
}
