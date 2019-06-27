package com.pranav.countrylist;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ArrayAdapter<String> adapter;
    EditText editTextCity;
    private AutoCompleteTextView autoCompleteTextView;
    private Button submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        PopupWindow popupWindow = new PopupWindow(MainActivity.this);
        editTextCity = (EditText) findViewById(R.id.edTextCity);
        String[] countries = getResources().getStringArray(R.array.countries);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, countries);
        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.countryNameEdView);
        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView.setThreshold(1);
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                editTextCity.setText(R.string.app_name);
            }
        });
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}
