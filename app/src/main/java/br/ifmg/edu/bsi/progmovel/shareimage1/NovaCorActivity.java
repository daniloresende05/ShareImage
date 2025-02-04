package br.ifmg.edu.bsi.progmovel.shareimage1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class NovaCorActivity extends AppCompatActivity {
    public static String EXTRA_COR_ATUAL = "br.ifmg.edu.bsi.progmovel.shareimage1.cor_atual";
    public static String EXTRA_NOVA_COR = "br.ifmg.edu.bsi.progmovel.shareimage1.nova_cor";
    private EditText etCor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova_cor);
        etCor = findViewById(R.id.etCor);
        Intent intent = getIntent();
        String corAtual = intent.getStringExtra(EXTRA_COR_ATUAL);
        etCor.setText(corAtual);
    }
    public void enviarNovoCor(View v) {
        String novaCor = etCor.getText().toString();
        Intent intent = new Intent();
        intent.putExtra(EXTRA_NOVA_COR, novaCor);
        setResult(RESULT_OK, intent);
        finish();
    }

}