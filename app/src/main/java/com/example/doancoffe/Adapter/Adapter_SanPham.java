package com.example.doancoffe.Adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.doancoffe.Dao.SanPham_Dao;
import com.example.doancoffe.Fragment.ChiTietSP;
import com.example.doancoffe.Fragment.HomeFragment;
import com.example.doancoffe.Fragment.SanPhamFragment;
import com.example.doancoffe.Mode.SanPham;
import com.example.doancoffe.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Adapter_SanPham extends RecyclerView.Adapter<Adapter_SanPham.SamPhamHolder> {
    Context context;
    SanPhamFragment sanPhamFragment;
    ArrayList<SanPham> list;


    public Adapter_SanPham(@NonNull Context context,SanPhamFragment sanPhamFragment,ArrayList<SanPham> sanPhams){
        this.sanPhamFragment= sanPhamFragment;
        this.context=context;
        this.list=sanPhams;
    }


    @NonNull
    @Override
    public SamPhamHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sam_pham,parent,false);
        return new SamPhamHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SamPhamHolder holder, int position) {
        SanPham sanPham=list.get(position);
        holder.txtTenSP.setText(""+sanPham.getTenSP());
        holder.txtGiaSP.setText("Giá : "+sanPham.getGiaSp()+" đ");
        Picasso.get().load(sanPham.getHinhSp()).
                placeholder(R.drawable.ic_launcher_background).
                error(R.drawable.ic_launcher_background).
                into(holder.iViewAnh);
        holder.cardViewsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickXemDuLieu2(sanPham);
            }
        });
    }
    private void onClickXemDuLieu2(SanPham sanPham) {
        Intent intent=new Intent(context, ChiTietSP.class);
        Bundle bundle=new Bundle();
        bundle.putSerializable("object_Dulieu",sanPham);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class SamPhamHolder extends RecyclerView.ViewHolder{
        private ImageView iViewAnh;
        private TextView txtTenSP;
        private TextView txtGiaSP;
        private CardView cardViewsp;
        public SamPhamHolder(@NonNull View itemView) {
            super(itemView);


            cardViewsp = (CardView) itemView.findViewById(R.id.cardViewsp);
            iViewAnh = (ImageView) itemView.findViewById(R.id.iViewAnh);
            txtTenSP = (TextView) itemView.findViewById(R.id.txtTenSP);
            txtGiaSP = (TextView) itemView.findViewById(R.id.txtGiaSP);
        }
    }
}
