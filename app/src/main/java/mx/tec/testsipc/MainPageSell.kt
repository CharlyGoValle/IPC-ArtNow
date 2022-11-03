package mx.tec.testsipc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainPageSell : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_page_sell)

        val buy = findViewById<ImageView>(R.id.imageViewMSC)
        val home = findViewById<ImageView>(R.id.imageViewMSH)
        val user = findViewById<ImageView>(R.id.userSettings)


        buy.setOnClickListener() {
            val intent = Intent(this@MainPageSell, MainPageBuy::class.java)
            startActivity(intent)
        }
        home.setOnClickListener() {
            val intent = Intent(this@MainPageSell, MainPage::class.java)
            startActivity(intent)
        }
        user.setOnClickListener() {
            val intent = Intent(this@MainPageSell, UserSettings::class.java)
            startActivity(intent)
        }

    }
}