package com.example.doancoffe.Mode;

public class GioHang {
    int Magh;
    int Masp;
    int Soluong;
    int TongTien;

    public GioHang(int magh, int masp, int soluong, int tongTien) {
        Magh = magh;
        Masp = masp;
        Soluong = soluong;
        TongTien = tongTien;
    }

    public GioHang() {
    }

    public int getMagh() {
        return Magh;
    }

    public void setMagh(int magh) {
        Magh = magh;
    }

    public int getMasp() {
        return Masp;
    }

    public void setMasp(int masp) {
        Masp = masp;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int soluong) {
        Soluong = soluong;
    }

    public int getTongTien() {
        return TongTien;
    }

    public void setTongTien(int tongTien) {
        TongTien = tongTien;
    }
}
