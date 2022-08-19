package com.example.doancoffe.Dao;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.doancoffe.Database.Database;
import com.example.doancoffe.Mode.SanPham;

import java.util.ArrayList;
import java.util.List;

public class SanPham_Dao {
    Database database;
    SQLiteDatabase db;
    public SanPham_Dao(Context context){
        database=new Database(context);
        db=database.getWritableDatabase();
    }


    public List<SanPham> getall(){
        String spl="select * from SanPham";
        return getData(spl);
    }
    public SanPham getId(String id){
        String sql="select * from SanPham where Masp=?";
        List<SanPham> list=getData(sql,id);
        return list.get(0);
    }
    @SuppressLint("Range")
    public  List<SanPham> getData(String sql,String... id){
        List<SanPham>  list=new ArrayList<SanPham>();
        Cursor cursor=db.rawQuery(sql,id);
         while (cursor.moveToNext()){
             SanPham sanPham=new SanPham();
             sanPham.Masp=Integer.parseInt(cursor.getString(cursor.getColumnIndex("Masp")));
             sanPham.HinhSp=cursor.getString(cursor.getColumnIndex("HinhSp"));
             sanPham.TenSP=cursor.getString(cursor.getColumnIndex("TenSP"));
             sanPham.GiaSp=Integer.parseInt(cursor.getString(cursor.getColumnIndex("GiaSp")));
             sanPham.ChiTietSP=cursor.getString(cursor.getColumnIndex("ChiTietSP"));
             list.add(sanPham);
         }

        return list;
    }




}
