package com.example.doancoffe.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.doancoffe.Fragment.SanPhamFragment;
import com.example.doancoffe.Fragment.GioHangFragment;
import com.example.doancoffe.Fragment.HomeFragment;

public class Adapter_Layout extends FragmentStateAdapter {
    public Adapter_Layout(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return  new HomeFragment();
            case 1:
                return  new SanPhamFragment();
            case 2:
                return  new GioHangFragment();
            default:
                return  new HomeFragment();

        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
