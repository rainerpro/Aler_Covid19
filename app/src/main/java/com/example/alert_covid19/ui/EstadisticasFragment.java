package com.example.alert_covid19.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.alert_covid19.R;

public class EstadisticasFragment extends Fragment {

    private EstadisticasViewModel mViewModel;
    String url = "https://www.coronavirusecuador.com/estadisticas-covid-19/";
    WebView miVisorWeb;
    View view;

    public static EstadisticasFragment newInstance() {
        return new EstadisticasFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.estadisticas_fragment, container, false);
        miVisorWeb = (WebView) view.findViewById(R.id.webview);
        final WebSettings ajustesVisorWeb = miVisorWeb.getSettings();
        ajustesVisorWeb.setJavaScriptEnabled(true);
        miVisorWeb.loadUrl(url);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(EstadisticasViewModel.class);
        // TODO: Use the ViewModel
    }

}