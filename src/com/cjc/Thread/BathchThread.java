package com.cjc.Thread;

import com.cjc.Thread.entity.UserEntity;

import java.util.ArrayList;
import java.util.List;

class UserThread extends Thread{
    private List<UserEntity> userEntities;
    UserThread(List<UserEntity> userEntities){
        this.userEntities = userEntities;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (UserEntity userEntity: userEntities) {
            System.out.println("name:"+getName()+userEntity.toString());
        }
    }
}
public class BathchThread {
    public static void main(String[] args) {
//        1.初始化用户
        List<UserEntity> initUser = initUser();
//        2.定义每个线程最多跑多少数据
        int userCount = 2;
//        3.计算每个线程数，并且计算每个线程跑那些数据
        List<List<UserEntity>> lists = ListUtils.splitList(initUser, userCount);

        for (int i = 0;i<lists.size();i++){
            List<UserEntity> list = lists.get(i);
            UserThread userThread = new UserThread(initUser);
            userThread.start();
//            System.out.println("i:"+i+"--"+list.toString());
        }
//        4.让子线程进行分批异步处理数据

    }
    public static List<UserEntity> initUser(){
        List<UserEntity> userEntities = new ArrayList<>();
        for (int i = 0 ; i < 11 ; i++){
            userEntities.add(new UserEntity("userId:"+i,"userName:"+i));
        }
        return userEntities;
    }
}
