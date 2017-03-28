package swe.sofolab.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView34;

    String[] countries=new String[]{

            "Bangladesh",
            "india",
            "australia",
            "arabamirat",
            "abudhabi",

            "Bangladesh",
            "india",
            "australia",
            "arabamirat",
            "abudhabi",

            "Bangladesh",
            "india",
            "australia",
            "arabamirat",
            "abudhabi",

            "Bangladesh",
            "india",
            "australia",
            "arabamirat",
            "abudhabi",

            "Bangladesh",
            "india",
            "australia",
            "arabamirat",
            "abudhabi",

            "Bangladesh",
            "india",
            "australia",
            "arabamirat",
            "abudhabi",





    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list_items();

    }


    public void list_items(){

        listView34=(ListView)findViewById(R.id.listView);

        ArrayAdapter adapter=new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,countries);

        listView34.setAdapter(adapter);



        listView34.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getApplicationContext(),countries[position],Toast.LENGTH_LONG).show();
            }
        });



        listView34.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getApplicationContext(),"long clicked:"+position+countries[position],Toast.LENGTH_LONG).show();

                return true;
            }
        });



    }





}
