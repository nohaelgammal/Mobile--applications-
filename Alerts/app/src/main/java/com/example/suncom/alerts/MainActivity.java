package com.example.suncom.alerts;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {


    Button btntoast,btndialog,btnnotify;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        btntoast=(Button)findViewById(R.id.btntoast);
        btndialog=(Button)findViewById(R.id.btndialog);
        btnnotify=(Button)findViewById(R.id.btnnotify);

        btntoast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast T=Toast.makeText(MainActivity.this,"hello in toast",Toast.LENGTH_LONG);
                T.setGravity(Gravity.TOP,0,0);
                T.show();
            }
        });

        btndialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("welcome ya a7la user");
                dialog.setMessage("are you happy?");
                dialog.setIcon(R.drawable.ic_launcher_background);
                dialog.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.d("NegativeButton","Yes");

                    }
                });

                dialog.setPositiveButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {


                        Log.d("setPositiveButton","NO");
                    }
                });
                dialog.show();

            }

        });






}


}
