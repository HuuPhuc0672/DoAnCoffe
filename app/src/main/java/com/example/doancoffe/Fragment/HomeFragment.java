package com.example.doancoffe.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.doancoffe.Adapter.Adapter_Hot;
import com.example.doancoffe.Dao.SanPham_Dao;
import com.example.doancoffe.Mode.SanPham;
import com.example.doancoffe.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private ImageSlider sildeImage;
    private RecyclerView reViewSpH;
    ArrayList<SanPham> list;
    SanPham_Dao sanPham_dao;
    Adapter_Hot adapter_hot;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        sildeImage = (ImageSlider) view.findViewById(R.id.sildeImage);
        ArrayList<SlideModel> models=new ArrayList<>();
        models.add(new SlideModel(R.drawable.silde1,null));
        models.add(new SlideModel(R.drawable.silde2,null));
        models.add(new SlideModel(R.drawable.silde3,null));
        models.add(new SlideModel(R.drawable.silde4,null));
        sildeImage.setImageList(models, ScaleTypes.CENTER_CROP);

        reViewSpH = (RecyclerView) view.findViewById(R.id.reViewSpH);
        sanPham_dao=new SanPham_Dao(getActivity());
        list=new ArrayList<>();
        list=(ArrayList<SanPham>) sanPham_dao.getall();
        adapter_hot=new Adapter_Hot(getActivity(),this,list);
        reViewSpH.setHasFixedSize(true);
        reViewSpH.setLayoutManager(new GridLayoutManager(getActivity(),2));
        reViewSpH.setAdapter(adapter_hot);
        sanPham_dao=new SanPham_Dao(getActivity());



    }
}