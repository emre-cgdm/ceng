package com.example.pizzaselection;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends Activity {
	
	RadioGroup rg;
	RadioButton rb1, rb2, rb3;
	CheckBox cb1, cb2;
	Button btn;

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        rg = (RadioGroup) findViewById(R.id.radioGroup1);
        rb1 = (RadioButton) findViewById(R.id.radio0);
        rb2 = (RadioButton) findViewById(R.id.radio1);
        rb3 = (RadioButton) findViewById(R.id.radio2);
        cb1 = (CheckBox) findViewById(R.id.checkBox1);
        cb2 = (CheckBox) findViewById(R.id.checkBox2);
        btn = (Button) findViewById(R.id.button1);
        
        btn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int Price = 0;
				int rgSelectionId = rg.getCheckedRadioButtonId();
				
				if(rgSelectionId == rb1.getId())
					Price += 9;
				else if(rgSelectionId == rb2.getId())
					Price += 14;
				else if(rgSelectionId == rb3.getId())
					Price += 19;
				
				if(cb1.isChecked())
					Price += 3;
				if(cb2.isChecked())
					Price += 5;
				
				Toast.makeText(getApplicationContext(), "Price: "+Price, Toast.LENGTH_SHORT).show();
				
			}
        	
        });
	}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
