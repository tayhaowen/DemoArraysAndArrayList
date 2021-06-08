package sg.edu.rp.c346.day2.demoarraysarraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ArrayListActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_list);

        tv = findViewById(R.id.textView2);

        //continue view the code in the worksheet
        ArrayList<String> fruits = new ArrayList<String>();


        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add(3,"Durian");
        String theFruit = fruits.get(1);
        fruits.remove(0);
        fruits.set(fruits.size()-1,"Dragon Fruit");

        String msg = "";
        for (int i = 0; i < fruits.size(); i++) {
            msg += fruits.get(i) + "\n";
        }
        tv.setText(msg);

    }
}