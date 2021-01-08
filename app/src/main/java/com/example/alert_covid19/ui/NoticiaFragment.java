package com.example.alert_covid19.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.alert_covid19.ListAdapter;
import com.example.alert_covid19.MainActivity;
import com.example.alert_covid19.R;
import com.example.alert_covid19.noticias1;

public class NoticiaFragment extends Fragment {

    private NoticiaViewModel mViewModel;

    int[] images = {R.mipmap.ic_launcher1, R.mipmap.ic_launcher2, R.mipmap.ic_launcher3, R.mipmap.ic_launcher4};
    String[] link={"https://www.expreso.ec/actualidad/coronavirus-mundo-ecuador-informacion-minuto-minuto-6162.html",
            "https://www.eluniverso.com/noticias/2021/01/05/nota/9314557/coronavirus-covid19-ecuador-casos-contagios-muertes-5-enero",
            "https://www.eluniverso.com/noticias/2021/01/05/nota/9314077/coronavirus-ecuador-vacunas-pfizer-biontech-llegan-tercera-semana",
            "https://www.eluniverso.com/noticias/2021/01/06/nota/9315589/covid-19-rios-babahoyo-nueva-cepa-caso-sospechoso" };
    String[] version = {"Coronavirus en Ecuador y el mundo: información verificada, casos, mapa y más | MINUTO A MINUTO", "Casos de coronavirus en Ecuador, al martes 5 de enero: 216.083 confirmados y 14.103 fallecidos ", "Coronavirus en Ecuador: vacunas de Pfizer-Biontech llegan la tercera semana de enero.", "En Los Ríos investigan sospecha de presencia de nueva variante de COVID-19."};

    String[] fecha= {"01/06/2020", "05/01/2021", "05/01/2021", "06/01/2021"};

    ListView lView;

    ListAdapter lAdapter;

    View view;

    public static NoticiaFragment newInstance() {
        return new NoticiaFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.noticia_fragment, container, false);

        lView = (ListView) view.findViewById(R.id.androidList);

        lAdapter = new ListAdapter(getContext(), version, fecha, images);

        lView.setAdapter(lAdapter);

        lView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent resultado = new Intent((MainActivity)getActivity(), noticias1.class);
                resultado.putExtra("linknoticias",link[i]);
                startActivity(resultado);

            }
        });

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(NoticiaViewModel.class);
        // TODO: Use the ViewModel
    }

}