package mx.tec.testsipc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_page)

        val buy = findViewById<Button>(R.id.BuybtnMP)
        val sell = findViewById<Button>(R.id.Sellbtn)


        buy.setOnClickListener() {
            val intent = Intent(this@MainPage, MainPageBuy::class.java)
            startActivity(intent)
        }
        sell.setOnClickListener() {
            val intent = Intent(this@MainPage, MainPageSell::class.java)
            startActivity(intent)
        }

    }
}