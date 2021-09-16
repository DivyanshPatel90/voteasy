package com.example.voteasy;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.voteasy.R;

public class adminLoginTabFragment extends Fragment {

    float v = 0;
    TextView adminEmail;
    TextView password;
    TextView forgotpassword;
    Button adminbutton;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.admin_login_fragment, container, false);

        adminEmail = root.findViewById(R.id.adminEmail);
        password = root.findViewById(R.id.adminloginPassword);
        adminbutton = root.findViewById(R.id.adminloginbtn);
        forgotpassword = root.findViewById(R.id.forgot_password);

        adminEmail.setTranslationY(300);
        password.setTranslationY(300);
        forgotpassword.setTranslationY(300);
        adminbutton.setTranslationY(300);


        adminEmail.setAlpha(v);
        password.setAlpha(v);
        forgotpassword.setAlpha(v);
        adminbutton.setAlpha(v);

        adminEmail.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        password.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        forgotpassword.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        adminbutton.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();


        return root;
    }
}