package mx.edu.tesoem.isc.REMG.gridviewbaseadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.inputmethod.InputContentInfo;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

   GridView gvdatos;

    ArrayList<String> arreglo= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gvdatos = findViewById(R.id.gvdatos);

        arreglo.add("rene");
        arreglo.add("kevin");
        arreglo.add("juan");
        arreglo.add("triton");
        arreglo.add("iops");
        arreglo.add("nash");
        arreglo.add("juanero");
        arreglo.add("edrai");

    }
}