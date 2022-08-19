package com.example.doancoffe.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.doancoffe.Adapter.Adapter_SanPham;
import com.example.doancoffe.Dao.SanPham_Dao;
import com.example.doancoffe.Mode.SanPham;
import com.example.doancoffe.R;

import java.util.ArrayList;


public class SanPhamFragment extends Fragment {
    private RecyclerView RecySanPham;
    ArrayList<SanPham> list;
    SanPham_Dao sanPham_dao;
    Adapter_SanPham adapter_sanPham;
    SanPham sanPham;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_san_pham, container, false);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecySanPham = (RecyclerView) view.findViewById(R.id.RecySanPham);
        sanPham_dao=new SanPham_Dao(getActivity());
        list=new ArrayList<>();
        list=(ArrayList<SanPham>) sanPham_dao.getall();
        adapter_sanPham =new Adapter_SanPham(getActivity(),this,list);
        RecySanPham.setAdapter(adapter_sanPham);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false);

        RecySanPham.setLayoutManager(linearLayoutManager);


    }
}