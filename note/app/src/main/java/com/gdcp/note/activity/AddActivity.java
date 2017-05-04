package com.gdcp.note.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.gdcp.note.R;
import com.gdcp.note.com.gdcp.note.date.NoteDBUtil;

import java.util.Date;

public class AddActivity extends AppCompatActivity {
    private Button btnAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);


        btnAdd = (Button) findViewById(R.id.btnSave);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = "asdfadsfasd";
                String content = "5241654641321";
                Date date = new Date();
                NoteDBUtil.addNote(AddActivity.this, title, content, date);
            }
        });
    }
}
