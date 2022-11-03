package mx.tec.testsipc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_page)

        val buy = findViewById<ImageView>(R.id.imageViewMPC)
        val sell = findViewById<ImageView>(R.id.imageViewMPS)
        val user = findViewById<ImageView>(R.id.userSettings)


        buy.setOnClickListener() {
            val intent = Intent(this@MainPage, MainPageBuy::class.java)
            startActivity(intent)
        }
        sell.setOnClickListener() {
            val intent = Intent(this@MainPage, MainPageSell::class.java)
            startActivity(intent)
        }
        user.setOnClickListener() {
            val intent = Intent(this@MainPage, UserSettings::class.java)
            startActivity(intent)
        }

    }
}