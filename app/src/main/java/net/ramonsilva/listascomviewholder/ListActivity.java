package net.ramonsilva.listascomviewholder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class ListActivity extends AppCompatActivity {

    private static String[] valoresDaLista = new String[]{"Cupcake", "Donut",
            "Eclair", "Froyo", "Gingerbread", "Honeycomb", "Ice Cream Sandwich",
            "Jelly Bean", "Kitkat", "Lollipop", "Marshmallow"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListaAdapter adapter = new ListaAdapter(this, R.layout.list_item_fragment, valoresDaLista);
        ListView listaView = (ListView) findViewById(R.id.lista);

        listaView.setAdapter(adapter);
    }
}
