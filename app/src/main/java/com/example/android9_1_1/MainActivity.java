package com.example.android9_1_1;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = ( Button )findViewById( R.id.button );
        button.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View view )
            {
                AlertDialog.Builder dialog = new AlertDialog.Builder( MainActivity.this );

                dialog.setTitle("Alart Dialog OK");
                dialog.setMessage("ボタンをクリック");
//              dialog.setIcon( R.drawable.ic_launcher );

                //  Positiveボタン
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick( DialogInterface dialog, int which )
                    {
                        TextView textView = ( TextView )findViewById( R.id.textView );
                        textView.setText("OK Click");
                    }
                });
                //  Neutralボタン
                dialog.setNeutralButton("NEUTRAL", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick( DialogInterface dialog, int which )
                    {
                        TextView textView = ( TextView )findViewById( R.id.textView );
                        textView.setText("NEUTRAL Click");
                    }
                });
                //  Negativeボタン
                dialog.setNegativeButton("NG", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick( DialogInterface dialog, int which )
                    {
                        TextView textView = ( TextView )findViewById( R.id.textView );
                        textView.setText("NG Click");
                    }
                });

                dialog.show();
            }
        });
    }
}
