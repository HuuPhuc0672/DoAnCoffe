package com.example.doancoffe.Mode;

public class SanPham {
    public int Masp;
    public String HinhSp;
    public String TenSP;
    public int GiaSp;
    public String ChiTietSP;

    public SanPham() {
    }

    public SanPham(int masp, String hinhSp, String tenSP, int giaSp, String chiTietSP) {
        Masp = masp;
        HinhSp = hinhSp;
        TenSP = tenSP;
        GiaSp = giaSp;
        ChiTietSP = chiTietSP;
    }

    public int getMasp() {
        return Masp;
    }

    public void setMasp(int masp) {
        Masp = masp;
    }

    public String getHinhSp() {
        return HinhSp;
    }

    public void setHinhSp(String hinhSp) {
        HinhSp = hinhSp;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String tenSP) {
        TenSP = tenSP;
    }

    public int getGiaSp() {
        return GiaSp;
    }

    public void setGiaSp(int giaSp) {
        GiaSp = giaSp;
    }

    public String getChiTietSP() {
        return ChiTietSP;
    }

    public void setChiTietSP(String chiTietSP) {
        ChiTietSP = chiTietSP;
    }
}
