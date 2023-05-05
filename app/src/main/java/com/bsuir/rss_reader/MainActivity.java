package com.bsuir.rss_reader;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnRediff;

    private EditText link;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRediff = findViewById(R.id.btnStart);
        link = findViewById(R.id.editText);

        btnRediff.setOnClickListener(this);

//        rssLinks.add("http://www.rediff.com/rss/moviesreviewsrss.xml");
//        rssLinks.add("http://www.cinemablend.com/rss_review.php");
    }

    @Override
    public void onClick(View view) {
        String rssLink = link.getText().toString();
        Intent intent = new Intent(getApplicationContext(), RSSFeedActivity.class);
        intent.putExtra("rssLink", rssLink);
        startActivity(intent);
    }
}