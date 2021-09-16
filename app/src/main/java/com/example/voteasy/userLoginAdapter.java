package com.example.voteasy;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class userLoginAdapter extends FragmentPagerAdapter {
    private Context context;
    int totalTabs;
    public userLoginAdapter(FragmentManager fm,Context context ,int totalTabs){
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
                userLoginTabFragment userlogintabfragment = new userLoginTabFragment();
                return userlogintabfragment;
            case 1:
                userSignupTabFragment usersignuptabfragment = new userSignupTabFragment();
                return  usersignuptabfragment;
            default:
                return  null;
        }
    }
}
