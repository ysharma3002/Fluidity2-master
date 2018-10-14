package app.com.fluid.fluidity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class homeScreen extends AppCompatActivity {

    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeScreen);
        ListView 1v = (ListView)findViewById(R.id.ListViewApp)
        ArrayList<String> arrayApp = new ArrayList<>();
        arrayApp.addAll(Arrays.asList().getStringArray(R.array.array_App))};

    adapter = new ArrayAdapter<>(
    MainActivity.this,
    android.R.layout.sinmple_test_item_1,
    arrayCountry);
        1v.setAdapter(adapter);
}

