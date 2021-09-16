package com.example.voteasy;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class adminLoginAdapter extends FragmentPagerAdapter {
    private Context context;
    int totalTabs;
    public adminLoginAdapter(FragmentManager fm,Context context ,int totalTabs){
        super(fm);
        this.context = context;
        this.totalTabs = totalTabs;
    }

    @Override
    public int getCount() {
        return totalTabs;
    }

    public  Fragment getItem(int postion ){
        switch (postion){
            case 0:
                adminLoginTabFragment adminlogintabfragment = new adminLoginTabFragment();
                return adminlogintabfragment;
            case 1:
                adminSignupTabFragment adminsignuptabfragment = new adminSignupTabFragment();
                return  adminsignuptabfragment;
            default:
                return  null;
        }
    }
}
