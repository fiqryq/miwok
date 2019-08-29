package com.example.android.miwok;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);

        ArrayList<Word> data = new ArrayList<>();
        data.add(new Word("lutti", "one", R.drawable.number_one));
        data.add(new Word("otiiko", "two", R.drawable.number_two));
        data.add(new Word("tolookosu", "three", R.drawable.number_three));
        data.add(new Word("oyyisa", "four", R.drawable.number_four));
        data.add(new Word("massokka", "five", R.drawable.number_five));
        data.add(new Word("temmokka", "six", R.drawable.number_six));
        data.add(new Word("kenekaku", "seven", R.drawable.number_seven));
        data.add(new Word("kawinta", "eight", R.drawable.number_eight));
        data.add(new Word("wo’e", "nine", R.drawable.number_nine));
        data.add(new Word("na’aacha", "ten", R.drawable.number_ten));

        RecyclerView recyclerView = findViewById(R.id.word_list);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);

        DividerItemDecoration divider = new DividerItemDecoration(this,
                manager.getOrientation());
        recyclerView.addItemDecoration(divider);

        WordAdapter adapter = new WordAdapter(this, data, R.color.category_numbers);
        recyclerView.setAdapter(adapter);
    }
}
