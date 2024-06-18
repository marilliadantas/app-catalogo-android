package com.example.apploja;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listViewProdutos;
    private AdaptadorProdutos adaptadorProdutos;
    private List<Produto> listaProdutos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewProdutos = findViewById(R.id.list_view_produtos);

        listaProdutos = new ArrayList<>();
        listaProdutos.add(new Produto("Case emoji", "Case para iphone 13/13Pro/13ProMax", "R$ 29,90", R.drawable.case1));
        listaProdutos.add(new Produto("Case Airpods", "Case protetora silicone para AirPods Pro", "R$ 19,90", R.drawable.casefone));
        listaProdutos.add(new Produto("Airpods Pro", "Fone de ouvido sem fio bluetooth", "R$ 59,90", R.drawable.foneblue));
        listaProdutos.add(new Produto("Case colorida", "Capa para iphone 13/13Pro/13ProMax/14/14Pro/14ProMax/15/15Pro", "R$ 29,90", R.drawable.casecolorida));
        listaProdutos.add(new Produto("Carregador portátil", "Carregador Portátil Power Bank Magnético sem fio por indução", "R$ 199,90", R.drawable.carregador));
        listaProdutos.add(new Produto("Case emoji", "Pulseira compatível com Apple Watch correia 38 mm 40 mm 41 mm 42 mm 44 mm 45 mm 49 mm", "R$ 15,00", R.drawable.pulseiras));

        adaptadorProdutos = new AdaptadorProdutos(this, listaProdutos);
        listViewProdutos.setAdapter(adaptadorProdutos);
    }
}
