package com.epicodus.forum;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
  private ArrayList<String> categories = new ArrayList<>();
//          {"Testy", "McTest Face", "Test", "Test", "Test", "Test", "Test", "Test", "Test", "Test", "Test"};

    @Bind(R.id.addCategoryButton) Button mAddCategoryButton;
    @Bind(R.id.categoryListView) ListView mCategoryListView;
    @Bind(R.id.newCategoryEditText) EditText mNewCategoryEditText;
    @Bind(R.id.backGroundImageView) ImageView mBackgroundImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        final ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, categories);
        mCategoryListView.setAdapter(adapter);

        mAddCategoryButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String category = mNewCategoryEditText.getText().toString();
                categories.add(category);
                adapter.notifyDataSetChanged();

            }
        });
    }
}
