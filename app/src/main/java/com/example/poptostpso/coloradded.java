package com.example.poptostpso;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

public class coloradded extends AppCompatActivity {
    LinearLayout LR2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coloradded);
        LR2 = findViewById(R.id.lr2);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main,menu);
        menu.add("Black");

        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        String st=item.getTitle().toString();

        if(st.equals("Red")){
            LR2.setBackgroundColor(Color.RED);
        }
        else if(st.equals("Green")){
            LR2.setBackgroundColor(Color.GREEN);
        }
        else if(st.equals("Blue")){
            LR2.setBackgroundColor(Color.BLUE);
        }
        else LR2.setBackgroundColor(Color.BLACK);

        return true;
    }
}
