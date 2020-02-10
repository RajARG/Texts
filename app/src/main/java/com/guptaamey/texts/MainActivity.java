package com.guptaamey.texts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout currentLayout;

    TextView displayText;
    EditText nameInput;
    Button nameButton;
    Button fieldButton;

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayText = findViewById(R.id.display1);
        nameInput = findViewById(R.id.nameEntry);
        nameButton = findViewById(R.id.button1);
        fieldButton = findViewById(R.id.button2);

        nameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = "Hello, " + nameInput.getText() + "!";
                displayText.setText(name);
            }
        });

        fieldButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Resources res = getResources();
                String[] fields = res.getStringArray(R.array.fields_array);
                displayText.setText(planets[count%fields.size()]);
            }
        });
    }
}
