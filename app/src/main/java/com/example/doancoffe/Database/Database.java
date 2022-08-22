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
        splSanPham="INSERT INTO SanPham VALUES(NULL,'https://product.hstatic.net/1000075078/product/1659432079_almond-cm_5cb710177ff649388a82e4288169535e.jpg','CloudFee Creamy Hạnh Nhân Nướng',39000,'Vị đắng của cà phê được dung hòa bởi sự ngọt ngào từ kem sữa, điểm tô chút nhẹ nhàng cùng lớp foam trắng bồng bềnh, quyện lẫn vị hạnh nhân nướng bùi bùi vui miệng, thêm thạch cà phê giòn ngon khó cưỡng. Đây là thức uống đúng gu giúp bạn khởi đầu ngày mới với tinh thần phơi phới.') ";
        db.execSQL(splSanPham);
        splSanPham="INSERT INTO SanPham VALUES(NULL,'https://product.hstatic.net/1000075078/product/1643102019_mochi-phucbontu_788fedf1ff364817b1805275d051297b.jpg','Mochi Kem Phúc Bồn Tử',20000,'Bao bọc bởi lớp vỏ Mochi dẻo thơm, bên trong là lớp kem lạnh cùng nhân phúc bồn tử ngọt ngào. Gọi 1 chiếc Mochi cho ngày thật tươi mát. Sản phẩm phải bảo quán mát và dùng ngon nhất trong 2h sau khi nhận hàng.') ";
        db.execSQL(splSanPham);
        splSanPham="INSERT INTO SanPham VALUES(NULL,'https://product.hstatic.net/1000075078/product/1659432096_cbf-caramel_a18e440d617942c6915cd32b40885518.jpg','CloudFee Creme Brulee Caramel',49000,'CloudFee Creme Brulee Caramel ngon khó cưỡng bởi lớp kem trứng Creme Brulee bồng bềnh béo mịn, ngọt thanh của Caramel, thêm xíu đắng nhẹ từ cà phê, kèm topping thạch cà phê dai dai giòn giòn.') ";
        db.execSQL(splSanPham);
        splSanPham="INSERT INTO SanPham VALUES(NULL,'https://product.hstatic.net/1000075078/product/1645980550_cha-bong-pho-mai-2_7ec48972d72b43698a42b454e7ff5eb9.jpg','Chà Bông Phô Mai',32000,'Chiếc bánh với lớp phô mai vàng sánh mịn bên trong, được bọc ngoài lớp vỏ xốp mềm thơm lừng. Thêm lớp chà bông mằn mặn hấp dẫn bên trên.') ";
        db.execSQL(splSanPham);
        splSanPham="INSERT INTO SanPham VALUES(NULL,'https://product.hstatic.net/1000075078/product/1638170137_tiramisu_566242eeef0d4aeabce98bd3e639b8dc.jpg','Mousse Tiramisu',23000,'Hương vị dễ ghiền được tạo nên bởi chút đắng nhẹ của cà phê, lớp kem trứng béo ngọt dịu hấp dẫn.') ";
        db.execSQL(splSanPham);
        splSanPham="INSERT INTO SanPham VALUES(NULL,'https://product.hstatic.net/1000075078/product/1653291204_hi-tea-vai_e356517503e04da3a2334eb7a1d1622f.jpg','Hi Tea Vải',49000,'Chút ngọt ngào của Vải, mix cùng vị chua thanh tao từ trà hoa Hibiscus, mang đến cho bạn thức uống đúng chuẩn vừa ngon, vừa healthy.') ";
        db.execSQL(splSanPham);
        splSanPham="INSERT INTO SanPham VALUES(NULL,'https://product.hstatic.net/1000075078/product/1655348113_mochi-traxanh_4cfb52685fbd4b1e8c669f547c4cb048.jpg','Mochi Kem Matcha',19000,'Bao bọc bởi lớp vỏ Mochi dẻo thơm, bên trong là lớp kem lạnh cùng nhân trà xanh đậm vị. Gọi 1 chiếc Mochi cho ngày thật tươi mát. Sản phẩm phải bảo quán mát và dùng ngon nhất trong 2h sau khi nhận hàng.') ";
        db.execSQL(splSanPham);
        splSanPham="INSERT INTO SanPham VALUES(NULL,'https://product.hstatic.net/1000075078/product/1653291185_hi-tea-dao_8e46fb89077e47628a318e081a13f593.jpg','Hi Tea Đào',49000,'Sự kết hợp ăn ý giữa Đào cùng trà hoa Hibiscus, tạo nên tổng thể hài hoà dễ gây “thương nhớ” cho team thích món thanh mát, có vị chua nhẹ.') ";
        db.execSQL(splSanPham);
        splSanPham="INSERT INTO SanPham VALUES(NULL,'https://product.hstatic.net/1000075078/product/1655348107_mochi-choco_c5a99086bf0841029667d02b15071d8b.jpg','Mochi Kem Chocolate',19000,'Bao bọc bởi lớp vỏ Mochi dẻo thơm, bên trong là lớp kem lạnh cùng nhân chocolate độc đáo. Gọi 1 chiếc Mochi cho ngày thật tươi mát. Sản phẩm phải bảo quán mát và dùng ngon nhất trong 2h sau khi nhận hàng.') ";
        db.execSQL(splSanPham);
        splSanPham="INSERT INTO SanPham VALUES(NULL,'https://product.hstatic.net/1000075078/product/1659428096_hi-tea-pbt_708f0f343e874b04a83b13ce028208d4.jpg','Hi Tea Phúc Bồn Tử Bling Bling',65000,'Nền trà Hibiscus thanh mát, quyện vị chua chua ngọt ngọt của phúc bồn tử 100% tự nhiên cùng quýt mọng nước mang đến cảm giác sảng khoái tức thì. Đặc biệt, bạn đừng bỏ lỡ trải nghiệm “khuấy để thấy trăng” với hiệu ứng bling bling lạ mắt, được làm từ bột nhũ vàng dùng trong thực phẩm.') ";
        db.execSQL(splSanPham);
        splSanPham="INSERT INTO SanPham VALUES(NULL,'https://product.hstatic.net/1000075078/product/1638170066_gau_9a32e5ca16ec46baa1d2696935fe7d89.jpg','Mousse Gấu Chocolate',36000,'Với vẻ ngoài đáng yêu và hương vị ngọt ngào, thơm béo nhất định bạn phải thử ít nhất 1 lần.') ";
        db.execSQL(splSanPham);
        splSanPham="INSERT INTO SanPham VALUES(NULL,'https://product.hstatic.net/1000075078/product/1643101968_mochi-xoai_5de4e0ede9cf4c39be76ba5efb85abbf.jpg','Mochi Kem Xoài',19000,'Bao bọc bởi lớp vỏ Mochi dẻo thơm, bên trong là lớp kem lạnh cùng nhân xoài chua chua ngọt ngọt. Gọi 1 chiếc Mochi cho ngày thật tươi mát. Sản phẩm phải bảo quán mát và dùng ngon nhất trong 2h sau khi nhận hàng.') ";
        db.execSQL(splSanPham);
        splSanPham="INSERT INTO SanPham VALUES(NULL,'https://product.hstatic.net/1000075078/product/5dd2087ff2546c2614fb08d1_red-velvet_087977_188c6186d48346cbaf2511d0fce5ad3f.jpg','\n" +
                "\n" +
                "Mousse Red Velvet',29000,'Bánh nhiều lớp được phủ lớp kem bên trên bằng Cream cheese.') ";
        db.execSQL(splSanPham);
        splSanPham="INSERT INTO SanPham VALUES(NULL,'https://product.hstatic.net/1000075078/product/1653291164_da-tuyet-dao_34d14b878bf443d8aae6c1509ca73f16.jpg','Hi Tea Đá Tuyết Xoài Đào',55000,'Những miếng đào vàng ươm kết hợp với đá tuyết vị xoài mát lành, cùng nền trà hoa Hibiscus chua dịu đem đến cảm giác lạ miệng, hấp dẫn đến tận ngụm cuối cùng.') ";
        db.execSQL(splSanPham);
        splSanPham="INSERT INTO SanPham VALUES(NULL,'https://product.hstatic.net/1000075078/product/croissant-trung-muoi_880850_d72f0a8c93ae469a932244d5b3f28048.jpg','Croissant trứng muối',35000,'Croissant trứng muối thơm lừng, bên ngoài vỏ bánh giòn hấp dẫn bên trong trứng muối vị ngon khó cưỡng.') ";
        db.execSQL(splSanPham);
        splSanPham="INSERT INTO SanPham VALUES(NULL,'https://product.hstatic.net/1000075078/product/kho-ga-la-chanh_995862_c1738b567d8a4c098a9c6c7f1365d289.jpg','Gà Xé Lá Chanh',25000,'Thịt gà được xé tơi, mang hương vị mặn, ngọt, cay cay quyện nhau vừa chuẩn, thêm chút thơm thơm thơm từ lá chanh sấy khô giòn giòn xua tan ngay cơn buồn miệng.') ";
        db.execSQL(splSanPham);
        splSanPham="INSERT INTO SanPham VALUES(NULL,'https://product.hstatic.net/1000075078/product/mit-say_666228_59524ede8da045fd9ea6da6fd486e4ab.jpg','\n" +
                "\n" +
                "Mít Sấy',20000,'Mít sấy khô vàng ươm, giòn rụm, giữ nguyên được vị ngọt lịm của mít tươi.') ";
        db.execSQL(splSanPham);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop table if exists SanPham");



    }
}
