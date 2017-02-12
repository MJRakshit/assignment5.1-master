package com.example.monojit.optionmenu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtView=(TextView)findViewById(R.id.textView);
        getSupportActionBar();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.option_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.red:
                txtView.setBackgroundColor(Color.RED);
                break;
            case R.id.blue:
                txtView.setBackgroundColor(Color.BLUE);
                break;
            case R.id.green:
                txtView.setBackgroundColor(Color.GREEN);
                break;
            case R.id.yellow:
                txtView.setBackgroundColor(Color.YELLOW);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
