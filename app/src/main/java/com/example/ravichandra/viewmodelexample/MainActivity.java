package com.example.ravichandra.viewmodelexample;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
      TextView text;
    Button btn;
     SampleViewModel model;
    EditText edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        model = ViewModelProviders.of(this).get(SampleViewModel.class);
        text=(TextView)findViewById(R.id.text);
        edit=(EditText)findViewById(R.id.edit);
        edit.setText(model.getEditstr());
        edit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
            model.setEditstr(editable.toString());

            }
        });
        btn=(Button)findViewById(R.id.btn);

        text.setText(model.getCount()+"");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                model.setCount(model.getCount()+1);
                text.setText(model.getCount()+"");
            }
        });
    }
}
