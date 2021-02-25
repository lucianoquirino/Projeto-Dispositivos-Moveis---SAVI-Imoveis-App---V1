package com.lucianoquirino.saviimoveisapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.blackcat.currencyedittext.CurrencyEditText;
import com.lucianoquirino.saviimoveisapp.R;
import com.santalu.maskara.widget.MaskEditText;

import java.util.Locale;

import static android.Manifest.permission.READ_EXTERNAL_STORAGE;

public class CadastrarAnuncioActivity extends AppCompatActivity {

    private EditText campoTítulo, campoDescrição;
    private CurrencyEditText campoValor;
    private MaskEditText campoTelefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_anuncio);

        inicializarComponentes();
    }

    public void cadastrarAnuncio(View view){

        String valor = campoTelefone.getText().toString();
        Log.d("cadastrar", "cadastrarAnuncio: " + valor);

    }

    private void inicializarComponentes(){

        campoTítulo = findViewById(R.id.editTitulo);
        campoDescrição = findViewById(R.id.editDescricao);
        campoValor = findViewById(R.id.editValor);
        campoTelefone = findViewById(R.id.editTelefone);

        //Configura localidade para pt -> portugues BR -> Brasil
        Locale locale = new Locale("pt", "BR");
        campoValor.setDefaultLocale(locale);
    }
}