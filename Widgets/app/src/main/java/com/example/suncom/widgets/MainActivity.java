package com.example.suncom.widgets;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends Activity implements View.OnClickListener, RadioGroup.OnCheckedChangeListener  {


    ImageButton imgButton;
    TextView txtEvents;
    CheckBox chk;
    RadioGroup rg;
    ToggleButton tgbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        imgButton=(ImageButton)findViewById(R.id.imgButton);
        txtEvents= (TextView)findViewById(R.id.txtEvents);
        chk=(CheckBox) findViewById(R.id.chk);
        rg=(RadioGroup)findViewById(R.id.rg);
        tgbtn=(ToggleButton) findViewById(R.id.tgbtn);
        imgButton.setOnClickListener(this);
        chk.setOnClickListener(this);
        tgbtn.setOnClickListener(this);
        rg.setOnCheckedChangeListener(this);

    }

    @Override
    public void onClick(View view) {

           if (view ==imgButton)
           {
               txtEvents.setText("Image clicked");
           }
           else if(view == chk)
           {
               if(chk.isChecked()==true)
               {

                   txtEvents.setText("checked");
               }
               else
               {

                   txtEvents.setText("Unchecked");
               }

           }
           else if(view == tgbtn)
           {
                    if(tgbtn.isChecked()==true)
                    {

                        txtEvents.setText(" toggle ON");
                    }
                    else

                    {

                        txtEvents.setText(" toggle OFF");
                    }

           }

    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {


        switch (i)
        {

            case R.id.rd1:
                txtEvents.setText(" Radio 1");
                break;
            case R.id.rd2:
                txtEvents.setText(" Radio 2");
                break;
            case R.id.rd3:
                txtEvents.setText("Radio 3");
                break;





        }

    }
}
