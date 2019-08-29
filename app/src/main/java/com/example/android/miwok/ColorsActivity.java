package com.example.android.miwok;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);

        ArrayList<Word> data = new ArrayList<>();
        data.add(new Word("weṭeṭṭi", "red", R.drawable.color_red));
        data.add(new Word("chiwiiṭә", "mustard yellow", R.drawable.color_mustard_yellow));
        data.add(new Word("ṭopiisә", "dusty yellow", R.drawable.color_dusty_yellow));
        data.add(new Word("chokokki", "green", R.drawable.color_green));
        data.add(new Word("ṭakaakki", "brown", R.drawable.color_brown));
        data.add(new Word("ṭopoppi", "gray", R.drawable.color_gray));
        data.add(new Word("kululli", "black", R.drawable.color_black));
        data.add(new Word("kelelli", "white", R.drawable.color_white));

        RecyclerView recyclerView = findViewById(R.id.word_list);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);

        DividerItemDecoration divider = new DividerItemDecoration(this,
                manager.getOrientation());
        recyclerView.addItemDecoration(divider);

        WordAdapter adapter = new WordAdapter(this, data, R.color.category_colors);
        recyclerView.setAdapter(adapter);
    }
}
