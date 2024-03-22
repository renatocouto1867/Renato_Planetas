package com.example.renato_planetas;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityPlaneta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_planeta);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Intent intent=getIntent();
        Planeta planeta = (Planeta) intent.getSerializableExtra("planeta");

        TextView textViewNome=findViewById(R.id.textViewNome);
        TextView textViewCarac1=findViewById(R.id.textViewcarac1);
        TextView textViewCarac2=findViewById(R.id.textViewcarac2);
        TextView textViewCarac3=findViewById(R.id.textViewcarac3);
        ImageView imageView = findViewById(R.id.imageViewPlaneta);

        textViewNome.setText(planeta.getNome());
        textViewCarac1.setText(planeta.getCarac1());
        textViewCarac2.setText(planeta.getCarac2());
        textViewCarac3.setText(planeta.getCarac3());

        imageView.setImageResource(planeta.getImagem());

    }
}