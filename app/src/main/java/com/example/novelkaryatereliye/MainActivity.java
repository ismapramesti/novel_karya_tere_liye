package com.example.novelkaryatereliye;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvNovel;
    private ArrayList<Novel> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvNovel = findViewById(R.id.rv_novel);
        rvNovel.setHasFixedSize(true);

        list.addAll(NovelData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvNovel.setLayoutManager(new LinearLayoutManager(this));
        ListNovelAdapter listNovelAdapter = new ListNovelAdapter(list);
        rvNovel.setAdapter(listNovelAdapter);
    }
}