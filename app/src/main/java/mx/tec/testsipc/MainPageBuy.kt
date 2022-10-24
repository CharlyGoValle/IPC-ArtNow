package mx.tec.testsipc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainPageBuy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_page_buy)

        val sell = findViewById<Button>(R.id.Sellbtn)
        val home = findViewById<Button>(R.id.Homebtn)


        sell.setOnClickListener() {
            val intent = Intent(this@MainPageBuy, MainPageSell::class.java)
            startActivity(intent)
        }
        home.setOnClickListener() {
            val intent = Intent(this@MainPageBuy, MainPage::class.java)
            startActivity(intent)
        }
    }
}