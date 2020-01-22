package com.rj.fragmentexam.dynamic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.rj.fragmentexam.R;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Fragment fragment = new Fragment3();

        loadFragment(fragment);
    }

    public void chnageFragment(View view) {

        loadFragment(new Fragment4());
//        getSupportFragmentManager().beginTransaction().replace(R.id.cont,new Fragment4()).commit();
    }

    public void loadFragment(Fragment fragment){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.cont,fragment)
                .addToBackStack(null)
                .commit();
    }

}
