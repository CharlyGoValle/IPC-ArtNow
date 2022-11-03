package mx.tec.testsipc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainPageBuy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_page_buy)

        val sell = findViewById<ImageView>(R.id.imageViewMBS)
        val home = findViewById<ImageView>(R.id.imageViewMBH)
        val user = findViewById<ImageView>(R.id.userSettings)

        val card = findViewById<CardView>(R.id.CardMaja)


        sell.setOnClickListener() {
            val intent = Intent(this@MainPageBuy, MainPageSell::class.java)
            startActivity(intent)
        }
        home.setOnClickListener() {
            val intent = Intent(this@MainPageBuy, MainPage::class.java)
            startActivity(intent)
        }
        user.setOnClickListener() {
            val intent = Intent(this@MainPageBuy, UserSettings::class.java)
            startActivity(intent)
        }

        card.setOnClickListener() {
            val intent = Intent(this@MainPageBuy, MajaVestida::class.java)
            startActivity(intent)
        }

    }
}