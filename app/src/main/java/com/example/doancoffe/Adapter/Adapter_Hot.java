package com.example.doancoffe.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.doancoffe.Dao.SanPham_Dao;
import com.example.doancoffe.Fragment.HomeFragment;
import com.example.doancoffe.Fragment.SanPhamFragment;
import com.example.doancoffe.Mode.SanPham;
import com.example.doancoffe.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Adapter_Hot extends RecyclerView.Adapter<Adapter_Hot.Hotholder>{

    Context context;
    HomeFragment homeFragment;
    ArrayList<SanPham> list;

    public Adapter_Hot(@NonNull Context context, HomeFragment homeFragment, ArrayList<SanPham> sanPhams){
        this.homeFragment= homeFragment;
        this.context=context;
        this.list=sanPhams;
    }

    @NonNull
    @Override
    public Hotholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hot,parent,false);
        return new Hotholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Hotholder holder, int position) {
        SanPham sanPham=list.get(position);
        holder.txtTenSPh.setText(""+sanPham.getTenSP());
        holder.txtGiaSPh.setText("Giá : "+sanPham.getGiaSp()+" đ");
        Picasso.get().load(sanPham.getHinhSp()).
                placeholder(R.drawable.ic_launcher_background).
                error(R.drawable.ic_launcher_background).
                into(holder.iViewAnhH);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Hotholder extends RecyclerView.ViewHolder{
        private ImageView iViewAnhH;
        private TextView txtGiaSPh;
        private TextView txtTenSPh;
        public Hotholder(@NonNull View itemView) {
            super(itemView);
            iViewAnhH = (ImageView) itemView.findViewById(R.id.iViewAnhH);
            txtGiaSPh = (TextView) itemView.findViewById(R.id.txtGiaSPh);
            txtTenSPh = (TextView) itemView.findViewById(R.id.txtTenSPh);
        }
    }

}
