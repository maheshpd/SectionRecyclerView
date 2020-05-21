package com.example.sectionrecyclerview;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    ArrayList<Section> sectionList = new ArrayList<>();
    RecyclerView mainReyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();

        mainReyclerView = findViewById(R.id.mainRecyclerView);
        MainRecyclerAdapter mainRecyclerAdapter = new MainRecyclerAdapter(this, sectionList);
        mainReyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        mainReyclerView.setAdapter(mainRecyclerAdapter);
    }

    private void initData() {

        String sectionOneName = "Action";

        ArrayList<String> sectionOneItems = new ArrayList<>();
        sectionOneItems.add("Captain America");
        sectionOneItems.add("Iron Man");

        String sectionTwoName = "Adventure";
        ArrayList<String> sectionTwoItems = new ArrayList<>();
        sectionTwoItems.add("Pirates of the Caribbean");
        sectionTwoItems.add("King Kong");
        sectionTwoItems.add("Life of Pie");

        String sectionThreeName = "Epic";
        ArrayList<String> sectionThreeItems = new ArrayList<>();
        sectionThreeItems.add("Titanic");
        sectionThreeItems.add("Gandhi");
        sectionThreeItems.add("Ben-Hur");


        String sectionFourName = "War";
        ArrayList<String> sectionFourItems = new ArrayList<>();
        sectionFourItems.add("Saving Private Ryan");
        sectionFourItems.add("1917");
        sectionFourItems.add("Valkyrie");
        sectionFourItems.add("The Hurt Locker");

        sectionList.add(new Section(sectionOneName, sectionOneItems));

       /* List<String> sectionListName = new ArrayList<>();
        sectionListName.add(sectionOneName);
        sectionListName.add(sectionTwoName);
        sectionListName.add(sectionThreeName);
        sectionListName.add(sectionFourName);

        List<List<String>> sectionListItem = new ArrayList<>();
        sectionListItem.add(sectionOneItems);
        sectionListItem.add(sectionTwoItems);
        sectionListItem.add(sectionThreeItems);
        sectionListItem.add(sectionFourItems);*/

        sectionList.add(new Section(sectionOneName, sectionOneItems));
        sectionList.add(new Section(sectionTwoName, sectionTwoItems));
        sectionList.add(new Section(sectionThreeName, sectionThreeItems));
        sectionList.add(new Section(sectionFourName, sectionFourItems));

        Log.d(TAG, "initData: " + sectionList);

    }
}
