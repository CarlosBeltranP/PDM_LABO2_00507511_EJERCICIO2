package com.example.labo2ejer1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView ajax;
    private ImageView fcbarcelona;
    private ImageView liverpool;
    private ImageView totenham;
    private ImageView oporto;
    private ImageView juventus;
    private ImageView trofeo;
    private ImageView manchesterc;
    private ImageView manchesteru;


    private int cont1 = 0;
    private int cont2 = 0;
    private int cont3 = 0;
    private int cont4 = 0;
    private int cont5 = 0;
    private int cont6 = 0;
    private int cont7 = 0;
    private int cont8 = 0;
    private int cont9 = 0;

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ajax = (ImageView) findViewById(R.id.ajax);
        fcbarcelona = (ImageView) findViewById(R.id.fcbarcelona);
        juventus = (ImageView) findViewById(R.id.juventus);
        manchesterc = (ImageView) findViewById(R.id.manchesterc);
        manchesteru = (ImageView) findViewById(R.id.manchesteru);
        liverpool = (ImageView) findViewById(R.id.liverpool);
        oporto = (ImageView) findViewById(R.id.oporto);
        totenham = (ImageView) findViewById(R.id.totenham);
        trofeo = (ImageView) findViewById(R.id.trofeo);

        ajax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont8++;
                switch (cont8){
                    case 1:
                        ajax.setImageResource(R.drawable.oporto1);
                        break;
                    case 2:
                        ajax.setImageResource(R.drawable.fcbarcelona1);
                        break;
                    case 3:
                        ajax.setImageResource(R.drawable.juventus1);
                        break;
                    case 4:
                        ajax.setImageResource(R.drawable.manchesterc1);
                        break;
                    case 5:
                        ajax.setImageResource(R.drawable.manchesteru1);
                        break;
                    case 6:
                        ajax.setImageResource(R.drawable.totenham1);
                        break;
                    case 7:
                        ajax.setImageResource(R.drawable.trofeo1);
                        break;
                    case 8:
                        ajax.setImageResource(R.drawable.liverpool1);
                        break;
                    case 9:
                        ajax.setImageResource(R.drawable.ajax1);
                        cont8 = 0;
                        break;

                }
            }
        });

        fcbarcelona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont9++;
                switch (cont9){
                    case 1:
                        fcbarcelona.setImageResource(R.drawable.oporto1);
                        break;
                    case 2:
                        fcbarcelona.setImageResource(R.drawable.ajax1);
                        break;
                    case 3:
                        fcbarcelona.setImageResource(R.drawable.juventus1);
                        break;
                    case 4:
                        fcbarcelona.setImageResource(R.drawable.manchesterc1);
                        break;
                    case 5:
                        fcbarcelona.setImageResource(R.drawable.manchesteru1);
                        break;
                    case 6:
                        fcbarcelona.setImageResource(R.drawable.totenham1);
                        break;
                    case 7:
                        fcbarcelona.setImageResource(R.drawable.trofeo1);
                        break;
                    case 8:
                        fcbarcelona.setImageResource(R.drawable.liverpool1);
                        break;
                    case 9:
                        fcbarcelona.setImageResource(R.drawable.fcbarcelona1);
                        cont9 = 0;
                        break;

                }
            }
        });

        oporto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont1++;
                switch (cont1){
                    case 1:
                        oporto.setImageResource(R.drawable.ajax1);
                        break;
                    case 2:
                        oporto.setImageResource(R.drawable.fcbarcelona1);
                        break;
                    case 3:
                        oporto.setImageResource(R.drawable.juventus1);
                        break;
                    case 4:
                        oporto.setImageResource(R.drawable.manchesterc1);
                        break;
                    case 5:
                        oporto.setImageResource(R.drawable.manchesteru1);
                        break;
                    case 6:
                        oporto.setImageResource(R.drawable.totenham1);
                        break;
                    case 7:
                        oporto.setImageResource(R.drawable.trofeo1);
                        break;
                    case 8:
                        oporto.setImageResource(R.drawable.liverpool1);
                        break;
                    case 9:
                        oporto.setImageResource(R.drawable.oporto1);
                        cont1 = 0;
                        break;

                }
            }
        });

        juventus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont2++;
                switch (cont2){
                    case 1:
                        juventus.setImageResource(R.drawable.oporto1);
                        break;
                    case 2:
                        juventus.setImageResource(R.drawable.fcbarcelona1);
                        break;
                    case 3:
                        juventus.setImageResource(R.drawable.ajax1);
                        break;
                    case 4:
                        juventus.setImageResource(R.drawable.manchesterc1);
                        break;
                    case 5:
                        juventus.setImageResource(R.drawable.manchesteru1);
                        break;
                    case 6:
                        juventus.setImageResource(R.drawable.totenham1);
                        break;
                    case 7:
                        juventus.setImageResource(R.drawable.trofeo1);
                        break;
                    case 8:
                        juventus.setImageResource(R.drawable.liverpool1);
                        break;
                    case 9:
                        juventus.setImageResource(R.drawable.juventus1);
                        cont2 = 0;
                        break;

                }
            }
        });

        manchesterc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont3++;
                switch (cont3){
                    case 1:
                        manchesterc.setImageResource(R.drawable.oporto1);
                        break;
                    case 2:
                        manchesterc.setImageResource(R.drawable.fcbarcelona1);
                        break;
                    case 3:
                        manchesterc.setImageResource(R.drawable.juventus1);
                        break;
                    case 4:
                        manchesterc.setImageResource(R.drawable.ajax1);
                        break;
                    case 5:
                        manchesterc.setImageResource(R.drawable.manchesteru1);
                        break;
                    case 6:
                        manchesterc.setImageResource(R.drawable.totenham1);
                        break;
                    case 7:
                        manchesterc.setImageResource(R.drawable.trofeo1);
                        break;
                    case 8:
                        manchesterc.setImageResource(R.drawable.liverpool1);
                        break;
                    case 9:
                        manchesterc.setImageResource(R.drawable.manchesterc1);
                        cont3 = 0;
                        break;

                }
            }
        });

        manchesteru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont4++;
                switch (cont4){
                    case 1:
                        manchesteru.setImageResource(R.drawable.oporto1);
                        break;
                    case 2:
                        manchesteru.setImageResource(R.drawable.fcbarcelona1);
                        break;
                    case 3:
                        manchesteru.setImageResource(R.drawable.juventus1);
                        break;
                    case 4:
                        manchesteru.setImageResource(R.drawable.manchesterc1);
                        break;
                    case 5:
                        manchesteru.setImageResource(R.drawable.ajax1);
                        break;
                    case 6:
                        manchesteru.setImageResource(R.drawable.totenham1);
                        break;
                    case 7:
                        manchesteru.setImageResource(R.drawable.trofeo1);
                        break;
                    case 8:
                        manchesteru.setImageResource(R.drawable.liverpool1);
                        break;
                    case 9:
                        manchesteru.setImageResource(R.drawable.manchesteru1);
                        cont4 = 0;
                        break;

                }
            }
        });

        trofeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont5++;
                switch (cont5){
                    case 1:
                       trofeo.setImageResource(R.drawable.oporto1);
                        break;
                    case 2:
                        trofeo.setImageResource(R.drawable.fcbarcelona1);
                        break;
                    case 3:
                        trofeo.setImageResource(R.drawable.juventus1);
                        break;
                    case 4:
                        trofeo.setImageResource(R.drawable.manchesterc1);
                        break;
                    case 5:
                        trofeo.setImageResource(R.drawable.manchesteru1);
                        break;
                    case 6:
                        trofeo.setImageResource(R.drawable.totenham1);
                        break;
                    case 7:
                        trofeo.setImageResource(R.drawable.ajax1);
                        break;
                    case 8:
                        trofeo.setImageResource(R.drawable.liverpool1);
                        break;
                    case 9:
                        trofeo.setImageResource(R.drawable.trofeo1);
                        cont5 = 0;
                        break;

                }
            }
        });

        liverpool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont6++;
                switch (cont6){
                    case 1:
                        liverpool.setImageResource(R.drawable.oporto1);
                        break;
                    case 2:
                        liverpool.setImageResource(R.drawable.fcbarcelona1);
                        break;
                    case 3:
                        liverpool.setImageResource(R.drawable.juventus1);
                        break;
                    case 4:
                        liverpool.setImageResource(R.drawable.manchesterc1);
                        break;
                    case 5:
                        liverpool.setImageResource(R.drawable.manchesteru1);
                        break;
                    case 6:
                        liverpool.setImageResource(R.drawable.totenham1);
                        break;
                    case 7:
                        liverpool.setImageResource(R.drawable.trofeo1);
                        break;
                    case 8:
                        liverpool.setImageResource(R.drawable.ajax1);
                        break;
                    case 9:
                        liverpool.setImageResource(R.drawable.liverpool1);
                        cont6 = 0;
                        break;

                }
            }
        });

        totenham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont7++;
                switch (cont7){
                    case 1:
                       totenham.setImageResource(R.drawable.oporto1);
                        break;
                    case 2:
                        totenham.setImageResource(R.drawable.fcbarcelona1);
                        break;
                    case 3:
                        totenham.setImageResource(R.drawable.juventus1);
                        break;
                    case 4:
                        totenham.setImageResource(R.drawable.manchesterc1);
                        break;
                    case 5:
                        totenham.setImageResource(R.drawable.manchesteru1);
                        break;
                    case 6:
                        totenham.setImageResource(R.drawable.ajax1);
                        break;
                    case 7:
                        totenham.setImageResource(R.drawable.trofeo1);
                        break;
                    case 8:
                        totenham.setImageResource(R.drawable.liverpool1);
                        break;
                    case 9:
                        totenham.setImageResource(R.drawable.totenham1);
                        cont7 = 0;
                        break;

                }
            }
        });


    }
}
