package com.code4casue.myapplicationsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/*
    developed by aravinthan..
 */
public class MainActivity extends AppCompatActivity {


    //DECLARING VIEWS.
    Button btnDrawOne;
    TextView txtViewOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDrawOne = (Button) findViewById(R.id.btnDrawShspes); btnDrawOne.setText("Draw Shapes");
        txtViewOne = (TextView) findViewById(R.id.txtHelloWorld); txtViewOne.setText("Welcome Aravinthan");
        btnDrawOne.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        disp_ToastMsg(btnDrawOne.getText().toString());
                    }
                }
        );


    }

    public void disp_ToastMsg(String viewName){

        Toast.makeText(this , "clicked "+viewName, Toast.LENGTH_SHORT).show();
    }
}
