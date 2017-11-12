package com.example.anisha.flames;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
EditText name1,name2;
    Button button;
    //public static ArrayList<String> n1=new ArrayList<String>();
   // String n1[];
    //public static ArrayList<String> n2=new ArrayList<String>();
   // String n2[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name1=(EditText)findViewById(R.id.name1);
        //final String txt1=name1.getText().toString();
        name2=(EditText)findViewById(R.id.name2);
        //final String txt2=name2.getText().toString();
        button=(Button)findViewById(R.id.button);
        //button.setOnClickListener(new View.OnClickListener() {
          //  @Override
            //public void onClick(View v) {
              //  if((name1.getText().length()!=0)&&(name2.getText().length()!=0))
                //{
                  //  n1.add(txt1);
                  //  n2.add(txt2);

                //}

                //Toast.makeText(MainActivity.this, txt1.toString(), Toast.LENGTH_SHORT).show();
                //Toast.makeText(MainActivity.this, txt2.toString(), Toast.LENGTH_SHORT).show();
            }//
        //});

    }
}
