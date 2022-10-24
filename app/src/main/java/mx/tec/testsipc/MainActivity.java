package mx.tec.testsipc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View buttonLogIn = findViewById(R.id.LogIn);
        View Register = findViewById(R.id.Registrarse);


        buttonLogIn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MainPage.class);
            startActivity(intent);
        });

        Register.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SingIn.class);
            startActivity(intent);
        });
    }
}