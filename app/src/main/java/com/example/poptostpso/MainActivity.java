package com.example.poptostpso;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout LR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LR = findViewById(R.id.lr);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        String st=item.getTitle().toString();

        if(st.equals("Red")){
            LR.setBackgroundColor(Color.RED);
        }
        else if(st.equals("Green")){
            LR.setBackgroundColor(Color.GREEN);
        }
        else LR.setBackgroundColor(Color.BLUE);

        return true;
    }

    public void nextact(View view) {
        Intent t1 = new Intent(this,coloradded.class);
        startActivity(t1);
    }
}
