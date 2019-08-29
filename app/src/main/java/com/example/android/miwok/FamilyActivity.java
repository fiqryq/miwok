package com.example.android.miwok;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);

        ArrayList<Word> data = new ArrayList<>();
        data.add(new Word("әpә", "father", R.drawable.family_father));
        data.add(new Word("әṭa", "mother", R.drawable.family_mother));
        data.add(new Word("angsi", "son", R.drawable.family_son));
        data.add(new Word("tune", "daughter", R.drawable.family_daughter));
        data.add(new Word("taachi", "older brother", R.drawable.family_older_brother));
        data.add(new Word("chalitti", "younger brother", R.drawable.family_younger_brother));
        data.add(new Word("teṭe", "older sister", R.drawable.family_older_sister));
        data.add(new Word("kolliti", "younger sister", R.drawable.family_younger_sister));
        data.add(new Word("ama", "grandmother", R.drawable.family_grandmother));
        data.add(new Word("paapa", "grandfather", R.drawable.family_grandfather));

        RecyclerView recyclerView = findViewById(R.id.word_list);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);

        DividerItemDecoration divider = new DividerItemDecoration(this,
                manager.getOrientation());
        recyclerView.addItemDecoration(divider);

        WordAdapter adapter = new WordAdapter(this, data, R.color.category_family);
        recyclerView.setAdapter(adapter);
    }
}
