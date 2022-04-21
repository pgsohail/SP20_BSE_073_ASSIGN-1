package com.example.sp20_bse_073;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button a, s, ss, store;
    TextView n, g, e, ad, numberss;
    String z[][] = new String[10][];
    EditText n11, n22, n33;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n = findViewById(R.id.numbers);
        g = findViewById(R.id.textView);
        e = findViewById(R.id.result);
        a = findViewById(R.id.add);
        s = findViewById(R.id.search);
        n11 = findViewById(R.id.n1);
        n22 = findViewById(R.id.n2);
        n33 = findViewById(R.id.n3);
        store = findViewById(R.id.save);
        numberss = findViewById(R.id.numbers);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                actionfragment a = new actionfragment();
                FragmentTransaction t = getSupportFragmentManager().beginTransaction();
                t.replace(R.id.l2, a).commit();
                g.setText("");
            }
        });

        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                messagefragment aa = new messagefragment();
                FragmentTransaction tt = getSupportFragmentManager().beginTransaction();
                tt.replace(R.id.l2, aa).commit();
                g.setText("");
            }
        });
    }
}