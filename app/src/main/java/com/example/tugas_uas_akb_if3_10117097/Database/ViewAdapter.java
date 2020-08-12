package com.example.tugas_uas_akb_if3_10117097.Database;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;


/** NIM : 10117097
 * Nama : Imam Jati Permana
 * Kelas : IF-3
 * Tanggal : 09-08-2020**/

public class ViewAdapter extends FragmentPagerAdapter {
    public final List<Fragment> mFragmentList = new ArrayList<>();

    public ViewAdapter(FragmentManager manager){
        super(manager);
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    public void addFragment(Fragment fragment){
        mFragmentList.add(fragment);
    }
}
