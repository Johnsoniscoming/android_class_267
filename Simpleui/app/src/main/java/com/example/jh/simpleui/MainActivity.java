package com.example.jh.simpleui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    ImageView button;
    EditText editText;
    RadioGroup radioGroup;
    CheckBox checkBox;
//    String selectedSex = "Male";
//    String name = "";
//    String sex = "";
    String drinkname = "black tea";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView =(TextView)findViewById(R.id.textView);
        button =(ImageView) findViewById(R.id.button);
        editText =(EditText)findViewById(R.id.editText);
        radioGroup =(RadioGroup)findViewById(R.id.radioGroup);
        checkBox = (CheckBox)findViewById(R.id.checkBox);

        editText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (keyCode == KeyEvent.KEYCODE_ENTER && event.getAction() == KeyEvent.ACTION_DOWN)
                {
                    click(v);
                }
                return true;
            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                if(checkedId == R.id.maleRadioButton){
//                    selectedSex = "Male";
//                }
//                else if(checkedId == R.id.femaleRadioButton){
//                    selectedSex = "Female";
//                }
                RadioButton radioButton =(RadioButton)findViewById(checkedId);
                drinkname =radioButton.getText().toString();
            }
        });

//        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                changeTextView();
//            }
//        });
    }
    public void click(View view){
        String note = editText.getText().toString();
//        sex = selectedSex;
//        changeTextView();
        textView.setText(drinkname);
        editText.setText("");

    }

//    public void changeTextView(){
//        if (name.equals("")){
//            return;
//        }
//        if (checkBox.isChecked())
//        {
//            textView.setText(name);
//        }
//        else
//        {
//            String content = name +"sex:"+sex;
//
//            textView.setText(content);
//        }
//
//    }

}
