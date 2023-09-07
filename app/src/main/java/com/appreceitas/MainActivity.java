package com.appreceitas;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.appreceitas.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);
    }

    Button btnNextActivity = findViewById(R.id.imageView2);
btnNextActivity.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // Crie um intent para iniciar a próxima atividade
            Intent intent = new Intent(MainActivity.this, fragment_dashboard.class);
            startActivity(intent);
        }
    });

    Button btnNextActivity1 = findViewById(R.id.nav_host_fragment_activity_main);
btnNextActivity1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // Crie um intent para iniciar a próxima atividade
            Intent intent = new Intent(MainActivity.this, fragment_dashboard.class);
            startActivity(intent);
        }
    });

    Button btnNextActivity2 = findViewById(R.id.nav_host_fragment_activity_main);
btnNextActivity2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // Crie um intent para iniciar a próxima atividade
            Intent intent = new Intent(MainActivity.this, fragment_home.class);
            startActivity(intent);
        }
    });
    Button btnNextActivity3 = findViewById(R.id.imageView3);
btnNextActivity3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // Crie um intent para iniciar a próxima atividade
            Intent intent = new Intent(MainActivity.this, fragment_dashboard.class);
            startActivity(intent);
        }
    });

    Button btnNextActivity4 = findViewById(R.id.imageView4);
btnNextActivity4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // Crie um intent para iniciar a próxima atividade
            Intent intent = new Intent(MainActivity.this, fragment_dashboard.class);
            startActivity(intent);
        }
    });

    Button btnNextActivity5 = findViewById(R.id.imageView5);
btnNextActivity5.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // Crie um intent para iniciar a próxima atividade
            Intent intent = new Intent(MainActivity.this, fragment_dashboard.class);
            startActivity(intent);
        }
    });

    Button btnNextActivity6 = findViewById(R.id.imageView6);
btnNextActivity6.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // Crie um intent para iniciar a próxima atividade
            Intent intent = new Intent(MainActivity.this, fragment_dashboard.class);
            startActivity(intent);
        }
    });

    Button btnNextActivity7 = findViewById(R.id.imageView7);
btnNextActivity7.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // Crie um intent para iniciar a próxima atividade
            Intent intent = new Intent(MainActivity.this, fragment_dashboard.class);
            startActivity(intent);
        }
    });
}