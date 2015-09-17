package com.valentine.yama;

import android.location.Location;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseQueryAdapter;
import com.valentine.yama.gettersandsetters.Neighbor;

public class Neighborhood extends ListView {

    private ParseQueryAdapter<Neighbor> mainAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getListView().setClickable(true);
        mainAdapter = new ParseQueryAdapter<Neighborhoods>(this, Neighborhood.class);
        mainAdapter.setTextKey("location");
        setListAdapter(mainAdapter);
    }

}