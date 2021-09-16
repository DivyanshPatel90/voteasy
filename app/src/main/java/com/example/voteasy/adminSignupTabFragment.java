package com.example.voteasy;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.voteasy.R;

public class adminSignupTabFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater , ViewGroup container , Bundle savedInstanceState){
        ViewGroup roo = (ViewGroup) inflater.inflate(R.layout.admin_signup_fragment,container,false);
        return  roo;
    }
}
