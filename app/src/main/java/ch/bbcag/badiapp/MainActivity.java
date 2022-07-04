package ch.bbcag.badiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import ch.bbcag.badiapp.model.Badi;
import ch.bbcag.badiapp.model.BadiDao;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Übersicht");
    }

    @Override
    protected void onStart() {
        super.onStart();
        addBadisToClickableList();
    }

    private void addBadisToClickableList() {
        ListView badis = findViewById(R.id.badiliste);
        ArrayAdapter<Badi> badiAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1);
        badiAdapter.addAll(BadiDao.getAll());
        badis.setAdapter(badiAdapter);

        AdapterView.OnItemClickListener itemClickListener = (adapterView, view, position, id) -> {
            Intent intent = new Intent(getApplicationContext(), BadiDetailsActivity.class);
            Badi badi = (Badi) adapterView.getItemAtPosition(position);

            intent.putExtra("id", badi.getId());
            intent.putExtra("name", badi.getName());
            startActivity(intent);
        };
        badis.setOnItemClickListener(itemClickListener);
    }
}