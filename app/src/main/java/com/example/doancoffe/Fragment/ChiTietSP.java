package com.example.doancoffe.Fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.doancoffe.Dao.SanPham_Dao;
import com.example.doancoffe.Mode.SanPham;
import com.example.doancoffe.R;
import com.squareup.picasso.Picasso;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class ChiTietSP extends AppCompatActivity {

    private ImageView iViewAnhC;
    private TextView txtTenSPC;
    private TextView txtGiaSPC;
    private TextView txtCchiSPC;
    private TextView btnDonHang;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet_sp);
        iViewAnhC = (ImageView) findViewById(R.id.iViewAnhC);
        txtTenSPC = (TextView) findViewById(R.id.txtTenSPC);
        txtGiaSPC = (TextView) findViewById(R.id.txtGiaSPC);
        txtCchiSPC = (TextView) findViewById(R.id.txtCchiSPC);
        btnDonHang = (TextView) findViewById(R.id.btnDonHang);


        Bundle bundle=getIntent().getExtras();
        SanPham sanPham= (SanPham) bundle.get("object_Dulieu");
        txtTenSPC.setText(sanPham.getTenSP());
        Picasso.get().load(sanPham.getHinhSp()).into(iViewAnhC);
        DecimalFormat decimalFormat = new DecimalFormat("###,###,###");
        txtGiaSPC.setText(decimalFormat.format(sanPham.getGiaSp()));
        txtCchiSPC.setText(sanPham.getChiTietSP());

        btnDonHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               DiaChi(Gravity.CENTER);

            }
        });



    }

    private void DiaChi( int gravity){
        Dialog dialog=new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.tao_don_hang);

        EditText edTxtDonhang = (EditText) dialog.findViewById(R.id.edTxt_Donhang);
        Button btnhuy = (Button) dialog.findViewById(R.id.btnhuy);
        Button btnThem = (Button) dialog.findViewById(R.id.btn_Them);


        dialog.show();
        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edTxtDonhang.getText().toString().equals("")){
                    Toast.makeText(ChiTietSP.this, "Vui lòng nhập địa chỉ ", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(ChiTietSP.this, "Đơn hàng đang được giao đi.", Toast.LENGTH_SHORT).show();
                    dialog.dismiss();
                }

            }
        });
        btnhuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               dialog.dismiss();
            }
        });


    }

}