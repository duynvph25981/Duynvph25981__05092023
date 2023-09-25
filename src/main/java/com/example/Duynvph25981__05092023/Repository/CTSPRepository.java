package com.example.Duynvph25981__05092023.Repository;

import com.example.Duynvph25981__05092023.Entity.ChiTietSanPham;
import com.example.Duynvph25981__05092023.Util.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;

public class CTSPRepository {
    public ArrayList<ChiTietSanPham> getAll(){
        ArrayList<ChiTietSanPham> list = new ArrayList<>();
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            list = (ArrayList<ChiTietSanPham>) session.createQuery("from ChiTietSanPham ").list();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return list;
    }
    public ChiTietSanPham getById(String id){
        ChiTietSanPham ctsp = new ChiTietSanPham();
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            ctsp = session.get(ChiTietSanPham.class,id);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return ctsp;
    }
    public Boolean delete(ChiTietSanPham ctsp){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            transaction = session.beginTransaction();
            session.delete(ctsp);
            transaction.commit();
            return true;
        }catch (Exception ex){
            ex.printStackTrace();
            return false;
        }
    }
    public Boolean add(ChiTietSanPham ctsp){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getFACTORY().openSession()){
            transaction = session.beginTransaction();
            session.persist(ctsp);
            transaction.commit();
            return true;
        }catch (Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(new CTSPRepository().getAll().size());
        System.out.println(new CTSPRepository().getById("65ed8d2d-1623-446c-bf34-2c99fa6774fb"));
        System.out.println(new CTSPRepository().delete(new ChiTietSanPham("65ed8d2d-1623-446c-bf34-2c99fa6774fb")));
    }
}
