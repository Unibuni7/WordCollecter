package com.example.slmns.wordcollecter;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private TextView word;
    private EditText input;
    private StringBuilder wordsFormatted = new StringBuilder();
    private List<String> words = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         this.word = (TextView) findViewById(R.id.TextviewShow);
         this.input = (EditText) findViewById(R.id.EditTextWord);
        Button save = (Button) findViewById(R.id.ButtonSave);
        Button clear = (Button) findViewById(R.id.ButtonClear);
        Button show = (Button) findViewById(R.id.ButtonShow);

    }




    public void SaveMethod(View view) {
        String text = this.input.getText().toString();

        words.add(text);
    }

    public void ClearMethod(View view) {
        words.clear();
        this.word.setText("");
    }

    public void ShowMethod(View view) {
        for (String word : words) {
            wordsFormatted.append(word).append("\n");
        }
        this.word.setText(wordsFormatted);
    }
}
