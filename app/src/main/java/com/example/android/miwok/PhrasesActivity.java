package com.example.android.miwok;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);

        ArrayList<Word> data = new ArrayList<>();
        data.add(new Word("minto wuksus", "Where are you going?"));
        data.add(new Word("tinnә oyaase'nә", "What is your name?"));
        data.add(new Word("oyaaset...", "My name is..."));
        data.add(new Word("michәksәs?", "How are you feeling?"));
        data.add(new Word("kuchi achit", "I’m feeling good."));
        data.add(new Word("әәnәs'aa?", "Are you coming?"));
        data.add(new Word("hәә’ әәnәm", "Yes, I’m coming."));
        data.add(new Word("әәnәm", "I’m coming."));
        data.add(new Word("yoowutis", "Let’s go."));
        data.add(new Word("әnni'nem", "Come here."));

        RecyclerView recyclerView = findViewById(R.id.word_list);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);

        DividerItemDecoration divider = new DividerItemDecoration(this,
                manager.getOrientation());
        recyclerView.addItemDecoration(divider);

        WordAdapter adapter = new WordAdapter(this, data, R.color.category_phrases);
        recyclerView.setAdapter(adapter);
    }
}
