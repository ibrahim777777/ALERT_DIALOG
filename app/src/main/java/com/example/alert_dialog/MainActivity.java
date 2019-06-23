package com.example.alert_dialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText enter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enter=findViewById(R.id.enter);

    }

    public void clear(View view) {
        final AlertDialog.Builder ff=new AlertDialog.Builder(this);
        ff.setMessage("are you sure to delete this message");
       ff. setTitle("delete words");
       ff.setIcon(R.drawable.ic_launcher_background);
        ff.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                enter.setText(null);
            }

        });
        ff.setNegativeButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        ff.show();

    }
}
