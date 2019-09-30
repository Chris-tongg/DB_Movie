package com.db.utils;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBManager {
    /*
    *   数据库增删改的分装
    * */
    public static Integer commonUpdate(String sql,Object ... args){
        Connection conn = null;
        PreparedStatement ps = null;
        int rSet = 0;
        try {
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            for (int i=0;i<args.length;i++){
                if (args[i]!=null){
                    ps.setObject(i+1,args[i]);
                }
            }
            rSet = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBClose.closeAll(ps,conn);
        }
        return rSet;
    }

    /*
    *   数据库的查找封装
    * */
    public static <T>List<T> commonQuery(String sql,Class<T> clazz,Object ... args){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rSet = null;
        List<T> list = new ArrayList<>();
        try {
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            for (int i=0;i<args.length;i++){
                if (args[i]!=null){
                    ps.setObject(i+1,args[i]);
                }
            }
            rSet = ps.executeQuery();
            while (rSet.next()){
                T ins = clazz.newInstance();
                Field[] fields = clazz.getDeclaredFields();
                for (Field field:fields){
                    field.setAccessible(true);
                    String name = field.getName();
                    Object value = rSet.getObject(name);
                    field.set(ins,value);
                }
                list.add(ins);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }finally {
            DBClose.closeAll(rSet,ps,conn);
        }
        return list;
    }

    /*
    *   获取总条数
    * */
    public static Integer commonCount(String sql,Object ... args){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rSet = null;
        int count = 0;
        try {
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            for (int i=0;i<args.length;i++){
                if (args[i]!=null){
                    ps.setObject(i+1,args[i]);
                }
            }
            rSet = ps.executeQuery();
            if (rSet.next()){
                count = rSet.getInt("count(1)");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBClose.closeAll(rSet,ps,conn);
        }
        return count;
    }
}
