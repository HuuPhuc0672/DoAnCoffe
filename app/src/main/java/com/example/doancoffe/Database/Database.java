package com.example.doancoffe.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Database extends SQLiteOpenHelper {

    public Database(@Nullable Context context) {
        super(context, "DoAn", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String splSanPham="CREATE TABLE SanPham("+
                "Masp INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "HinhSp TEXT,"+
                "TenSP TEXT,"+
                "GiaSp INTEGER,"+
                "ChiTietSP TEXT )";
        db.execSQL(splSanPham);
        splSanPham="INSERT INTO SanPham VALUES(NULL,'https://product.hstatic.net/1000075078/product/1659432096_cbf-caramel_a18e440d617942c6915cd32b40885518.jpg','CloudFee Creme Brulee Caramel',49000,'CloudFee Creme Brulee Caramel ngon khó cưỡng bởi lớp kem trứng Creme Brulee bồng bềnh béo mịn, ngọt thanh của Caramel, thêm xíu đắng nhẹ từ cà phê, kèm topping thạch cà phê dai dai giòn giòn.') ";
        db.execSQL(splSanPham);
        splSanPham="INSERT INTO SanPham VALUES(NULL,'https://product.hstatic.net/1000075078/product/1659432079_almond-cm_5cb710177ff649388a82e4288169535e.jpg','CloudFee Creamy Hạnh Nhân Nướng',39000,'Vị đắng của cà phê được dung hòa bởi sự ngọt ngào từ kem sữa, điểm tô chút nhẹ nhàng cùng lớp foam trắng bồng bềnh, quyện lẫn vị hạnh nhân nướng bùi bùi vui miệng, thêm thạch cà phê giòn ngon khó cưỡng. Đây là thức uống đúng gu giúp bạn khởi đầu ngày mới với tinh thần phơi phới.') ";
        db.execSQL(splSanPham);
        splSanPham="INSERT INTO SanPham VALUES(NULL,'https://product.hstatic.net/1000075078/product/1653291204_hi-tea-vai_e356517503e04da3a2334eb7a1d1622f.jpg','Hi Tea Vải',49000,'Chút ngọt ngào của Vải, mix cùng vị chua thanh tao từ trà hoa Hibiscus, mang đến cho bạn thức uống đúng chuẩn vừa ngon, vừa healthy.') ";
        db.execSQL(splSanPham);
        splSanPham="INSERT INTO SanPham VALUES(NULL,'https://product.hstatic.net/1000075078/product/1659428096_hi-tea-pbt_708f0f343e874b04a83b13ce028208d4.jpg','Hi Tea Phúc Bồn Tử Bling Bling',65000,'Nền trà Hibiscus thanh mát, quyện vị chua chua ngọt ngọt của phúc bồn tử 100% tự nhiên cùng quýt mọng nước mang đến cảm giác sảng khoái tức thì. Đặc biệt, bạn đừng bỏ lỡ trải nghiệm “khuấy để thấy trăng” với hiệu ứng bling bling lạ mắt, được làm từ bột nhũ vàng dùng trong thực phẩm.') ";
        db.execSQL(splSanPham);
        splSanPham="INSERT INTO SanPham VALUES(NULL,'https://product.hstatic.net/1000075078/product/1653291164_da-tuyet-dao_34d14b878bf443d8aae6c1509ca73f16.jpg','Hi Tea Đá Tuyết Xoài Đào',55000,'Những miếng đào vàng ươm kết hợp với đá tuyết vị xoài mát lành, cùng nền trà hoa Hibiscus chua dịu đem đến cảm giác lạ miệng, hấp dẫn đến tận ngụm cuối cùng.') ";
        db.execSQL(splSanPham);
        splSanPham="INSERT INTO SanPham VALUES(NULL,'https://product.hstatic.net/1000075078/product/1643102019_mochi-phucbontu_788fedf1ff364817b1805275d051297b.jpg','Mochi Kem Phúc Bồn Tử',20000,'Bao bọc bởi lớp vỏ Mochi dẻo thơm, bên trong là lớp kem lạnh cùng nhân phúc bồn tử ngọt ngào. Gọi 1 chiếc Mochi cho ngày thật tươi mát. Sản phẩm phải bảo quán mát và dùng ngon nhất trong 2h sau khi nhận hàng.') ";
        db.execSQL(splSanPham);
        splSanPham="INSERT INTO SanPham VALUES(NULL,'https://product.hstatic.net/1000075078/product/1655348107_mochi-choco_c5a99086bf0841029667d02b15071d8b.jpg','Mochi Kem Chocolate',19000,'Bao bọc bởi lớp vỏ Mochi dẻo thơm, bên trong là lớp kem lạnh cùng nhân chocolate độc đáo. Gọi 1 chiếc Mochi cho ngày thật tươi mát. Sản phẩm phải bảo quán mát và dùng ngon nhất trong 2h sau khi nhận hàng.') ";
        db.execSQL(splSanPham);
        splSanPham="INSERT INTO SanPham VALUES(NULL,'https://product.hstatic.net/1000075078/product/1655348113_mochi-traxanh_4cfb52685fbd4b1e8c669f547c4cb048.jpg','Mochi Kem Matcha',19000,'Bao bọc bởi lớp vỏ Mochi dẻo thơm, bên trong là lớp kem lạnh cùng nhân trà xanh đậm vị. Gọi 1 chiếc Mochi cho ngày thật tươi mát. Sản phẩm phải bảo quán mát và dùng ngon nhất trong 2h sau khi nhận hàng.') ";
        db.execSQL(splSanPham);
        splSanPham="INSERT INTO SanPham VALUES(NULL,'https://product.hstatic.net/1000075078/product/1643101968_mochi-xoai_5de4e0ede9cf4c39be76ba5efb85abbf.jpg','Mochi Kem Xoài',19000,'Bao bọc bởi lớp vỏ Mochi dẻo thơm, bên trong là lớp kem lạnh cùng nhân xoài chua chua ngọt ngọt. Gọi 1 chiếc Mochi cho ngày thật tươi mát. Sản phẩm phải bảo quán mát và dùng ngon nhất trong 2h sau khi nhận hàng.') ";
        db.execSQL(splSanPham);
        splSanPham="INSERT INTO SanPham VALUES(NULL,'https://product.hstatic.net/1000075078/product/croissant-trung-muoi_880850_d72f0a8c93ae469a932244d5b3f28048.jpg','Croissant trứng muối',35000,'Croissant trứng muối thơm lừng, bên ngoài vỏ bánh giòn hấp dẫn bên trong trứng muối vị ngon khó cưỡng.') ";
        db.execSQL(splSanPham);
        splSanPham="INSERT INTO SanPham VALUES(NULL,'https://product.hstatic.net/1000075078/product/1645980550_cha-bong-pho-mai-2_7ec48972d72b43698a42b454e7ff5eb9.jpg','Chà Bông Phô Mai',32000,'Chiếc bánh với lớp phô mai vàng sánh mịn bên trong, được bọc ngoài lớp vỏ xốp mềm thơm lừng. Thêm lớp chà bông mằn mặn hấp dẫn bên trên.') ";
        db.execSQL(splSanPham);





        String splGioHang="CREATE TABLE GioHang("+
                "Magh INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "Soluong INTEGER,"+
                "TongTien INTEGER,"+
                "Masp INTEGER REFERENCES SanPham(Masp))";
        db.execSQL(splGioHang);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop table if exists SanPham");
        db.execSQL("drop table if exists GioHang");


    }
}
