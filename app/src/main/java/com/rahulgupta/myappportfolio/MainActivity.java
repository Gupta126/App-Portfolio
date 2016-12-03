package com.rahulgupta.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {

        switch (view.getId()){

            case R.id.btn_stock_hawk:
                toastMessage(getString(R.string.stock_hawk));
                break;
            case R.id.btn_build_it_bigger:
                toastMessage(getString(R.string.build_it_bigger));
                break;

            case R.id.btn_capstone:
                toastMessage(getString(R.string.capstone_my_own_app));
                break;

            case R.id.btn_go_ubiquitous:
                toastMessage(getString(R.string.go_ubiquitous));
                break;

            case R.id.btn_make_your_app_material:
                toastMessage(getString(R.string.make_your_app_material));
                break;

            case R.id.btn_popular_movie:
                toastMessage(getString(R.string.popular_movies));
                break;
        }




    }

    private void toastMessage(String project_name) {
        String message = "This button will launch my " + project_name +" project";
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();

    }
}
