package com.example.baitaprecyclerview_18093421_LeVanTai;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

//    String s1[],s2[];
//    int image[]={R.drawable.sach1,R.drawable.sach1,R.drawable.sach1,R.drawable.sach1,R.drawable.sach1
//    ,R.drawable.sach1,R.drawable.sach1,R.drawable.sach1};
    RecyclerView recyclerView;
    List<BookName>  nameArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
//        s1 = getResources().getStringArray(R.array.title);
//        s2 = getResources().getStringArray(R.array.des);
//        MyAdapter myadapter = new MyAdapter(this,s1,s2,image);
        nameArrayList = new ArrayList<>();
        BookName b1 = new BookName("Book 1", "This is book",R.drawable.sach1);
        BookName b2 = new BookName("Book 2", "This is book",R.drawable.sach1);
        BookName b3= new BookName("Book 3", "This is book",R.drawable.sach1);
        BookName b4 = new BookName("Book 4", "This is book",R.drawable.sach1);
        BookName b5 = new BookName("Book 5", "This is book",R.drawable.sach1);
        BookName b6 = new BookName("Book 6", "This is book",R.drawable.sach1);
        BookName b7 = new BookName("Book 7", "This is book",R.drawable.sach1);
        BookName b8 = new BookName("Book 8", "This is book",R.drawable.sach1);
        nameArrayList.add(b1);
        nameArrayList.add(b2);
        nameArrayList.add(b3);
        nameArrayList.add(b4);
        nameArrayList.add(b5);
        nameArrayList.add(b6);
        nameArrayList.add(b7);
        nameArrayList.add(b8);
        MyAdapter myAdapter = new MyAdapter(this, nameArrayList);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}