package mx.tec.testsipc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainPageSell : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_page_sell)

        val buy = findViewById<Button>(R.id.Buybtn)
        val home = findViewById<Button>(R.id.Homebtn)


        buy.setOnClickListener() {
            val intent = Intent(this@MainPageSell, MainPageBuy::class.java)
            startActivity(intent)
        }
        home.setOnClickListener() {
            val intent = Intent(this@MainPageSell, MainPage::class.java)
            startActivity(intent)
        }
    }
}