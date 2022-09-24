package com.example.lost_found;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class MainActivity3 extends AppCompatActivity {

   private EditText name,phone,objName,date;
   Button button;

   private FirebaseDatabase db= FirebaseDatabase.getInstance();
   private DatabaseReference root=db.getReference().child("object");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        name=findViewById(R.id.editTextName);
        phone=findViewById(R.id.editTextPhone);
        objName=findViewById(R.id.editTextObjectName);
        date=findViewById(R.id.editTextDate);
        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nme=name.getText().toString();
                String phn=phone.getText().toString();
                String objNme=objName.getText().toString();
                String dte=date.getText().toString();

                HashMap<String,String> userMap=new HashMap<>();
                userMap.put("name",nme);
                userMap.put("phone",phn);
                userMap.put("objName",objNme);
                userMap.put("date",dte);

                root.push().setValue(userMap);
            }
        });


    }
}