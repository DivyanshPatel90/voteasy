package com.example.voteasy;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.voteasy.R;

public class userLoginTabFragment extends Fragment {

    float v = 0;
    TextView userEmail;
    TextView password;
    TextView forgotpassword;
    Button  loginbutton;


    public View onCreateView(LayoutInflater inflater , ViewGroup container , Bundle savedInstanceState){
        ViewGroup root  = (ViewGroup) inflater.inflate(R.layout.user_login_fragment,container,false);

         userEmail =  root.findViewById(R.id.userEmail);
         password  =  root.findViewById(R.id.userloginPassword);
         loginbutton = root.findViewById(R.id.userloginbtn);
         forgotpassword = root.findViewById(R.id.forgot_password);

         userEmail.setTranslationY(300);
         password.setTranslationY(300);
         forgotpassword.setTranslationY(300);
         loginbutton.setTranslationY(300);


        userEmail.setAlpha(v);
        password.setAlpha(v);
        forgotpassword.setAlpha(v);
        loginbutton.setAlpha(v);

        userEmail.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        password.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        forgotpassword.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        loginbutton.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();


        return  root;
    }
}
